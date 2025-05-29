//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:00 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per EventType_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EventType_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ContributionEmployer"/&gt;
 *     &lt;enumeration value="ContributionIndividual"/&gt;
 *     &lt;enumeration value="ContributionThirdParty"/&gt;
 *     &lt;enumeration value="DirectedTerminationPayment"/&gt;
 *     &lt;enumeration value="OtherIn"/&gt;
 *     &lt;enumeration value="NormalPayment"/&gt;
 *     &lt;enumeration value="BuybackNoCondition"/&gt;
 *     &lt;enumeration value="BuybackDisabilityTerminalMedicalCondition"/&gt;
 *     &lt;enumeration value="BuybackOtherExceptionalConditionsOfRelease"/&gt;
 *     &lt;enumeration value="OtherOut"/&gt;
 *     &lt;enumeration value="TransferInScheme"/&gt;
 *     &lt;enumeration value="TransferInNational"/&gt;
 *     &lt;enumeration value="TransferInInternational"/&gt;
 *     &lt;enumeration value="OtherTransferIn"/&gt;
 *     &lt;enumeration value="TransferOutScheme"/&gt;
 *     &lt;enumeration value="TransferOutNational"/&gt;
 *     &lt;enumeration value="TransferOutInternational"/&gt;
 *     &lt;enumeration value="OtherTransferOut"/&gt;
 *     &lt;enumeration value="Collateral"/&gt;
 *     &lt;enumeration value="AdvanceIn"/&gt;
 *     &lt;enumeration value="AdvanceOut"/&gt;
 *     &lt;enumeration value="Payback"/&gt;
 *     &lt;enumeration value="Adjustment"/&gt;
 *     &lt;enumeration value="OtherOtherUnspecified"/&gt;
 *     &lt;enumeration value="Yield"/&gt;
 *     &lt;enumeration value="OtherYield"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EventType_Type")
@XmlEnum
public enum EventTypeType {


    /**
     * Contribution - Employer (represents the contribution paid by the Employer to the Pension Scheme)
     * 
     */
    @XmlEnumValue("ContributionEmployer")
    CONTRIBUTION_EMPLOYER("ContributionEmployer"),

    /**
     * Contribution - Individual (represents the contribution paid by the Individual to the Pension Scheme)
     * 
     */
    @XmlEnumValue("ContributionIndividual")
    CONTRIBUTION_INDIVIDUAL("ContributionIndividual"),

    /**
     * Contribution - Third Party (represents the contribution paid by a Third Party to the Pension Scheme)
     * 
     */
    @XmlEnumValue("ContributionThirdParty")
    CONTRIBUTION_THIRD_PARTY("ContributionThirdParty"),

    /**
     * Directed Termination Payment (paid to the Pension Scheme upon termination of a relationship, i.e. this value tackles specifically the case where the -severance- indemnities are paid to a pension scheme further to the dismissal or resignation agreement between the employer and the employee)
     * 
     */
    @XmlEnumValue("DirectedTerminationPayment")
    DIRECTED_TERMINATION_PAYMENT("DirectedTerminationPayment"),

    /**
     * Other / Unspecified
     * 
     */
    @XmlEnumValue("OtherIn")
    OTHER_IN("OtherIn"),

    /**
     * Normal Payment (represents a normal payment made by the Payer to the Recipient in the context of a Pension Scheme)
     * 
     */
    @XmlEnumValue("NormalPayment")
    NORMAL_PAYMENT("NormalPayment"),

    /**
     * Buyback - No Condition (represents the case where the Recipient decided to buyback his/her Pension Scheme before its term)
     * 
     */
    @XmlEnumValue("BuybackNoCondition")
    BUYBACK_NO_CONDITION("BuybackNoCondition"),

    /**
     * Buyback - Disability or Terminal Medical Condition (represents the case where the Recipient decided to buyback his/her Pension Scheme because of a sickness or terminal medical condition)
     * 
     */
    @XmlEnumValue("BuybackDisabilityTerminalMedicalCondition")
    BUYBACK_DISABILITY_TERMINAL_MEDICAL_CONDITION("BuybackDisabilityTerminalMedicalCondition"),

