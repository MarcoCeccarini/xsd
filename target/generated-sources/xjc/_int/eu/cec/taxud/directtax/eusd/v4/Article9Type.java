//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 07:08:57 PM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Article9_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Article9_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayingAgent" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}CorrectablePAParty_Type"/&gt;
 *         &lt;element name="BeneficialOwnerInfo" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}BeneficialOwnerInfo_Type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Article9_Type", propOrder = {
    "payingAgent",
    "beneficialOwnerInfo"
})
public class Article9Type {

    @XmlElement(name = "PayingAgent", required = true)
    protected CorrectablePAPartyType payingAgent;
    @XmlElement(name = "BeneficialOwnerInfo", required = true)
    protected List<BeneficialOwnerInfoType> beneficialOwnerInfo;

    /**
     * Recupera il valore della proprietà payingAgent.
     * 
     * @return
     *     possible object is
     *     {@link CorrectablePAPartyType }
     *     
     */
    public CorrectablePAPartyType getPayingAgent() {
        return payingAgent;
    }

    /**
     * Imposta il valore della proprietà payingAgent.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectablePAPartyType }
     *     
     */
    public void setPayingAgent(CorrectablePAPartyType value) {
        this.payingAgent = value;
    }

    /**
     * Gets the value of the beneficialOwnerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beneficialOwnerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeneficialOwnerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeneficialOwnerInfoType }
     * 
     * 
     */
    public List<BeneficialOwnerInfoType> getBeneficialOwnerInfo() {
        if (beneficialOwnerInfo == null) {
            beneficialOwnerInfo = new ArrayList<BeneficialOwnerInfoType>();
        }
        return this.beneficialOwnerInfo;
    }

}
