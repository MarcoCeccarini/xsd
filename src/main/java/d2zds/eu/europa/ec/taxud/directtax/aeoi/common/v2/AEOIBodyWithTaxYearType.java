//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:08 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import _int.eu.cec.taxud.directtax.v4.BodyType;


/**
 * Abstract subtype of the standard body type to add a tax year
 * 
 * <p>Classe Java per AEOIBodyWithTaxYear_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AEOIBodyWithTaxYear_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:cec.eu.int:taxud:directtax:v4}Body_Type"&gt;
 *       &lt;attribute name="taxYear" use="required" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}DateYearMonthDay_Type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AEOIBodyWithTaxYear_Type")
public abstract class AEOIBodyWithTaxYearType
    extends BodyType
{

    @XmlAttribute(name = "taxYear", required = true)
    protected XMLGregorianCalendar taxYear;

    /**
     * Recupera il valore della proprietà taxYear.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTaxYear() {
        return taxYear;
    }

    /**
     * Imposta il valore della proprietà taxYear.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTaxYear(XMLGregorianCalendar value) {
        this.taxYear = value;
    }

}
