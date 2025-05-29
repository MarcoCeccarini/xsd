//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 03:46:47 PM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ReportingType_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportingType_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Payment"/&gt;
 *     &lt;enumeration value="Entitlement"/&gt;
 *     &lt;enumeration value="Arrears"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReportingType_Type")
@XmlEnum
public enum ReportingTypeType {

    @XmlEnumValue("Payment")
    PAYMENT("Payment"),
    @XmlEnumValue("Entitlement")
    ENTITLEMENT("Entitlement"),
    @XmlEnumValue("Arrears")
    ARREARS("Arrears"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ReportingTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportingTypeType fromValue(String v) {
        for (ReportingTypeType c: ReportingTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
