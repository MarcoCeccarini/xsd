//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 03:46:47 PM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per AdjustablePrecisionDate_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AdjustablePrecisionDate_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="DateYMD" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}DateYearMonthDay_Type"/&gt;
 *         &lt;element name="DateYM" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}DateYearMonth_Type"/&gt;
 *         &lt;element name="DateY" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}DateYear_Type"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustablePrecisionDate_Type", propOrder = {
    "dateYMD",
    "dateYM",
    "dateY"
})
public class AdjustablePrecisionDateType {

    @XmlElement(name = "DateYMD")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateYMD;
    @XmlElement(name = "DateYM")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar dateYM;
    @XmlElement(name = "DateY")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar dateY;

    /**
     * Recupera il valore della proprietà dateYMD.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateYMD() {
        return dateYMD;
    }

    /**
     * Imposta il valore della proprietà dateYMD.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateYMD(XMLGregorianCalendar value) {
        this.dateYMD = value;
    }

    /**
     * Recupera il valore della proprietà dateYM.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateYM() {
        return dateYM;
    }

    /**
     * Imposta il valore della proprietà dateYM.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateYM(XMLGregorianCalendar value) {
        this.dateYM = value;
    }

    /**
     * Recupera il valore della proprietà dateY.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateY() {
        return dateY;
    }

    /**
     * Imposta il valore della proprietà dateY.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateY(XMLGregorianCalendar value) {
        this.dateY = value;
    }

}
