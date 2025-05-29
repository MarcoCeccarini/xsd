//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:06 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per SecuritiesIdentificationNumber_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SecuritiesIdentificationNumber_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ISIN" type="{urn:oecd:ties:stf:v2}ISIN_Type"/&gt;
 *         &lt;element name="OSIN" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesIdentificationNumber_Type", propOrder = {
    "isin",
    "osin"
})
public class SecuritiesIdentificationNumberType {

    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "OSIN")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String osin;

    /**
     * Recupera il valore della proprietà isin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * Imposta il valore della proprietà isin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISIN(String value) {
        this.isin = value;
    }

    /**
     * Recupera il valore della proprietà osin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOSIN() {
        return osin;
    }

    /**
     * Imposta il valore della proprietà osin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOSIN(String value) {
        this.osin = value;
    }

}
