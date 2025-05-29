//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:09:57 AM CEST 
//


package oecd.ties.stf.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per legalAddressType_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="legalAddressType_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="residentialOrBusiness"/&gt;
 *     &lt;enumeration value="residential"/&gt;
 *     &lt;enumeration value="business"/&gt;
 *     &lt;enumeration value="registeredOffice"/&gt;
 *     &lt;enumeration value="unspecified"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "legalAddressType_Type")
@XmlEnum
public enum LegalAddressTypeType {

    @XmlEnumValue("residentialOrBusiness")
    RESIDENTIAL_OR_BUSINESS("residentialOrBusiness"),
    @XmlEnumValue("residential")
    RESIDENTIAL("residential"),
    @XmlEnumValue("business")
    BUSINESS("business"),
    @XmlEnumValue("registeredOffice")
    REGISTERED_OFFICE("registeredOffice"),
    @XmlEnumValue("unspecified")
    UNSPECIFIED("unspecified");
    private final String value;

    LegalAddressTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LegalAddressTypeType fromValue(String v) {
        for (LegalAddressTypeType c: LegalAddressTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
