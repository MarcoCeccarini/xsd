//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:09:57 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TransactionDirection_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionDirection_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Disposal"/&gt;
 *     &lt;enumeration value="Acquisition"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionDirection_Type")
@XmlEnum
public enum TransactionDirectionType {


    /**
     *  0 (Disposal)
     * 
     */
    @XmlEnumValue("Disposal")
    DISPOSAL("Disposal"),

    /**
     *  1 (Acquisition)
     * 
     */
    @XmlEnumValue("Acquisition")
    ACQUISITION("Acquisition");
    private final String value;

    TransactionDirectionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionDirectionType fromValue(String v) {
        for (TransactionDirectionType c: TransactionDirectionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
