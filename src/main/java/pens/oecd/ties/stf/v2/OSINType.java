//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:00 AM CEST 
//


package oecd.ties.stf.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * 			Other Security Identification Number: A security identification number other than the standard ISIN, the attribute 'secNoQlf' has to be used to indicate the kind of such number.
 * 			
 * 
 * <p>Classe Java per OSIN_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OSIN_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="secNoQlf" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OSIN_Type", propOrder = {
    "value"
})
public class OSINType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "secNoQlf", required = true)
    protected String secNoQlf;

    /**
     * Recupera il valore della proprietà value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Recupera il valore della proprietà secNoQlf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecNoQlf() {
        return secNoQlf;
    }

    /**
     * Imposta il valore della proprietà secNoQlf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecNoQlf(String value) {
        this.secNoQlf = value;
    }

}
