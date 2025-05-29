//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 07:06:57 PM CEST 
//


package it.finanze.entrate.statist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Income_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Income_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="WagesBasic"/&gt;
 *     &lt;enumeration value="WagesBonusCommissionFees"/&gt;
 *     &lt;enumeration value="WagesSeveranceNonCompetition"/&gt;
 *     &lt;enumeration value="WagesOtherOrUnspecified"/&gt;
 *     &lt;enumeration value="AllowanceLinkedToWork"/&gt;
 *     &lt;enumeration value="AllowanceRelocation"/&gt;
 *     &lt;enumeration value="AllowanceLinkedToFamily"/&gt;
 *     &lt;enumeration value="AllowanceOtherOrUnspecified"/&gt;
 *     &lt;enumeration value="FringeBenefitsCompanyCarAndSimilarBenefits"/&gt;
 *     &lt;enumeration value="FringeBenefitsAccommodationAndSimilarBenefits"/&gt;
 *     &lt;enumeration value="FringeBenefitsPensionContribution"/&gt;
 *     &lt;enumeration value="FringeBenefitsHealthContribution"/&gt;
 *     &lt;enumeration value="FringeBenefitsLoan"/&gt;
 *     &lt;enumeration value="FringeBenefitsStockOptionsAndShares"/&gt;
 *     &lt;enumeration value="FringeBenefitsOtherOrUnspecified"/&gt;
 *     &lt;enumeration value="DirectReimbursement"/&gt;
 *     &lt;enumeration value="OtherStatutoryOrEmploymentBenefits"/&gt;
 *     &lt;enumeration value="OtherOrUnspecifiedIncome"/&gt;
 *     &lt;enumeration value="DirectorsFees"/&gt;
 *     &lt;enumeration value="IndependentTurnoverFeesAndOtherRevenues"/&gt;
 *     &lt;enumeration value="IndependentCostOfGoodsSold"/&gt;
 *     &lt;enumeration value="IndependentDirectOperatingExpenses"/&gt;
 *     &lt;enumeration value="IndependentDepreciation"/&gt;
 *     &lt;enumeration value="IndependentOtherRevenuesOrGains"/&gt;
 *     &lt;enumeration value="IndependentOtherExpensesOrLosses"/&gt;
 *     &lt;enumeration value="IndependentNetFinancialResult"/&gt;
 *     &lt;enumeration value="IndependentDiscontinuedOperationsOrExtraordinaryItems"/&gt;
 *     &lt;enumeration value="IndependentOtherOrUnspecified"/&gt;
 *     &lt;enumeration value="Royalties"/&gt;
 *     &lt;enumeration value="IncomeTax"/&gt;
 *     &lt;enumeration value="IncomeTaxRefund"/&gt;
 *     &lt;enumeration value="OtherTax"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Income_Type")
@XmlEnum
public enum IncomeType {


    /**
     * Wages - Basic
     * 
     */
    @XmlEnumValue("WagesBasic")
    WAGES_BASIC("WagesBasic"),

    /**
     * Wages - Bonus + Commission + Fees
     * 
     */
    @XmlEnumValue("WagesBonusCommissionFees")
    WAGES_BONUS_COMMISSION_FEES("WagesBonusCommissionFees"),

    /**
     * Wages - Severance + non-competition
     * 
     */
    @XmlEnumValue("WagesSeveranceNonCompetition")
    WAGES_SEVERANCE_NON_COMPETITION("WagesSeveranceNonCompetition"),

    /**
     * Wages - Other or Unspecified
     * 
     */
    @XmlEnumValue("WagesOtherOrUnspecified")
    WAGES_OTHER_OR_UNSPECIFIED("WagesOtherOrUnspecified"),

    /**
     * Allowance - Linked to Work
     * 
     */
    @XmlEnumValue("AllowanceLinkedToWork")
    ALLOWANCE_LINKED_TO_WORK("AllowanceLinkedToWork"),

    /**
     * Allowance - Relocation
     * 
     */
    @XmlEnumValue("AllowanceRelocation")
    ALLOWANCE_RELOCATION("AllowanceRelocation"),

    /**
     * Allowance - Linked to Family
     * 
     */
    @XmlEnumValue("AllowanceLinkedToFamily")
    ALLOWANCE_LINKED_TO_FAMILY("AllowanceLinkedToFamily"),

    /**
     * Allowance - Other or Unspecified
     * 
     */
    @XmlEnumValue("AllowanceOtherOrUnspecified")
    ALLOWANCE_OTHER_OR_UNSPECIFIED("AllowanceOtherOrUnspecified"),

    /**
     * Fringe Benefits - Company Car and Similar Benefits
     * 
     */
    @XmlEnumValue("FringeBenefitsCompanyCarAndSimilarBenefits")
    FRINGE_BENEFITS_COMPANY_CAR_AND_SIMILAR_BENEFITS("FringeBenefitsCompanyCarAndSimilarBenefits"),

    /**
     * Fringe Benefits - Accommodation and Similar Benefits
     * 
     */
    @XmlEnumValue("FringeBenefitsAccommodationAndSimilarBenefits")
    FRINGE_BENEFITS_ACCOMMODATION_AND_SIMILAR_BENEFITS("FringeBenefitsAccommodationAndSimilarBenefits"),

