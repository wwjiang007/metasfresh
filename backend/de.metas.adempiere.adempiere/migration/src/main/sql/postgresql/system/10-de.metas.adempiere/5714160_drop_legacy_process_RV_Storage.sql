-- Run mode: SWING_CLIENT

-- Name: Lagerbestand - Detail
-- Action Type: R
-- Report: RV_Storage
-- 2023-12-20T19:23:08.255Z
DELETE FROM  AD_Menu_Trl WHERE AD_Menu_ID=411
;

-- 2023-12-20T19:23:08.262Z
DELETE FROM AD_Menu WHERE AD_Menu_ID=411
;

-- 2023-12-20T19:23:08.266Z
DELETE FROM AD_TreeNodeMM n WHERE Node_ID=411 AND EXISTS (SELECT * FROM AD_Tree t WHERE t.AD_Tree_ID=n.AD_Tree_ID AND t.AD_Table_ID=116)
;

-- Value: RV_Storage
-- 2023-12-20T19:23:13.110Z
DELETE FROM  AD_Process_Trl WHERE AD_Process_ID=236
;

-- 2023-12-20T19:23:13.116Z
DELETE FROM AD_Process WHERE AD_Process_ID=236
;

