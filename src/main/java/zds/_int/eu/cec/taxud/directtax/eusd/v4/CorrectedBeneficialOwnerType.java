//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:03 AM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CorrectedBeneficialOwner_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CorrectedBeneficialOwner_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:cec.eu.int:taxud:directtax:eusd:v4}CorrectableBOParty_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayingAgentDocRefId" type="{urn:cec.eu.int:taxud:directtax:v4}UID_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrectedBeneficialOwner_Type", propOrder = {
    "payingAgentDocRefId"
})
public class CorrectedBeneficialOwnerType
    extends CorrectableBOPartyType
{

    @XmlElement(name = "PayingAgentDocRefId")
    protected String payingAgentDocRefId;

    /**
     * Recupera il valore della proprietà payingAgentDocRefId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayingAgentDocRefId() {
        return payingAgentDocRefId;
    }

    /**
     * Imposta il valore della proprietà payingAgentDocRefId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayingAgentDocRefId(String value) {
        this.payingAgentDocRefId = value;
    }

}
