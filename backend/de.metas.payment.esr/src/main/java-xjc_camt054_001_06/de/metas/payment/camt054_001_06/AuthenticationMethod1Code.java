
package de.metas.payment.camt054_001_06;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AuthenticationMethod1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UKNW"/&gt;
 *     &lt;enumeration value="BYPS"/&gt;
 *     &lt;enumeration value="NPIN"/&gt;
 *     &lt;enumeration value="FPIN"/&gt;
 *     &lt;enumeration value="CPSG"/&gt;
 *     &lt;enumeration value="PPSG"/&gt;
 *     &lt;enumeration value="MANU"/&gt;
 *     &lt;enumeration value="MERC"/&gt;
 *     &lt;enumeration value="SCRT"/&gt;
 *     &lt;enumeration value="SNCT"/&gt;
 *     &lt;enumeration value="SCNL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AuthenticationMethod1Code")
@XmlEnum
public enum AuthenticationMethod1Code {

    UKNW,
    BYPS,
    NPIN,
    FPIN,
    CPSG,
    PPSG,
    MANU,
    MERC,
    SCRT,
    SNCT,
    SCNL;

    public String value() {
        return name();
    }

    public static AuthenticationMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
