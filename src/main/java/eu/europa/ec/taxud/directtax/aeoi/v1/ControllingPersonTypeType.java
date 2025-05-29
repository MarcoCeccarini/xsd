//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:05 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ControllingPersonType_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ControllingPersonType_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CRS801"/&gt;
 *     &lt;enumeration value="CRS802"/&gt;
 *     &lt;enumeration value="CRS803"/&gt;
 *     &lt;enumeration value="CRS804"/&gt;
 *     &lt;enumeration value="CRS805"/&gt;
 *     &lt;enumeration value="CRS806"/&gt;
 *     &lt;enumeration value="CRS807"/&gt;
 *     &lt;enumeration value="CRS808"/&gt;
 *     &lt;enumeration value="CRS809"/&gt;
 *     &lt;enumeration value="CRS810"/&gt;
 *     &lt;enumeration value="CRS811"/&gt;
 *     &lt;enumeration value="CRS812"/&gt;
 *     &lt;enumeration value="CRS813"/&gt;
 *     &lt;enumeration value="NotApplicable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ControllingPersonType_Type")
@XmlEnum
public enum ControllingPersonTypeType {


    /**
     * CP of legal person - ownership
     * 
     */
    @XmlEnumValue("CRS801")
    CRS_801("CRS801"),

    /**
     * CP of legal person - other means
     * 
     */
    @XmlEnumValue("CRS802")
    CRS_802("CRS802"),

    /**
     * CP of legal person - senior managing official
     * 
     */
    @XmlEnumValue("CRS803")
    CRS_803("CRS803"),

    /**
     * CP of legal arrangement - trust - settlor
     * 
     */
    @XmlEnumValue("CRS804")
    CRS_804("CRS804"),

    /**
     * CP of legal arrangement - trust - trustee
     * 
     */
    @XmlEnumValue("CRS805")
    CRS_805("CRS805"),

    /**
     * CP of legal arrangement - trust - protector
     * 
     */
    @XmlEnumValue("CRS806")
    CRS_806("CRS806"),

    /**
     * CP of legal arrangement - trust - beneficiary
     * 
     */
    @XmlEnumValue("CRS807")
    CRS_807("CRS807"),

    /**
     * CP of legal arrangement - trust - other
     * 
     */
    @XmlEnumValue("CRS808")
    CRS_808("CRS808"),

    /**
     * CP of legal arrangement - other - settlor-equivalent
     * 
     */
    @XmlEnumValue("CRS809")
    CRS_809("CRS809"),

    /**
     * CP of legal arrangement - other - trustee-equivalent
     * 
     */
    @XmlEnumValue("CRS810")
    CRS_810("CRS810"),

    /**
     * CP of legal arrangement - other - protector-equivalent
     * 
     */
    @XmlEnumValue("CRS811")
    CRS_811("CRS811"),

    /**
     * CP of legal arrangement - other - beneficiary-equivalent
     * 
     */
    @XmlEnumValue("CRS812")
    CRS_812("CRS812"),

    /**
     * CP of legal arrangement - other - other-equivalent
     * 
     */
    @XmlEnumValue("CRS813")
    CRS_813("CRS813"),

    /**
     * Where information not available
     * 
     */
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable");
    private final String value;

    ControllingPersonTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ControllingPersonTypeType fromValue(String v) {
        for (ControllingPersonTypeType c: ControllingPersonTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
