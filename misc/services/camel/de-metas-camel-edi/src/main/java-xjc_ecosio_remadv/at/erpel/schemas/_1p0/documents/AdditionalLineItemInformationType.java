
package at.erpel.schemas._1p0.documents;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AdditionalLineItemInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalLineItemInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}DrawingRevisionNumber" minOccurs="0"/&gt;
 *         &lt;element name="DrawingRevisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}EngineeringChangeNumber" minOccurs="0"/&gt;
 *         &lt;element name="ControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModelYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BuyersInternalProductGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentificationOfUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpecialConditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProgressNumberDifference" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="KanbanID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}Classification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalLineItemInformationType", propOrder = {
    "drawingRevisionNumber",
    "drawingRevisionDate",
    "engineeringChangeNumber",
    "controlNumber",
    "productionNumber",
    "modelYear",
    "buyersInternalProductGroupCode",
    "identificationOfUse",
    "specialConditions",
    "progressNumberDifference",
    "kanbanID",
    "classification"
})
public class AdditionalLineItemInformationType {

    @XmlElement(name = "DrawingRevisionNumber")
    protected String drawingRevisionNumber;
    @XmlElement(name = "DrawingRevisionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar drawingRevisionDate;
    @XmlElement(name = "EngineeringChangeNumber")
    protected String engineeringChangeNumber;
    @XmlElement(name = "ControlNumber")
    protected String controlNumber;
    @XmlElement(name = "ProductionNumber")
    protected String productionNumber;
    @XmlElement(name = "ModelYear")
    protected String modelYear;
    @XmlElement(name = "BuyersInternalProductGroupCode")
    protected String buyersInternalProductGroupCode;
    @XmlElement(name = "IdentificationOfUse")
    protected String identificationOfUse;
    @XmlElement(name = "SpecialConditions")
    protected String specialConditions;
    @XmlElement(name = "ProgressNumberDifference")
    protected BigInteger progressNumberDifference;
    @XmlElement(name = "KanbanID")
    protected List<String> kanbanID;
    @XmlElement(name = "Classification")
    protected List<ClassificationType> classification;

    /**
     * Revision number of the underlying drawing of the product
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrawingRevisionNumber() {
        return drawingRevisionNumber;
    }

    /**
     * Sets the value of the drawingRevisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrawingRevisionNumber(String value) {
        this.drawingRevisionNumber = value;
    }

    /**
     * Gets the value of the drawingRevisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDrawingRevisionDate() {
        return drawingRevisionDate;
    }

    /**
     * Sets the value of the drawingRevisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDrawingRevisionDate(XMLGregorianCalendar value) {
        this.drawingRevisionDate = value;
    }

    /**
     * A control number indicating the engineering change
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineeringChangeNumber() {
        return engineeringChangeNumber;
    }

    /**
     * Sets the value of the engineeringChangeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineeringChangeNumber(String value) {
        this.engineeringChangeNumber = value;
    }

    /**
     * Gets the value of the controlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlNumber() {
        return controlNumber;
    }

    /**
     * Sets the value of the controlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlNumber(String value) {
        this.controlNumber = value;
    }

    /**
     * Gets the value of the productionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductionNumber() {
        return productionNumber;
    }

    /**
     * Sets the value of the productionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionNumber(String value) {
        this.productionNumber = value;
    }

    /**
     * Gets the value of the modelYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelYear() {
        return modelYear;
    }

    /**
     * Sets the value of the modelYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelYear(String value) {
        this.modelYear = value;
    }

    /**
     * Gets the value of the buyersInternalProductGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyersInternalProductGroupCode() {
        return buyersInternalProductGroupCode;
    }

    /**
     * Sets the value of the buyersInternalProductGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyersInternalProductGroupCode(String value) {
        this.buyersInternalProductGroupCode = value;
    }

    /**
     * Gets the value of the identificationOfUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationOfUse() {
        return identificationOfUse;
    }

    /**
     * Sets the value of the identificationOfUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationOfUse(String value) {
        this.identificationOfUse = value;
    }

    /**
     * Gets the value of the specialConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialConditions() {
        return specialConditions;
    }

    /**
     * Sets the value of the specialConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialConditions(String value) {
        this.specialConditions = value;
    }

    /**
     * Gets the value of the progressNumberDifference property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProgressNumberDifference() {
        return progressNumberDifference;
    }

    /**
     * Sets the value of the progressNumberDifference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProgressNumberDifference(BigInteger value) {
        this.progressNumberDifference = value;
    }

    /**
     * Gets the value of the kanbanID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kanbanID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKanbanID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKanbanID() {
        if (kanbanID == null) {
            kanbanID = new ArrayList<String>();
        }
        return this.kanbanID;
    }

    /**
     * The classification of the product/service in free-text form.Gets the value of the classification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationType }
     * 
     * 
     */
    public List<ClassificationType> getClassification() {
        if (classification == null) {
            classification = new ArrayList<ClassificationType>();
        }
        return this.classification;
    }

}
