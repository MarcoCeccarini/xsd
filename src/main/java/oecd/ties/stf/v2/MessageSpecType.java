//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:09:55 AM CEST 
//


package oecd.ties.stf.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Message specification: Data identifying and describing the message as a whole. 'SendingCountry' and 'ReceivingCountry' are to identify the relation of the transmission, so that this is visible at the very top of the message and independently of the transmission content further downstream. The elements are optional because in the SMF record there are no exactly  corresponding fields and STF shall not go to far away from SMF; it is, however, strongly recommended to use these fields as intended.  'Warning' is for legal constraints: free text expressing the restrictions for use of the information this message contains and the  legal framework under which it is given. 'Contact' should contain all necessary contact information about persons responsible for and involved in the processing of the data transmitted in this message, both legally and technically. This is free text as it is not intended for automatic processing. 'MessageRefId' is a unique identifier that the sender has to attribute to this message and shall be used in any correspondence. 'TaxYearList' is a list of all tax years for which information is transmitted in the documents of the current message. To indicate a tax year, the date of the last day of that year is given. Format for dates is ccyy-mm-dd. List items have to be separated by blanks.				
 * 
 * <p>Classe Java per MessageSpec_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MessageSpec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SendingCountry" type="{urn:oecd:ties:stf:v2}CountryCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReceivingCountry" type="{urn:oecd:ties:stf:v2}CountryCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="Warning" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Contact" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MessageRefId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TaxYearList" type="{urn:oecd:ties:stf:v2}TaxYearList_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageSpec_Type", propOrder = {
    "sendingCountry",
    "receivingCountry",
    "warning",
    "contact",
    "messageRefId",
    "taxYearList"
})
public class MessageSpecType {

    @XmlElement(name = "SendingCountry")
    @XmlSchemaType(name = "anySimpleType")
    protected String sendingCountry;
    @XmlElement(name = "ReceivingCountry")
    @XmlSchemaType(name = "anySimpleType")
    protected String receivingCountry;
    @XmlElement(name = "Warning", required = true)
    protected String warning;
    @XmlElement(name = "Contact", required = true)
    protected String contact;
    @XmlElement(name = "MessageRefId", required = true)
    protected String messageRefId;
    @XmlList
    @XmlElement(name = "TaxYearList", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<XMLGregorianCalendar> taxYearList;

    /**
     * Recupera il valore della proprietà sendingCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendingCountry() {
        return sendingCountry;
    }

    /**
     * Imposta il valore della proprietà sendingCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendingCountry(String value) {
        this.sendingCountry = value;
    }

    /**
     * Recupera il valore della proprietà receivingCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivingCountry() {
        return receivingCountry;
    }

    /**
     * Imposta il valore della proprietà receivingCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivingCountry(String value) {
        this.receivingCountry = value;
    }

    /**
     * Recupera il valore della proprietà warning.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarning() {
        return warning;
    }

    /**
     * Imposta il valore della proprietà warning.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarning(String value) {
        this.warning = value;
    }

    /**
     * Recupera il valore della proprietà contact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Imposta il valore della proprietà contact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * Recupera il valore della proprietà messageRefId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageRefId() {
        return messageRefId;
    }

    /**
     * Imposta il valore della proprietà messageRefId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageRefId(String value) {
        this.messageRefId = value;
    }

    /**
     * Gets the value of the taxYearList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxYearList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxYearList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getTaxYearList() {
        if (taxYearList == null) {
            taxYearList = new ArrayList<XMLGregorianCalendar>();
        }
        return this.taxYearList;
    }

}
