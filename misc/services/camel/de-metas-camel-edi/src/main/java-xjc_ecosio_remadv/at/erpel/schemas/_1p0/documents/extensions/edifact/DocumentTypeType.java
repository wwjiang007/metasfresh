
package at.erpel.schemas._1p0.documents.extensions.edifact;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DocumentTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Offer"/&gt;
 *     &lt;enumeration value="RequestForQuote"/&gt;
 *     &lt;enumeration value="Order"/&gt;
 *     &lt;enumeration value="OrderConfirmation"/&gt;
 *     &lt;enumeration value="DispatchAdvice"/&gt;
 *     &lt;enumeration value="ReceiptAdvice"/&gt;
 *     &lt;enumeration value="Invoice"/&gt;
 *     &lt;enumeration value="InvoiceList"/&gt;
 *     &lt;enumeration value="InvoiceForAdvancePayment"/&gt;
 *     &lt;enumeration value="InvoiceForPartialDelivery"/&gt;
 *     &lt;enumeration value="InvoiceFinalSettlement"/&gt;
 *     &lt;enumeration value="InvoiceSubsequentCredit"/&gt;
 *     &lt;enumeration value="InvoiceCreditMemo"/&gt;
 *     &lt;enumeration value="InvoiceSubsequentDebit"/&gt;
 *     &lt;enumeration value="InvoiceSelfBilling"/&gt;
 *     &lt;enumeration value="InvoiceProForma"/&gt;
 *     &lt;enumeration value="TransportInstruction"/&gt;
 *     &lt;enumeration value="TransportStatus"/&gt;
 *     &lt;enumeration value="Contrl"/&gt;
 *     &lt;enumeration value="ContractReference"/&gt;
 *     &lt;enumeration value="Project"/&gt;
 *     &lt;enumeration value="ReturnDelivery"/&gt;
 *     &lt;enumeration value="StockReference"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentTypeType")
@XmlEnum
public enum DocumentTypeType {

    @XmlEnumValue("Offer")
    OFFER("Offer"),
    @XmlEnumValue("RequestForQuote")
    REQUEST_FOR_QUOTE("RequestForQuote"),
    @XmlEnumValue("Order")
    ORDER("Order"),
    @XmlEnumValue("OrderConfirmation")
    ORDER_CONFIRMATION("OrderConfirmation"),
    @XmlEnumValue("DispatchAdvice")
    DISPATCH_ADVICE("DispatchAdvice"),
    @XmlEnumValue("ReceiptAdvice")
    RECEIPT_ADVICE("ReceiptAdvice"),
    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("InvoiceList")
    INVOICE_LIST("InvoiceList"),
    @XmlEnumValue("InvoiceForAdvancePayment")
    INVOICE_FOR_ADVANCE_PAYMENT("InvoiceForAdvancePayment"),
    @XmlEnumValue("InvoiceForPartialDelivery")
    INVOICE_FOR_PARTIAL_DELIVERY("InvoiceForPartialDelivery"),
    @XmlEnumValue("InvoiceFinalSettlement")
    INVOICE_FINAL_SETTLEMENT("InvoiceFinalSettlement"),
    @XmlEnumValue("InvoiceSubsequentCredit")
    INVOICE_SUBSEQUENT_CREDIT("InvoiceSubsequentCredit"),
    @XmlEnumValue("InvoiceCreditMemo")
    INVOICE_CREDIT_MEMO("InvoiceCreditMemo"),
    @XmlEnumValue("InvoiceSubsequentDebit")
    INVOICE_SUBSEQUENT_DEBIT("InvoiceSubsequentDebit"),
    @XmlEnumValue("InvoiceSelfBilling")
    INVOICE_SELF_BILLING("InvoiceSelfBilling"),
    @XmlEnumValue("InvoiceProForma")
    INVOICE_PRO_FORMA("InvoiceProForma"),
    @XmlEnumValue("TransportInstruction")
    TRANSPORT_INSTRUCTION("TransportInstruction"),
    @XmlEnumValue("TransportStatus")
    TRANSPORT_STATUS("TransportStatus"),
    @XmlEnumValue("Contrl")
    CONTRL("Contrl"),
    @XmlEnumValue("ContractReference")
    CONTRACT_REFERENCE("ContractReference"),
    @XmlEnumValue("Project")
    PROJECT("Project"),
    @XmlEnumValue("ReturnDelivery")
    RETURN_DELIVERY("ReturnDelivery"),
    @XmlEnumValue("StockReference")
    STOCK_REFERENCE("StockReference");
    private final String value;

    DocumentTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentTypeType fromValue(String v) {
        for (DocumentTypeType c: DocumentTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
