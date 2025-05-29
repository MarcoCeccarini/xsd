//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:00 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.v1;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This type defines the statistics for PENS-110 - Recipient Statistics.
 * 
 * <p>Classe Java per PENS-110_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PENS-110_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MSG_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="MSG_REF" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="MSG_DATE" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}DateYearMonthDay_Type"/&gt;
 *         &lt;element name="MSG_ORIGINATING_COUNTRY" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type"/&gt;
 *         &lt;element name="MSG_DESTINATION_COUNTRY" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type"/&gt;
 *         &lt;element name="MSG_TYPE_INDIC" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common_statistics:v2}MsgTypeIndic_Type"/&gt;
 *         &lt;element name="MSG_APPLICATION_ID" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}MsgApplicationIdPEN_Type"/&gt;
 *         &lt;element name="MSG_TAX_YEAR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}DateYearMonthDay_Type"/&gt;
 *         &lt;element name="IS_NP" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PERSON_ID_TIN_IS_RR" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_ID_TIN_ISNT_RR" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_ID_SSN_IS_RR" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_ID_SSN_ISNT_RR" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_ID_VAT" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_ID_OTHER" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_ID_NO_TYPE" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_NAME_STRUCT" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_NAME_FREE" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_BIRTH_DATE" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_ADDRESS_STRUCT" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_ADDRESS_FREE" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="RECIPIENT_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="SCHEME_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="SCHEME_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="EVENT_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="EVENT_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="EVENT_INFO_AMOUNT_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="EVENT_INFO_AMOUNT_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="EVENT_INFO_AMOUNT_EUR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="EVENT_INFO_EXISTENCE_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="EVENT_INFO_EXISTENCE_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TAX_INFO_AMOUNT_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TAX_INFO_AMOUNT_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TAX_INFO_AMOUNT_EUR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="TAX_INFO_EXISTENCE_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TAX_INFO_EXISTENCE_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CAPITAL_VALUE_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CAPITAL_VALUE_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CAPITAL_VALUE_EUR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PENS-110_Type", propOrder = {
    "msgid",
    "msgref",
    "msgdate",
    "msgoriginatingcountry",
    "msgdestinationcountry",
    "msgtypeindic",
    "msgapplicationid",
    "msgtaxyear",
    "isnp",
    "personidtinisrr",
    "personidtinisntrr",
    "personidssnisrr",
    "personidssnisntrr",
    "personidvat",
    "personidother",
    "personidnotype",
    "personnamestruct",
    "personnamefree",
    "personbirthdate",
    "personaddressstruct",
    "personaddressfree",
    "recipientqty",
    "schemegroup",
    "schemeqty",
    "eventgroup",
    "eventqty",
    "eventinfoamountgroup",
    "eventinfoamountqty",
    "eventinfoamounteur",
    "eventinfoexistencegroup",
    "eventinfoexistenceqty",
    "taxinfoamountgroup",
    "taxinfoamountqty",
    "taxinfoamounteur",
    "taxinfoexistencegroup",
    "taxinfoexistenceqty",
    "capitalvaluegroup",
    "capitalvalueqty",
    "capitalvalueeur"
})
public class PENS110Type {

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
    @XmlElement(name = "MSG_APPLICATION_ID", required = true)
    @XmlSchemaType(name = "token")
    protected MsgApplicationIdPENType msgapplicationid;
    @XmlElement(name = "MSG_TAX_YEAR", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar msgtaxyear;
    @XmlElement(name = "IS_NP")
    protected boolean isnp;
    @XmlElement(name = "PERSON_ID_TIN_IS_RR", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personidtinisrr;
    @XmlElement(name = "PERSON_ID_TIN_ISNT_RR", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personidtinisntrr;
    @XmlElement(name = "PERSON_ID_SSN_IS_RR", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personidssnisrr;
    @XmlElement(name = "PERSON_ID_SSN_ISNT_RR", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personidssnisntrr;
    @XmlElement(name = "PERSON_ID_VAT", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personidvat;
    @XmlElement(name = "PERSON_ID_OTHER", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personidother;
    @XmlElement(name = "PERSON_ID_NO_TYPE", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personidnotype;
    @XmlElement(name = "PERSON_NAME_STRUCT", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personnamestruct;
    @XmlElement(name = "PERSON_NAME_FREE", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personnamefree;
    @XmlElement(name = "PERSON_BIRTH_DATE", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personbirthdate;
    @XmlElement(name = "PERSON_ADDRESS_STRUCT", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personaddressstruct;
    @XmlElement(name = "PERSON_ADDRESS_FREE", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personaddressfree;
    @XmlElement(name = "RECIPIENT_QTY", required = true)
    protected BigInteger recipientqty;
    @XmlElement(name = "SCHEME_GROUP", required = true)
    protected BigInteger schemegroup;
    @XmlElement(name = "SCHEME_QTY", required = true)
    protected BigInteger schemeqty;
    @XmlElement(name = "EVENT_GROUP", required = true)
    protected BigInteger eventgroup;
    @XmlElement(name = "EVENT_QTY", required = true)
    protected BigInteger eventqty;
    @XmlElement(name = "EVENT_INFO_AMOUNT_GROUP", required = true)
    protected BigInteger eventinfoamountgroup;
    @XmlElement(name = "EVENT_INFO_AMOUNT_QTY", required = true)
    protected BigInteger eventinfoamountqty;
    @XmlElement(name = "EVENT_INFO_AMOUNT_EUR", required = true)
    protected BigDecimal eventinfoamounteur;
    @XmlElement(name = "EVENT_INFO_EXISTENCE_GROUP", required = true)
    protected BigInteger eventinfoexistencegroup;
    @XmlElement(name = "EVENT_INFO_EXISTENCE_QTY", required = true)
    protected BigInteger eventinfoexistenceqty;
    @XmlElement(name = "TAX_INFO_AMOUNT_GROUP", required = true)
    protected BigInteger taxinfoamountgroup;
    @XmlElement(name = "TAX_INFO_AMOUNT_QTY", required = true)
    protected BigInteger taxinfoamountqty;
    @XmlElement(name = "TAX_INFO_AMOUNT_EUR", required = true)
    protected BigDecimal taxinfoamounteur;
    @XmlElement(name = "TAX_INFO_EXISTENCE_GROUP", required = true)
    protected BigInteger taxinfoexistencegroup;
    @XmlElement(name = "TAX_INFO_EXISTENCE_QTY", required = true)
    protected BigInteger taxinfoexistenceqty;
    @XmlElement(name = "CAPITAL_VALUE_GROUP", required = true)
    protected BigInteger capitalvaluegroup;
    @XmlElement(name = "CAPITAL_VALUE_QTY", required = true)
    protected BigInteger capitalvalueqty;
    @XmlElement(name = "CAPITAL_VALUE_EUR", required = true)
    protected BigDecimal capitalvalueeur;

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
     * Recupera il valore della proprietà msgapplicationid.
     * 
     * @return
     *     possible object is
     *     {@link MsgApplicationIdPENType }
     *     
     */
    public MsgApplicationIdPENType getMSGAPPLICATIONID() {
        return msgapplicationid;
    }

    /**
     * Imposta il valore della proprietà msgapplicationid.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgApplicationIdPENType }
     *     
     */
    public void setMSGAPPLICATIONID(MsgApplicationIdPENType value) {
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
     * Recupera il valore della proprietà isnp.
     * 
     */
    public boolean isISNP() {
        return isnp;
    }

    /**
     * Imposta il valore della proprietà isnp.
     * 
     */
    public void setISNP(boolean value) {
        this.isnp = value;
    }

    /**
     * Recupera il valore della proprietà personidtinisrr.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONIDTINISRR() {
        return personidtinisrr;
    }

    /**
     * Imposta il valore della proprietà personidtinisrr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONIDTINISRR(BigInteger value) {
        this.personidtinisrr = value;
    }

    /**
     * Recupera il valore della proprietà personidtinisntrr.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONIDTINISNTRR() {
        return personidtinisntrr;
    }

    /**
     * Imposta il valore della proprietà personidtinisntrr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONIDTINISNTRR(BigInteger value) {
        this.personidtinisntrr = value;
    }

    /**
     * Recupera il valore della proprietà personidssnisrr.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONIDSSNISRR() {
        return personidssnisrr;
    }

    /**
     * Imposta il valore della proprietà personidssnisrr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONIDSSNISRR(BigInteger value) {
        this.personidssnisrr = value;
    }

    /**
     * Recupera il valore della proprietà personidssnisntrr.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONIDSSNISNTRR() {
        return personidssnisntrr;
    }

    /**
     * Imposta il valore della proprietà personidssnisntrr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONIDSSNISNTRR(BigInteger value) {
        this.personidssnisntrr = value;
    }

    /**
     * Recupera il valore della proprietà personidvat.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONIDVAT() {
        return personidvat;
    }

    /**
     * Imposta il valore della proprietà personidvat.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONIDVAT(BigInteger value) {
        this.personidvat = value;
    }

    /**
     * Recupera il valore della proprietà personidother.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONIDOTHER() {
        return personidother;
    }

    /**
     * Imposta il valore della proprietà personidother.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONIDOTHER(BigInteger value) {
        this.personidother = value;
    }

    /**
     * Recupera il valore della proprietà personidnotype.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONIDNOTYPE() {
        return personidnotype;
    }

    /**
     * Imposta il valore della proprietà personidnotype.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONIDNOTYPE(BigInteger value) {
        this.personidnotype = value;
    }

    /**
     * Recupera il valore della proprietà personnamestruct.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONNAMESTRUCT() {
        return personnamestruct;
    }

    /**
     * Imposta il valore della proprietà personnamestruct.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONNAMESTRUCT(BigInteger value) {
        this.personnamestruct = value;
    }

    /**
     * Recupera il valore della proprietà personnamefree.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONNAMEFREE() {
        return personnamefree;
    }

    /**
     * Imposta il valore della proprietà personnamefree.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONNAMEFREE(BigInteger value) {
        this.personnamefree = value;
    }

    /**
     * Recupera il valore della proprietà personbirthdate.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONBIRTHDATE() {
        return personbirthdate;
    }

    /**
     * Imposta il valore della proprietà personbirthdate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONBIRTHDATE(BigInteger value) {
        this.personbirthdate = value;
    }

    /**
     * Recupera il valore della proprietà personaddressstruct.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONADDRESSSTRUCT() {
        return personaddressstruct;
    }

    /**
     * Imposta il valore della proprietà personaddressstruct.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONADDRESSSTRUCT(BigInteger value) {
        this.personaddressstruct = value;
    }

    /**
     * Recupera il valore della proprietà personaddressfree.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONADDRESSFREE() {
        return personaddressfree;
    }

    /**
     * Imposta il valore della proprietà personaddressfree.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONADDRESSFREE(BigInteger value) {
        this.personaddressfree = value;
    }

    /**
     * Recupera il valore della proprietà recipientqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRECIPIENTQTY() {
        return recipientqty;
    }

    /**
     * Imposta il valore della proprietà recipientqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRECIPIENTQTY(BigInteger value) {
        this.recipientqty = value;
    }

    /**
     * Recupera il valore della proprietà schemegroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSCHEMEGROUP() {
        return schemegroup;
    }

    /**
     * Imposta il valore della proprietà schemegroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSCHEMEGROUP(BigInteger value) {
        this.schemegroup = value;
    }

    /**
     * Recupera il valore della proprietà schemeqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSCHEMEQTY() {
        return schemeqty;
    }

    /**
     * Imposta il valore della proprietà schemeqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSCHEMEQTY(BigInteger value) {
        this.schemeqty = value;
    }

    /**
     * Recupera il valore della proprietà eventgroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEVENTGROUP() {
        return eventgroup;
    }

    /**
     * Imposta il valore della proprietà eventgroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEVENTGROUP(BigInteger value) {
        this.eventgroup = value;
    }

    /**
     * Recupera il valore della proprietà eventqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEVENTQTY() {
        return eventqty;
    }

    /**
     * Imposta il valore della proprietà eventqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEVENTQTY(BigInteger value) {
        this.eventqty = value;
    }

    /**
     * Recupera il valore della proprietà eventinfoamountgroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEVENTINFOAMOUNTGROUP() {
        return eventinfoamountgroup;
    }

    /**
     * Imposta il valore della proprietà eventinfoamountgroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEVENTINFOAMOUNTGROUP(BigInteger value) {
        this.eventinfoamountgroup = value;
    }

    /**
     * Recupera il valore della proprietà eventinfoamountqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEVENTINFOAMOUNTQTY() {
        return eventinfoamountqty;
    }

    /**
     * Imposta il valore della proprietà eventinfoamountqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEVENTINFOAMOUNTQTY(BigInteger value) {
        this.eventinfoamountqty = value;
    }

    /**
     * Recupera il valore della proprietà eventinfoamounteur.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEVENTINFOAMOUNTEUR() {
        return eventinfoamounteur;
    }

    /**
     * Imposta il valore della proprietà eventinfoamounteur.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEVENTINFOAMOUNTEUR(BigDecimal value) {
        this.eventinfoamounteur = value;
    }

    /**
     * Recupera il valore della proprietà eventinfoexistencegroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEVENTINFOEXISTENCEGROUP() {
        return eventinfoexistencegroup;
    }

    /**
     * Imposta il valore della proprietà eventinfoexistencegroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEVENTINFOEXISTENCEGROUP(BigInteger value) {
        this.eventinfoexistencegroup = value;
    }

    /**
     * Recupera il valore della proprietà eventinfoexistenceqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEVENTINFOEXISTENCEQTY() {
        return eventinfoexistenceqty;
    }

    /**
     * Imposta il valore della proprietà eventinfoexistenceqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEVENTINFOEXISTENCEQTY(BigInteger value) {
        this.eventinfoexistenceqty = value;
    }

    /**
     * Recupera il valore della proprietà taxinfoamountgroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTAXINFOAMOUNTGROUP() {
        return taxinfoamountgroup;
    }

    /**
     * Imposta il valore della proprietà taxinfoamountgroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTAXINFOAMOUNTGROUP(BigInteger value) {
        this.taxinfoamountgroup = value;
    }

    /**
     * Recupera il valore della proprietà taxinfoamountqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTAXINFOAMOUNTQTY() {
        return taxinfoamountqty;
    }

    /**
     * Imposta il valore della proprietà taxinfoamountqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTAXINFOAMOUNTQTY(BigInteger value) {
        this.taxinfoamountqty = value;
    }

    /**
     * Recupera il valore della proprietà taxinfoamounteur.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTAXINFOAMOUNTEUR() {
        return taxinfoamounteur;
    }

    /**
     * Imposta il valore della proprietà taxinfoamounteur.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTAXINFOAMOUNTEUR(BigDecimal value) {
        this.taxinfoamounteur = value;
    }

    /**
     * Recupera il valore della proprietà taxinfoexistencegroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTAXINFOEXISTENCEGROUP() {
        return taxinfoexistencegroup;
    }

    /**
     * Imposta il valore della proprietà taxinfoexistencegroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTAXINFOEXISTENCEGROUP(BigInteger value) {
        this.taxinfoexistencegroup = value;
    }

    /**
     * Recupera il valore della proprietà taxinfoexistenceqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTAXINFOEXISTENCEQTY() {
        return taxinfoexistenceqty;
    }

    /**
     * Imposta il valore della proprietà taxinfoexistenceqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTAXINFOEXISTENCEQTY(BigInteger value) {
        this.taxinfoexistenceqty = value;
    }

    /**
     * Recupera il valore della proprietà capitalvaluegroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCAPITALVALUEGROUP() {
        return capitalvaluegroup;
    }

    /**
     * Imposta il valore della proprietà capitalvaluegroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCAPITALVALUEGROUP(BigInteger value) {
        this.capitalvaluegroup = value;
    }

    /**
     * Recupera il valore della proprietà capitalvalueqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCAPITALVALUEQTY() {
        return capitalvalueqty;
    }

    /**
     * Imposta il valore della proprietà capitalvalueqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCAPITALVALUEQTY(BigInteger value) {
        this.capitalvalueqty = value;
    }

    /**
     * Recupera il valore della proprietà capitalvalueeur.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCAPITALVALUEEUR() {
        return capitalvalueeur;
    }

    /**
     * Imposta il valore della proprietà capitalvalueeur.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCAPITALVALUEEUR(BigDecimal value) {
        this.capitalvalueeur = value;
    }

}