    /**
     * Buyback - Other Exceptional Conditions of Release (represents the case where the Recipient decided to buyback his/her Pension Scheme because of other exceptional conditions of release)
     * 
     */
    @XmlEnumValue("BuybackOtherExceptionalConditionsOfRelease")
    BUYBACK_OTHER_EXCEPTIONAL_CONDITIONS_OF_RELEASE("BuybackOtherExceptionalConditionsOfRelease"),

    /**
     * Other / Unspecified
     * 
     */
    @XmlEnumValue("OtherOut")
    OTHER_OUT("OtherOut"),

    /**
     * Scheme (represents a transfer made between two different Schemes within a Payer)
     * 
     */
    @XmlEnumValue("TransferInScheme")
    TRANSFER_IN_SCHEME("TransferInScheme"),

    /**
     * National (represents a transfer between two different Payers in the same country)
     * 
     */
    @XmlEnumValue("TransferInNational")
    TRANSFER_IN_NATIONAL("TransferInNational"),

    /**
     * International (represents a transfer made from a Pension Scheme to another Pension Scheme located within another country (from the old Pension Scheme point-of-view))
     * 
     */
    @XmlEnumValue("TransferInInternational")
    TRANSFER_IN_INTERNATIONAL("TransferInInternational"),

    /**
     * Other / Unspecified
     * 
     */
    @XmlEnumValue("OtherTransferIn")
    OTHER_TRANSFER_IN("OtherTransferIn"),

    /**
     * Scheme (represents a transfer made between two different Schemes within a Payer)
     * 
     */
    @XmlEnumValue("TransferOutScheme")
    TRANSFER_OUT_SCHEME("TransferOutScheme"),

    /**
     * National (represents a transfer between two different Payers in the same country)
     * 
     */
    @XmlEnumValue("TransferOutNational")
    TRANSFER_OUT_NATIONAL("TransferOutNational"),

    /**
     * International (represents a transfer made from a Pension Scheme to another Pension Scheme located within another country (from the old Pension Scheme point-of-view))
     * 
     */
    @XmlEnumValue("TransferOutInternational")
    TRANSFER_OUT_INTERNATIONAL("TransferOutInternational"),

    /**
     * Other / Unspecified
     * 
     */
    @XmlEnumValue("OtherTransferOut")
    OTHER_TRANSFER_OUT("OtherTransferOut"),

    /**
     * Collateral (represents the fact that the Pension Scheme is used as Collateral (e.g. in the context of a Mortgage))
     * 
     */
    @XmlEnumValue("Collateral")
    COLLATERAL("Collateral"),

    /**
     * Advance In (represents the reimbursement made by the Recipient after having received an advance)
     * 
     */
    @XmlEnumValue("AdvanceIn")
    ADVANCE_IN("AdvanceIn"),

    /**
     * Advance Out (represents an advance made to the Recipient)
     * 
     */
    @XmlEnumValue("AdvanceOut")
    ADVANCE_OUT("AdvanceOut"),

    /**
     * Payback (represents the amount paid back by a Person to the Pension Scheme, whether voluntarily or for legal or any other reasons)
     * 
     */
    @XmlEnumValue("Payback")
    PAYBACK("Payback"),

    /**
     * Adjustment (represents "technical adjustments". Technical adjustments are operations specific to Pension Schemes that could modify the Pension Schemes. These changes could be subject to taxation and might need to be reported)
     * 
     */
    @XmlEnumValue("Adjustment")
    ADJUSTMENT("Adjustment"),

    /**
     * Other / Unspecified
     * 
     */
    @XmlEnumValue("OtherOtherUnspecified")
    OTHER_OTHER_UNSPECIFIED("OtherOtherUnspecified"),

    /**
     * Yield (represents the income generated during the tax year by the pension scheme (this income or its notional value may be taxable in various countries on a yearly basis))
     * 
     */
    @XmlEnumValue("Yield")
    YIELD("Yield"),

    /**
     * Other / Unspecified
     * 
     */
    @XmlEnumValue("OtherYield")
    OTHER_YIELD("OtherYield");
    private final String value;

    EventTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventTypeType fromValue(String v) {
        for (EventTypeType c: EventTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
