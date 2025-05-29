//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:09:58 AM CEST 
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
 * This type defines the statistics for LIPS-110 - Policy Overall Statistics.
 * 
 * <p>Classe Java per LIPS-110_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LIPS-110_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MSG_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="MSG_REF" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="MSG_DATE" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}DateYearMonthDay_Type"/&gt;
 *         &lt;element name="MSG_ORIGINATING_COUNTRY" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type"/&gt;
 *         &lt;element name="MSG_DESTINATION_COUNTRY" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type"/&gt;
 *         &lt;element name="MSG_TYPE_INDIC" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common_statistics:v2}MsgTypeIndic_Type"/&gt;
 *         &lt;element name="MSG_APPLICATION_ID" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}MsgApplicationIdLIP_Type"/&gt;
 *         &lt;element name="MSG_TAX_YEAR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}DateYearMonthDay_Type"/&gt;
 *         &lt;element name="POLICY_TYPE" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}PolicyType_Type"/&gt;
 *         &lt;element name="EUSD_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="BENEFICIARY_ABSOLUTE_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="BENEFICIARY_ON_BEHALF_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="BENEFICIARY_ULTIMATE_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="BENEFICIARY_UNKNOWN_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="BENEFICIARY_CLASS_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="INSURER_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="OWNER_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="PAYER_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="LIFE_INSURED_NAMED_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="LIFE_INSURED_CLASS_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="POLICY_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CAPITAL_VALUE_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CAPITAL_VALUE_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CAPITAL_VALUE_EUR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIPS-110_Type", propOrder = {
    "msgid",
    "msgref",
    "msgdate",
    "msgoriginatingcountry",
    "msgdestinationcountry",
    "msgtypeindic",
    "msgapplicationid",
    "msgtaxyear",
    "policytype",
    "eusdindicator",
    "beneficiaryabsolutegroup",
    "beneficiaryonbehalfgroup",
    "beneficiaryultimategroup",
    "beneficiaryunknowngroup",
    "beneficiaryclassgroup",
    "insurergroup",
    "ownergroup",
    "payergroup",
    "lifeinsurednamedgroup",
    "lifeinsuredclassgroup",
    "policyqty",
    "capitalvaluegroup",
    "capitalvalueqty",
    "capitalvalueeur",
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
    "taxinfoexistenceqty"
})
public class LIPS110Type {

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
    protected MsgApplicationIdLIPType msgapplicationid;
    @XmlElement(name = "MSG_TAX_YEAR", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar msgtaxyear;
    @XmlElement(name = "POLICY_TYPE", required = true)
    @XmlSchemaType(name = "token")
    protected PolicyTypeType policytype;
    @XmlElement(name = "EUSD_INDICATOR")
    protected boolean eusdindicator;
    @XmlElement(name = "BENEFICIARY_ABSOLUTE_GROUP", required = true)
    protected BigInteger beneficiaryabsolutegroup;
    @XmlElement(name = "BENEFICIARY_ON_BEHALF_GROUP", required = true)
    protected BigInteger beneficiaryonbehalfgroup;
    @XmlElement(name = "BENEFICIARY_ULTIMATE_GROUP", required = true)
    protected BigInteger beneficiaryultimategroup;
    @XmlElement(name = "BENEFICIARY_UNKNOWN_GROUP", required = true)
    protected BigInteger beneficiaryunknowngroup;
    @XmlElement(name = "BENEFICIARY_CLASS_GROUP", required = true)
    protected BigInteger beneficiaryclassgroup;
    @XmlElement(name = "INSURER_GROUP", required = true)
    protected BigInteger insurergroup;
    @XmlElement(name = "OWNER_GROUP", required = true)
    protected BigInteger ownergroup;
    @XmlElement(name = "PAYER_GROUP", required = true)
    protected BigInteger payergroup;
    @XmlElement(name = "LIFE_INSURED_NAMED_GROUP", required = true)
    protected BigInteger lifeinsurednamedgroup;
    @XmlElement(name = "LIFE_INSURED_CLASS_GROUP", required = true)
    protected BigInteger lifeinsuredclassgroup;
    @XmlElement(name = "POLICY_QTY", required = true)
    protected BigInteger policyqty;
    @XmlElement(name = "CAPITAL_VALUE_GROUP", required = true)
    protected BigInteger capitalvaluegroup;
    @XmlElement(name = "CAPITAL_VALUE_QTY", required = true)
    protected BigInteger capitalvalueqty;
    @XmlElement(name = "CAPITAL_VALUE_EUR", required = true)
    protected BigDecimal capitalvalueeur;
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
     *     {@link MsgApplicationIdLIPType }
     *     
     */
    public MsgApplicationIdLIPType getMSGAPPLICATIONID() {
        return msgapplicationid;
    }

    /**
     * Imposta il valore della proprietà msgapplicationid.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgApplicationIdLIPType }
     *     
     */
    public void setMSGAPPLICATIONID(MsgApplicationIdLIPType value) {
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
     * Recupera il valore della proprietà policytype.
     * 
     * @return
     *     possible object is
     *     {@link PolicyTypeType }
     *     
     */
    public PolicyTypeType getPOLICYTYPE() {
        return policytype;
    }

    /**
     * Imposta il valore della proprietà policytype.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyTypeType }
     *     
     */
    public void setPOLICYTYPE(PolicyTypeType value) {
        this.policytype = value;
    }

    /**
     * Recupera il valore della proprietà eusdindicator.
     * 
     */
    public boolean isEUSDINDICATOR() {
        return eusdindicator;
    }

    /**
     * Imposta il valore della proprietà eusdindicator.
     * 
     */
    public void setEUSDINDICATOR(boolean value) {
        this.eusdindicator = value;
    }

    /**
     * Recupera il valore della proprietà beneficiaryabsolutegroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBENEFICIARYABSOLUTEGROUP() {
        return beneficiaryabsolutegroup;
    }

    /**
     * Imposta il valore della proprietà beneficiaryabsolutegroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBENEFICIARYABSOLUTEGROUP(BigInteger value) {
        this.beneficiaryabsolutegroup = value;
    }

    /**
     * Recupera il valore della proprietà beneficiaryonbehalfgroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBENEFICIARYONBEHALFGROUP() {
        return beneficiaryonbehalfgroup;
    }

    /**
     * Imposta il valore della proprietà beneficiaryonbehalfgroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBENEFICIARYONBEHALFGROUP(BigInteger value) {
        this.beneficiaryonbehalfgroup = value;
    }

    /**
     * Recupera il valore della proprietà beneficiaryultimategroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBENEFICIARYULTIMATEGROUP() {
        return beneficiaryultimategroup;
    }

    /**
     * Imposta il valore della proprietà beneficiaryultimategroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBENEFICIARYULTIMATEGROUP(BigInteger value) {
        this.beneficiaryultimategroup = value;
    }

    /**
     * Recupera il valore della proprietà beneficiaryunknowngroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBENEFICIARYUNKNOWNGROUP() {
        return beneficiaryunknowngroup;
    }

    /**
     * Imposta il valore della proprietà beneficiaryunknowngroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBENEFICIARYUNKNOWNGROUP(BigInteger value) {
        this.beneficiaryunknowngroup = value;
    }

    /**
     * Recupera il valore della proprietà beneficiaryclassgroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBENEFICIARYCLASSGROUP() {
        return beneficiaryclassgroup;
    }

    /**
     * Imposta il valore della proprietà beneficiaryclassgroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBENEFICIARYCLASSGROUP(BigInteger value) {
        this.beneficiaryclassgroup = value;
    }

    /**
     * Recupera il valore della proprietà insurergroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getINSURERGROUP() {
        return insurergroup;
    }

    /**
     * Imposta il valore della proprietà insurergroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setINSURERGROUP(BigInteger value) {
        this.insurergroup = value;
    }

    /**
     * Recupera il valore della proprietà ownergroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOWNERGROUP() {
        return ownergroup;
    }

    /**
     * Imposta il valore della proprietà ownergroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOWNERGROUP(BigInteger value) {
        this.ownergroup = value;
    }

    /**
     * Recupera il valore della proprietà payergroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPAYERGROUP() {
        return payergroup;
    }

    /**
     * Imposta il valore della proprietà payergroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPAYERGROUP(BigInteger value) {
        this.payergroup = value;
    }

    /**
     * Recupera il valore della proprietà lifeinsurednamedgroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLIFEINSUREDNAMEDGROUP() {
        return lifeinsurednamedgroup;
    }

    /**
     * Imposta il valore della proprietà lifeinsurednamedgroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLIFEINSUREDNAMEDGROUP(BigInteger value) {
        this.lifeinsurednamedgroup = value;
    }

    /**
     * Recupera il valore della proprietà lifeinsuredclassgroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLIFEINSUREDCLASSGROUP() {
        return lifeinsuredclassgroup;
    }

    /**
     * Imposta il valore della proprietà lifeinsuredclassgroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLIFEINSUREDCLASSGROUP(BigInteger value) {
        this.lifeinsuredclassgroup = value;
    }

    /**
     * Recupera il valore della proprietà policyqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPOLICYQTY() {
        return policyqty;
    }

    /**
     * Imposta il valore della proprietà policyqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPOLICYQTY(BigInteger value) {
        this.policyqty = value;
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

}
