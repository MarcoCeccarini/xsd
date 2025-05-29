//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:06 AM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per EntityInfo_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EntityInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Entity" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}CorrectableEntityParty_Type"/&gt;
 *         &lt;element name="Art4_2PaymentData" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}CorrectableArt4_2PaymentData_Type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityInfo_Type", propOrder = {
    "entity",
    "art42PaymentData"
})
public class EntityInfoType {

    @XmlElement(name = "Entity", required = true)
    protected CorrectableEntityPartyType entity;
    @XmlElement(name = "Art4_2PaymentData", required = true)
    protected List<CorrectableArt42PaymentDataType> art42PaymentData;

    /**
     * Recupera il valore della proprietà entity.
     * 
     * @return
     *     possible object is
     *     {@link CorrectableEntityPartyType }
     *     
     */
    public CorrectableEntityPartyType getEntity() {
        return entity;
    }

    /**
     * Imposta il valore della proprietà entity.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectableEntityPartyType }
     *     
     */
    public void setEntity(CorrectableEntityPartyType value) {
        this.entity = value;
    }

    /**
     * Gets the value of the art42PaymentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the art42PaymentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArt42PaymentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrectableArt42PaymentDataType }
     * 
     * 
     */
    public List<CorrectableArt42PaymentDataType> getArt42PaymentData() {
        if (art42PaymentData == null) {
            art42PaymentData = new ArrayList<CorrectableArt42PaymentDataType>();
        }
        return this.art42PaymentData;
    }

}
