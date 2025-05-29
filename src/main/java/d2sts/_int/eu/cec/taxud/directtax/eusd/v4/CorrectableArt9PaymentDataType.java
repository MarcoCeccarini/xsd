//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:06 AM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CorrectableArt9PaymentData_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CorrectableArt9PaymentData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:cec.eu.int:taxud:directtax:eusd:v4}Art9PaymentData_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocSpec" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}DocSpec_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrectableArt9PaymentData_Type", propOrder = {
    "docSpec"
})
@XmlSeeAlso({
    CorrectedArt9PaymentDataType.class
})
public class CorrectableArt9PaymentDataType
    extends Art9PaymentDataType
{

    @XmlElement(name = "DocSpec", required = true)
    protected DocSpecType docSpec;

    /**
     * Recupera il valore della proprietà docSpec.
     * 
     * @return
     *     possible object is
     *     {@link DocSpecType }
     *     
     */
    public DocSpecType getDocSpec() {
        return docSpec;
    }

    /**
     * Imposta il valore della proprietà docSpec.
     * 
     * @param value
     *     allowed object is
     *     {@link DocSpecType }
     *     
     */
    public void setDocSpec(DocSpecType value) {
        this.docSpec = value;
    }

}
