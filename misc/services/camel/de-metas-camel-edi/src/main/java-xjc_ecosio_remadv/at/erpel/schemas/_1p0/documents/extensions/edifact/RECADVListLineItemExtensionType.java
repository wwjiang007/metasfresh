
package at.erpel.schemas._1p0.documents.extensions.edifact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RECADVListLineItemExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RECADVListLineItemExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}OrderedQuantity" minOccurs="0"/&gt;
 *         &lt;element name="DeliveredQuantity" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}UnitType" minOccurs="0"/&gt;
 *         &lt;element name="QuantityVariances" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}UnitType" minOccurs="0"/&gt;
 *         &lt;element name="VariancesReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContractReference" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}ReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RECADVListLineItemExtensionType", propOrder = {
    "orderedQuantity",
    "deliveredQuantity",
    "quantityVariances",
    "variancesReasonCode",
    "contractReference"
})
public class RECADVListLineItemExtensionType {

    @XmlElement(name = "OrderedQuantity")
    protected UnitType orderedQuantity;
    @XmlElement(name = "DeliveredQuantity")
    protected UnitType deliveredQuantity;
    @XmlElement(name = "QuantityVariances")
    protected UnitType quantityVariances;
    @XmlElement(name = "VariancesReasonCode")
    protected String variancesReasonCode;
    @XmlElement(name = "ContractReference")
    protected ReferenceType contractReference;

    /**
     * DEPRICATED - Please use "ListLineItemExtension/OrderedQuantity" instead.
     * 
     * @return
     *     possible object is
     *     {@link UnitType }
     *     
     */
    public UnitType getOrderedQuantity() {
        return orderedQuantity;
    }

    /**
     * Sets the value of the orderedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitType }
     *     
     */
    public void setOrderedQuantity(UnitType value) {
        this.orderedQuantity = value;
    }

    /**
     * Gets the value of the deliveredQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link UnitType }
     *     
     */
    public UnitType getDeliveredQuantity() {
        return deliveredQuantity;
    }

    /**
     * Sets the value of the deliveredQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitType }
     *     
     */
    public void setDeliveredQuantity(UnitType value) {
        this.deliveredQuantity = value;
    }

    /**
     * Gets the value of the quantityVariances property.
     * 
     * @return
     *     possible object is
     *     {@link UnitType }
     *     
     */
    public UnitType getQuantityVariances() {
        return quantityVariances;
    }

    /**
     * Sets the value of the quantityVariances property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitType }
     *     
     */
    public void setQuantityVariances(UnitType value) {
        this.quantityVariances = value;
    }

    /**
     * Gets the value of the variancesReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariancesReasonCode() {
        return variancesReasonCode;
    }

    /**
     * Sets the value of the variancesReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariancesReasonCode(String value) {
        this.variancesReasonCode = value;
    }

    /**
     * Gets the value of the contractReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getContractReference() {
        return contractReference;
    }

    /**
     * Sets the value of the contractReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setContractReference(ReferenceType value) {
        this.contractReference = value;
    }

}
