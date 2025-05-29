//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:03 AM CEST 
//


package oecd.ties.stf.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Payment Data within international data exchange for tax purposes.  In this container all payment data is brought together. The reason for the payment (the "payment type"), e.g. interest, can be described both by an OECD code and a country specific code. The element 'OECDPaymentType' is required, the supplementary element 'CountrySpecificPaymentType' is optional. PaymentData_Type can include several  "Payment" elements, which all represent payments caused by one and the same gross payment (the gross payment itself, net payment, tax deducted etc.). To indicate the relevant tax year, the date of the last day of that year is given.  In a PaymentData element as a rule the following equations should hold between the amounts in the Payment child elements that are distinguished by the paymentQlf attribute: NIP = GIP - TWH; TWH = GIP * TR (the paymentQlf values are used in these equations to identify the amounts between which the equations hold) . Amounts that can be calculated from the others by virtue of these equations do not necessarily have to be entered. If amounts are entered for which the above equations do not hold, an explanation should be provided in the OtherInfo element. It is assumed that tax refund is not bound to the other amounts by an equation of the above kind.
 * 			
 * 
 * <p>Classe Java per PaymentData_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PaymentData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxYearEnd" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="OECDPaymentType" type="{urn:oecd:ties:stf:v2}OECDPaymentType_Type"/&gt;
 *         &lt;element name="SpecificPaymentType" type="{urn:oecd:ties:stf:v2}SpecificPaymentType_Type" minOccurs="0"/&gt;
 *         &lt;element name="Payment" type="{urn:oecd:ties:stf:v2}Payment_Type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentData_Type", propOrder = {
    "taxYearEnd",
    "oecdPaymentType",
    "specificPaymentType",
    "payment"
})
public class PaymentDataType {

    @XmlElement(name = "TaxYearEnd", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar taxYearEnd;
    @XmlElement(name = "OECDPaymentType", required = true)
    protected String oecdPaymentType;
    @XmlElement(name = "SpecificPaymentType")
    protected SpecificPaymentTypeType specificPaymentType;
    @XmlElement(name = "Payment", required = true)
    protected List<PaymentType> payment;

    /**
     * Recupera il valore della proprietà taxYearEnd.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTaxYearEnd() {
        return taxYearEnd;
    }

    /**
     * Imposta il valore della proprietà taxYearEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTaxYearEnd(XMLGregorianCalendar value) {
        this.taxYearEnd = value;
    }

    /**
     * Recupera il valore della proprietà oecdPaymentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOECDPaymentType() {
        return oecdPaymentType;
    }

    /**
     * Imposta il valore della proprietà oecdPaymentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOECDPaymentType(String value) {
        this.oecdPaymentType = value;
    }

    /**
     * Recupera il valore della proprietà specificPaymentType.
     * 
     * @return
     *     possible object is
     *     {@link SpecificPaymentTypeType }
     *     
     */
    public SpecificPaymentTypeType getSpecificPaymentType() {
        return specificPaymentType;
    }

    /**
     * Imposta il valore della proprietà specificPaymentType.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificPaymentTypeType }
     *     
     */
    public void setSpecificPaymentType(SpecificPaymentTypeType value) {
        this.specificPaymentType = value;
    }

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
