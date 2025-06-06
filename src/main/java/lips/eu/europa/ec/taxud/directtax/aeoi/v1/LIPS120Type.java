//
// Questo file Ŕ stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrÓ persa durante la ricompilazione dello schema di origine. 
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
 * This type defines the statistics for LIPS-120 - Event Statistics.
 * 
 * <p>Classe Java per LIPS-120_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LIPS-120_Type"&gt;
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
 *         &lt;element name="EVENT_TYPE" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}EventType_Type"/&gt;
 *         &lt;element name="EVENT_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="EVENT_INFO_AMOUNT_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="EVENT_INFO_AMOUNT_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="EVENT_INFO_AMOUNT_EUR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="EVENT_INFO_EXISTENCE_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="EVENT_INFO_EXISTENCE_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TAX_INFO_AMOUNT_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TAX_INFO_AMOUNT_RELIEF_EUR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="TAX_INFO_AMOUNT_IN_EUR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="TAX_INFO_AMOUNT_OUT_EUR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="TAX_INFO_AMOUNT_YIELD_EUR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="TAX_INFO_AMOUNT_OTHER_EUR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="TAX_INFO_EXISTENCE_RELIEF_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TAX_INFO_EXISTENCE_IN_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TAX_INFO_EXISTENCE_OUT_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TAX_INFO_EXISTENCE_YIELD_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TAX_INFO_EXISTENCE_OTHER_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIPS-120_Type", propOrder = {
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
    "eventtype",
    "eventqty",
    "eventinfoamountgroup",
    "eventinfoamountqty",
    "eventinfoamounteur",
    "eventinfoexistencegroup",
    "eventinfoexistenceqty",
    "taxinfoamountqty",
    "taxinfoamountreliefeur",
    "taxinfoamountineur",
    "taxinfoamountouteur",
    "taxinfoamountyieldeur",
    "taxinfoamountothereur",
    "taxinfoexistencereliefqty",
    "taxinfoexistenceinqty",
    "taxinfoexistenceoutqty",
    "taxinfoexistenceyieldqty",
    "taxinfoexistenceotherqty"
})
public class LIPS120Type {

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
    @XmlElement(name = "EVENT_TYPE", required = true)
    @XmlSchemaType(name = "token")
    protected EventTypeType eventtype;
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
    @XmlElement(name = "TAX_INFO_AMOUNT_QTY", required = true)
    protected BigInteger taxinfoamountqty;
    @XmlElement(name = "TAX_INFO_AMOUNT_RELIEF_EUR", required = true)
    protected BigDecimal taxinfoamountreliefeur;
    @XmlElement(name = "TAX_INFO_AMOUNT_IN_EUR", required = true)
    protected BigDecimal taxinfoamountineur;
    @XmlElement(name = "TAX_INFO_AMOUNT_OUT_EUR", required = true)
    protected BigDecimal taxinfoamountouteur;
    @XmlElement(name = "TAX_INFO_AMOUNT_YIELD_EUR", required = true)
    protected BigDecimal taxinfoamountyieldeur;
    @XmlElement(name = "TAX_INFO_AMOUNT_OTHER_EUR", required = true)
    protected BigDecimal taxinfoamountothereur;
    @XmlElement(name = "TAX_INFO_EXISTENCE_RELIEF_QTY", required = true)
    protected BigInteger taxinfoexistencereliefqty;
    @XmlElement(name = "TAX_INFO_EXISTENCE_IN_QTY", required = true)
    protected BigInteger taxinfoexistenceinqty;
    @XmlElement(name = "TAX_INFO_EXISTENCE_OUT_QTY", required = true)
    protected BigInteger taxinfoexistenceoutqty;
    @XmlElement(name = "TAX_INFO_EXISTENCE_YIELD_QTY", required = true)
    protected BigInteger taxinfoexistenceyieldqty;
    @XmlElement(name = "TAX_INFO_EXISTENCE_OTHER_QTY", required = true)
    protected BigInteger taxinfoexistenceotherqty;

