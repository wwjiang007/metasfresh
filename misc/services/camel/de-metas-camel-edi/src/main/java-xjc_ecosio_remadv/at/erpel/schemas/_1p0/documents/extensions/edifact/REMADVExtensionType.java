
package at.erpel.schemas._1p0.documents.extensions.edifact;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REMADVExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REMADVExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AmountRemitted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComissionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Adjustment" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AdjustmentReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AdjustmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AdjustmentValues" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CommissionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TaxableAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AdjustmentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}AdditionalBankAccount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REMADVExtensionType", propOrder = {
    "amountRemitted",
    "invoiceTotalAmount",
    "comissionAmount",
    "paymentDiscountAmount",
    "adjustment",
    "additionalBankAccount"
})
public class REMADVExtensionType {

    @XmlElement(name = "AmountRemitted")
    protected String amountRemitted;
    @XmlElement(name = "InvoiceTotalAmount")
    protected String invoiceTotalAmount;
    @XmlElement(name = "ComissionAmount")
    protected String comissionAmount;
    @XmlElement(name = "PaymentDiscountAmount")
    protected String paymentDiscountAmount;
    @XmlElement(name = "Adjustment")
    protected List<REMADVExtensionType.Adjustment> adjustment;
    @XmlElement(name = "AdditionalBankAccount")
    protected List<AdditionalBankAccountType> additionalBankAccount;

    /**
     * Gets the value of the amountRemitted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountRemitted() {
        return amountRemitted;
    }

    /**
     * Sets the value of the amountRemitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountRemitted(String value) {
        this.amountRemitted = value;
    }

    /**
     * Gets the value of the invoiceTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceTotalAmount() {
        return invoiceTotalAmount;
    }

    /**
     * Sets the value of the invoiceTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceTotalAmount(String value) {
        this.invoiceTotalAmount = value;
    }

    /**
     * Gets the value of the comissionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComissionAmount() {
        return comissionAmount;
    }

    /**
     * Sets the value of the comissionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComissionAmount(String value) {
        this.comissionAmount = value;
    }

    /**
     * Gets the value of the paymentDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDiscountAmount() {
        return paymentDiscountAmount;
    }

    /**
     * Sets the value of the paymentDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDiscountAmount(String value) {
        this.paymentDiscountAmount = value;
    }

    /**
     * Gets the value of the adjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REMADVExtensionType.Adjustment }
     * 
     * 
     */
    public List<REMADVExtensionType.Adjustment> getAdjustment() {
        if (adjustment == null) {
            adjustment = new ArrayList<REMADVExtensionType.Adjustment>();
        }
        return this.adjustment;
    }

    /**
     * Additional bank accounts.Gets the value of the additionalBankAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalBankAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalBankAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalBankAccountType }
     * 
     * 
     */
    public List<AdditionalBankAccountType> getAdditionalBankAccount() {
        if (additionalBankAccount == null) {
            additionalBankAccount = new ArrayList<AdditionalBankAccountType>();
        }
        return this.additionalBankAccount;
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
     *         &lt;element name="AdjustmentReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AdjustmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AdjustmentValues" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CommissionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TaxableAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AdjustmentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "adjustmentReasonCode",
        "adjustmentDescription",
        "adjustmentValues"
    })
    public static class Adjustment {

        @XmlElement(name = "AdjustmentReasonCode")
        protected String adjustmentReasonCode;
        @XmlElement(name = "AdjustmentDescription")
        protected String adjustmentDescription;
        @XmlElement(name = "AdjustmentValues")
        protected List<REMADVExtensionType.Adjustment.AdjustmentValues> adjustmentValues;

        /**
         * Gets the value of the adjustmentReasonCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdjustmentReasonCode() {
            return adjustmentReasonCode;
        }

        /**
         * Sets the value of the adjustmentReasonCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdjustmentReasonCode(String value) {
            this.adjustmentReasonCode = value;
        }

        /**
         * Gets the value of the adjustmentDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdjustmentDescription() {
            return adjustmentDescription;
        }

        /**
         * Sets the value of the adjustmentDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdjustmentDescription(String value) {
            this.adjustmentDescription = value;
        }

        /**
         * Gets the value of the adjustmentValues property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the adjustmentValues property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdjustmentValues().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link REMADVExtensionType.Adjustment.AdjustmentValues }
         * 
         * 
         */
        public List<REMADVExtensionType.Adjustment.AdjustmentValues> getAdjustmentValues() {
            if (adjustmentValues == null) {
                adjustmentValues = new ArrayList<REMADVExtensionType.Adjustment.AdjustmentValues>();
            }
            return this.adjustmentValues;
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
         *         &lt;element name="CommissionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TaxableAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AdjustmentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "commissionAmount",
            "taxRate",
            "taxCode",
            "taxableAmount",
            "taxAmount",
            "adjustmentAmount"
        })
        public static class AdjustmentValues {

            @XmlElement(name = "CommissionAmount")
            protected String commissionAmount;
            @XmlElement(name = "TaxRate")
            protected String taxRate;
            @XmlElement(name = "TaxCode")
            protected String taxCode;
            @XmlElement(name = "TaxableAmount")
            protected String taxableAmount;
            @XmlElement(name = "TaxAmount")
            protected String taxAmount;
            @XmlElement(name = "AdjustmentAmount")
            protected String adjustmentAmount;

            /**
             * Gets the value of the commissionAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCommissionAmount() {
                return commissionAmount;
            }

            /**
             * Sets the value of the commissionAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCommissionAmount(String value) {
                this.commissionAmount = value;
            }

            /**
             * Gets the value of the taxRate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxRate() {
                return taxRate;
            }

            /**
             * Sets the value of the taxRate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxRate(String value) {
                this.taxRate = value;
            }

            /**
             * Gets the value of the taxCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxCode() {
                return taxCode;
            }

            /**
             * Sets the value of the taxCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxCode(String value) {
                this.taxCode = value;
            }

            /**
             * Gets the value of the taxableAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxableAmount() {
                return taxableAmount;
            }

            /**
             * Sets the value of the taxableAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxableAmount(String value) {
                this.taxableAmount = value;
            }

            /**
             * Gets the value of the taxAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxAmount() {
                return taxAmount;
            }

            /**
             * Sets the value of the taxAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxAmount(String value) {
                this.taxAmount = value;
            }

            /**
             * Gets the value of the adjustmentAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdjustmentAmount() {
                return adjustmentAmount;
            }

            /**
             * Sets the value of the adjustmentAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdjustmentAmount(String value) {
                this.adjustmentAmount = value;
            }

        }

    }

}
