
package at.erpel.schemas._1p0.documents;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReductionAndSurchargeBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReductionAndSurchargeBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}BaseAmount"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}Percentage" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}Amount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}Comment" minOccurs="0"/&gt;
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
@XmlType(name = "ReductionAndSurchargeBaseType", propOrder = {
    "baseAmount",
    "percentage",
    "amount",
    "comment",
    "classification"
})
@XmlSeeAlso({
    ReductionAndSurchargeType.class
})
public class ReductionAndSurchargeBaseType {

    @XmlElement(name = "BaseAmount", required = true)
    protected BigDecimal baseAmount;
    @XmlElement(name = "Percentage")
    protected BigDecimal percentage;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "Classification")
    protected List<ClassificationType> classification;

    /**
     * The base amount to which the reduction/surcharge refers to.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseAmount(BigDecimal value) {
        this.baseAmount = value;
    }

    /**
     * The percentage of the reduction/surcharge.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentage(BigDecimal value) {
        this.percentage = value;
    }

    /**
     * The amount of reduction/surcharge. The amount of reduction is calculated by: base amount x percentage = amount. In case amount is specified, it is not necessary to provide percentage (it may, however, be specified). If both, amount and percentage, are present amount is normative. Note that both, reductions and surcharges, are always provided as positive values.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Free text for the reudction/surcharge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * The type of surcharge or reduction. May be used to aggregate surcharges and reductions into different categories.Gets the value of the classification property.
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
