
package at.erpel.schemas._1p0.documents.extensions.edifact;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the at.erpel.schemas._1p0.documents.extensions.edifact package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AdditionalBankAccount_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "AdditionalBankAccount");
    private final static QName _AdditionalBusinessPartner_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "AdditionalBusinessPartner");
    private final static QName _AdditionalReference_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "AdditionalReference");
    private final static QName _AdditionalQuantitiy_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "AdditionalQuantitiy");
    private final static QName _ActualInventoryQuantity_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "ActualInventoryQuantity");
    private final static QName _Address_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "Address");
    private final static QName _AddressExtension_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "AddressExtension");
    private final static QName _AdjustmentMonetaryAmount_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "AdjustmentMonetaryAmount");
    private final static QName _BookingDate_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "BookingDate");
    private final static QName _BusinessEntityTypeQualifier_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "BusinessEntityTypeQualifier");
    private final static QName _CommissionBaseAmount_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "CommissionBaseAmount");
    private final static QName _ConsignmentItemInformationExtension_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "ConsignmentItemInformationExtension");
    private final static QName _ConsumerUnitEAN_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "ConsumerUnitEAN");
    private final static QName _CurrencyCode_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "CurrencyCode");
    private final static QName _CustomerExtension_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "CustomerExtension");
    private final static QName _DeliveryDetailsExtension_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "DeliveryDetailsExtension");
    private final static QName _DeliveryRecipientExtension_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "DeliveryRecipientExtension");
    private final static QName _DocumentExtension_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "DocumentExtension");
    private final static QName _DocumentReference_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "DocumentReference");
    private final static QName _ForecastListLineItemExtension_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "ForecastListLineItemExtension");
    private final static QName _InvoiceRecipientExtension_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "InvoiceRecipientExtension");
    private final static QName _ListLineItemExtension_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "ListLineItemExtension");
    private final static QName _OrderingPartyExtension_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "OrderingPartyExtension");
    private final static QName _PaymentConditionsExtension_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "PaymentConditionsExtension");
    private final static QName _PlanningQuantityExtension_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "PlanningQuantityExtension");
    private final static QName _PresentationDetailsExtension_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "PresentationDetailsExtension");
    private final static QName _ReductionExtension_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "ReductionExtension");
    private final static QName _ShipperExtension_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "ShipperExtension");
    private final static QName _SupplierExtension_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "SupplierExtension");
    private final static QName _TaxExtension_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "TaxExtension");
    private final static QName _AdditionalChargesAndReductions_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "AdditionalChargesAndReductions");
    private final static QName _Adjustment_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "Adjustment");
    private final static QName _AgencyCode_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "AgencyCode");
    private final static QName _Amount_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "Amount");
    private final static QName _ArticleNumber_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "ArticleNumber");
    private final static QName _ConsignmentReference_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "ConsignmentReference");
    private final static QName _Comment_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "Comment");
    private final static QName _Contact_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "Contact");
    private final static QName _CostUnit_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "CostUnit");
    private final static QName _Country_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "Country");
    private final static QName _Date_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "Date");
    private final static QName _DeliveryRequirementsCoded_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "DeliveryRequirementsCoded");
    private final static QName _Department_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "Department");
    private final static QName _Description_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "Description");
    private final static QName _DocumentID_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "DocumentID");
    private final static QName _DocumentPositionNumber_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "DocumentPositionNumber");
    private final static QName _DocumentType_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "DocumentType");
    private final static QName _DomesticAmount_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "DomesticAmount");
    private final static QName _Email_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "Email");
    private final static QName _FiscalNumber_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "FiscalNumber");
    private final static QName _FreeText_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "FreeText");
    private final static QName _FromDate_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "FromDate");
    private final static QName _FTX_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "FTX");
    private final static QName _FurtherIdentification_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "FurtherIdentification");
    private final static QName _GLN_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "GLN");
    private final static QName _Height_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "Height");
    private final static QName _InventoryAdjustmentQuantity_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "InventoryAdjustmentQuantity");
    private final static QName _InvoiceFooter_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "InvoiceFooter");
    private final static QName _InvoiceSettlementDate_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "InvoiceSettlementDate");
    private final static QName _Item_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "Item");
    private final static QName _Language_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "Language");
    private final static QName _LegalFormOfCompany_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "LegalFormOfCompany");
    private final static QName _Length_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "Length");
    private final static QName _Name_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "Name");
    private final static QName _MaterialAuthorizationDuration_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "MaterialAuthorizationDuration");
    private final static QName _MessageFunction_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "MessageFunction");
    private final static QName _NumberOfPromotion_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "NumberOfPromotion");
    private final static QName _ReportingPeriod_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "ReportingPeriod");
    private final static QName _OrderedQuantity_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "OrderedQuantity");
    private final static QName _OtherTax_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "OtherTax");
    private final static QName _PackagingDimensions_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "PackagingDimensions");
    private final static QName _PaymentCondition_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "PaymentCondition");
    private final static QName _PaymentDueDate_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "PaymentDueDate");
    private final static QName _PaymentMeans_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "PaymentMeans");
    private final static QName _Phone_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "Phone");
    private final static QName _POBox_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "POBox");
    private final static QName _ProductionAuthorizationDuration_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "ProductionAuthorizationDuration");
    private final static QName _Qualifier_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "Qualifier");
    private final static QName _Quantity_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "Quantity");
    private final static QName _ReferenceDate_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "ReferenceDate");
    private final static QName _ReportingDate_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "ReportingDate");
    private final static QName _RegisteredOfficeOfCompany_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "RegisteredOfficeOfCompany");
    private final static QName _Salutation_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "Salutation");
    private final static QName _ShipFrom_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "ShipFrom");
    private final static QName _StatusIndicator_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "StatusIndicator");
    private final static QName _Street_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "Street");
    private final static QName _Subject_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "Subject");
    private final static QName _TargetCurrency_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "TargetCurrency");
    private final static QName _Tax_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "Tax");
    private final static QName _TaxedAmount_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "TaxedAmount");
    private final static QName _TaxExemption_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "TaxExemption");
    private final static QName _Text_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "Text");
    private final static QName _TextCode_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "TextCode");
    private final static QName _ToDate_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "ToDate");
    private final static QName _Town_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "Town");
    private final static QName _TribnalPlaceRegistrationLocation_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "TribnalPlaceRegistrationLocation");
    private final static QName _VAT_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "VAT");
    private final static QName _VATIdentificationNumber_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "VATIdentificationNumber");
    private final static QName _Width_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "Width");
    private final static QName _ZIP_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "ZIP");
    private final static QName _SLSRPTExtensionTypePointOfSales_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "PointOfSales");
    private final static QName _SLSRPTExtensionTypeSalesDate_QNAME = new QName("http://erpel.at/schemas/1p0/documents/extensions/edifact", "SalesDate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.erpel.schemas._1p0.documents.extensions.edifact
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link REMADVListLineItemExtensionType }
     * 
     */
    public REMADVListLineItemExtensionType createREMADVListLineItemExtensionType() {
        return new REMADVListLineItemExtensionType();
    }

    /**
     * Create an instance of {@link REMADVExtensionType }
     * 
     */
    public REMADVExtensionType createREMADVExtensionType() {
        return new REMADVExtensionType();
    }

    /**
     * Create an instance of {@link REMADVExtensionType.Adjustment }
     * 
     */
    public REMADVExtensionType.Adjustment createREMADVExtensionTypeAdjustment() {
        return new REMADVExtensionType.Adjustment();
    }

    /**
     * Create an instance of {@link SizeType }
     * 
     */
    public SizeType createSizeType() {
        return new SizeType();
    }

    /**
     * Create an instance of {@link ProductGroupType }
     * 
     */
    public ProductGroupType createProductGroupType() {
        return new ProductGroupType();
    }

    /**
     * Create an instance of {@link ProductGroupType.SubGroups }
     * 
     */
    public ProductGroupType.SubGroups createProductGroupTypeSubGroups() {
        return new ProductGroupType.SubGroups();
    }

    /**
     * Create an instance of {@link PRICATListLineItemExtensionType }
     * 
     */
    public PRICATListLineItemExtensionType createPRICATListLineItemExtensionType() {
        return new PRICATListLineItemExtensionType();
    }

    /**
     * Create an instance of {@link PRICATListLineItemExtensionType.PriceSpecification }
     * 
     */
    public PRICATListLineItemExtensionType.PriceSpecification createPRICATListLineItemExtensionTypePriceSpecification() {
        return new PRICATListLineItemExtensionType.PriceSpecification();
    }

    /**
     * Create an instance of {@link PRICATListLineItemExtensionType.ProductSpecification }
     * 
     */
    public PRICATListLineItemExtensionType.ProductSpecification createPRICATListLineItemExtensionTypeProductSpecification() {
        return new PRICATListLineItemExtensionType.ProductSpecification();
    }

    /**
     * Create an instance of {@link PRICATListLineItemExtensionType.ProductSpecification.Appearance }
     * 
     */
    public PRICATListLineItemExtensionType.ProductSpecification.Appearance createPRICATListLineItemExtensionTypeProductSpecificationAppearance() {
        return new PRICATListLineItemExtensionType.ProductSpecification.Appearance();
    }

    /**
     * Create an instance of {@link PRICATListLineItemExtensionType.ProductSpecification.Measurements }
     * 
     */
    public PRICATListLineItemExtensionType.ProductSpecification.Measurements createPRICATListLineItemExtensionTypeProductSpecificationMeasurements() {
        return new PRICATListLineItemExtensionType.ProductSpecification.Measurements();
    }

    /**
     * Create an instance of {@link ORDRSPListLineItemExtensionType }
     * 
     */
    public ORDRSPListLineItemExtensionType createORDRSPListLineItemExtensionType() {
        return new ORDRSPListLineItemExtensionType();
    }

    /**
     * Create an instance of {@link ORDRSPListLineItemExtensionType.Condition }
     * 
     */
    public ORDRSPListLineItemExtensionType.Condition createORDRSPListLineItemExtensionTypeCondition() {
        return new ORDRSPListLineItemExtensionType.Condition();
    }

    /**
     * Create an instance of {@link ORDRSPListLineItemExtensionType.Condition.ScheduledConditions }
     * 
     */
    public ORDRSPListLineItemExtensionType.Condition.ScheduledConditions createORDRSPListLineItemExtensionTypeConditionScheduledConditions() {
        return new ORDRSPListLineItemExtensionType.Condition.ScheduledConditions();
    }

    /**
     * Create an instance of {@link ORDERSListLineItemExtensionType }
     * 
     */
    public ORDERSListLineItemExtensionType createORDERSListLineItemExtensionType() {
        return new ORDERSListLineItemExtensionType();
    }

    /**
     * Create an instance of {@link INVRPTListLineItemExtensionType }
     * 
     */
    public INVRPTListLineItemExtensionType createINVRPTListLineItemExtensionType() {
        return new INVRPTListLineItemExtensionType();
    }

    /**
     * Create an instance of {@link INVRPTListLineItemExtensionType.Details }
     * 
     */
    public INVRPTListLineItemExtensionType.Details createINVRPTListLineItemExtensionTypeDetails() {
        return new INVRPTListLineItemExtensionType.Details();
    }

    /**
     * Create an instance of {@link INVRPTListLineItemExtensionType.Details.InventoryDates }
     * 
     */
    public INVRPTListLineItemExtensionType.Details.InventoryDates createINVRPTListLineItemExtensionTypeDetailsInventoryDates() {
        return new INVRPTListLineItemExtensionType.Details.InventoryDates();
    }

    /**
     * Create an instance of {@link INVRPTListLineItemExtensionType.Details.InventoryQuantities }
     * 
     */
    public INVRPTListLineItemExtensionType.Details.InventoryQuantities createINVRPTListLineItemExtensionTypeDetailsInventoryQuantities() {
        return new INVRPTListLineItemExtensionType.Details.InventoryQuantities();
    }

    /**
     * Create an instance of {@link INVOICExtensionType }
     * 
     */
    public INVOICExtensionType createINVOICExtensionType() {
        return new INVOICExtensionType();
    }

    /**
     * Create an instance of {@link AdditionalCostsType }
     * 
     */
    public AdditionalCostsType createAdditionalCostsType() {
        return new AdditionalCostsType();
    }

    /**
     * Create an instance of {@link FreeTextType }
     * 
     */
    public FreeTextType createFreeTextType() {
        return new FreeTextType();
    }

    /**
     * Create an instance of {@link AdditionalChargesAndReductionsType }
     * 
     */
    public AdditionalChargesAndReductionsType createAdditionalChargesAndReductionsType() {
        return new AdditionalChargesAndReductionsType();
    }

    /**
     * Create an instance of {@link ListLineItemExtensionType }
     * 
     */
    public ListLineItemExtensionType createListLineItemExtensionType() {
        return new ListLineItemExtensionType();
    }

    /**
     * Create an instance of {@link ListLineItemExtensionType.QuantitySchedules }
     * 
     */
    public ListLineItemExtensionType.QuantitySchedules createListLineItemExtensionTypeQuantitySchedules() {
        return new ListLineItemExtensionType.QuantitySchedules();
    }

    /**
     * Create an instance of {@link ListLineItemExtensionType.QuantitySchedules.Schedule }
     * 
     */
    public ListLineItemExtensionType.QuantitySchedules.Schedule createListLineItemExtensionTypeQuantitySchedulesSchedule() {
        return new ListLineItemExtensionType.QuantitySchedules.Schedule();
    }

    /**
     * Create an instance of {@link ListLineItemExtensionType.QuantitySchedules.Schedule.ScheduledQuantities }
     * 
     */
    public ListLineItemExtensionType.QuantitySchedules.Schedule.ScheduledQuantities createListLineItemExtensionTypeQuantitySchedulesScheduleScheduledQuantities() {
        return new ListLineItemExtensionType.QuantitySchedules.Schedule.ScheduledQuantities();
    }

    /**
     * Create an instance of {@link DocumentExtensionType }
     * 
     */
    public DocumentExtensionType createDocumentExtensionType() {
        return new DocumentExtensionType();
    }

    /**
     * Create an instance of {@link AdditionalBankAccountType }
     * 
     */
    public AdditionalBankAccountType createAdditionalBankAccountType() {
        return new AdditionalBankAccountType();
    }

    /**
     * Create an instance of {@link BusinessEntityType }
     * 
     */
    public BusinessEntityType createBusinessEntityType() {
        return new BusinessEntityType();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link ExtendedQuantityType }
     * 
     */
    public ExtendedQuantityType createExtendedQuantityType() {
        return new ExtendedQuantityType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link MonetaryAmountType }
     * 
     */
    public MonetaryAmountType createMonetaryAmountType() {
        return new MonetaryAmountType();
    }

    /**
     * Create an instance of {@link ExtendedDateType }
     * 
     */
    public ExtendedDateType createExtendedDateType() {
        return new ExtendedDateType();
    }

    /**
     * Create an instance of {@link ConsignmentItemInformationExtensionType }
     * 
     */
    public ConsignmentItemInformationExtensionType createConsignmentItemInformationExtensionType() {
        return new ConsignmentItemInformationExtensionType();
    }

    /**
     * Create an instance of {@link CustomerExtensionType }
     * 
     */
    public CustomerExtensionType createCustomerExtensionType() {
        return new CustomerExtensionType();
    }

    /**
     * Create an instance of {@link DeliveryDetailsExtensionType }
     * 
     */
    public DeliveryDetailsExtensionType createDeliveryDetailsExtensionType() {
        return new DeliveryDetailsExtensionType();
    }

    /**
     * Create an instance of {@link DeliveryRecipientExtensionType }
     * 
     */
    public DeliveryRecipientExtensionType createDeliveryRecipientExtensionType() {
        return new DeliveryRecipientExtensionType();
    }

    /**
     * Create an instance of {@link DocumentReferenceType }
     * 
     */
    public DocumentReferenceType createDocumentReferenceType() {
        return new DocumentReferenceType();
    }

    /**
     * Create an instance of {@link ForecastListLineItemExtensionType }
     * 
     */
    public ForecastListLineItemExtensionType createForecastListLineItemExtensionType() {
        return new ForecastListLineItemExtensionType();
    }

    /**
     * Create an instance of {@link InvoiceRecipientExtensionType }
     * 
     */
    public InvoiceRecipientExtensionType createInvoiceRecipientExtensionType() {
        return new InvoiceRecipientExtensionType();
    }

    /**
     * Create an instance of {@link OrderingPartyExtensionType }
     * 
     */
    public OrderingPartyExtensionType createOrderingPartyExtensionType() {
        return new OrderingPartyExtensionType();
    }

    /**
     * Create an instance of {@link PaymentConditionsExtensionType }
     * 
     */
    public PaymentConditionsExtensionType createPaymentConditionsExtensionType() {
        return new PaymentConditionsExtensionType();
    }

    /**
     * Create an instance of {@link PlanningQuantityExtensionType }
     * 
     */
    public PlanningQuantityExtensionType createPlanningQuantityExtensionType() {
        return new PlanningQuantityExtensionType();
    }

    /**
     * Create an instance of {@link PresentationDetailsExtensionType }
     * 
     */
    public PresentationDetailsExtensionType createPresentationDetailsExtensionType() {
        return new PresentationDetailsExtensionType();
    }

    /**
     * Create an instance of {@link ReductionExtensionType }
     * 
     */
    public ReductionExtensionType createReductionExtensionType() {
        return new ReductionExtensionType();
    }

    /**
     * Create an instance of {@link ShipperExtensionType }
     * 
     */
    public ShipperExtensionType createShipperExtensionType() {
        return new ShipperExtensionType();
    }

    /**
     * Create an instance of {@link SupplierExtensionType }
     * 
     */
    public SupplierExtensionType createSupplierExtensionType() {
        return new SupplierExtensionType();
    }

    /**
     * Create an instance of {@link TaxExtensionType }
     * 
     */
    public TaxExtensionType createTaxExtensionType() {
        return new TaxExtensionType();
    }

    /**
     * Create an instance of {@link AdjustmentType }
     * 
     */
    public AdjustmentType createAdjustmentType() {
        return new AdjustmentType();
    }

    /**
     * Create an instance of {@link ArticleNumberExtType }
     * 
     */
    public ArticleNumberExtType createArticleNumberExtType() {
        return new ArticleNumberExtType();
    }

    /**
     * Create an instance of {@link ContactType }
     * 
     */
    public ContactType createContactType() {
        return new ContactType();
    }

    /**
     * Create an instance of {@link CountryType }
     * 
     */
    public CountryType createCountryType() {
        return new CountryType();
    }

    /**
     * Create an instance of {@link DescriptionType }
     * 
     */
    public DescriptionType createDescriptionType() {
        return new DescriptionType();
    }

    /**
     * Create an instance of {@link DomesticAmountType }
     * 
     */
    public DomesticAmountType createDomesticAmountType() {
        return new DomesticAmountType();
    }

    /**
     * Create an instance of {@link FurtherIdentificationType }
     * 
     */
    public FurtherIdentificationType createFurtherIdentificationType() {
        return new FurtherIdentificationType();
    }

    /**
     * Create an instance of {@link UnitType }
     * 
     */
    public UnitType createUnitType() {
        return new UnitType();
    }

    /**
     * Create an instance of {@link InvoiceFooterType }
     * 
     */
    public InvoiceFooterType createInvoiceFooterType() {
        return new InvoiceFooterType();
    }

    /**
     * Create an instance of {@link ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link PeriodType }
     * 
     */
    public PeriodType createPeriodType() {
        return new PeriodType();
    }

    /**
     * Create an instance of {@link OtherTaxType }
     * 
     */
    public OtherTaxType createOtherTaxType() {
        return new OtherTaxType();
    }

    /**
     * Create an instance of {@link DimensionsType }
     * 
     */
    public DimensionsType createDimensionsType() {
        return new DimensionsType();
    }

    /**
     * Create an instance of {@link ShipFromType }
     * 
     */
    public ShipFromType createShipFromType() {
        return new ShipFromType();
    }

    /**
     * Create an instance of {@link TargetCurrencyType }
     * 
     */
    public TargetCurrencyType createTargetCurrencyType() {
        return new TargetCurrencyType();
    }

    /**
     * Create an instance of {@link TaxType }
     * 
     */
    public TaxType createTaxType() {
        return new TaxType();
    }

    /**
     * Create an instance of {@link VATType }
     * 
     */
    public VATType createVATType() {
        return new VATType();
    }

    /**
     * Create an instance of {@link BankCodeCType }
     * 
     */
    public BankCodeCType createBankCodeCType() {
        return new BankCodeCType();
    }

    /**
     * Create an instance of {@link CONTRLExtensionType }
     * 
     */
    public CONTRLExtensionType createCONTRLExtensionType() {
        return new CONTRLExtensionType();
    }

    /**
     * Create an instance of {@link DeliveryPointDetails }
     * 
     */
    public DeliveryPointDetails createDeliveryPointDetails() {
        return new DeliveryPointDetails();
    }

    /**
     * Create an instance of {@link DESADVExtensionType }
     * 
     */
    public DESADVExtensionType createDESADVExtensionType() {
        return new DESADVExtensionType();
    }

    /**
     * Create an instance of {@link DESADVListLineItemExtensionType }
     * 
     */
    public DESADVListLineItemExtensionType createDESADVListLineItemExtensionType() {
        return new DESADVListLineItemExtensionType();
    }

    /**
     * Create an instance of {@link ExtendedPeriodType }
     * 
     */
    public ExtendedPeriodType createExtendedPeriodType() {
        return new ExtendedPeriodType();
    }

    /**
     * Create an instance of {@link ForecastExtensionType }
     * 
     */
    public ForecastExtensionType createForecastExtensionType() {
        return new ForecastExtensionType();
    }

    /**
     * Create an instance of {@link GroupDescriptionType }
     * 
     */
    public GroupDescriptionType createGroupDescriptionType() {
        return new GroupDescriptionType();
    }

    /**
     * Create an instance of {@link INVOICListLineItemExtensionType }
     * 
     */
    public INVOICListLineItemExtensionType createINVOICListLineItemExtensionType() {
        return new INVOICListLineItemExtensionType();
    }

    /**
     * Create an instance of {@link ORDERSExtensionType }
     * 
     */
    public ORDERSExtensionType createORDERSExtensionType() {
        return new ORDERSExtensionType();
    }

    /**
     * Create an instance of {@link ORDRSPExtensionType }
     * 
     */
    public ORDRSPExtensionType createORDRSPExtensionType() {
        return new ORDRSPExtensionType();
    }

    /**
     * Create an instance of {@link PackagingInformationType }
     * 
     */
    public PackagingInformationType createPackagingInformationType() {
        return new PackagingInformationType();
    }

    /**
     * Create an instance of {@link PriceSpecificationType }
     * 
     */
    public PriceSpecificationType createPriceSpecificationType() {
        return new PriceSpecificationType();
    }

    /**
     * Create an instance of {@link RECADVExtensionType }
     * 
     */
    public RECADVExtensionType createRECADVExtensionType() {
        return new RECADVExtensionType();
    }

    /**
     * Create an instance of {@link RECADVListLineItemExtensionType }
     * 
     */
    public RECADVListLineItemExtensionType createRECADVListLineItemExtensionType() {
        return new RECADVListLineItemExtensionType();
    }

    /**
     * Create an instance of {@link RelatedDocumentsType }
     * 
     */
    public RelatedDocumentsType createRelatedDocumentsType() {
        return new RelatedDocumentsType();
    }

    /**
     * Create an instance of {@link SLSRPTExtensionType }
     * 
     */
    public SLSRPTExtensionType createSLSRPTExtensionType() {
        return new SLSRPTExtensionType();
    }

    /**
     * Create an instance of {@link SLSRPTListLineExtensionType }
     * 
     */
    public SLSRPTListLineExtensionType createSLSRPTListLineExtensionType() {
        return new SLSRPTListLineExtensionType();
    }

    /**
     * Create an instance of {@link UnitConversionType }
     * 
     */
    public UnitConversionType createUnitConversionType() {
        return new UnitConversionType();
    }

    /**
     * Create an instance of {@link UnitPriceExtType }
     * 
     */
    public UnitPriceExtType createUnitPriceExtType() {
        return new UnitPriceExtType();
    }

    /**
     * Create an instance of {@link REMADVListLineItemExtensionType.RelatedDates }
     * 
     */
    public REMADVListLineItemExtensionType.RelatedDates createREMADVListLineItemExtensionTypeRelatedDates() {
        return new REMADVListLineItemExtensionType.RelatedDates();
    }

    /**
     * Create an instance of {@link REMADVListLineItemExtensionType.RelatedReferences }
     * 
     */
    public REMADVListLineItemExtensionType.RelatedReferences createREMADVListLineItemExtensionTypeRelatedReferences() {
        return new REMADVListLineItemExtensionType.RelatedReferences();
    }

    /**
     * Create an instance of {@link REMADVListLineItemExtensionType.MonetaryAmounts }
     * 
     */
    public REMADVListLineItemExtensionType.MonetaryAmounts createREMADVListLineItemExtensionTypeMonetaryAmounts() {
        return new REMADVListLineItemExtensionType.MonetaryAmounts();
    }

    /**
     * Create an instance of {@link REMADVExtensionType.Adjustment.AdjustmentValues }
     * 
     */
    public REMADVExtensionType.Adjustment.AdjustmentValues createREMADVExtensionTypeAdjustmentAdjustmentValues() {
        return new REMADVExtensionType.Adjustment.AdjustmentValues();
    }

    /**
     * Create an instance of {@link SizeType.AdditionalSizeInformation }
     * 
     */
    public SizeType.AdditionalSizeInformation createSizeTypeAdditionalSizeInformation() {
        return new SizeType.AdditionalSizeInformation();
    }

    /**
     * Create an instance of {@link ProductGroupType.MainGroup }
     * 
     */
    public ProductGroupType.MainGroup createProductGroupTypeMainGroup() {
        return new ProductGroupType.MainGroup();
    }

    /**
     * Create an instance of {@link ProductGroupType.SubGroups.SubGroup }
     * 
     */
    public ProductGroupType.SubGroups.SubGroup createProductGroupTypeSubGroupsSubGroup() {
        return new ProductGroupType.SubGroups.SubGroup();
    }

    /**
     * Create an instance of {@link PRICATListLineItemExtensionType.ManufacturerSpecification }
     * 
     */
    public PRICATListLineItemExtensionType.ManufacturerSpecification createPRICATListLineItemExtensionTypeManufacturerSpecification() {
        return new PRICATListLineItemExtensionType.ManufacturerSpecification();
    }

    /**
     * Create an instance of {@link PRICATListLineItemExtensionType.DeliverySpecification }
     * 
     */
    public PRICATListLineItemExtensionType.DeliverySpecification createPRICATListLineItemExtensionTypeDeliverySpecification() {
        return new PRICATListLineItemExtensionType.DeliverySpecification();
    }

    /**
     * Create an instance of {@link PRICATListLineItemExtensionType.UnitSpecification }
     * 
     */
    public PRICATListLineItemExtensionType.UnitSpecification createPRICATListLineItemExtensionTypeUnitSpecification() {
        return new PRICATListLineItemExtensionType.UnitSpecification();
    }

    /**
     * Create an instance of {@link PRICATListLineItemExtensionType.PriceSpecification.Purchase }
     * 
     */
    public PRICATListLineItemExtensionType.PriceSpecification.Purchase createPRICATListLineItemExtensionTypePriceSpecificationPurchase() {
        return new PRICATListLineItemExtensionType.PriceSpecification.Purchase();
    }

    /**
     * Create an instance of {@link PRICATListLineItemExtensionType.PriceSpecification.Sales }
     * 
     */
    public PRICATListLineItemExtensionType.PriceSpecification.Sales createPRICATListLineItemExtensionTypePriceSpecificationSales() {
        return new PRICATListLineItemExtensionType.PriceSpecification.Sales();
    }

    /**
     * Create an instance of {@link PRICATListLineItemExtensionType.ProductSpecification.Season }
     * 
     */
    public PRICATListLineItemExtensionType.ProductSpecification.Season createPRICATListLineItemExtensionTypeProductSpecificationSeason() {
        return new PRICATListLineItemExtensionType.ProductSpecification.Season();
    }

    /**
     * Create an instance of {@link PRICATListLineItemExtensionType.ProductSpecification.Indicators }
     * 
     */
    public PRICATListLineItemExtensionType.ProductSpecification.Indicators createPRICATListLineItemExtensionTypeProductSpecificationIndicators() {
        return new PRICATListLineItemExtensionType.ProductSpecification.Indicators();
    }

    /**
     * Create an instance of {@link PRICATListLineItemExtensionType.ProductSpecification.AdditionalArticleNumber }
     * 
     */
    public PRICATListLineItemExtensionType.ProductSpecification.AdditionalArticleNumber createPRICATListLineItemExtensionTypeProductSpecificationAdditionalArticleNumber() {
        return new PRICATListLineItemExtensionType.ProductSpecification.AdditionalArticleNumber();
    }

    /**
     * Create an instance of {@link PRICATListLineItemExtensionType.ProductSpecification.Appearance.ColorInformation }
     * 
     */
    public PRICATListLineItemExtensionType.ProductSpecification.Appearance.ColorInformation createPRICATListLineItemExtensionTypeProductSpecificationAppearanceColorInformation() {
        return new PRICATListLineItemExtensionType.ProductSpecification.Appearance.ColorInformation();
    }

    /**
     * Create an instance of {@link PRICATListLineItemExtensionType.ProductSpecification.Measurements.Weight }
     * 
     */
    public PRICATListLineItemExtensionType.ProductSpecification.Measurements.Weight createPRICATListLineItemExtensionTypeProductSpecificationMeasurementsWeight() {
        return new PRICATListLineItemExtensionType.ProductSpecification.Measurements.Weight();
    }

    /**
     * Create an instance of {@link ORDRSPListLineItemExtensionType.ConfirmedQuantity }
     * 
     */
    public ORDRSPListLineItemExtensionType.ConfirmedQuantity createORDRSPListLineItemExtensionTypeConfirmedQuantity() {
        return new ORDRSPListLineItemExtensionType.ConfirmedQuantity();
    }

    /**
     * Create an instance of {@link ORDRSPListLineItemExtensionType.Condition.ScheduledConditions.Conditions }
     * 
     */
    public ORDRSPListLineItemExtensionType.Condition.ScheduledConditions.Conditions createORDRSPListLineItemExtensionTypeConditionScheduledConditionsConditions() {
        return new ORDRSPListLineItemExtensionType.Condition.ScheduledConditions.Conditions();
    }

    /**
     * Create an instance of {@link ORDRSPListLineItemExtensionType.Condition.ScheduledConditions.ScheduledQuantities }
     * 
     */
    public ORDRSPListLineItemExtensionType.Condition.ScheduledConditions.ScheduledQuantities createORDRSPListLineItemExtensionTypeConditionScheduledConditionsScheduledQuantities() {
        return new ORDRSPListLineItemExtensionType.Condition.ScheduledConditions.ScheduledQuantities();
    }

    /**
     * Create an instance of {@link ORDERSListLineItemExtensionType.ScheduledQuantity }
     * 
     */
    public ORDERSListLineItemExtensionType.ScheduledQuantity createORDERSListLineItemExtensionTypeScheduledQuantity() {
        return new ORDERSListLineItemExtensionType.ScheduledQuantity();
    }

    /**
     * Create an instance of {@link INVRPTListLineItemExtensionType.Details.Code }
     * 
     */
    public INVRPTListLineItemExtensionType.Details.Code createINVRPTListLineItemExtensionTypeDetailsCode() {
        return new INVRPTListLineItemExtensionType.Details.Code();
    }

    /**
     * Create an instance of {@link INVRPTListLineItemExtensionType.Details.InventoryReferences }
     * 
     */
    public INVRPTListLineItemExtensionType.Details.InventoryReferences createINVRPTListLineItemExtensionTypeDetailsInventoryReferences() {
        return new INVRPTListLineItemExtensionType.Details.InventoryReferences();
    }

    /**
     * Create an instance of {@link INVRPTListLineItemExtensionType.Details.InventoryDates.Date }
     * 
     */
    public INVRPTListLineItemExtensionType.Details.InventoryDates.Date createINVRPTListLineItemExtensionTypeDetailsInventoryDatesDate() {
        return new INVRPTListLineItemExtensionType.Details.InventoryDates.Date();
    }

    /**
     * Create an instance of {@link INVRPTListLineItemExtensionType.Details.InventoryQuantities.Quantity }
     * 
     */
    public INVRPTListLineItemExtensionType.Details.InventoryQuantities.Quantity createINVRPTListLineItemExtensionTypeDetailsInventoryQuantitiesQuantity() {
        return new INVRPTListLineItemExtensionType.Details.InventoryQuantities.Quantity();
    }

    /**
     * Create an instance of {@link INVOICExtensionType.InvoiceFooters }
     * 
     */
    public INVOICExtensionType.InvoiceFooters createINVOICExtensionTypeInvoiceFooters() {
        return new INVOICExtensionType.InvoiceFooters();
    }

    /**
     * Create an instance of {@link AdditionalCostsType.AdditionalCost }
     * 
     */
    public AdditionalCostsType.AdditionalCost createAdditionalCostsTypeAdditionalCost() {
        return new AdditionalCostsType.AdditionalCost();
    }

    /**
     * Create an instance of {@link FreeTextType.Row }
     * 
     */
    public FreeTextType.Row createFreeTextTypeRow() {
        return new FreeTextType.Row();
    }

    /**
     * Create an instance of {@link AdditionalChargesAndReductionsType.AdditionalChargeAndReduction }
     * 
     */
    public AdditionalChargesAndReductionsType.AdditionalChargeAndReduction createAdditionalChargesAndReductionsTypeAdditionalChargeAndReduction() {
        return new AdditionalChargesAndReductionsType.AdditionalChargeAndReduction();
    }

    /**
     * Create an instance of {@link ListLineItemExtensionType.QuantitySchedules.Schedule.Conditions }
     * 
     */
    public ListLineItemExtensionType.QuantitySchedules.Schedule.Conditions createListLineItemExtensionTypeQuantitySchedulesScheduleConditions() {
        return new ListLineItemExtensionType.QuantitySchedules.Schedule.Conditions();
    }

    /**
     * Create an instance of {@link ListLineItemExtensionType.QuantitySchedules.Schedule.ScheduledQuantities.Date }
     * 
     */
    public ListLineItemExtensionType.QuantitySchedules.Schedule.ScheduledQuantities.Date createListLineItemExtensionTypeQuantitySchedulesScheduleScheduledQuantitiesDate() {
        return new ListLineItemExtensionType.QuantitySchedules.Schedule.ScheduledQuantities.Date();
    }

    /**
     * Create an instance of {@link DocumentExtensionType.ControlTotal }
     * 
     */
    public DocumentExtensionType.ControlTotal createDocumentExtensionTypeControlTotal() {
        return new DocumentExtensionType.ControlTotal();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalBankAccountType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdditionalBankAccountType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "AdditionalBankAccount")
    public JAXBElement<AdditionalBankAccountType> createAdditionalBankAccount(AdditionalBankAccountType value) {
        return new JAXBElement<AdditionalBankAccountType>(_AdditionalBankAccount_QNAME, AdditionalBankAccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessEntityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BusinessEntityType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "AdditionalBusinessPartner")
    public JAXBElement<BusinessEntityType> createAdditionalBusinessPartner(BusinessEntityType value) {
        return new JAXBElement<BusinessEntityType>(_AdditionalBusinessPartner_QNAME, BusinessEntityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "AdditionalReference")
    public JAXBElement<ReferenceType> createAdditionalReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_AdditionalReference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedQuantityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExtendedQuantityType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "AdditionalQuantitiy")
    public JAXBElement<ExtendedQuantityType> createAdditionalQuantitiy(ExtendedQuantityType value) {
        return new JAXBElement<ExtendedQuantityType>(_AdditionalQuantitiy_QNAME, ExtendedQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedQuantityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExtendedQuantityType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "ActualInventoryQuantity")
    public JAXBElement<ExtendedQuantityType> createActualInventoryQuantity(ExtendedQuantityType value) {
        return new JAXBElement<ExtendedQuantityType>(_ActualInventoryQuantity_QNAME, ExtendedQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "Address")
    public JAXBElement<AddressType> createAddress(AddressType value) {
        return new JAXBElement<AddressType>(_Address_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "AddressExtension")
    public JAXBElement<String> createAddressExtension(String value) {
        return new JAXBElement<String>(_AddressExtension_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "AdjustmentMonetaryAmount")
    public JAXBElement<MonetaryAmountType> createAdjustmentMonetaryAmount(MonetaryAmountType value) {
        return new JAXBElement<MonetaryAmountType>(_AdjustmentMonetaryAmount_QNAME, MonetaryAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedDateType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExtendedDateType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "BookingDate")
    public JAXBElement<ExtendedDateType> createBookingDate(ExtendedDateType value) {
        return new JAXBElement<ExtendedDateType>(_BookingDate_QNAME, ExtendedDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "BusinessEntityTypeQualifier")
    public JAXBElement<String> createBusinessEntityTypeQualifier(String value) {
        return new JAXBElement<String>(_BusinessEntityTypeQualifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "CommissionBaseAmount")
    public JAXBElement<MonetaryAmountType> createCommissionBaseAmount(MonetaryAmountType value) {
        return new JAXBElement<MonetaryAmountType>(_CommissionBaseAmount_QNAME, MonetaryAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsignmentItemInformationExtensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsignmentItemInformationExtensionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "ConsignmentItemInformationExtension")
    public JAXBElement<ConsignmentItemInformationExtensionType> createConsignmentItemInformationExtension(ConsignmentItemInformationExtensionType value) {
        return new JAXBElement<ConsignmentItemInformationExtensionType>(_ConsignmentItemInformationExtension_QNAME, ConsignmentItemInformationExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "ConsumerUnitEAN")
    public JAXBElement<String> createConsumerUnitEAN(String value) {
        return new JAXBElement<String>(_ConsumerUnitEAN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "CurrencyCode")
    public JAXBElement<String> createCurrencyCode(String value) {
        return new JAXBElement<String>(_CurrencyCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerExtensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerExtensionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "CustomerExtension")
    public JAXBElement<CustomerExtensionType> createCustomerExtension(CustomerExtensionType value) {
        return new JAXBElement<CustomerExtensionType>(_CustomerExtension_QNAME, CustomerExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryDetailsExtensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeliveryDetailsExtensionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "DeliveryDetailsExtension")
    public JAXBElement<DeliveryDetailsExtensionType> createDeliveryDetailsExtension(DeliveryDetailsExtensionType value) {
        return new JAXBElement<DeliveryDetailsExtensionType>(_DeliveryDetailsExtension_QNAME, DeliveryDetailsExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryRecipientExtensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeliveryRecipientExtensionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "DeliveryRecipientExtension")
    public JAXBElement<DeliveryRecipientExtensionType> createDeliveryRecipientExtension(DeliveryRecipientExtensionType value) {
        return new JAXBElement<DeliveryRecipientExtensionType>(_DeliveryRecipientExtension_QNAME, DeliveryRecipientExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentExtensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentExtensionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "DocumentExtension")
    public JAXBElement<DocumentExtensionType> createDocumentExtension(DocumentExtensionType value) {
        return new JAXBElement<DocumentExtensionType>(_DocumentExtension_QNAME, DocumentExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "DocumentReference")
    public JAXBElement<DocumentReferenceType> createDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_DocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForecastListLineItemExtensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ForecastListLineItemExtensionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "ForecastListLineItemExtension")
    public JAXBElement<ForecastListLineItemExtensionType> createForecastListLineItemExtension(ForecastListLineItemExtensionType value) {
        return new JAXBElement<ForecastListLineItemExtensionType>(_ForecastListLineItemExtension_QNAME, ForecastListLineItemExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceRecipientExtensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvoiceRecipientExtensionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "InvoiceRecipientExtension")
    public JAXBElement<InvoiceRecipientExtensionType> createInvoiceRecipientExtension(InvoiceRecipientExtensionType value) {
        return new JAXBElement<InvoiceRecipientExtensionType>(_InvoiceRecipientExtension_QNAME, InvoiceRecipientExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListLineItemExtensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListLineItemExtensionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "ListLineItemExtension")
    public JAXBElement<ListLineItemExtensionType> createListLineItemExtension(ListLineItemExtensionType value) {
        return new JAXBElement<ListLineItemExtensionType>(_ListLineItemExtension_QNAME, ListLineItemExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderingPartyExtensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrderingPartyExtensionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "OrderingPartyExtension")
    public JAXBElement<OrderingPartyExtensionType> createOrderingPartyExtension(OrderingPartyExtensionType value) {
        return new JAXBElement<OrderingPartyExtensionType>(_OrderingPartyExtension_QNAME, OrderingPartyExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentConditionsExtensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentConditionsExtensionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "PaymentConditionsExtension")
    public JAXBElement<PaymentConditionsExtensionType> createPaymentConditionsExtension(PaymentConditionsExtensionType value) {
        return new JAXBElement<PaymentConditionsExtensionType>(_PaymentConditionsExtension_QNAME, PaymentConditionsExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanningQuantityExtensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PlanningQuantityExtensionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "PlanningQuantityExtension")
    public JAXBElement<PlanningQuantityExtensionType> createPlanningQuantityExtension(PlanningQuantityExtensionType value) {
        return new JAXBElement<PlanningQuantityExtensionType>(_PlanningQuantityExtension_QNAME, PlanningQuantityExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PresentationDetailsExtensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PresentationDetailsExtensionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "PresentationDetailsExtension")
    public JAXBElement<PresentationDetailsExtensionType> createPresentationDetailsExtension(PresentationDetailsExtensionType value) {
        return new JAXBElement<PresentationDetailsExtensionType>(_PresentationDetailsExtension_QNAME, PresentationDetailsExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReductionExtensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReductionExtensionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "ReductionExtension")
    public JAXBElement<ReductionExtensionType> createReductionExtension(ReductionExtensionType value) {
        return new JAXBElement<ReductionExtensionType>(_ReductionExtension_QNAME, ReductionExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipperExtensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShipperExtensionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "ShipperExtension")
    public JAXBElement<ShipperExtensionType> createShipperExtension(ShipperExtensionType value) {
        return new JAXBElement<ShipperExtensionType>(_ShipperExtension_QNAME, ShipperExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierExtensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SupplierExtensionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "SupplierExtension")
    public JAXBElement<SupplierExtensionType> createSupplierExtension(SupplierExtensionType value) {
        return new JAXBElement<SupplierExtensionType>(_SupplierExtension_QNAME, SupplierExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxExtensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TaxExtensionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "TaxExtension")
    public JAXBElement<TaxExtensionType> createTaxExtension(TaxExtensionType value) {
        return new JAXBElement<TaxExtensionType>(_TaxExtension_QNAME, TaxExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalChargesAndReductionsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdditionalChargesAndReductionsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "AdditionalChargesAndReductions")
    public JAXBElement<AdditionalChargesAndReductionsType> createAdditionalChargesAndReductions(AdditionalChargesAndReductionsType value) {
        return new JAXBElement<AdditionalChargesAndReductionsType>(_AdditionalChargesAndReductions_QNAME, AdditionalChargesAndReductionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdjustmentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdjustmentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "Adjustment")
    public JAXBElement<AdjustmentType> createAdjustment(AdjustmentType value) {
        return new JAXBElement<AdjustmentType>(_Adjustment_QNAME, AdjustmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "AgencyCode")
    public JAXBElement<String> createAgencyCode(String value) {
        return new JAXBElement<String>(_AgencyCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "Amount")
    public JAXBElement<BigDecimal> createAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Amount_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArticleNumberExtType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArticleNumberExtType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "ArticleNumber")
    public JAXBElement<ArticleNumberExtType> createArticleNumber(ArticleNumberExtType value) {
        return new JAXBElement<ArticleNumberExtType>(_ArticleNumber_QNAME, ArticleNumberExtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "ConsignmentReference")
    public JAXBElement<String> createConsignmentReference(String value) {
        return new JAXBElement<String>(_ConsignmentReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "Comment")
    public JAXBElement<String> createComment(String value) {
        return new JAXBElement<String>(_Comment_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "Contact")
    public JAXBElement<ContactType> createContact(ContactType value) {
        return new JAXBElement<ContactType>(_Contact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "CostUnit")
    public JAXBElement<String> createCostUnit(String value) {
        return new JAXBElement<String>(_CostUnit_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "Country")
    public JAXBElement<CountryType> createCountry(CountryType value) {
        return new JAXBElement<CountryType>(_Country_QNAME, CountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "Date")
    public JAXBElement<XMLGregorianCalendar> createDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_Date_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "DeliveryRequirementsCoded")
    public JAXBElement<String> createDeliveryRequirementsCoded(String value) {
        return new JAXBElement<String>(_DeliveryRequirementsCoded_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "Department")
    public JAXBElement<String> createDepartment(String value) {
        return new JAXBElement<String>(_Department_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescriptionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DescriptionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "Description")
    public JAXBElement<DescriptionType> createDescription(DescriptionType value) {
        return new JAXBElement<DescriptionType>(_Description_QNAME, DescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "DocumentID")
    public JAXBElement<String> createDocumentID(String value) {
        return new JAXBElement<String>(_DocumentID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "DocumentPositionNumber")
    public JAXBElement<String> createDocumentPositionNumber(String value) {
        return new JAXBElement<String>(_DocumentPositionNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentTypeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentTypeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "DocumentType")
    public JAXBElement<DocumentTypeType> createDocumentType(DocumentTypeType value) {
        return new JAXBElement<DocumentTypeType>(_DocumentType_QNAME, DocumentTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomesticAmountType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DomesticAmountType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "DomesticAmount")
    public JAXBElement<DomesticAmountType> createDomesticAmount(DomesticAmountType value) {
        return new JAXBElement<DomesticAmountType>(_DomesticAmount_QNAME, DomesticAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "Email")
    public JAXBElement<String> createEmail(String value) {
        return new JAXBElement<String>(_Email_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "FiscalNumber")
    public JAXBElement<String> createFiscalNumber(String value) {
        return new JAXBElement<String>(_FiscalNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreeTextType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FreeTextType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "FreeText")
    public JAXBElement<FreeTextType> createFreeText(FreeTextType value) {
        return new JAXBElement<FreeTextType>(_FreeText_QNAME, FreeTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "FromDate")
    public JAXBElement<XMLGregorianCalendar> createFromDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FromDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "FTX")
    public JAXBElement<String> createFTX(String value) {
        return new JAXBElement<String>(_FTX_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FurtherIdentificationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FurtherIdentificationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "FurtherIdentification")
    public JAXBElement<FurtherIdentificationType> createFurtherIdentification(FurtherIdentificationType value) {
        return new JAXBElement<FurtherIdentificationType>(_FurtherIdentification_QNAME, FurtherIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "GLN")
    public JAXBElement<String> createGLN(String value) {
        return new JAXBElement<String>(_GLN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnitType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "Height")
    public JAXBElement<UnitType> createHeight(UnitType value) {
        return new JAXBElement<UnitType>(_Height_QNAME, UnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedQuantityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExtendedQuantityType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "InventoryAdjustmentQuantity")
    public JAXBElement<ExtendedQuantityType> createInventoryAdjustmentQuantity(ExtendedQuantityType value) {
        return new JAXBElement<ExtendedQuantityType>(_InventoryAdjustmentQuantity_QNAME, ExtendedQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceFooterType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvoiceFooterType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "InvoiceFooter")
    public JAXBElement<InvoiceFooterType> createInvoiceFooter(InvoiceFooterType value) {
        return new JAXBElement<InvoiceFooterType>(_InvoiceFooter_QNAME, InvoiceFooterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedDateType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExtendedDateType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "InvoiceSettlementDate")
    public JAXBElement<ExtendedDateType> createInvoiceSettlementDate(ExtendedDateType value) {
        return new JAXBElement<ExtendedDateType>(_InvoiceSettlementDate_QNAME, ExtendedDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ItemType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "Item")
    public JAXBElement<ItemType> createItem(ItemType value) {
        return new JAXBElement<ItemType>(_Item_QNAME, ItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "Language")
    public JAXBElement<String> createLanguage(String value) {
        return new JAXBElement<String>(_Language_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "LegalFormOfCompany")
    public JAXBElement<String> createLegalFormOfCompany(String value) {
        return new JAXBElement<String>(_LegalFormOfCompany_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnitType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "Length")
    public JAXBElement<UnitType> createLength(UnitType value) {
        return new JAXBElement<UnitType>(_Length_QNAME, UnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "Name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "MaterialAuthorizationDuration")
    public JAXBElement<Duration> createMaterialAuthorizationDuration(Duration value) {
        return new JAXBElement<Duration>(_MaterialAuthorizationDuration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "MessageFunction")
    public JAXBElement<String> createMessageFunction(String value) {
        return new JAXBElement<String>(_MessageFunction_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "NumberOfPromotion")
    public JAXBElement<String> createNumberOfPromotion(String value) {
        return new JAXBElement<String>(_NumberOfPromotion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "ReportingPeriod")
    public JAXBElement<PeriodType> createReportingPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_ReportingPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnitType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "OrderedQuantity")
    public JAXBElement<UnitType> createOrderedQuantity(UnitType value) {
        return new JAXBElement<UnitType>(_OrderedQuantity_QNAME, UnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherTaxType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OtherTaxType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "OtherTax")
    public JAXBElement<OtherTaxType> createOtherTax(OtherTaxType value) {
        return new JAXBElement<OtherTaxType>(_OtherTax_QNAME, OtherTaxType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DimensionsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DimensionsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "PackagingDimensions")
    public JAXBElement<DimensionsType> createPackagingDimensions(DimensionsType value) {
        return new JAXBElement<DimensionsType>(_PackagingDimensions_QNAME, DimensionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "PaymentCondition")
    public JAXBElement<String> createPaymentCondition(String value) {
        return new JAXBElement<String>(_PaymentCondition_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedDateType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExtendedDateType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "PaymentDueDate")
    public JAXBElement<ExtendedDateType> createPaymentDueDate(ExtendedDateType value) {
        return new JAXBElement<ExtendedDateType>(_PaymentDueDate_QNAME, ExtendedDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "PaymentMeans")
    public JAXBElement<String> createPaymentMeans(String value) {
        return new JAXBElement<String>(_PaymentMeans_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "Phone")
    public JAXBElement<String> createPhone(String value) {
        return new JAXBElement<String>(_Phone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "POBox")
    public JAXBElement<String> createPOBox(String value) {
        return new JAXBElement<String>(_POBox_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "ProductionAuthorizationDuration")
    public JAXBElement<Duration> createProductionAuthorizationDuration(Duration value) {
        return new JAXBElement<Duration>(_ProductionAuthorizationDuration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "Qualifier")
    public JAXBElement<String> createQualifier(String value) {
        return new JAXBElement<String>(_Qualifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnitType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "Quantity")
    public JAXBElement<UnitType> createQuantity(UnitType value) {
        return new JAXBElement<UnitType>(_Quantity_QNAME, UnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "ReferenceDate")
    public JAXBElement<XMLGregorianCalendar> createReferenceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ReferenceDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "ReportingDate")
    public JAXBElement<XMLGregorianCalendar> createReportingDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ReportingDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "RegisteredOfficeOfCompany")
    public JAXBElement<String> createRegisteredOfficeOfCompany(String value) {
        return new JAXBElement<String>(_RegisteredOfficeOfCompany_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "Salutation")
    public JAXBElement<String> createSalutation(String value) {
        return new JAXBElement<String>(_Salutation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipFromType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShipFromType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "ShipFrom")
    public JAXBElement<ShipFromType> createShipFrom(ShipFromType value) {
        return new JAXBElement<ShipFromType>(_ShipFrom_QNAME, ShipFromType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "StatusIndicator")
    public JAXBElement<String> createStatusIndicator(String value) {
        return new JAXBElement<String>(_StatusIndicator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "Street")
    public JAXBElement<String> createStreet(String value) {
        return new JAXBElement<String>(_Street_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "Subject")
    public JAXBElement<String> createSubject(String value) {
        return new JAXBElement<String>(_Subject_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TargetCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "TargetCurrency")
    public JAXBElement<TargetCurrencyType> createTargetCurrency(TargetCurrencyType value) {
        return new JAXBElement<TargetCurrencyType>(_TargetCurrency_QNAME, TargetCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TaxType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "Tax")
    public JAXBElement<TaxType> createTax(TaxType value) {
        return new JAXBElement<TaxType>(_Tax_QNAME, TaxType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "TaxedAmount")
    public JAXBElement<BigDecimal> createTaxedAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TaxedAmount_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "TaxExemption")
    public JAXBElement<String> createTaxExemption(String value) {
        return new JAXBElement<String>(_TaxExemption_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "Text")
    public JAXBElement<String> createText(String value) {
        return new JAXBElement<String>(_Text_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "TextCode")
    public JAXBElement<String> createTextCode(String value) {
        return new JAXBElement<String>(_TextCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "ToDate")
    public JAXBElement<XMLGregorianCalendar> createToDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ToDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "Town")
    public JAXBElement<String> createTown(String value) {
        return new JAXBElement<String>(_Town_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "TribnalPlaceRegistrationLocation")
    public JAXBElement<String> createTribnalPlaceRegistrationLocation(String value) {
        return new JAXBElement<String>(_TribnalPlaceRegistrationLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VATType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VATType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "VAT")
    public JAXBElement<VATType> createVAT(VATType value) {
        return new JAXBElement<VATType>(_VAT_QNAME, VATType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "VATIdentificationNumber")
    public JAXBElement<String> createVATIdentificationNumber(String value) {
        return new JAXBElement<String>(_VATIdentificationNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnitType }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "Width")
    public JAXBElement<UnitType> createWidth(UnitType value) {
        return new JAXBElement<UnitType>(_Width_QNAME, UnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "ZIP")
    public JAXBElement<String> createZIP(String value) {
        return new JAXBElement<String>(_ZIP_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "PointOfSales", scope = SLSRPTExtensionType.class)
    public JAXBElement<String> createSLSRPTExtensionTypePointOfSales(String value) {
        return new JAXBElement<String>(_SLSRPTExtensionTypePointOfSales_QNAME, String.class, SLSRPTExtensionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", name = "SalesDate", scope = SLSRPTExtensionType.class)
    public JAXBElement<XMLGregorianCalendar> createSLSRPTExtensionTypeSalesDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SLSRPTExtensionTypeSalesDate_QNAME, XMLGregorianCalendar.class, SLSRPTExtensionType.class, value);
    }

}
