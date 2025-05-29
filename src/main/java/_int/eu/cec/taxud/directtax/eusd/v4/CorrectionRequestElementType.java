//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:09:55 AM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CorrectionRequestElement_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CorrectionRequestElement_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReqRefId" type="{urn:cec.eu.int:taxud:directtax:v4}UID_Type"/&gt;
 *         &lt;element name="ReqTypeIndic" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}DocTypeIndic_Type"/&gt;
 *         &lt;element name="ReqElements" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}ReqElements_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrectionRequestElement_Type", propOrder = {
    "reqRefId",
    "reqTypeIndic",
    "reqElements"
})
public class CorrectionRequestElementType {

    @XmlElement(name = "ReqRefId", required = true)
    protected String reqRefId;
    @XmlElement(name = "ReqTypeIndic")
    protected byte reqTypeIndic;
    @XmlElement(name = "ReqElements")
    protected ReqElementsType reqElements;

    /**
     * Recupera il valore della proprietà reqRefId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqRefId() {
        return reqRefId;
    }

    /**
     * Imposta il valore della proprietà reqRefId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqRefId(String value) {
        this.reqRefId = value;
    }

    /**
     * Recupera il valore della proprietà reqTypeIndic.
     * 
     */
    public byte getReqTypeIndic() {
        return reqTypeIndic;
    }

    /**
     * Imposta il valore della proprietà reqTypeIndic.
     * 
     */
    public void setReqTypeIndic(byte value) {
        this.reqTypeIndic = value;
    }

    /**
     * Recupera il valore della proprietà reqElements.
     * 
     * @return
     *     possible object is
     *     {@link ReqElementsType }
     *     
     */
    public ReqElementsType getReqElements() {
        return reqElements;
    }

    /**
     * Imposta il valore della proprietà reqElements.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqElementsType }
     *     
     */
    public void setReqElements(ReqElementsType value) {
        this.reqElements = value;
    }

}
