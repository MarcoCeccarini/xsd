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


/**
 * <p>Classe Java per CorrectedArt9PaymentData_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CorrectedArt9PaymentData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:cec.eu.int:taxud:directtax:eusd:v4}CorrectableArt9PaymentData_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BeneficialOwnerDocRefId" type="{urn:cec.eu.int:taxud:directtax:v4}UID_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrectedArt9PaymentData_Type", propOrder = {
    "beneficialOwnerDocRefId"
})
public class CorrectedArt9PaymentDataType
    extends CorrectableArt9PaymentDataType
{

    @XmlElement(name = "BeneficialOwnerDocRefId")
    protected String beneficialOwnerDocRefId;

    /**
     * Recupera il valore della proprietà beneficialOwnerDocRefId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficialOwnerDocRefId() {
        return beneficialOwnerDocRefId;
    }

    /**
     * Imposta il valore della proprietà beneficialOwnerDocRefId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficialOwnerDocRefId(String value) {
        this.beneficialOwnerDocRefId = value;
    }

}
