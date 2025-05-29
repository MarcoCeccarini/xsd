//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:08 AM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import oecd.ties.stf.v2.PaymentQlfType;


/**
 * <p>Classe Java per Art9Payment_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Art9Payment_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="YearOfPayment" type="{http://www.w3.org/2001/XMLSchema}gYear"/&gt;
 *         &lt;element name="MonAmnt" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}RoundedMonAmnt_Type"/&gt;
 *         &lt;element name="AcctInfo" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}EUSDAcctInfo_Type"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="paymentQlf" use="required" type="{urn:oecd:ties:stf:v2}paymentQlf_Type" fixed="gip" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Art9Payment_Type", propOrder = {
    "yearOfPayment",
    "monAmnt",
    "acctInfo"
})
public class Art9PaymentType {

    @XmlElement(name = "YearOfPayment", required = true)
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar yearOfPayment;
    @XmlElement(name = "MonAmnt", required = true)
    protected RoundedMonAmntType monAmnt;
    @XmlElement(name = "AcctInfo", required = true)
    protected EUSDAcctInfoType acctInfo;
    @XmlAttribute(name = "paymentQlf", required = true)
    protected PaymentQlfType paymentQlf;

    /**
     * Recupera il valore della proprietà yearOfPayment.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYearOfPayment() {
        return yearOfPayment;
    }

    /**
     * Imposta il valore della proprietà yearOfPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYearOfPayment(XMLGregorianCalendar value) {
        this.yearOfPayment = value;
    }

    /**
     * Recupera il valore della proprietà monAmnt.
     * 
     * @return
     *     possible object is
     *     {@link RoundedMonAmntType }
     *     
     */
    public RoundedMonAmntType getMonAmnt() {
        return monAmnt;
    }

    /**
     * Imposta il valore della proprietà monAmnt.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundedMonAmntType }
     *     
     */
    public void setMonAmnt(RoundedMonAmntType value) {
        this.monAmnt = value;
    }

    /**
     * Recupera il valore della proprietà acctInfo.
     * 
     * @return
     *     possible object is
     *     {@link EUSDAcctInfoType }
     *     
     */
    public EUSDAcctInfoType getAcctInfo() {
        return acctInfo;
    }

    /**
     * Imposta il valore della proprietà acctInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link EUSDAcctInfoType }
     *     
     */
    public void setAcctInfo(EUSDAcctInfoType value) {
        this.acctInfo = value;
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
        if (paymentQlf == null) {
            return PaymentQlfType.GIP;
        } else {
            return paymentQlf;
        }
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
