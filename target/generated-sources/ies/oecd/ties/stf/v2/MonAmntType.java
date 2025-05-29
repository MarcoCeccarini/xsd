//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 03:45:18 PM CEST 
//


package oecd.ties.stf.v2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * 			This data type is to be used whenever monetary amounts are to be communicated. Such amounts shall be given including two fractional digits of the main currency unit. The code for the currency in which the value is expressed has to be taken from the ISO codelist 4217 and added in attribute currCode.
 * 			
 * 
 * <p>Classe Java per MonAmnt_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MonAmnt_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:oecd:ties:stf:v2&gt;TwoDigFract_Type"&gt;
 *       &lt;attribute name="currCode" use="required" type="{urn:oecd:ties:stf:v2}currCode_Type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonAmnt_Type", propOrder = {
    "value"
})
public class MonAmntType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "currCode", required = true)
    protected CurrCodeType currCode;

    /**
     * 
     * 			Data type for any kind of numeric data with two decimal fraction digits, especially monetary amounts 
     * 			
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Recupera il valore della proprietà currCode.
     * 
     * @return
     *     possible object is
     *     {@link CurrCodeType }
     *     
     */
    public CurrCodeType getCurrCode() {
        return currCode;
    }

    /**
     * Imposta il valore della proprietà currCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrCodeType }
     *     
     */
    public void setCurrCode(CurrCodeType value) {
        this.currCode = value;
    }

}
