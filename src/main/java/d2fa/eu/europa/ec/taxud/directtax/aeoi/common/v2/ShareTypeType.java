//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:05 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ShareType_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ShareType_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="SoleParty"/&gt;
 *     &lt;enumeration value="MultipleParties"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShareType_Type")
@XmlEnum
public enum ShareTypeType {

    @XmlEnumValue("SoleParty")
    SOLE_PARTY("SoleParty"),
    @XmlEnumValue("MultipleParties")
    MULTIPLE_PARTIES("MultipleParties"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ShareTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShareTypeType fromValue(String v) {
        for (ShareTypeType c: ShareTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
