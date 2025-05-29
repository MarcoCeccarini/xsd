//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:02 AM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PayingAgentInfo_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PayingAgentInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayingAgent" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}PAParty_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayingAgentInfo_Type", propOrder = {
    "payingAgent"
})
@XmlSeeAlso({
    CorrectablePayingAgentInfoType.class
})
public class PayingAgentInfoType {

    @XmlElement(name = "PayingAgent", required = true)
    protected PAPartyType payingAgent;

    /**
     * Recupera il valore della proprietà payingAgent.
     * 
     * @return
     *     possible object is
     *     {@link PAPartyType }
     *     
     */
    public PAPartyType getPayingAgent() {
        return payingAgent;
    }

    /**
     * Imposta il valore della proprietà payingAgent.
     * 
     * @param value
     *     allowed object is
     *     {@link PAPartyType }
     *     
     */
    public void setPayingAgent(PAPartyType value) {
        this.payingAgent = value;
    }

}
