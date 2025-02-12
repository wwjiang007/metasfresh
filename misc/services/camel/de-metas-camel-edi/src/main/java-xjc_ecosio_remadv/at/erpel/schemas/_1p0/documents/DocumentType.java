
package at.erpel.schemas._1p0.documents;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import at.erpel.schemas._1p0.documents.ext.DocumentExtensionType;


/**
 * 
 * 				The ERPEL core document is defined as a single XML Schema file and comprises all elements, which are used by the different ERPEL sub document types.
 * 			
 * 
 * <p>Java class for DocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}BusinessProcessID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}DocumentNumber"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}DocumentDate"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}Delivery" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}Supplier"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}Customer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}OrderingParty" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}Shipper" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}InvoiceRecipient" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}Details"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}TotalLineItemAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}ReductionAndSurchargeDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}TotalNetAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}Tax" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}TotalGrossAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}PaymentMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}PaymentConditions" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}PresentationDetails" minOccurs="0"/&gt;
 *         &lt;element name="Attachments" type="{http://erpel.at/schemas/1p0/documents}AttachmentsType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/ext}DocumentExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://erpel.at/schemas/1p0/documents}GeneratingSystem use="required""/&gt;
 *       &lt;attribute ref="{http://erpel.at/schemas/1p0/documents}CancelledOriginalDocument"/&gt;
 *       &lt;attribute ref="{http://erpel.at/schemas/1p0/documents}DocumentType use="required""/&gt;
 *       &lt;attribute ref="{http://erpel.at/schemas/1p0/documents}DocumentCurrency use="required""/&gt;
 *       &lt;attribute ref="{http://erpel.at/schemas/1p0/documents}ManualProcessing"/&gt;
 *       &lt;attribute ref="{http://erpel.at/schemas/1p0/documents}DocumentTitle"/&gt;
 *       &lt;attribute ref="{http://erpel.at/schemas/1p0/documents}Language"/&gt;
 *       &lt;attribute ref="{http://erpel.at/schemas/1p0/documents}IsGrossPrice"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType", propOrder = {
    "businessProcessID",
    "documentNumber",
    "documentDate",
    "delivery",
    "supplier",
    "customer",
    "orderingParty",
    "shipper",
    "invoiceRecipient",
    "details",
    "totalLineItemAmount",
    "reductionAndSurchargeDetails",
    "totalNetAmount",
    "tax",
    "totalGrossAmount",
    "paymentMethod",
    "paymentConditions",
    "presentationDetails",
    "attachments",
    "documentExtension"
})
public class DocumentType {

    @XmlElement(name = "BusinessProcessID")
    protected String businessProcessID;
    @XmlElement(name = "DocumentNumber", required = true)
    protected String documentNumber;
    @XmlElement(name = "DocumentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDate;
    @XmlElement(name = "Delivery")
    protected DeliveryType delivery;
    @XmlElement(name = "Supplier", required = true)
    protected SupplierType supplier;
    @XmlElement(name = "Customer")
    protected CustomerType customer;
    @XmlElement(name = "OrderingParty")
    protected OrderingPartyType orderingParty;
    @XmlElement(name = "Shipper")
    protected ShipperType shipper;
    @XmlElement(name = "InvoiceRecipient")
    protected InvoiceRecipientType invoiceRecipient;
    @XmlElement(name = "Details", required = true)
    protected DetailsType details;
    @XmlElement(name = "TotalLineItemAmount")
    protected BigDecimal totalLineItemAmount;
    @XmlElement(name = "ReductionAndSurchargeDetails")
    protected ReductionAndSurchargeDetailsType reductionAndSurchargeDetails;
    @XmlElement(name = "TotalNetAmount")
    protected BigDecimal totalNetAmount;
    @XmlElement(name = "Tax")
    protected TaxType tax;
    @XmlElement(name = "TotalGrossAmount")
    protected BigDecimal totalGrossAmount;
    @XmlElement(name = "PaymentMethod")
    protected PaymentMethodType paymentMethod;
    @XmlElement(name = "PaymentConditions")
    protected PaymentConditionsType paymentConditions;
    @XmlElement(name = "PresentationDetails")
    protected PresentationDetailsType presentationDetails;
    @XmlElement(name = "Attachments")
    protected AttachmentsType attachments;
    @XmlElement(name = "DocumentExtension", namespace = "http://erpel.at/schemas/1p0/documents/ext")
    protected DocumentExtensionType documentExtension;
    @XmlAttribute(name = "GeneratingSystem", namespace = "http://erpel.at/schemas/1p0/documents", required = true)
    protected String generatingSystem;
    @XmlAttribute(name = "CancelledOriginalDocument", namespace = "http://erpel.at/schemas/1p0/documents")
    protected String cancelledOriginalDocument;
    @XmlAttribute(name = "DocumentType", namespace = "http://erpel.at/schemas/1p0/documents", required = true)
    protected DocumentTypeType documentType;
    @XmlAttribute(name = "DocumentCurrency", namespace = "http://erpel.at/schemas/1p0/documents", required = true)
    protected CurrencyType documentCurrency;
    @XmlAttribute(name = "ManualProcessing", namespace = "http://erpel.at/schemas/1p0/documents")
    protected Boolean manualProcessing;
    @XmlAttribute(name = "DocumentTitle", namespace = "http://erpel.at/schemas/1p0/documents")
    protected String documentTitle;
    @XmlAttribute(name = "Language", namespace = "http://erpel.at/schemas/1p0/documents")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;
    @XmlAttribute(name = "IsGrossPrice", namespace = "http://erpel.at/schemas/1p0/documents")
    protected Boolean isGrossPrice;

    /**
     * Several documents such as order, despatch advice and invoice may belong to a common business process. This element may be used to correlate different business documents to a common business process.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessProcessID() {
        return businessProcessID;
    }

    /**
     * Sets the value of the businessProcessID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessProcessID(String value) {
        this.businessProcessID = value;
    }

    /**
     * The document number. May be used to identify the document.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * The date when the document was issued.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDate() {
        return documentDate;
    }

    /**
     * Sets the value of the documentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDate(XMLGregorianCalendar value) {
        this.documentDate = value;
    }

    /**
     * Used to store information about the delivery itself (such as delivery date, delivery times, etc.) and the delivery party.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryType }
     *     
     */
    public DeliveryType getDelivery() {
        return delivery;
    }

    /**
     * Sets the value of the delivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryType }
     *     
     */
    public void setDelivery(DeliveryType value) {
        this.delivery = value;
    }

    /**
     * Details about the supplier of goods/services.
     * 
     * @return
     *     possible object is
     *     {@link SupplierType }
     *     
     */
    public SupplierType getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierType }
     *     
     */
    public void setSupplier(SupplierType value) {
        this.supplier = value;
    }

    /**
     * Details about the receiver of goods or services.
     * 
     * @return
     *     possible object is
     *     {@link CustomerType }
     *     
     */
    public CustomerType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerType }
     *     
     */
    public void setCustomer(CustomerType value) {
        this.customer = value;
    }

    /**
     * Details about the party ordering the goods/services. Customer and ordering party do not necessarily have to be the same.
     * 
     * @return
     *     possible object is
     *     {@link OrderingPartyType }
     *     
     */
    public OrderingPartyType getOrderingParty() {
        return orderingParty;
    }

    /**
     * Sets the value of the orderingParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderingPartyType }
     *     
     */
    public void setOrderingParty(OrderingPartyType value) {
        this.orderingParty = value;
    }

    /**
     * Details about the company (carrier) shipping the product/services.
     * 
     * @return
     *     possible object is
     *     {@link ShipperType }
     *     
     */
    public ShipperType getShipper() {
        return shipper;
    }

    /**
     * Sets the value of the shipper property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipperType }
     *     
     */
    public void setShipper(ShipperType value) {
        this.shipper = value;
    }

    /**
     * Details about the party receiving the invoice.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceRecipientType }
     *     
     */
    public InvoiceRecipientType getInvoiceRecipient() {
        return invoiceRecipient;
    }

    /**
     * Sets the value of the invoiceRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceRecipientType }
     *     
     */
    public void setInvoiceRecipient(InvoiceRecipientType value) {
        this.invoiceRecipient = value;
    }

    /**
     * Details about the document itself are provided in this element, i.e., the different line items.
     * 
     * @return
     *     possible object is
     *     {@link DetailsType }
     *     
     */
    public DetailsType getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailsType }
     *     
     */
    public void setDetails(DetailsType value) {
        this.details = value;
    }

    /**
     * The total line item ammount of the invoice. Equals the sum of all line item amounts bafore any further calculations were done.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalLineItemAmount() {
        return totalLineItemAmount;
    }

    /**
     * Sets the value of the totalLineItemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalLineItemAmount(BigDecimal value) {
        this.totalLineItemAmount = value;
    }

    /**
     * Details about reductions and surcharges applying to the products/services defined in the document. Note that both, reductions and surcharges, are always provided as positive values.
     * 
     * @return
     *     possible object is
     *     {@link ReductionAndSurchargeDetailsType }
     *     
     */
    public ReductionAndSurchargeDetailsType getReductionAndSurchargeDetails() {
        return reductionAndSurchargeDetails;
    }

    /**
     * Sets the value of the reductionAndSurchargeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReductionAndSurchargeDetailsType }
     *     
     */
    public void setReductionAndSurchargeDetails(ReductionAndSurchargeDetailsType value) {
        this.reductionAndSurchargeDetails = value;
    }

    /**
     * The total net amount of the invoice. Equals the sum of all line item net amounts minus reductions and plus surcharges.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalNetAmount() {
        return totalNetAmount;
    }

    /**
     * Sets the value of the totalNetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalNetAmount(BigDecimal value) {
        this.totalNetAmount = value;
    }

    /**
     * Used to specify the relevant tax information for this document.
     * 
     * @return
     *     possible object is
     *     {@link TaxType }
     *     
     */
    public TaxType getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxType }
     *     
     */
    public void setTax(TaxType value) {
        this.tax = value;
    }

    /**
     * The total gross amount of the invoice. Equals the total net amount plus taxes.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalGrossAmount() {
        return totalGrossAmount;
    }

    /**
     * Sets the value of the totalGrossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalGrossAmount(BigDecimal value) {
        this.totalGrossAmount = value;
    }

    /**
     * The payment method applicable to this document. May be either of type UniversalBankTransaction, DirectDebit, or NoPayment.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodType }
     *     
     */
    public PaymentMethodType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodType }
     *     
     */
    public void setPaymentMethod(PaymentMethodType value) {
        this.paymentMethod = value;
    }

    /**
     * Information in regard to the payment conditions of this document.
     * 
     * @return
     *     possible object is
     *     {@link PaymentConditionsType }
     *     
     */
    public PaymentConditionsType getPaymentConditions() {
        return paymentConditions;
    }

    /**
     * Sets the value of the paymentConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentConditionsType }
     *     
     */
    public void setPaymentConditions(PaymentConditionsType value) {
        this.paymentConditions = value;
    }

    /**
     * Used to provide presentation details for the document.
     * 
     * @return
     *     possible object is
     *     {@link PresentationDetailsType }
     *     
     */
    public PresentationDetailsType getPresentationDetails() {
        return presentationDetails;
    }

    /**
     * Sets the value of the presentationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationDetailsType }
     *     
     */
    public void setPresentationDetails(PresentationDetailsType value) {
        this.presentationDetails = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentsType }
     *     
     */
    public AttachmentsType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentsType }
     *     
     */
    public void setAttachments(AttachmentsType value) {
        this.attachments = value;
    }

    /**
     * Any further elements or attributes which are necessary for the ERPEL document may be provided here. Note that extensions should be used with care and only those extensions shall be used, which are  officially provided by ERPEL.
     * 
     * @return
     *     possible object is
     *     {@link DocumentExtensionType }
     *     
     */
    public DocumentExtensionType getDocumentExtension() {
        return documentExtension;
    }

    /**
     * Sets the value of the documentExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentExtensionType }
     *     
     */
    public void setDocumentExtension(DocumentExtensionType value) {
        this.documentExtension = value;
    }

    /**
     * The name of the system which has been used to generate the document.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneratingSystem() {
        return generatingSystem;
    }

    /**
     * Sets the value of the generatingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneratingSystem(String value) {
        this.generatingSystem = value;
    }

    /**
     * In case a previously sent ERPEL document shall be cancelled, this attribute may be used. In this case the document number of the document to cancel must be provided in this attribute.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelledOriginalDocument() {
        return cancelledOriginalDocument;
    }

    /**
     * Sets the value of the cancelledOriginalDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelledOriginalDocument(String value) {
        this.cancelledOriginalDocument = value;
    }

    /**
     * The document type of the current document.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTypeType }
     *     
     */
    public DocumentTypeType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTypeType }
     *     
     */
    public void setDocumentType(DocumentTypeType value) {
        this.documentType = value;
    }

    /**
     * The currency in which the monetary values of the document are provided. Codes according to ISO 4217 must be used.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getDocumentCurrency() {
        return documentCurrency;
    }

    /**
     * Sets the value of the documentCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setDocumentCurrency(CurrencyType value) {
        this.documentCurrency = value;
    }

    /**
     * If this attribute is set to true, the issuer of the document signalizes the recipient of the document that the document shall be checked manual upon receipt before any automated processing takes place.
     * 				This might for instance occur if previously untested fields are set or tests shall be conducted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManualProcessing() {
        return manualProcessing;
    }

    /**
     * Sets the value of the manualProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManualProcessing(Boolean value) {
        this.manualProcessing = value;
    }

    /**
     * The free-text title of the document.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTitle() {
        return documentTitle;
    }

    /**
     * Sets the value of the documentTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTitle(String value) {
        this.documentTitle = value;
    }

    /**
     * The language used throughout the document. Codes according to  ISO 639-2 must be used.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * @Deprecated. Indicates whether prices in this document are provided in gross or in net.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGrossPrice() {
        return isGrossPrice;
    }

    /**
     * Sets the value of the isGrossPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGrossPrice(Boolean value) {
        this.isGrossPrice = value;
    }

}
