
package at.erpel.schemas._1p0.documents.extensions.edifact;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ORDERSExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ORDERSExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderReference" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="OrderedByPartyGLN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgreementNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeForPayment" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}FreeText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}ConsignmentReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ORDERSExtensionType", propOrder = {
    "orderReference",
    "orderedByPartyGLN",
    "contractNumber",
    "agreementNumber",
    "timeForPayment",
    "freeText",
    "consignmentReference"
})
public class ORDERSExtensionType {

    @XmlElement(name = "OrderReference")
    protected ReferenceType orderReference;
    @XmlElement(name = "OrderedByPartyGLN")
    protected String orderedByPartyGLN;
    @XmlElement(name = "ContractNumber")
    protected String contractNumber;
    @XmlElement(name = "AgreementNumber")
    protected String agreementNumber;
    @XmlElement(name = "TimeForPayment")
    protected BigInteger timeForPayment;
    @XmlElement(name = "FreeText")
    protected List<FreeTextType> freeText;
    @XmlElement(name = "ConsignmentReference")
    protected String consignmentReference;

    /**
     * Gets the value of the orderReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getOrderReference() {
        return orderReference;
    }

    /**
     * Sets the value of the orderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setOrderReference(ReferenceType value) {
        this.orderReference = value;
    }

    /**
     * Gets the value of the orderedByPartyGLN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderedByPartyGLN() {
        return orderedByPartyGLN;
    }

    /**
     * Sets the value of the orderedByPartyGLN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderedByPartyGLN(String value) {
        this.orderedByPartyGLN = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the agreementNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementNumber() {
        return agreementNumber;
    }

    /**
     * Sets the value of the agreementNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementNumber(String value) {
        this.agreementNumber = value;
    }

    /**
     * Gets the value of the timeForPayment property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeForPayment() {
        return timeForPayment;
    }

    /**
     * Sets the value of the timeForPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeForPayment(BigInteger value) {
        this.timeForPayment = value;
    }

    /**
     * Additional free text.Gets the value of the freeText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeTextType }
     * 
     * 
     */
    public List<FreeTextType> getFreeText() {
        if (freeText == null) {
            freeText = new ArrayList<FreeTextType>();
        }
        return this.freeText;
    }

    /**
     * Reference to the consignment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignmentReference() {
        return consignmentReference;
    }

    /**
     * Sets the value of the consignmentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignmentReference(String value) {
        this.consignmentReference = value;
    }

}
