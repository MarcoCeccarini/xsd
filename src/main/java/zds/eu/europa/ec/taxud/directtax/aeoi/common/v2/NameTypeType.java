//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:03 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per NameType_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NameType_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="indiv"/&gt;
 *     &lt;enumeration value="alias"/&gt;
 *     &lt;enumeration value="nick"/&gt;
 *     &lt;enumeration value="aka"/&gt;
 *     &lt;enumeration value="dba"/&gt;
 *     &lt;enumeration value="legal"/&gt;
 *     &lt;enumeration value="atbirth"/&gt;
 *     &lt;enumeration value="pka"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NameType_Type")
@XmlEnum
public enum NameTypeType {

    @XmlEnumValue("indiv")
    INDIV("indiv"),
    @XmlEnumValue("alias")
    ALIAS("alias"),
    @XmlEnumValue("nick")
    NICK("nick"),
    @XmlEnumValue("aka")
    AKA("aka"),
    @XmlEnumValue("dba")
    DBA("dba"),
    @XmlEnumValue("legal")
    LEGAL("legal"),
    @XmlEnumValue("atbirth")
    ATBIRTH("atbirth"),
    @XmlEnumValue("pka")
    PKA("pka"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    NameTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameTypeType fromValue(String v) {
        for (NameTypeType c: NameTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
