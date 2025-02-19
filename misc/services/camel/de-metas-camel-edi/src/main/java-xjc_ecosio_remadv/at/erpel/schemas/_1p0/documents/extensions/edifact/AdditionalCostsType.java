
package at.erpel.schemas._1p0.documents.extensions.edifact;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalCostsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalCostsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="AdditionalCost" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AdditionalCostType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="AdditionalCostAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="VATRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalCostsType", propOrder = {
    "additionalCost"
})
public class AdditionalCostsType {

    @XmlElement(name = "AdditionalCost")
    protected List<AdditionalCostsType.AdditionalCost> additionalCost;

    /**
     * Gets the value of the additionalCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalCostsType.AdditionalCost }
     * 
     * 
     */
    public List<AdditionalCostsType.AdditionalCost> getAdditionalCost() {
        if (additionalCost == null) {
            additionalCost = new ArrayList<AdditionalCostsType.AdditionalCost>();
        }
        return this.additionalCost;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AdditionalCostType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="AdditionalCostAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="VATRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "additionalCostType",
        "additionalCostAmount",
        "vatRate"
    })
    public static class AdditionalCost {

        @XmlElement(name = "AdditionalCostType", required = true)
        protected String additionalCostType;
        @XmlElement(name = "AdditionalCostAmount", required = true)
        protected BigDecimal additionalCostAmount;
        @XmlElement(name = "VATRate")
        protected BigDecimal vatRate;

        /**
         * Gets the value of the additionalCostType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalCostType() {
            return additionalCostType;
        }

        /**
         * Sets the value of the additionalCostType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdditionalCostType(String value) {
            this.additionalCostType = value;
        }

        /**
         * Gets the value of the additionalCostAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAdditionalCostAmount() {
            return additionalCostAmount;
        }

        /**
         * Sets the value of the additionalCostAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAdditionalCostAmount(BigDecimal value) {
            this.additionalCostAmount = value;
        }

        /**
         * Gets the value of the vatRate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVATRate() {
            return vatRate;
        }

        /**
         * Sets the value of the vatRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVATRate(BigDecimal value) {
            this.vatRate = value;
        }

    }

}