    /**
     * Fringe Benefits - Pension Contribution
     * 
     */
    @XmlEnumValue("FringeBenefitsPensionContribution")
    FRINGE_BENEFITS_PENSION_CONTRIBUTION("FringeBenefitsPensionContribution"),

    /**
     * Fringe Benefits - Health Contribution
     * 
     */
    @XmlEnumValue("FringeBenefitsHealthContribution")
    FRINGE_BENEFITS_HEALTH_CONTRIBUTION("FringeBenefitsHealthContribution"),

    /**
     * Fringe Benefits - Loan
     * 
     */
    @XmlEnumValue("FringeBenefitsLoan")
    FRINGE_BENEFITS_LOAN("FringeBenefitsLoan"),

    /**
     * Fringe Benefits - Stock Options and Shares
     * 
     */
    @XmlEnumValue("FringeBenefitsStockOptionsAndShares")
    FRINGE_BENEFITS_STOCK_OPTIONS_AND_SHARES("FringeBenefitsStockOptionsAndShares"),

    /**
     * Fringe Benefits - Other or Unspecified
     * 
     */
    @XmlEnumValue("FringeBenefitsOtherOrUnspecified")
    FRINGE_BENEFITS_OTHER_OR_UNSPECIFIED("FringeBenefitsOtherOrUnspecified"),

    /**
     * Direct Reimbursement
     * 
     */
    @XmlEnumValue("DirectReimbursement")
    DIRECT_REIMBURSEMENT("DirectReimbursement"),

    /**
     * Other statutory or employment benefits
     * 
     */
    @XmlEnumValue("OtherStatutoryOrEmploymentBenefits")
    OTHER_STATUTORY_OR_EMPLOYMENT_BENEFITS("OtherStatutoryOrEmploymentBenefits"),

    /**
     * Other or unspecified income
     * 
     */
    @XmlEnumValue("OtherOrUnspecifiedIncome")
    OTHER_OR_UNSPECIFIED_INCOME("OtherOrUnspecifiedIncome"),

    /**
     * Directors Fees
     * 
     */
    @XmlEnumValue("DirectorsFees")
    DIRECTORS_FEES("DirectorsFees"),

    /**
     * Independent - turnover, fees and other revenues
     * 
     */
    @XmlEnumValue("IndependentTurnoverFeesAndOtherRevenues")
    INDEPENDENT_TURNOVER_FEES_AND_OTHER_REVENUES("IndependentTurnoverFeesAndOtherRevenues"),

    /**
     * Independent - cost of goods sold
     * 
     */
    @XmlEnumValue("IndependentCostOfGoodsSold")
    INDEPENDENT_COST_OF_GOODS_SOLD("IndependentCostOfGoodsSold"),

    /**
     * Independent - direct/operating expenses
     * 
     */
    @XmlEnumValue("IndependentDirectOperatingExpenses")
    INDEPENDENT_DIRECT_OPERATING_EXPENSES("IndependentDirectOperatingExpenses"),

    /**
     * Independent - depreciation
     * 
     */
    @XmlEnumValue("IndependentDepreciation")
    INDEPENDENT_DEPRECIATION("IndependentDepreciation"),

    /**
     * Independent - other revenues or gains
     * 
     */
    @XmlEnumValue("IndependentOtherRevenuesOrGains")
    INDEPENDENT_OTHER_REVENUES_OR_GAINS("IndependentOtherRevenuesOrGains"),

    /**
     * Independent - other expenses or losses
     * 
     */
    @XmlEnumValue("IndependentOtherExpensesOrLosses")
    INDEPENDENT_OTHER_EXPENSES_OR_LOSSES("IndependentOtherExpensesOrLosses"),

    /**
     * Independent - net financial result
     * 
     */
    @XmlEnumValue("IndependentNetFinancialResult")
    INDEPENDENT_NET_FINANCIAL_RESULT("IndependentNetFinancialResult"),

    /**
     * Independent - discontinued operations or "extraordinary items
     * 
     */
    @XmlEnumValue("IndependentDiscontinuedOperationsOrExtraordinaryItems")
    INDEPENDENT_DISCONTINUED_OPERATIONS_OR_EXTRAORDINARY_ITEMS("IndependentDiscontinuedOperationsOrExtraordinaryItems"),

    /**
     * Independent - other or unspecified
     * 
     */
    @XmlEnumValue("IndependentOtherOrUnspecified")
    INDEPENDENT_OTHER_OR_UNSPECIFIED("IndependentOtherOrUnspecified"),

    /**
     * Royalties
     * 
     */
    @XmlEnumValue("Royalties")
    ROYALTIES("Royalties"),

    /**
     * Income Tax
     * 
     */
    @XmlEnumValue("IncomeTax")
    INCOME_TAX("IncomeTax"),

    /**
     * Income Tax Refund
     * 
     */
    @XmlEnumValue("IncomeTaxRefund")
    INCOME_TAX_REFUND("IncomeTaxRefund"),

    /**
     * Other Tax
     * 
     */
    @XmlEnumValue("OtherTax")
    OTHER_TAX("OtherTax");
    private final String value;

    IncomeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IncomeType fromValue(String v) {
        for (IncomeType c: IncomeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
