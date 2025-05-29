//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:09:57 AM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java per PartyId_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PartyId_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="partyIdType" use="required" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}partyIdType_Type" /&gt;
 *       &lt;attribute name="issuedBy" use="required" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}IssuedByCountryCode_Type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyId_Type", propOrder = {
    "value"
})
public class PartyIdType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "partyIdType", required = true)
    protected PartyIdTypeType partyIdType;
    @XmlAttribute(name = "issuedBy", required = true)
    protected List<String> issuedBy;

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
     * Recupera il valore della proprietà partyIdType.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdTypeType }
     *     
     */
    public PartyIdTypeType getPartyIdType() {
        return partyIdType;
    }

    /**
     * Imposta il valore della proprietà partyIdType.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdTypeType }
     *     
     */
    public void setPartyIdType(PartyIdTypeType value) {
        this.partyIdType = value;
    }

    /**
     * Gets the value of the issuedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issuedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssuedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIssuedBy() {
        if (issuedBy == null) {
            issuedBy = new ArrayList<String>();
        }
        return this.issuedBy;
    }

}
