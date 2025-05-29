//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:06 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.v1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.europa.ec.taxud.directtax.aeoi.common_statistics.v2.MessageTypeIndicatorType;
import eu.europa.ec.taxud.directtax.aeoi.common_statistics.v2.StatusType;


/**
 * This type defines the statistics for STS-110 - Status Message Error Statistics.
 * 
 * <p>Classe Java per STS-110_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="STS-110_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MESSAGE_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="MESSAGE_REF" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="MESSAGE_DATE" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}DateYearMonthDay_Type"/&gt;
 *         &lt;element name="SS_CODE" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type"/&gt;
 *         &lt;element name="RR_CODE" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type"/&gt;
 *         &lt;element name="MESSAGE_TYPE_INDICATOR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common_statistics:v2}MessageTypeIndicator_Type"/&gt;
 *         &lt;element name="REPORTING_PERIOD" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}DateYearMonthDay_Type"/&gt;
 *         &lt;element name="STATUS" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common_statistics:v2}Status_Type"/&gt;
 *         &lt;element name="VALIDATOR" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="ERROR_CODE" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="ST_ERRORS_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STS-110_Type", propOrder = {
    "messageid",
    "messageref",
    "messagedate",
    "sscode",
    "rrcode",
    "messagetypeindicator",
    "reportingperiod",
    "status",
    "validator",
    "errorcode",
    "sterrorsqty"
})
public class STS110TypeDAC2STS {

    @XmlElement(name = "MESSAGE_ID", required = true)
    protected BigInteger messageid;
    @XmlElement(name = "MESSAGE_REF", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String messageref;
    @XmlElement(name = "MESSAGE_DATE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar messagedate;
    @XmlElement(name = "SS_CODE", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String sscode;
    @XmlElement(name = "RR_CODE", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String rrcode;
    @XmlElement(name = "MESSAGE_TYPE_INDICATOR", required = true)
    @XmlSchemaType(name = "token")
    protected MessageTypeIndicatorType messagetypeindicator;
    @XmlElement(name = "REPORTING_PERIOD", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reportingperiod;
    @XmlElement(name = "STATUS", required = true)
    @XmlSchemaType(name = "token")
    protected StatusType status;
    @XmlElement(name = "VALIDATOR", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String validator;
    @XmlElement(name = "ERROR_CODE", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String errorcode;
    @XmlElement(name = "ST_ERRORS_QTY", required = true)
    protected BigInteger sterrorsqty;

    /**
     * Recupera il valore della proprietà messageid.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMESSAGEID() {
        return messageid;
    }

    /**
     * Imposta il valore della proprietà messageid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMESSAGEID(BigInteger value) {
        this.messageid = value;
    }

    /**
     * Recupera il valore della proprietà messageref.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESSAGEREF() {
        return messageref;
    }

    /**
     * Imposta il valore della proprietà messageref.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESSAGEREF(String value) {
        this.messageref = value;
    }

    /**
     * Recupera il valore della proprietà messagedate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMESSAGEDATE() {
        return messagedate;
    }

    /**
     * Imposta il valore della proprietà messagedate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMESSAGEDATE(XMLGregorianCalendar value) {
        this.messagedate = value;
    }

    /**
     * Recupera il valore della proprietà sscode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSCODE() {
        return sscode;
    }

    /**
     * Imposta il valore della proprietà sscode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSCODE(String value) {
        this.sscode = value;
    }

    /**
     * Recupera il valore della proprietà rrcode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRRCODE() {
        return rrcode;
    }

    /**
     * Imposta il valore della proprietà rrcode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRRCODE(String value) {
        this.rrcode = value;
    }

    /**
     * Recupera il valore della proprietà messagetypeindicator.
     * 
     * @return
     *     possible object is
     *     {@link MessageTypeIndicatorType }
     *     
     */
    public MessageTypeIndicatorType getMESSAGETYPEINDICATOR() {
        return messagetypeindicator;
    }

    /**
     * Imposta il valore della proprietà messagetypeindicator.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageTypeIndicatorType }
     *     
     */
    public void setMESSAGETYPEINDICATOR(MessageTypeIndicatorType value) {
        this.messagetypeindicator = value;
    }

    /**
     * Recupera il valore della proprietà reportingperiod.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getREPORTINGPERIOD() {
        return reportingperiod;
    }

    /**
     * Imposta il valore della proprietà reportingperiod.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setREPORTINGPERIOD(XMLGregorianCalendar value) {
        this.reportingperiod = value;
    }

    /**
     * Recupera il valore della proprietà status.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getSTATUS() {
        return status;
    }

    /**
     * Imposta il valore della proprietà status.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setSTATUS(StatusType value) {
        this.status = value;
    }

    /**
     * Recupera il valore della proprietà validator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALIDATOR() {
        return validator;
    }

    /**
     * Imposta il valore della proprietà validator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALIDATOR(String value) {
        this.validator = value;
    }

    /**
     * Recupera il valore della proprietà errorcode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRORCODE() {
        return errorcode;
    }

    /**
     * Imposta il valore della proprietà errorcode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRORCODE(String value) {
        this.errorcode = value;
    }

    /**
     * Recupera il valore della proprietà sterrorsqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSTERRORSQTY() {
        return sterrorsqty;
    }

    /**
     * Imposta il valore della proprietà sterrorsqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSTERRORSQTY(BigInteger value) {
        this.sterrorsqty = value;
    }

}
