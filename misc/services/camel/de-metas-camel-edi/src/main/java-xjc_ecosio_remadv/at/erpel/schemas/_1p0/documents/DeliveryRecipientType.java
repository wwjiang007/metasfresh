
package at.erpel.schemas._1p0.documents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import at.erpel.schemas._1p0.documents.ext.DeliveryRecipientExtensionType;


/**
 * <p>Java class for DeliveryRecipientType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryRecipientType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://erpel.at/schemas/1p0/documents}BusinessEntityType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/ext}DeliveryRecipientExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryRecipientType", propOrder = {
    "deliveryRecipientExtension"
})
public class DeliveryRecipientType
    extends BusinessEntityType
{

    @XmlElement(name = "DeliveryRecipientExtension", namespace = "http://erpel.at/schemas/1p0/documents/ext")
    protected DeliveryRecipientExtensionType deliveryRecipientExtension;

    /**
     * Gets the value of the deliveryRecipientExtension property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryRecipientExtensionType }
     *     
     */
    public DeliveryRecipientExtensionType getDeliveryRecipientExtension() {
        return deliveryRecipientExtension;
    }

    /**
     * Sets the value of the deliveryRecipientExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryRecipientExtensionType }
     *     
     */
    public void setDeliveryRecipientExtension(DeliveryRecipientExtensionType value) {
        this.deliveryRecipientExtension = value;
    }

}
