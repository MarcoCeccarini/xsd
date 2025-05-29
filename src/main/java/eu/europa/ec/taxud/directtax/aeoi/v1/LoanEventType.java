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
 * <p>Classe Java per LoanEvent_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LoanEvent_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="LoanGranted"/&gt;
 *     &lt;enumeration value="PeriodicPayment"/&gt;
 *     &lt;enumeration value="PeriodicPaymentInCapital"/&gt;
 *     &lt;enumeration value="PeriodicPaymentInInterest"/&gt;
 *     &lt;enumeration value="Reimbursement"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoanEvent_Type")
@XmlEnum
public enum LoanEventType {


    /**
     * Loan Granted
     * 
     */
    @XmlEnumValue("LoanGranted")
    LOAN_GRANTED("LoanGranted"),

    /**
     * Periodic Payment (this includes both cases where the SS does not make a distinction between capital or interest and where this distinction is not available)
     * 
     */
    @XmlEnumValue("PeriodicPayment")
    PERIODIC_PAYMENT("PeriodicPayment"),

    /**
     * Periodic Payment in Capital
     * 
     */
    @XmlEnumValue("PeriodicPaymentInCapital")
    PERIODIC_PAYMENT_IN_CAPITAL("PeriodicPaymentInCapital"),

    /**
     * Periodic Payment in Interest
     * 
     */
    @XmlEnumValue("PeriodicPaymentInInterest")
    PERIODIC_PAYMENT_IN_INTEREST("PeriodicPaymentInInterest"),

    /**
     * Reimbursement
     * 
     */
    @XmlEnumValue("Reimbursement")
    REIMBURSEMENT("Reimbursement");
    private final String value;

    LoanEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoanEventType fromValue(String v) {
        for (LoanEventType c: LoanEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