    /**
     * Recupera il valore della proprietÓ msgid.
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
     * Imposta il valore della proprietÓ msgid.
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
     * Recupera il valore della proprietÓ msgref.
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
     * Imposta il valore della proprietÓ msgref.
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
     * Recupera il valore della proprietÓ msgdate.
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
     * Imposta il valore della proprietÓ msgdate.
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
     * Recupera il valore della proprietÓ msgoriginatingcountry.
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
     * Imposta il valore della proprietÓ msgoriginatingcountry.
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
     * Recupera il valore della proprietÓ msgdestinationcountry.
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
     * Imposta il valore della proprietÓ msgdestinationcountry.
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
     * Recupera il valore della proprietÓ msgtypeindic.
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
     * Imposta il valore della proprietÓ msgtypeindic.
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
     * Recupera il valore della proprietÓ msgapplicationid.
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
     * Imposta il valore della proprietÓ msgapplicationid.
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
     * Recupera il valore della proprietÓ msgtaxyear.
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
     * Imposta il valore della proprietÓ msgtaxyear.
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
     * Recupera il valore della proprietÓ policytype.
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
     * Imposta il valore della proprietÓ policytype.
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
     * Recupera il valore della proprietÓ eusdindicator.
     * 
     */
    public boolean isEUSDINDICATOR() {
        return eusdindicator;
    }

    /**
     * Imposta il valore della proprietÓ eusdindicator.
     * 
     */
    public void setEUSDINDICATOR(boolean value) {
        this.eusdindicator = value;
    }

    /**
     * Recupera il valore della proprietÓ beneficiaryabsolutegroup.
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
     * Imposta il valore della proprietÓ beneficiaryabsolutegroup.
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
     * Recupera il valore della proprietÓ beneficiaryonbehalfgroup.
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
     * Imposta il valore della proprietÓ beneficiaryonbehalfgroup.
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
     * Recupera il valore della proprietÓ beneficiaryultimategroup.
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
     * Imposta il valore della proprietÓ beneficiaryultimategroup.
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
     * Recupera il valore della proprietÓ beneficiaryunknowngroup.
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
     * Imposta il valore della proprietÓ beneficiaryunknowngroup.
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
     * Recupera il valore della proprietÓ beneficiaryclassgroup.
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
     * Imposta il valore della proprietÓ beneficiaryclassgroup.
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
     * Recupera il valore della proprietÓ insurergroup.
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
     * Imposta il valore della proprietÓ insurergroup.
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
     * Recupera il valore della proprietÓ ownergroup.
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
     * Imposta il valore della proprietÓ ownergroup.
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
     * Recupera il valore della proprietÓ payergroup.
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
     * Imposta il valore della proprietÓ payergroup.
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
     * Recupera il valore della proprietÓ lifeinsurednamedgroup.
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
     * Imposta il valore della proprietÓ lifeinsurednamedgroup.
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
     * Recupera il valore della proprietÓ lifeinsuredclassgroup.
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
     * Imposta il valore della proprietÓ lifeinsuredclassgroup.
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
     * Recupera il valore della proprietÓ eventtype.
     * 
     * @return
     *     possible object is
     *     {@link EventTypeType }
     *     
     */
    public EventTypeType getEVENTTYPE() {
        return eventtype;
    }

    /**
     * Imposta il valore della proprietÓ eventtype.
     * 
     * @param value
     *     allowed object is
     *     {@link EventTypeType }
     *     
     */
    public void setEVENTTYPE(EventTypeType value) {
        this.eventtype = value;
    }

