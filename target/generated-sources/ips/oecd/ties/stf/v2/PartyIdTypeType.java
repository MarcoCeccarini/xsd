//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 03:46:47 PM CEST 
//


package oecd.ties.stf.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per partyIdType_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="partyIdType_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TIN"/&gt;
 *     &lt;enumeration value="IdNo"/&gt;
 *     &lt;enumeration value="TFN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "partyIdType_Type")
@XmlEnum
public enum PartyIdTypeType {

    TIN("TIN"),
    @XmlEnumValue("IdNo")
    ID_NO("IdNo"),
    TFN("TFN");
    private final String value;

    PartyIdTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PartyIdTypeType fromValue(String v) {
        for (PartyIdTypeType c: PartyIdTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
