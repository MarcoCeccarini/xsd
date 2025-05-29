//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 03:46:47 PM CEST 
//


package oecd.ties.stf.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per MSCurrCode_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MSCurrCode_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BGN"/&gt;
 *     &lt;enumeration value="CZK"/&gt;
 *     &lt;enumeration value="DKK"/&gt;
 *     &lt;enumeration value="EEK"/&gt;
 *     &lt;enumeration value="EUR"/&gt;
 *     &lt;enumeration value="GBP"/&gt;
 *     &lt;enumeration value="HRK"/&gt;
 *     &lt;enumeration value="HUF"/&gt;
 *     &lt;enumeration value="LTL"/&gt;
 *     &lt;enumeration value="LVL"/&gt;
 *     &lt;enumeration value="PLN"/&gt;
 *     &lt;enumeration value="RON"/&gt;
 *     &lt;enumeration value="SEK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MSCurrCode_Type")
@XmlEnum
public enum MSCurrCodeType {

    BGN,
    CZK,
    DKK,
    EEK,
    EUR,
    GBP,
    HRK,
    HUF,
    LTL,
    LVL,
    PLN,
    RON,
    SEK;

    public String value() {
        return name();
    }

    public static MSCurrCodeType fromValue(String v) {
        return valueOf(v);
    }

}
