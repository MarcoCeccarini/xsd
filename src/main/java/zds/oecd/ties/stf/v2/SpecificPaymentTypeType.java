//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:03 AM CEST 
//


package oecd.ties.stf.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Type for explanation of a payment by a code that is specific for a certain legislation, e.g. for the sending country. In the OECD file for this schema part is a dummy code. The enumeration element and the annotation-documentation in the OECD prepared file serve as an example for real legislation specific codes and their documentation.
 * 
 * <p>Classe Java per SpecificPaymentType_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SpecificPaymentType_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:oecd:ties:stf:v2&gt;SpecifPaymentType_Type"&gt;
 *       &lt;attribute name="specificPaymentTypeQlf" type="{http://www.w3.org/2001/XMLSchema}string" fixed="EU-SD" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificPaymentType_Type", propOrder = {
    "value"
})
public class SpecificPaymentTypeType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "specificPaymentTypeQlf")
    protected String specificPaymentTypeQlf;

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
     * Recupera il valore della proprietà specificPaymentTypeQlf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificPaymentTypeQlf() {
        if (specificPaymentTypeQlf == null) {
            return "EU-SD";
        } else {
            return specificPaymentTypeQlf;
        }
    }

    /**
     * Imposta il valore della proprietà specificPaymentTypeQlf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificPaymentTypeQlf(String value) {
        this.specificPaymentTypeQlf = value;
    }

}
