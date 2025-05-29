//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
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
 * This type defines the statistics for PENS-140 - Income Statistics.
 * 
 * <p>Classe Java per PENS-140_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PENS-140_Type"&gt;
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
 *         &lt;element name="ADMIN_EXIST" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ABSOLUTE_ENTITLEMENT_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ON_BEHALF_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="BENEFICIAL_OWNER_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="SCHEME_NATURE" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}SchemeNature_Type"/&gt;
 *         &lt;element name="FOREIGN_APPROVED_SCHEME" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SCHEME_KIND" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}SchemeKind_Type"/&gt;
 *         &lt;element name="SCHEME_TYPE" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}SchemeType_Type"/&gt;
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
 *         &lt;element name="TAX_INFO_AMOUNT_EXCESS_AND_OTHER_EUR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="TAX_INFO_EXISTENCE_RELIEF_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TAX_INFO_EXISTENCE_IN_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TAX_INFO_EXISTENCE_OUT_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TAX_INFO_EXISTENCE_YIELD_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TAX_INFO_EXISTENCE_EXCESS_AND_OTHER_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PENS-140_Type", propOrder = {
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
    "adminexist",
    "absoluteentitlementgroup",
    "onbehalfgroup",
    "beneficialownergroup",
    "schemenature",
    "foreignapprovedscheme",
    "schemekind",
    "schemetype",
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
    "taxinfoamountexcessandothereur",
    "taxinfoexistencereliefqty",
    "taxinfoexistenceinqty",
    "taxinfoexistenceoutqty",
    "taxinfoexistenceyieldqty",
    "taxinfoexistenceexcessandotherqty"
})
public class PENS140Type {

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
    @XmlElement(name = "ADMIN_EXIST")
    protected boolean adminexist;
    @XmlElement(name = "ABSOLUTE_ENTITLEMENT_GROUP", required = true)
    protected BigInteger absoluteentitlementgroup;
    @XmlElement(name = "ON_BEHALF_GROUP", required = true)
    protected BigInteger onbehalfgroup;
    @XmlElement(name = "BENEFICIAL_OWNER_GROUP", required = true)
    protected BigInteger beneficialownergroup;
    @XmlElement(name = "SCHEME_NATURE", required = true)
    @XmlSchemaType(name = "token")
    protected SchemeNatureType schemenature;
    @XmlElement(name = "FOREIGN_APPROVED_SCHEME")
    protected Boolean foreignapprovedscheme;
    @XmlElement(name = "SCHEME_KIND", required = true)
    @XmlSchemaType(name = "token")
    protected SchemeKindType schemekind;
    @XmlElement(name = "SCHEME_TYPE", required = true)
    @XmlSchemaType(name = "token")
    protected SchemeTypeType schemetype;
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
    @XmlElement(name = "TAX_INFO_AMOUNT_EXCESS_AND_OTHER_EUR", required = true)
    protected BigDecimal taxinfoamountexcessandothereur;
    @XmlElement(name = "TAX_INFO_EXISTENCE_RELIEF_QTY", required = true)
    protected BigInteger taxinfoexistencereliefqty;
    @XmlElement(name = "TAX_INFO_EXISTENCE_IN_QTY", required = true)
    protected BigInteger taxinfoexistenceinqty;
    @XmlElement(name = "TAX_INFO_EXISTENCE_OUT_QTY", required = true)
    protected BigInteger taxinfoexistenceoutqty;
    @XmlElement(name = "TAX_INFO_EXISTENCE_YIELD_QTY", required = true)
    protected BigInteger taxinfoexistenceyieldqty;
    @XmlElement(name = "TAX_INFO_EXISTENCE_EXCESS_AND_OTHER_QTY", required = true)
    protected BigInteger taxinfoexistenceexcessandotherqty;

