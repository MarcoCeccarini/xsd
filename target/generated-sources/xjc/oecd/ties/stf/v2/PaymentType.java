//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 07:08:57 PM CEST 
//


package oecd.ties.stf.v2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 			A single item describing one aspect of a payment, e.g. a net payment, a tax payment - distinguished by the required attribute 'paymentQlf'. The payment should be described as precisely as possible, even if all of the subelements except the monitary amount itself are optional. 
 * 			
 * 
 * <p>Classe Java per Payment_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Payment_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="MonAmnt" type="{urn:oecd:ties:stf:v2}MonAmnt_Type"/&gt;
 *         &lt;element name="AcctInfo" type="{urn:oecd:ties:stf:v2}AcctInfo_Type" minOccurs="0"/&gt;
 *         &lt;element name="TaxRate" type="{urn:oecd:ties:stf:v2}TaxRate_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="paymentQlf" use="required" type="{urn:oecd:ties:stf:v2}paymentQlf_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payment_Type", propOrder = {
    "paymentDate",
    "monAmnt",
    "acctInfo",
    "taxRate"
})
public class PaymentType {

    @XmlElement(name = "PaymentDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentDate;
    @XmlElement(name = "MonAmnt", required = true)
    protected MonAmntType monAmnt;
    @XmlElement(name = "AcctInfo")
    protected AcctInfoType acctInfo;
    @XmlElement(name = "TaxRate")
    protected BigDecimal taxRate;
    @XmlAttribute(name = "paymentQlf", required = true)
    protected PaymentQlfType paymentQlf;

    /**
     * Recupera il valore della proprietà paymentDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Imposta il valore della proprietà paymentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * Recupera il valore della proprietà monAmnt.
     * 
     * @return
     *     possible object is
     *     {@link MonAmntType }
     *     
     */
    public MonAmntType getMonAmnt() {
        return monAmnt;
    }

    /**
     * Imposta il valore della proprietà monAmnt.
     * 
     * @param value
     *     allowed object is
     *     {@link MonAmntType }
     *     
     */
    public void setMonAmnt(MonAmntType value) {
        this.monAmnt = value;
    }

    /**
     * Recupera il valore della proprietà acctInfo.
     * 
     * @return
     *     possible object is
     *     {@link AcctInfoType }
     *     
     */
    public AcctInfoType getAcctInfo() {
        return acctInfo;
    }

    /**
     * Imposta il valore della proprietà acctInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctInfoType }
     *     
     */
    public void setAcctInfo(AcctInfoType value) {
        this.acctInfo = value;
    }

    /**
     * Recupera il valore della proprietà taxRate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * Imposta il valore della proprietà taxRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxRate(BigDecimal value) {
        this.taxRate = value;
    }

    /**
     * Recupera il valore della proprietà paymentQlf.
     * 
     * @return
     *     possible object is
     *     {@link PaymentQlfType }
     *     
     */
    public PaymentQlfType getPaymentQlf() {
        return paymentQlf;
    }

    /**
     * Imposta il valore della proprietà paymentQlf.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentQlfType }
     *     
     */
    public void setPaymentQlf(PaymentQlfType value) {
        this.paymentQlf = value;
    }

}
