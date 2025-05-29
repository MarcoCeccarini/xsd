//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:03 AM CEST 
//


package oecd.ties.stf.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per paymentQlf_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="paymentQlf_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="gip"/&gt;
 *     &lt;enumeration value="nip"/&gt;
 *     &lt;enumeration value="twh"/&gt;
 *     &lt;enumeration value="trf"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "paymentQlf_Type")
@XmlEnum
public enum PaymentQlfType {

    @XmlEnumValue("gip")
    GIP("gip"),
    @XmlEnumValue("nip")
    NIP("nip"),
    @XmlEnumValue("twh")
    TWH("twh"),
    @XmlEnumValue("trf")
    TRF("trf");
    private final String value;

    PaymentQlfType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentQlfType fromValue(String v) {
        for (PaymentQlfType c: PaymentQlfType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
