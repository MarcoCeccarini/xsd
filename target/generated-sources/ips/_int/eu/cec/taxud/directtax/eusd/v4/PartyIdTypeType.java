//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 03:46:47 PM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per partyIdType_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="partyIdType_Type"&gt;
 *   &lt;restriction base="{urn:oecd:ties:stf:v2}partyIdType_Type"&gt;
 *     &lt;enumeration value="TIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "partyIdType_Type")
@XmlEnum(oecd.ties.stf.v2.PartyIdTypeType.class)
public enum PartyIdTypeType {

    TIN;

    public String value() {
        return name();
    }

    public static PartyIdTypeType fromValue(String v) {
        return valueOf(v);
    }

}
