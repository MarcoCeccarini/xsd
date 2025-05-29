//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 07:08:57 PM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PayerType_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PayerType_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="StatePoliticalSubdivisionLocalAuthority"/&gt;
 *     &lt;enumeration value="Private"/&gt;
 *     &lt;enumeration value="Mixed"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PayerType_Type")
@XmlEnum
public enum PayerTypeType {

    @XmlEnumValue("StatePoliticalSubdivisionLocalAuthority")
    STATE_POLITICAL_SUBDIVISION_LOCAL_AUTHORITY("StatePoliticalSubdivisionLocalAuthority"),
    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("Mixed")
    MIXED("Mixed"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    PayerTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayerTypeType fromValue(String v) {
        for (PayerTypeType c: PayerTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
