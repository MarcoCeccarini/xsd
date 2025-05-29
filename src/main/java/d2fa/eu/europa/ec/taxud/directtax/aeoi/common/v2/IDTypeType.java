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
 * <p>Classe Java per IDType_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="IDType_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="TIN"/&gt;
 *     &lt;enumeration value="SocialSecurityNumber"/&gt;
 *     &lt;enumeration value="VATNumber"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IDType_Type")
@XmlEnum
public enum IDTypeType {

    TIN("TIN"),
    @XmlEnumValue("SocialSecurityNumber")
    SOCIAL_SECURITY_NUMBER("SocialSecurityNumber"),
    @XmlEnumValue("VATNumber")
    VAT_NUMBER("VATNumber"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    IDTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IDTypeType fromValue(String v) {
        for (IDTypeType c: IDTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
