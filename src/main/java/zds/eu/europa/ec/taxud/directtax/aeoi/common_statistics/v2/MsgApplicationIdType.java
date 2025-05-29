//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:03 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common_statistics.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per MsgApplicationId_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MsgApplicationId_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AEOI-IE"/&gt;
 *     &lt;enumeration value="AEOI-DF"/&gt;
 *     &lt;enumeration value="AEOI-ROY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MsgApplicationId_Type")
@XmlEnum
public enum MsgApplicationIdType {

    @XmlEnumValue("AEOI-IE")
    AEOI_IE("AEOI-IE"),
    @XmlEnumValue("AEOI-DF")
    AEOI_DF("AEOI-DF"),
    @XmlEnumValue("AEOI-ROY")
    AEOI_ROY("AEOI-ROY");
    private final String value;

    MsgApplicationIdType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MsgApplicationIdType fromValue(String v) {
        for (MsgApplicationIdType c: MsgApplicationIdType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
