
package at.erpel.schemas._1p0.documents;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UniversalBankTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UniversalBankTransactionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}BeneficiaryAccount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}PaymentReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://erpel.at/schemas/1p0/documents}ConsolidatorPayable"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniversalBankTransactionType", propOrder = {
    "beneficiaryAccount",
    "paymentReference"
})
public class UniversalBankTransactionType {

    @XmlElement(name = "BeneficiaryAccount")
    protected List<AccountType> beneficiaryAccount;
    @XmlElement(name = "PaymentReference")
    protected String paymentReference;
    @XmlAttribute(name = "ConsolidatorPayable", namespace = "http://erpel.at/schemas/1p0/documents")
    protected Boolean consolidatorPayable;

    /**
     * The account of the beneficiary.Gets the value of the beneficiaryAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beneficiaryAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeneficiaryAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountType }
     * 
     * 
     */
    public List<AccountType> getBeneficiaryAccount() {
        if (beneficiaryAccount == null) {
            beneficiaryAccount = new ArrayList<AccountType>();
        }
        return this.beneficiaryAccount;
    }

    /**
     * A payment reference which may be provided in order to allow for an automated processing of the payment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentReference() {
        return paymentReference;
    }

    /**
     * Sets the value of the paymentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentReference(String value) {
        this.paymentReference = value;
    }

    /**
     * Indicates whether the payment is payable on a consolidator platform. In this case the attribute must be set to true.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsolidatorPayable() {
        return consolidatorPayable;
    }

    /**
     * Sets the value of the consolidatorPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsolidatorPayable(Boolean value) {
        this.consolidatorPayable = value;
    }

}
