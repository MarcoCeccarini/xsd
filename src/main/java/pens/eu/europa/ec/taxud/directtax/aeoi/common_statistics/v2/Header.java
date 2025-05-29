//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:00 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common_statistics.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per Header complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Header"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransmittingCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MessageRefId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CorrMessageRefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header", propOrder = {
    "transmittingCountry",
    "messageRefId",
    "corrMessageRefId",
    "timestamp"
})
public class Header {

    @XmlElement(name = "TransmittingCountry", required = true)
    protected String transmittingCountry;
    @XmlElement(name = "MessageRefId", required = true)
    protected String messageRefId;
    @XmlElement(name = "CorrMessageRefId")
    protected String corrMessageRefId;
    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;

    /**
     * Recupera il valore della proprietà transmittingCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmittingCountry() {
        return transmittingCountry;
    }

    /**
     * Imposta il valore della proprietà transmittingCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmittingCountry(String value) {
        this.transmittingCountry = value;
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
     * Recupera il valore della proprietà corrMessageRefId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrMessageRefId() {
        return corrMessageRefId;
    }

    /**
     * Imposta il valore della proprietà corrMessageRefId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrMessageRefId(String value) {
        this.corrMessageRefId = value;
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

}
