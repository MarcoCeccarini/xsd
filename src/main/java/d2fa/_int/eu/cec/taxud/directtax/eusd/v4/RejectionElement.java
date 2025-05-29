//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:05 AM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ErrorType" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="ReqRefId" type="{urn:cec.eu.int:taxud:directtax:v4}UID_Type"/&gt;
 *           &lt;element name="DocRefId" type="{urn:cec.eu.int:taxud:directtax:v4}UID_Type"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "errorType",
    "reason",
    "reqRefId",
    "docRefId",
    "details"
})
@XmlRootElement(name = "RejectionElement")
public class RejectionElement {

    @XmlElement(name = "ErrorType", required = true)
    protected BigInteger errorType;
    @XmlElement(name = "Reason")
    protected BigInteger reason;
    @XmlElement(name = "ReqRefId")
    protected String reqRefId;
    @XmlElement(name = "DocRefId")
    protected String docRefId;
    @XmlElement(name = "Details")
    protected String details;

    /**
     * Recupera il valore della proprietà errorType.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getErrorType() {
        return errorType;
    }

    /**
     * Imposta il valore della proprietà errorType.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setErrorType(BigInteger value) {
        this.errorType = value;
    }

    /**
     * Recupera il valore della proprietà reason.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReason() {
        return reason;
    }

    /**
     * Imposta il valore della proprietà reason.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReason(BigInteger value) {
        this.reason = value;
    }

    /**
     * Recupera il valore della proprietà reqRefId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqRefId() {
        return reqRefId;
    }

    /**
     * Imposta il valore della proprietà reqRefId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqRefId(String value) {
        this.reqRefId = value;
    }

    /**
     * Recupera il valore della proprietà docRefId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocRefId() {
        return docRefId;
    }

    /**
     * Imposta il valore della proprietà docRefId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocRefId(String value) {
        this.docRefId = value;
    }

    /**
     * Recupera il valore della proprietà details.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetails() {
        return details;
    }

    /**
     * Imposta il valore della proprietà details.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetails(String value) {
        this.details = value;
    }

}
