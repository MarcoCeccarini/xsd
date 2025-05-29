//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:09:55 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Alternative for PersonId_Type where all mandatory fields are optional. Used for Representatives, Counterparts and Administrators.
 * 
 * <p>Classe Java per PersonIdOpt_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PersonIdOpt_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ref" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="idType" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}IDType_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonIdOpt_Type", propOrder = {
    "ref",
    "country"
})
public class PersonIdOptType {

    @XmlElement(name = "Ref")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ref;
    @XmlElement(name = "Country")
    @XmlSchemaType(name = "anySimpleType")
    protected String country;
    @XmlAttribute(name = "idType")
    protected IDTypeType idType;

    /**
     * Recupera il valore della propriet� ref.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Imposta il valore della propriet� ref.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Recupera il valore della propriet� country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Imposta il valore della propriet� country.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Recupera il valore della propriet� idType.
     * 
     * @return
     *     possible object is
     *     {@link IDTypeType }
     *     
     */
    public IDTypeType getIdType() {
        return idType;
    }

    /**
     * Imposta il valore della propriet� idType.
     * 
     * @param value
     *     allowed object is
     *     {@link IDTypeType }
     *     
     */
    public void setIdType(IDTypeType value) {
        this.idType = value;
    }

}
