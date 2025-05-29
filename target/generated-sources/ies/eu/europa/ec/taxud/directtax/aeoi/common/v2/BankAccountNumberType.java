//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 03:45:18 PM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A Bank Account Number
 * 
 * <p>Classe Java per BankAccountNumber_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BankAccountNumber_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BIC" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}BIC_Type" minOccurs="0"/&gt;
 *         &lt;element name="IBAN" type="{urn:oecd:ties:stf:v2}IBAN_Type" minOccurs="0"/&gt;
 *         &lt;element name="OBAN" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankAccountNumber_Type", propOrder = {
    "bic",
    "iban",
    "oban"
})
public class BankAccountNumberType {

    @XmlElement(name = "BIC")
    protected String bic;
    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "OBAN")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String oban;

    /**
     * Recupera il valore della proprietà bic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Imposta il valore della proprietà bic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

    /**
     * Recupera il valore della proprietà iban.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Imposta il valore della proprietà iban.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Recupera il valore della proprietà oban.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBAN() {
        return oban;
    }

    /**
     * Imposta il valore della proprietà oban.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBAN(String value) {
        this.oban = value;
    }

}
