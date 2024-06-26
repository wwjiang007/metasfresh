DROP FUNCTION IF EXISTS de_metas_acct.fact_acct_openItems_to_update_process(
    p_BatchSize integer
)
;

CREATE OR REPLACE FUNCTION de_metas_acct.fact_acct_openItems_to_update_process(
    p_BatchSize integer = 999999999
)
    RETURNS integer
    LANGUAGE plpgsql
AS
$BODY$
DECLARE
    v_selectionId           varchar(60);
    v_count                 integer;
    v_factAcctUpdatedCount  integer;
    v_group                 record;
    v_isOpenItemsReconciled char(1);
BEGIN
    v_selectionId := gen_random_uuid();

    UPDATE "de_metas_acct".fact_acct_openItems_to_update
    SET selection_id=v_selectionId
    WHERE seqno IN (SELECT seqno
                    FROM "de_metas_acct".fact_acct_openItems_to_update
                    WHERE selection_id IS NULL
                    ORDER BY seqno
                    LIMIT p_BatchSize);
    GET DIAGNOSTICS v_count = ROW_COUNT;
    RAISE NOTICE 'Selected % records to process (%)', v_count, v_selectionId;

    IF (v_count <= 0) THEN
        RETURN 0;
    END IF;

    v_factAcctUpdatedCount := 0;
    FOR v_group IN (WITH sel AS (SELECT DISTINCT openitemkey, c_acctschema_id, postingtype
                                 FROM "de_metas_acct".fact_acct_openItems_to_update
                                 WHERE selection_id = v_selectionId)
                    SELECT fa.openitemkey,
                           fa.c_acctschema_id,
                           fa.postingtype,
                           SUM(fa.amtsourcedr - fa.amtsourcecr)                                               AS balance_source,
                           MIN(CASE WHEN fa.oi_trxtype = 'O' THEN fa.fact_acct_id END)                        AS openitem_fact_acct_id,
                           SUM(CASE WHEN fa.oi_trxtype = 'C' THEN fa.amtacctdr - fa.amtacctcr ELSE 0 END)     AS oi_cleared_amountAcct,
                           SUM(CASE WHEN fa.oi_trxtype = 'C' THEN fa.amtsourcedr - fa.amtsourcecr ELSE 0 END) AS oi_cleared_amountSource,
                           COUNT(DISTINCT fa.c_currency_id)                                                   AS count_currencies,
                           ARRAY_AGG(fa.fact_acct_id)                                                         AS fact_acct_ids
                    FROM sel
                             INNER JOIN fact_acct fa ON (fa.openitemkey = sel.openitemkey
                        AND fa.c_acctschema_id = sel.c_acctschema_id
                        AND fa.postingtype = sel.postingtype)
                    WHERE fa.docstatus IN ('CO', 'CL')
                    GROUP BY fa.openitemkey, fa.c_acctschema_id, fa.postingtype
                             -- , fa.account_id -- we shall not group by account, think about conversion gain/loss case where we clear the open item using the gain/loss account too
                    HAVING COUNT(1) > 0)
        LOOP
            v_isOpenItemsReconciled := (CASE WHEN v_group.balance_source = 0 THEN 'Y' ELSE 'N' END);
            -- RAISE NOTICE 'group=%, v_isOpenItemsReconciled=%', v_group, v_isOpenItemsReconciled;

            UPDATE fact_acct fa
            SET IsOpenItemsReconciled=v_isOpenItemsReconciled,
                OI_OpenAmount=(CASE
                    -- WHEN fa.fact_acct_id = v_group.openitem_fact_acct_id AND v_isOpenItemsReconciled = 'Y' THEN 0
                                   WHEN fa.fact_acct_id = v_group.openitem_fact_acct_id /*AND v_isOpenItemsReconciled = 'N'*/ THEN (fa.amtacctdr - fa.amtacctcr) + v_group.oi_cleared_amountAcct
                               END),
                OI_OpenAmountSource=(CASE
                                         WHEN v_group.count_currencies != 1                   THEN NULL -- shall not happen
                                         WHEN fa.fact_acct_id = v_group.openitem_fact_acct_id THEN (fa.amtsourcedr - fa.amtsourcecr) + v_group.oi_cleared_amountSource
                                     END)
            WHERE fa.fact_acct_id = ANY (v_group.fact_acct_ids);
            GET DIAGNOSTICS v_count = ROW_COUNT;
            v_factAcctUpdatedCount := v_factAcctUpdatedCount + v_count;
            RAISE DEBUG 'Updated % Fact_acct records with isOpenItemsReconciled=% (%)', v_count, v_isOpenItemsReconciled, v_group;
        END LOOP;

    RAISE NOTICE 'Updated % Fact_Acct records', v_factAcctUpdatedCount;

    DELETE FROM "de_metas_acct".fact_acct_openItems_to_update WHERE selection_id = v_selectionId;
    GET DIAGNOSTICS v_count = ROW_COUNT;
    RAISE NOTICE 'Removed selection % (% rows)', v_selectionId, v_count;

    RETURN v_count; -- i.e. now many records were processed
END;
$BODY$
;
