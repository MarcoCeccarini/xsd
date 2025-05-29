//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:02 AM CEST 
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
import eu.europa.ec.taxud.directtax.aeoi.common_statistics.v2.StatusType;


/**
 * This type defines the statistics for STS-110 - Status Message Statistics.
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
 *         &lt;element name="MSG_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="MSG_REF" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="MSG_DATE" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}DateYearMonthDay_Type"/&gt;
 *         &lt;element name="MSG_ORIGINATING_COUNTRY" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type"/&gt;
 *         &lt;element name="MSG_DESTINATION_COUNTRY" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type"/&gt;
 *         &lt;element name="MSG_TYPE_INDIC" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}MsgTypeIndicSTS_Type"/&gt;
 *         &lt;element name="MSG_CORRELATION_REF" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="MSG_APPLICATION_ID" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}MsgApplicationIdSTS_Type"/&gt;
 *         &lt;element name="MSG_TAX_YEAR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}DateYearMonthDay_Type"/&gt;
 *         &lt;element name="STATUS" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common_statistics:v2}Status_Type"/&gt;
 *         &lt;element name="VALIDATED_BY" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="ST_MSG_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
    "msgid",
    "msgref",
    "msgdate",
    "msgoriginatingcountry",
    "msgdestinationcountry",
    "msgtypeindic",
    "msgcorrelationref",
    "msgapplicationid",
    "msgtaxyear",
    "status",
    "validatedby",
    "stmsgqty",
    "sterrorsqty"
})
public class STS110Type {

    @XmlElement(name = "MSG_ID", required = true)
    protected BigInteger msgid;
    @XmlElement(name = "MSG_REF", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String msgref;
    @XmlElement(name = "MSG_DATE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar msgdate;
    @XmlElement(name = "MSG_ORIGINATING_COUNTRY", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String msgoriginatingcountry;
    @XmlElement(name = "MSG_DESTINATION_COUNTRY", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String msgdestinationcountry;
    @XmlElement(name = "MSG_TYPE_INDIC", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String msgtypeindic;
    @XmlElement(name = "MSG_CORRELATION_REF", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String msgcorrelationref;
    @XmlElement(name = "MSG_APPLICATION_ID", required = true)
    @XmlSchemaType(name = "token")
    protected MsgApplicationIdSTSType msgapplicationid;
    @XmlElement(name = "MSG_TAX_YEAR", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar msgtaxyear;
    @XmlElement(name = "STATUS", required = true)
    @XmlSchemaType(name = "token")
    protected StatusType status;
    @XmlElement(name = "VALIDATED_BY", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String validatedby;
    @XmlElement(name = "ST_MSG_QTY", required = true)
    protected BigInteger stmsgqty;
    @XmlElement(name = "ST_ERRORS_QTY", required = true)
    protected BigInteger sterrorsqty;

    /**
     * Recupera il valore della proprietà msgid.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMSGID() {
        return msgid;
    }

    /**
     * Imposta il valore della proprietà msgid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMSGID(BigInteger value) {
        this.msgid = value;
    }

    /**
     * Recupera il valore della proprietà msgref.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGREF() {
        return msgref;
    }

    /**
     * Imposta il valore della proprietà msgref.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGREF(String value) {
        this.msgref = value;
    }

    /**
     * Recupera il valore della proprietà msgdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMSGDATE() {
        return msgdate;
    }

    /**
     * Imposta il valore della proprietà msgdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMSGDATE(XMLGregorianCalendar value) {
        this.msgdate = value;
    }

    /**
     * Recupera il valore della proprietà msgoriginatingcountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGORIGINATINGCOUNTRY() {
        return msgoriginatingcountry;
    }

    /**
     * Imposta il valore della proprietà msgoriginatingcountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGORIGINATINGCOUNTRY(String value) {
        this.msgoriginatingcountry = value;
    }

    /**
     * Recupera il valore della proprietà msgdestinationcountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGDESTINATIONCOUNTRY() {
        return msgdestinationcountry;
    }

    /**
     * Imposta il valore della proprietà msgdestinationcountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGDESTINATIONCOUNTRY(String value) {
        this.msgdestinationcountry = value;
    }

    /**
     * Recupera il valore della proprietà msgtypeindic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGTYPEINDIC() {
        return msgtypeindic;
    }

    /**
     * Imposta il valore della proprietà msgtypeindic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGTYPEINDIC(String value) {
        this.msgtypeindic = value;
    }

    /**
     * Recupera il valore della proprietà msgcorrelationref.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGCORRELATIONREF() {
        return msgcorrelationref;
    }

    /**
     * Imposta il valore della proprietà msgcorrelationref.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGCORRELATIONREF(String value) {
        this.msgcorrelationref = value;
    }

    /**
     * Recupera il valore della proprietà msgapplicationid.
     * 
     * @return
     *     possible object is
     *     {@link MsgApplicationIdSTSType }
     *     
     */
    public MsgApplicationIdSTSType getMSGAPPLICATIONID() {
        return msgapplicationid;
    }

    /**
     * Imposta il valore della proprietà msgapplicationid.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgApplicationIdSTSType }
     *     
     */
    public void setMSGAPPLICATIONID(MsgApplicationIdSTSType value) {
        this.msgapplicationid = value;
    }

    /**
     * Recupera il valore della proprietà msgtaxyear.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMSGTAXYEAR() {
        return msgtaxyear;
    }

    /**
     * Imposta il valore della proprietà msgtaxyear.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMSGTAXYEAR(XMLGregorianCalendar value) {
        this.msgtaxyear = value;
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
     * Recupera il valore della proprietà validatedby.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALIDATEDBY() {
        return validatedby;
    }

    /**
     * Imposta il valore della proprietà validatedby.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALIDATEDBY(String value) {
        this.validatedby = value;
    }

    /**
     * Recupera il valore della proprietà stmsgqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSTMSGQTY() {
        return stmsgqty;
    }

    /**
     * Imposta il valore della proprietà stmsgqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSTMSGQTY(BigInteger value) {
        this.stmsgqty = value;
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
