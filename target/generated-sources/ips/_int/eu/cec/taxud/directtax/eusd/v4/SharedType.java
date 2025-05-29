//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 03:46:47 PM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per shared_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="shared_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="unknown_if_shared"/&gt;
 *     &lt;enumeration value="not_shared"/&gt;
 *     &lt;enumeration value="shared_repartition_evenly"/&gt;
 *     &lt;enumeration value="shared_repartition_actual"/&gt;
 *     &lt;enumeration value="shared_repartition_total"/&gt;
 *     &lt;enumeration value="shared_repartition_unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "shared_Type")
@XmlEnum
public enum SharedType {

    @XmlEnumValue("unknown_if_shared")
    UNKNOWN_IF_SHARED("unknown_if_shared"),
    @XmlEnumValue("not_shared")
    NOT_SHARED("not_shared"),
    @XmlEnumValue("shared_repartition_evenly")
    SHARED_REPARTITION_EVENLY("shared_repartition_evenly"),
    @XmlEnumValue("shared_repartition_actual")
    SHARED_REPARTITION_ACTUAL("shared_repartition_actual"),
    @XmlEnumValue("shared_repartition_total")
    SHARED_REPARTITION_TOTAL("shared_repartition_total"),
    @XmlEnumValue("shared_repartition_unknown")
    SHARED_REPARTITION_UNKNOWN("shared_repartition_unknown");
    private final String value;

    SharedType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SharedType fromValue(String v) {
        for (SharedType c: SharedType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
