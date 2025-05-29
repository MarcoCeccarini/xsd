//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 03:45:18 PM CEST 
//


package oecd.ties.stf.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per MSCountryCode_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MSCountryCode_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AT"/&gt;
 *     &lt;enumeration value="BE"/&gt;
 *     &lt;enumeration value="BG"/&gt;
 *     &lt;enumeration value="CY"/&gt;
 *     &lt;enumeration value="CZ"/&gt;
 *     &lt;enumeration value="DK"/&gt;
 *     &lt;enumeration value="EE"/&gt;
 *     &lt;enumeration value="FI"/&gt;
 *     &lt;enumeration value="FR"/&gt;
 *     &lt;enumeration value="DE"/&gt;
 *     &lt;enumeration value="EL"/&gt;
 *     &lt;enumeration value="GR"/&gt;
 *     &lt;enumeration value="HR"/&gt;
 *     &lt;enumeration value="HU"/&gt;
 *     &lt;enumeration value="IE"/&gt;
 *     &lt;enumeration value="IT"/&gt;
 *     &lt;enumeration value="LV"/&gt;
 *     &lt;enumeration value="LT"/&gt;
 *     &lt;enumeration value="LU"/&gt;
 *     &lt;enumeration value="MT"/&gt;
 *     &lt;enumeration value="NL"/&gt;
 *     &lt;enumeration value="PL"/&gt;
 *     &lt;enumeration value="PT"/&gt;
 *     &lt;enumeration value="RO"/&gt;
 *     &lt;enumeration value="SK"/&gt;
 *     &lt;enumeration value="SI"/&gt;
 *     &lt;enumeration value="ES"/&gt;
 *     &lt;enumeration value="SE"/&gt;
 *     &lt;enumeration value="GB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MSCountryCode_Type")
@XmlEnum
public enum MSCountryCodeType {

    AT,
    BE,
    BG,
    CY,
    CZ,
    DK,
    EE,
    FI,
    FR,
    DE,
    EL,
    GR,
    HR,
    HU,
    IE,
    IT,
    LV,
    LT,
    LU,
    MT,
    NL,
    PL,
    PT,
    RO,
    SK,
    SI,
    ES,
    SE,
    GB;

    public String value() {
        return name();
    }

    public static MSCountryCodeType fromValue(String v) {
        return valueOf(v);
    }

}
