//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 03:46:47 PM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per LoanCollateral_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LoanCollateral_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Property"/&gt;
 *     &lt;enumeration value="OtherProperty"/&gt;
 *     &lt;enumeration value="FinancialSecurities"/&gt;
 *     &lt;enumeration value="ThirdPartyGuarantee"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoanCollateral_Type")
@XmlEnum
public enum LoanCollateralType {


    /**
     * Property
     * 
     */
    @XmlEnumValue("Property")
    PROPERTY("Property"),

    /**
     * Other Property
     * 
     */
    @XmlEnumValue("OtherProperty")
    OTHER_PROPERTY("OtherProperty"),

    /**
     * Financial Securities
     * 
     */
    @XmlEnumValue("FinancialSecurities")
    FINANCIAL_SECURITIES("FinancialSecurities"),

    /**
     * Third Party Guarantee
     * 
     */
    @XmlEnumValue("ThirdPartyGuarantee")
    THIRD_PARTY_GUARANTEE("ThirdPartyGuarantee"),

    /**
     * Other
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * DT-IP-0099: “Unknown”
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    LoanCollateralType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoanCollateralType fromValue(String v) {
        for (LoanCollateralType c: LoanCollateralType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
