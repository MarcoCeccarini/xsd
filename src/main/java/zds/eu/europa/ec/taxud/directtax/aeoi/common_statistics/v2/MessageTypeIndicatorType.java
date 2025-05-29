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
 * <p>Classe Java per MessageTypeIndicator_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageTypeIndicator_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CRS701"/&gt;
 *     &lt;enumeration value="CRS702"/&gt;
 *     &lt;enumeration value="CRS703"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageTypeIndicator_Type")
@XmlEnum
public enum MessageTypeIndicatorType {


    /**
     * The message contains new information
     * 
     */
    @XmlEnumValue("CRS701")
    CRS_701("CRS701"),

    /**
     * The message contains corrections for previously sent information
     * 
     */
    @XmlEnumValue("CRS702")
    CRS_702("CRS702"),

    /**
     * The message advises there is no data to report
     * 
     */
    @XmlEnumValue("CRS703")
    CRS_703("CRS703");
    private final String value;

    MessageTypeIndicatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageTypeIndicatorType fromValue(String v) {
        for (MessageTypeIndicatorType c: MessageTypeIndicatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
