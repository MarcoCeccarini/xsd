//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:09:58 AM CEST 
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
 *     &lt;enumeration value="Contribution"/&gt;
 *     &lt;enumeration value="OtherUnspecifiedIn"/&gt;
 *     &lt;enumeration value="Annuity"/&gt;
 *     &lt;enumeration value="LumpSumAtMaturity"/&gt;
 *     &lt;enumeration value="Death"/&gt;
 *     &lt;enumeration value="Disability"/&gt;
 *     &lt;enumeration value="Illness"/&gt;
 *     &lt;enumeration value="SurrenderOfRightsRepayment"/&gt;
 *     &lt;enumeration value="OtherUnspecifiedOut"/&gt;
 *     &lt;enumeration value="TransferInScheme"/&gt;
 *     &lt;enumeration value="TransferInNational"/&gt;
 *     &lt;enumeration value="TransferInInternational"/&gt;
 *     &lt;enumeration value="TransferInOtherUnspecified"/&gt;
 *     &lt;enumeration value="TransferOutScheme"/&gt;
 *     &lt;enumeration value="TransferOutNational"/&gt;
 *     &lt;enumeration value="TransferOutInternational"/&gt;
 *     &lt;enumeration value="TransferOutOtherUnspecified"/&gt;
 *     &lt;enumeration value="CollateralPledge"/&gt;
 *     &lt;enumeration value="AdvanceIn"/&gt;
 *     &lt;enumeration value="AdvanceOut"/&gt;
 *     &lt;enumeration value="RefundOfPremiums"/&gt;
 *     &lt;enumeration value="AcceptanceByTheBeneficiary"/&gt;
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
     * Contribution (represents the contribution paid by the Payer of Premiums to the LIP Policy)
     * 
     */
    @XmlEnumValue("Contribution")
    CONTRIBUTION("Contribution"),

    /**
     * Other / Unspecified
     * 
     */
    @XmlEnumValue("OtherUnspecifiedIn")
    OTHER_UNSPECIFIED_IN("OtherUnspecifiedIn"),

    /**
     * Annuity (a payment made by the Insurer/Paying Agent to the Beneficiary at regular interval)
     * 
     */
    @XmlEnumValue("Annuity")
    ANNUITY("Annuity"),

    /**
     * Lump sum at maturity (Investment policies are fixed term. That term could be reached (Maturity))
     * 
     */
    @XmlEnumValue("LumpSumAtMaturity")
    LUMP_SUM_AT_MATURITY("LumpSumAtMaturity"),

    /**
     * Death (Death could happen and lead to a payment)
     * 
     */
    @XmlEnumValue("Death")
    DEATH("Death"),

    /**
     * Disability (Disability could happen and lead to a payment)
     * 
     */
    @XmlEnumValue("Disability")
    DISABILITY("Disability"),

    /**
     * Illness (Illness could happen and lead to a payment)
     * 
     */
    @XmlEnumValue("Illness")
    ILLNESS("Illness"),

    /**
     * Surrender of rights / Repayment (The Policy Owner decides to abandon its rights to a LIP and receives the total amount of contributions that were already paid to the Insurer/Paying Agent or asks the Insurer/Paying Agent to repay (partially) the amount of contributions that were already paid)
     * 
     */
    @XmlEnumValue("SurrenderOfRightsRepayment")
    SURRENDER_OF_RIGHTS_REPAYMENT("SurrenderOfRightsRepayment"),

    /**
     * Other / Unspecified
     * 
     */
    @XmlEnumValue("OtherUnspecifiedOut")
    OTHER_UNSPECIFIED_OUT("OtherUnspecifiedOut"),

    /**
     * Scheme (represents a transfer made within the same Policy (e.g. from a fund to another one))
     * 
     */
    @XmlEnumValue("TransferInScheme")
    TRANSFER_IN_SCHEME("TransferInScheme"),

    /**
     * National (represents a transfer made from a Policy to another Policy located within the same country (from the new Policy point-of-view))
     * 
     */
    @XmlEnumValue("TransferInNational")
    TRANSFER_IN_NATIONAL("TransferInNational"),

    /**
     * International (represents a transfer made from a Policy to another Policy located within another country (from the new Policy point-of-view))
     * 
     */
    @XmlEnumValue("TransferInInternational")
    TRANSFER_IN_INTERNATIONAL("TransferInInternational"),

    /**
     * Other / Unspecified
     * 
     */
    @XmlEnumValue("TransferInOtherUnspecified")
    TRANSFER_IN_OTHER_UNSPECIFIED("TransferInOtherUnspecified"),

    /**
     * Scheme (represents a transfer made within the same Policy (e.g. from a fund to another one))
     * 
     */
    @XmlEnumValue("TransferOutScheme")
    TRANSFER_OUT_SCHEME("TransferOutScheme"),

    /**
     * National (represents a transfer made from a Policy to another Policy located within the same country (from the old Policy point-of-view))
     * 
     */
    @XmlEnumValue("TransferOutNational")
    TRANSFER_OUT_NATIONAL("TransferOutNational"),

    /**
     * International (represents a transfer made from a Policy to another Policy located within another country (from the old Policy point-of-view))
     * 
     */
    @XmlEnumValue("TransferOutInternational")
    TRANSFER_OUT_INTERNATIONAL("TransferOutInternational"),

    /**
     * Other / Unspecified
     * 
     */
    @XmlEnumValue("TransferOutOtherUnspecified")
    TRANSFER_OUT_OTHER_UNSPECIFIED("TransferOutOtherUnspecified"),

    /**
     * Collateral/Pledge (represents the fact that the Policy is used as a Collateral (e.g. in the context of a Mortgage))
     * 
     */
    @XmlEnumValue("CollateralPledge")
    COLLATERAL_PLEDGE("CollateralPledge"),

    /**
     * Advance In (represents the reimbursement made by the Beneficiary after having received an advance)
     * 
     */
    @XmlEnumValue("AdvanceIn")
    ADVANCE_IN("AdvanceIn"),

    /**
     * Advance Out (represents an advance made to the Beneficiary)
     * 
     */
    @XmlEnumValue("AdvanceOut")
    ADVANCE_OUT("AdvanceOut"),

    /**
     * Refund of premiums (This value will be used to cover "cooling off periods" which allows Policy Owners to cancel the Policy within a certain period of time and receives back the premiums he/she has already paid)
     * 
     */
    @XmlEnumValue("RefundOfPremiums")
    REFUND_OF_PREMIUMS("RefundOfPremiums"),

    /**
     * Acceptance by the Beneficiary (represents the decision by the Beneficiary to accept a Policy granted to him/her (in whatever way) by the Policy Owner)
     * 
     */
    @XmlEnumValue("AcceptanceByTheBeneficiary")
    ACCEPTANCE_BY_THE_BENEFICIARY("AcceptanceByTheBeneficiary"),

    /**
     * Other / Unspecified
     * 
     */
    @XmlEnumValue("OtherOtherUnspecified")
    OTHER_OTHER_UNSPECIFIED("OtherOtherUnspecified"),

    /**
     * Yield (represents the income generated during the tax year by the LIP (this income or its notional value may be taxable in various countries on a yearly basis))
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
