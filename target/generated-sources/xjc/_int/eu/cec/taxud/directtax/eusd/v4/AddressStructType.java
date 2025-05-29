//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 07:08:57 PM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oecd.ties.stf.v2.AddressFixType;


/**
 * <p>Classe Java per AddressStruct_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AddressStruct_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oecd:ties:stf:v2}AddressFix_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OtherLocalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressStruct_Type", propOrder = {
    "otherLocalId"
})
public class AddressStructType
    extends AddressFixType
{

    @XmlElement(name = "OtherLocalId")
    protected String otherLocalId;

    /**
     * Recupera il valore della proprietà otherLocalId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherLocalId() {
        return otherLocalId;
    }

    /**
     * Imposta il valore della proprietà otherLocalId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherLocalId(String value) {
        this.otherLocalId = value;
    }

}
