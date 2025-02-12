
package at.erpel.schemas._1p0.documents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import at.erpel.schemas._1p0.documents.ext.PlanningQuantityExtensionType;


/**
 * <p>Java class for PlanningQuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlanningQuantityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlanningQuantity" type="{http://erpel.at/schemas/1p0/documents}ConditionalUnitType" minOccurs="0"/&gt;
 *         &lt;element name="BackorderQuantity" type="{http://erpel.at/schemas/1p0/documents}ConditionalUnitType" minOccurs="0"/&gt;
 *         &lt;element name="ImmediateRequestQuantity" type="{http://erpel.at/schemas/1p0/documents}ConditionalUnitType" minOccurs="0"/&gt;
 *         &lt;element name="RequestedShipmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EarliestShipmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LatestShipmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="WeeklyPeriodEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryPlanStatusIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FrequencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryRequirements" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DespatchPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CumulativeQuantity" type="{http://erpel.at/schemas/1p0/documents}ConditionalUnitType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/ext}PlanningQuantityExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanningQuantityType", propOrder = {
    "planningQuantity",
    "backorderQuantity",
    "immediateRequestQuantity",
    "requestedShipmentDate",
    "earliestShipmentDate",
    "latestShipmentDate",
    "weeklyPeriodEndDate",
    "deliveryPlanStatusIdentifier",
    "frequencyIdentifier",
    "deliveryRequirements",
    "despatchPattern",
    "cumulativeQuantity",
    "planningQuantityExtension"
})
public class PlanningQuantityType {

    @XmlElement(name = "PlanningQuantity")
    protected ConditionalUnitType planningQuantity;
    @XmlElement(name = "BackorderQuantity")
    protected ConditionalUnitType backorderQuantity;
    @XmlElement(name = "ImmediateRequestQuantity")
    protected ConditionalUnitType immediateRequestQuantity;
    @XmlElement(name = "RequestedShipmentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestedShipmentDate;
    @XmlElement(name = "EarliestShipmentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestShipmentDate;
    @XmlElement(name = "LatestShipmentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestShipmentDate;
    @XmlElement(name = "WeeklyPeriodEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar weeklyPeriodEndDate;
    @XmlElement(name = "DeliveryPlanStatusIdentifier")
    protected String deliveryPlanStatusIdentifier;
    @XmlElement(name = "FrequencyIdentifier")
    protected String frequencyIdentifier;
    @XmlElement(name = "DeliveryRequirements")
    protected String deliveryRequirements;
    @XmlElement(name = "DespatchPattern")
    protected String despatchPattern;
    @XmlElement(name = "CumulativeQuantity")
    protected ConditionalUnitType cumulativeQuantity;
    @XmlElement(name = "PlanningQuantityExtension", namespace = "http://erpel.at/schemas/1p0/documents/ext")
    protected PlanningQuantityExtensionType planningQuantityExtension;

    /**
     * Gets the value of the planningQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalUnitType }
     *     
     */
    public ConditionalUnitType getPlanningQuantity() {
        return planningQuantity;
    }

    /**
     * Sets the value of the planningQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalUnitType }
     *     
     */
    public void setPlanningQuantity(ConditionalUnitType value) {
        this.planningQuantity = value;
    }

    /**
     * Gets the value of the backorderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalUnitType }
     *     
     */
    public ConditionalUnitType getBackorderQuantity() {
        return backorderQuantity;
    }

    /**
     * Sets the value of the backorderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalUnitType }
     *     
     */
    public void setBackorderQuantity(ConditionalUnitType value) {
        this.backorderQuantity = value;
    }

    /**
     * Gets the value of the immediateRequestQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalUnitType }
     *     
     */
    public ConditionalUnitType getImmediateRequestQuantity() {
        return immediateRequestQuantity;
    }

    /**
     * Sets the value of the immediateRequestQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalUnitType }
     *     
     */
    public void setImmediateRequestQuantity(ConditionalUnitType value) {
        this.immediateRequestQuantity = value;
    }

    /**
     * Gets the value of the requestedShipmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedShipmentDate() {
        return requestedShipmentDate;
    }

    /**
     * Sets the value of the requestedShipmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedShipmentDate(XMLGregorianCalendar value) {
        this.requestedShipmentDate = value;
    }

    /**
     * Gets the value of the earliestShipmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestShipmentDate() {
        return earliestShipmentDate;
    }

    /**
     * Sets the value of the earliestShipmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestShipmentDate(XMLGregorianCalendar value) {
        this.earliestShipmentDate = value;
    }

    /**
     * Gets the value of the latestShipmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestShipmentDate() {
        return latestShipmentDate;
    }

    /**
     * Sets the value of the latestShipmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestShipmentDate(XMLGregorianCalendar value) {
        this.latestShipmentDate = value;
    }

    /**
     * Gets the value of the weeklyPeriodEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWeeklyPeriodEndDate() {
        return weeklyPeriodEndDate;
    }

    /**
     * Sets the value of the weeklyPeriodEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWeeklyPeriodEndDate(XMLGregorianCalendar value) {
        this.weeklyPeriodEndDate = value;
    }

    /**
     * Gets the value of the deliveryPlanStatusIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPlanStatusIdentifier() {
        return deliveryPlanStatusIdentifier;
    }

    /**
     * Sets the value of the deliveryPlanStatusIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPlanStatusIdentifier(String value) {
        this.deliveryPlanStatusIdentifier = value;
    }

    /**
     * Gets the value of the frequencyIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyIdentifier() {
        return frequencyIdentifier;
    }

    /**
     * Sets the value of the frequencyIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyIdentifier(String value) {
        this.frequencyIdentifier = value;
    }

    /**
     * Gets the value of the deliveryRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryRequirements() {
        return deliveryRequirements;
    }

    /**
     * Sets the value of the deliveryRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryRequirements(String value) {
        this.deliveryRequirements = value;
    }

    /**
     * Gets the value of the despatchPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDespatchPattern() {
        return despatchPattern;
    }

    /**
     * Sets the value of the despatchPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDespatchPattern(String value) {
        this.despatchPattern = value;
    }

    /**
     * Gets the value of the cumulativeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalUnitType }
     *     
     */
    public ConditionalUnitType getCumulativeQuantity() {
        return cumulativeQuantity;
    }

    /**
     * Sets the value of the cumulativeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalUnitType }
     *     
     */
    public void setCumulativeQuantity(ConditionalUnitType value) {
        this.cumulativeQuantity = value;
    }

    /**
     * Gets the value of the planningQuantityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link PlanningQuantityExtensionType }
     *     
     */
    public PlanningQuantityExtensionType getPlanningQuantityExtension() {
        return planningQuantityExtension;
    }

    /**
     * Sets the value of the planningQuantityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanningQuantityExtensionType }
     *     
     */
    public void setPlanningQuantityExtension(PlanningQuantityExtensionType value) {
        this.planningQuantityExtension = value;
    }

}