    /**
     * Recupera il valore della propriet� msgid.
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
     * Imposta il valore della propriet� msgid.
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
     * Recupera il valore della propriet� msgref.
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
     * Imposta il valore della propriet� msgref.
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
     * Recupera il valore della propriet� msgdate.
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
     * Imposta il valore della propriet� msgdate.
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
     * Recupera il valore della propriet� msgoriginatingcountry.
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
     * Imposta il valore della propriet� msgoriginatingcountry.
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
     * Recupera il valore della propriet� msgdestinationcountry.
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
     * Imposta il valore della propriet� msgdestinationcountry.
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
     * Recupera il valore della propriet� msgtypeindic.
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
     * Imposta il valore della propriet� msgtypeindic.
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
     * Recupera il valore della propriet� msgapplicationid.
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
     * Imposta il valore della propriet� msgapplicationid.
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
     * Recupera il valore della propriet� msgtaxyear.
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
     * Imposta il valore della propriet� msgtaxyear.
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
     * Recupera il valore della propriet� isnp.
     * 
     */
    public boolean isISNP() {
        return isnp;
    }

    /**
     * Imposta il valore della propriet� isnp.
     * 
     */
    public void setISNP(boolean value) {
        this.isnp = value;
    }

    /**
     * Recupera il valore della propriet� personidtinisrr.
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
     * Imposta il valore della propriet� personidtinisrr.
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
     * Recupera il valore della propriet� personidtinisntrr.
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
     * Imposta il valore della propriet� personidtinisntrr.
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
     * Recupera il valore della propriet� personidssnisrr.
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
     * Imposta il valore della propriet� personidssnisrr.
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
     * Recupera il valore della propriet� personidssnisntrr.
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
     * Imposta il valore della propriet� personidssnisntrr.
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
     * Recupera il valore della propriet� personidvat.
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
     * Imposta il valore della propriet� personidvat.
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
     * Recupera il valore della propriet� personidother.
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
     * Imposta il valore della propriet� personidother.
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
     * Recupera il valore della propriet� personidnotype.
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
     * Imposta il valore della propriet� personidnotype.
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
     * Recupera il valore della propriet� adminexist.
     * 
     */
    public boolean isADMINEXIST() {
        return adminexist;
    }

    /**
     * Imposta il valore della propriet� adminexist.
     * 
     */
    public void setADMINEXIST(boolean value) {
        this.adminexist = value;
    }

    /**
     * Recupera il valore della propriet� absoluteentitlementgroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getABSOLUTEENTITLEMENTGROUP() {
        return absoluteentitlementgroup;
    }

    /**
     * Imposta il valore della propriet� absoluteentitlementgroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setABSOLUTEENTITLEMENTGROUP(BigInteger value) {
        this.absoluteentitlementgroup = value;
    }

    /**
     * Recupera il valore della propriet� onbehalfgroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getONBEHALFGROUP() {
        return onbehalfgroup;
    }

    /**
     * Imposta il valore della propriet� onbehalfgroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setONBEHALFGROUP(BigInteger value) {
        this.onbehalfgroup = value;
    }

    /**
     * Recupera il valore della propriet� beneficialownergroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBENEFICIALOWNERGROUP() {
        return beneficialownergroup;
    }

    /**
     * Imposta il valore della propriet� beneficialownergroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBENEFICIALOWNERGROUP(BigInteger value) {
        this.beneficialownergroup = value;
    }

    /**
     * Recupera il valore della propriet� schemenature.
     * 
     * @return
     *     possible object is
     *     {@link SchemeNatureType }
     *     
     */
    public SchemeNatureType getSCHEMENATURE() {
        return schemenature;
    }

    /**
     * Imposta il valore della propriet� schemenature.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemeNatureType }
     *     
     */
    public void setSCHEMENATURE(SchemeNatureType value) {
        this.schemenature = value;
    }

    /**
     * Recupera il valore della propriet� foreignapprovedscheme.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFOREIGNAPPROVEDSCHEME() {
        return foreignapprovedscheme;
    }

    /**
     * Imposta il valore della propriet� foreignapprovedscheme.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFOREIGNAPPROVEDSCHEME(Boolean value) {
        this.foreignapprovedscheme = value;
    }

    /**
     * Recupera il valore della propriet� schemekind.
     * 
     * @return
     *     possible object is
     *     {@link SchemeKindType }
     *     
     */
    public SchemeKindType getSCHEMEKIND() {
        return schemekind;
    }

