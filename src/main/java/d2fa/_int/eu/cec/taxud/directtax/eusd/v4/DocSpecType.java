//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:05 AM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DocSpec_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DocSpec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocTypeIndic" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}DocTypeIndic_Type"/&gt;
 *         &lt;element name="DocRefId" type="{urn:cec.eu.int:taxud:directtax:v4}UID_Type"/&gt;
 *         &lt;element name="CorrDocRefId" type="{urn:cec.eu.int:taxud:directtax:v4}UID_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocSpec_Type", propOrder = {
    "docTypeIndic",
    "docRefId",
    "corrDocRefId"
})
@XmlSeeAlso({
    CancellationDocSpecType.class
})
public class DocSpecType {

    @XmlElement(name = "DocTypeIndic")
    protected byte docTypeIndic;
    @XmlElement(name = "DocRefId", required = true)
    protected String docRefId;
    @XmlElement(name = "CorrDocRefId")
    protected String corrDocRefId;

    /**
     * Recupera il valore della propriet� docTypeIndic.
     * 
     */
    public byte getDocTypeIndic() {
        return docTypeIndic;
    }

    /**
     * Imposta il valore della propriet� docTypeIndic.
     * 
     */
    public void setDocTypeIndic(byte value) {
        this.docTypeIndic = value;
    }

    /**
     * Recupera il valore della propriet� docRefId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocRefId() {
        return docRefId;
    }

    /**
     * Imposta il valore della propriet� docRefId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocRefId(String value) {
        this.docRefId = value;
    }

    /**
     * Recupera il valore della propriet� corrDocRefId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrDocRefId() {
        return corrDocRefId;
    }

    /**
     * Imposta il valore della propriet� corrDocRefId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrDocRefId(String value) {
        this.corrDocRefId = value;
    }

}