    /**
     * Recupera il valore della proprietÓ eventqty.
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
     * Imposta il valore della proprietÓ eventqty.
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
     * Recupera il valore della proprietÓ eventinfoamountgroup.
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
     * Imposta il valore della proprietÓ eventinfoamountgroup.
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
     * Recupera il valore della proprietÓ eventinfoamountqty.
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
     * Imposta il valore della proprietÓ eventinfoamountqty.
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
     * Recupera il valore della proprietÓ eventinfoamounteur.
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
     * Imposta il valore della proprietÓ eventinfoamounteur.
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
     * Recupera il valore della proprietÓ eventinfoexistencegroup.
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
     * Imposta il valore della proprietÓ eventinfoexistencegroup.
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
     * Recupera il valore della proprietÓ eventinfoexistenceqty.
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
     * Imposta il valore della proprietÓ eventinfoexistenceqty.
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
     * Recupera il valore della proprietÓ taxinfoamountqty.
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
     * Imposta il valore della proprietÓ taxinfoamountqty.
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
     * Recupera il valore della proprietÓ taxinfoamountreliefeur.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTAXINFOAMOUNTRELIEFEUR() {
        return taxinfoamountreliefeur;
    }

    /**
     * Imposta il valore della proprietÓ taxinfoamountreliefeur.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTAXINFOAMOUNTRELIEFEUR(BigDecimal value) {
        this.taxinfoamountreliefeur = value;
    }

    /**
     * Recupera il valore della proprietÓ taxinfoamountineur.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTAXINFOAMOUNTINEUR() {
        return taxinfoamountineur;
    }

    /**
     * Imposta il valore della proprietÓ taxinfoamountineur.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTAXINFOAMOUNTINEUR(BigDecimal value) {
        this.taxinfoamountineur = value;
    }

    /**
     * Recupera il valore della proprietÓ taxinfoamountouteur.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTAXINFOAMOUNTOUTEUR() {
        return taxinfoamountouteur;
    }

    /**
     * Imposta il valore della proprietÓ taxinfoamountouteur.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTAXINFOAMOUNTOUTEUR(BigDecimal value) {
        this.taxinfoamountouteur = value;
    }

    /**
     * Recupera il valore della proprietÓ taxinfoamountyieldeur.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTAXINFOAMOUNTYIELDEUR() {
        return taxinfoamountyieldeur;
    }

    /**
     * Imposta il valore della proprietÓ taxinfoamountyieldeur.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTAXINFOAMOUNTYIELDEUR(BigDecimal value) {
        this.taxinfoamountyieldeur = value;
    }

    /**
     * Recupera il valore della proprietÓ taxinfoamountothereur.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTAXINFOAMOUNTOTHEREUR() {
        return taxinfoamountothereur;
    }

    /**
     * Imposta il valore della proprietÓ taxinfoamountothereur.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTAXINFOAMOUNTOTHEREUR(BigDecimal value) {
        this.taxinfoamountothereur = value;
    }

    /**
     * Recupera il valore della proprietÓ taxinfoexistencereliefqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTAXINFOEXISTENCERELIEFQTY() {
        return taxinfoexistencereliefqty;
    }

    /**
     * Imposta il valore della proprietÓ taxinfoexistencereliefqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTAXINFOEXISTENCERELIEFQTY(BigInteger value) {
        this.taxinfoexistencereliefqty = value;
    }

    /**
     * Recupera il valore della proprietÓ taxinfoexistenceinqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTAXINFOEXISTENCEINQTY() {
        return taxinfoexistenceinqty;
    }

    /**
     * Imposta il valore della proprietÓ taxinfoexistenceinqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTAXINFOEXISTENCEINQTY(BigInteger value) {
        this.taxinfoexistenceinqty = value;
    }

    /**
     * Recupera il valore della proprietÓ taxinfoexistenceoutqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTAXINFOEXISTENCEOUTQTY() {
        return taxinfoexistenceoutqty;
    }

    /**
     * Imposta il valore della proprietÓ taxinfoexistenceoutqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTAXINFOEXISTENCEOUTQTY(BigInteger value) {
        this.taxinfoexistenceoutqty = value;
    }

    /**
     * Recupera il valore della proprietÓ taxinfoexistenceyieldqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTAXINFOEXISTENCEYIELDQTY() {
        return taxinfoexistenceyieldqty;
    }

    /**
     * Imposta il valore della proprietÓ taxinfoexistenceyieldqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTAXINFOEXISTENCEYIELDQTY(BigInteger value) {
        this.taxinfoexistenceyieldqty = value;
    }

    /**
     * Recupera il valore della proprietÓ taxinfoexistenceotherqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTAXINFOEXISTENCEOTHERQTY() {
        return taxinfoexistenceotherqty;
    }

    /**
     * Imposta il valore della proprietÓ taxinfoexistenceotherqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTAXINFOEXISTENCEOTHERQTY(BigInteger value) {
        this.taxinfoexistenceotherqty = value;
    }

}