    /**
     * Imposta il valore della propriet� schemekind.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemeKindType }
     *     
     */
    public void setSCHEMEKIND(SchemeKindType value) {
        this.schemekind = value;
    }

    /**
     * Recupera il valore della propriet� schemetype.
     * 
     * @return
     *     possible object is
     *     {@link SchemeTypeType }
     *     
     */
    public SchemeTypeType getSCHEMETYPE() {
        return schemetype;
    }

    /**
     * Imposta il valore della propriet� schemetype.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemeTypeType }
     *     
     */
    public void setSCHEMETYPE(SchemeTypeType value) {
        this.schemetype = value;
    }

    /**
     * Recupera il valore della propriet� eventtype.
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
     * Imposta il valore della propriet� eventtype.
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
     * Recupera il valore della propriet� eventqty.
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
     * Imposta il valore della propriet� eventqty.
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
     * Recupera il valore della propriet� eventinfoamountgroup.
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
     * Imposta il valore della propriet� eventinfoamountgroup.
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
     * Recupera il valore della propriet� eventinfoamountqty.
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
     * Imposta il valore della propriet� eventinfoamountqty.
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
     * Recupera il valore della propriet� eventinfoamounteur.
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
     * Imposta il valore della propriet� eventinfoamounteur.
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
     * Recupera il valore della propriet� eventinfoexistencegroup.
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
     * Imposta il valore della propriet� eventinfoexistencegroup.
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
     * Recupera il valore della propriet� eventinfoexistenceqty.
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
     * Imposta il valore della propriet� eventinfoexistenceqty.
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
     * Recupera il valore della propriet� taxinfoamountqty.
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
     * Imposta il valore della propriet� taxinfoamountqty.
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
     * Recupera il valore della propriet� taxinfoamountreliefeur.
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
     * Imposta il valore della propriet� taxinfoamountreliefeur.
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
     * Recupera il valore della propriet� taxinfoamountineur.
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
     * Imposta il valore della propriet� taxinfoamountineur.
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
     * Recupera il valore della propriet� taxinfoamountouteur.
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
     * Imposta il valore della propriet� taxinfoamountouteur.
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
     * Recupera il valore della propriet� taxinfoamountyieldeur.
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
     * Imposta il valore della propriet� taxinfoamountyieldeur.
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
     * Recupera il valore della propriet� taxinfoamountexcessandothereur.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTAXINFOAMOUNTEXCESSANDOTHEREUR() {
        return taxinfoamountexcessandothereur;
    }

    /**
     * Imposta il valore della propriet� taxinfoamountexcessandothereur.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTAXINFOAMOUNTEXCESSANDOTHEREUR(BigDecimal value) {
        this.taxinfoamountexcessandothereur = value;
    }

    /**
     * Recupera il valore della propriet� taxinfoexistencereliefqty.
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
     * Imposta il valore della propriet� taxinfoexistencereliefqty.
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
     * Recupera il valore della propriet� taxinfoexistenceinqty.
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
     * Imposta il valore della propriet� taxinfoexistenceinqty.
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
     * Recupera il valore della propriet� taxinfoexistenceoutqty.
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
     * Imposta il valore della propriet� taxinfoexistenceoutqty.
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
     * Recupera il valore della propriet� taxinfoexistenceyieldqty.
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
     * Imposta il valore della propriet� taxinfoexistenceyieldqty.
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
     * Recupera il valore della propriet� taxinfoexistenceexcessandotherqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTAXINFOEXISTENCEEXCESSANDOTHERQTY() {
        return taxinfoexistenceexcessandotherqty;
    }

    /**
     * Imposta il valore della propriet� taxinfoexistenceexcessandotherqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTAXINFOEXISTENCEEXCESSANDOTHERQTY(BigInteger value) {
        this.taxinfoexistenceexcessandotherqty = value;
    }

}
