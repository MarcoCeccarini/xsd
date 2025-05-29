//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:09:58 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FinancialInfo_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FinancialInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}MoneyAmount_Type"/&gt;
 *         &lt;element name="Payments" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Payment" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}Payment_Type" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInfo_Type", propOrder = {
    "amount",
    "payments"
})
public class FinancialInfoType {

    @XmlElement(name = "Amount", required = true)
    protected MoneyAmountType amount;
    @XmlElement(name = "Payments")
    protected FinancialInfoType.Payments payments;

    /**
     * Recupera il valore della proprietà amount.
     * 
     * @return
     *     possible object is
     *     {@link MoneyAmountType }
     *     
     */
    public MoneyAmountType getAmount() {
        return amount;
    }

    /**
     * Imposta il valore della proprietà amount.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyAmountType }
     *     
     */
    public void setAmount(MoneyAmountType value) {
        this.amount = value;
    }

    /**
     * Recupera il valore della proprietà payments.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInfoType.Payments }
     *     
     */
    public FinancialInfoType.Payments getPayments() {
        return payments;
    }

    /**
     * Imposta il valore della proprietà payments.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInfoType.Payments }
     *     
     */
    public void setPayments(FinancialInfoType.Payments value) {
        this.payments = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Payment" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}Payment_Type" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "payment"
    })
    public static class Payments {

        @XmlElement(name = "Payment", required = true)
        protected List<PaymentType> payment;

        /**
         * Gets the value of the payment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the payment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPayment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PaymentType }
         * 
         * 
         */
        public List<PaymentType> getPayment() {
            if (payment == null) {
                payment = new ArrayList<PaymentType>();
            }
            return this.payment;
        }

    }

}
