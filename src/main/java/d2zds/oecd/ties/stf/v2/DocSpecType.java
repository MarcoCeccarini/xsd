//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:08 AM CEST 
//


package oecd.ties.stf.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Document specification: Data identifying and describing the document, where 'document' here means the part of a message that is to transmit the data about a single payment/transaction or other meaningful self-contained chunk of information. STF messages do not factorize such information in order to transmit repeating data only once (e.g. data about a party that has received multiple payments). 'DocRefId' is an identifier that the sender has to attribute to this document and which has to be unique at least inside the containing message. If the document refers to another one transmitted before, 'CorrMessageRefId' and 'CorrDocRefId' have to contain the  corresponding Id's of the message and document referred to.			
 * 
 * <p>Classe Java per DocSpec_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DocSpec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocTypeIndic" type="{urn:oecd:ties:stf:v2}DocTypeIndic_Type"/&gt;
 *         &lt;element name="DocRefId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CorrMessageRefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CorrDocRefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "corrMessageRefId",
    "corrDocRefId"
})
public class DocSpecType {

    @XmlElement(name = "DocTypeIndic")
    protected byte docTypeIndic;
    @XmlElement(name = "DocRefId", required = true)
    protected String docRefId;
    @XmlElement(name = "CorrMessageRefId")
    protected String corrMessageRefId;
    @XmlElement(name = "CorrDocRefId")
    protected String corrDocRefId;

    /**
     * Recupera il valore della proprietà docTypeIndic.
     * 
     */
    public byte getDocTypeIndic() {
        return docTypeIndic;
    }

    /**
     * Imposta il valore della proprietà docTypeIndic.
     * 
     */
    public void setDocTypeIndic(byte value) {
        this.docTypeIndic = value;
    }

    /**
     * Recupera il valore della proprietà docRefId.
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
     * Imposta il valore della proprietà docRefId.
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
     * Recupera il valore della proprietà corrMessageRefId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrMessageRefId() {
        return corrMessageRefId;
    }

    /**
     * Imposta il valore della proprietà corrMessageRefId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrMessageRefId(String value) {
        this.corrMessageRefId = value;
    }

    /**
     * Recupera il valore della proprietà corrDocRefId.
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
     * Imposta il valore della proprietà corrDocRefId.
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
