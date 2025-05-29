//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 03:46:47 PM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per Art4_2PaymentData_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Art4_2PaymentData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxYearEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="SpecificPaymentType" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}SpecifPaymentType_Type" minOccurs="0"/&gt;
 *         &lt;element name="Art4_2Payment" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}Art4_2Payment_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Art4_2PaymentData_Type", propOrder = {
    "taxYearEnd",
    "specificPaymentType",
    "art42Payment"
})
@XmlSeeAlso({
    CorrectableArt42PaymentDataType.class
})
public class Art42PaymentDataType {

    @XmlElement(name = "TaxYearEnd")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar taxYearEnd;
    @XmlElement(name = "SpecificPaymentType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String specificPaymentType;
    @XmlElement(name = "Art4_2Payment", required = true)
    protected Art42PaymentType art42Payment;

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
     * Recupera il valore della proprietà specificPaymentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificPaymentType() {
        return specificPaymentType;
    }

    /**
     * Imposta il valore della proprietà specificPaymentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificPaymentType(String value) {
        this.specificPaymentType = value;
    }

    /**
     * Recupera il valore della proprietà art42Payment.
     * 
     * @return
     *     possible object is
     *     {@link Art42PaymentType }
     *     
     */
    public Art42PaymentType getArt42Payment() {
        return art42Payment;
    }

    /**
     * Imposta il valore della proprietà art42Payment.
     * 
     * @param value
     *     allowed object is
     *     {@link Art42PaymentType }
     *     
     */
    public void setArt42Payment(Art42PaymentType value) {
        this.art42Payment = value;
    }

}
