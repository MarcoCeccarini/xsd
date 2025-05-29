//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:03 AM CEST 
//


package _int.eu.cec.taxud.directtax.v4;

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
 * <p>Classe Java per Header_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Header_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginatingCountry" type="{urn:cec.eu.int:taxud:directtax:v4}CountryCode_Type"/&gt;
 *         &lt;element name="DestinationCountries" type="{urn:cec.eu.int:taxud:directtax:v4}CountryCodeList_Type"/&gt;
 *         &lt;element name="MessageId" type="{urn:cec.eu.int:taxud:directtax:v4}MsgId_Type"/&gt;
 *         &lt;element name="CorrelationId" type="{urn:cec.eu.int:taxud:directtax:v4}MsgId_Type" minOccurs="0"/&gt;
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="MessageTypeIndic" type="{urn:cec.eu.int:taxud:directtax:v4}MessageTypeIndic_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header_Type", propOrder = {
    "originatingCountry",
    "destinationCountries",
    "messageId",
    "correlationId",
    "timestamp",
    "messageTypeIndic"
})
public class HeaderType {

    @XmlElement(name = "OriginatingCountry", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String originatingCountry;
    @XmlList
    @XmlElement(name = "DestinationCountries", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> destinationCountries;
    @XmlElement(name = "MessageId", required = true)
    protected String messageId;
    @XmlElement(name = "CorrelationId")
    protected String correlationId;
    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "MessageTypeIndic")
    protected byte messageTypeIndic;

    /**
     * Recupera il valore della proprietà originatingCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingCountry() {
        return originatingCountry;
    }

    /**
     * Imposta il valore della proprietà originatingCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingCountry(String value) {
        this.originatingCountry = value;
    }

    /**
     * Gets the value of the destinationCountries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationCountries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationCountries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDestinationCountries() {
        if (destinationCountries == null) {
            destinationCountries = new ArrayList<String>();
        }
        return this.destinationCountries;
    }

    /**
     * Recupera il valore della proprietà messageId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Imposta il valore della proprietà messageId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Recupera il valore della proprietà correlationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationId() {
        return correlationId;
    }

    /**
     * Imposta il valore della proprietà correlationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationId(String value) {
        this.correlationId = value;
    }

    /**
     * Recupera il valore della proprietà timestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Imposta il valore della proprietà timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Recupera il valore della proprietà messageTypeIndic.
     * 
     */
    public byte getMessageTypeIndic() {
        return messageTypeIndic;
    }

    /**
     * Imposta il valore della proprietà messageTypeIndic.
     * 
     */
    public void setMessageTypeIndic(byte value) {
        this.messageTypeIndic = value;
    }

}
