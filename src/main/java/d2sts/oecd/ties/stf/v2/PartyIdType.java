//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:06 AM CEST 
//


package oecd.ties.stf.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * 			This is the type of an element 'PartyId' which is to contain an identification number/identification code for the party in question. As the identifier may be not strictly numeric, it is just defined as a string of characters. Attributes 'partyIdType' and 'issuedBy' are required to designate the kind (e.g. TIN) and issuer of the identifier. In the case of a TIN the issuer attribute has to be the ISO country code of the issuing country. This has to be guaranteed by the sender without  the type of issuedBy being formally restricted to CountryCode_Type. (In non-TIN cases issuedBy may have to contain some information the kind of which is not known in advance, so as to the formal typing we have to stay here somewhat ambiguous.)
 * 			
 * 
 * <p>Classe Java per PartyId_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PartyId_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="partyIdType" use="required" type="{urn:oecd:ties:stf:v2}partyIdType_Type" /&gt;
 *       &lt;attribute name="issuedBy" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    protected String issuedBy;

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
     * Recupera il valore della proprietà issuedBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedBy() {
        return issuedBy;
    }

    /**
     * Imposta il valore della proprietà issuedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedBy(String value) {
        this.issuedBy = value;
    }

}
