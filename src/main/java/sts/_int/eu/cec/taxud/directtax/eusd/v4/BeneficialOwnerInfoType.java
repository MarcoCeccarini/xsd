//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:02 AM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BeneficialOwnerInfo_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BeneficialOwnerInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BeneficialOwner" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}CorrectableBOParty_Type"/&gt;
 *         &lt;element name="Art9PaymentData" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}CorrectableArt9PaymentData_Type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeneficialOwnerInfo_Type", propOrder = {
    "beneficialOwner",
    "art9PaymentData"
})
public class BeneficialOwnerInfoType {

    @XmlElement(name = "BeneficialOwner", required = true)
    protected CorrectableBOPartyType beneficialOwner;
    @XmlElement(name = "Art9PaymentData", required = true)
    protected List<CorrectableArt9PaymentDataType> art9PaymentData;

    /**
     * Recupera il valore della proprietà beneficialOwner.
     * 
     * @return
     *     possible object is
     *     {@link CorrectableBOPartyType }
     *     
     */
    public CorrectableBOPartyType getBeneficialOwner() {
        return beneficialOwner;
    }

    /**
     * Imposta il valore della proprietà beneficialOwner.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectableBOPartyType }
     *     
     */
    public void setBeneficialOwner(CorrectableBOPartyType value) {
        this.beneficialOwner = value;
    }

    /**
     * Gets the value of the art9PaymentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the art9PaymentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArt9PaymentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrectableArt9PaymentDataType }
     * 
     * 
     */
    public List<CorrectableArt9PaymentDataType> getArt9PaymentData() {
        if (art9PaymentData == null) {
            art9PaymentData = new ArrayList<CorrectableArt9PaymentDataType>();
        }
        return this.art9PaymentData;
    }

}
