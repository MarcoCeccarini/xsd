//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 03:45:18 PM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CancellationDocSpec_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CancellationDocSpec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{urn:cec.eu.int:taxud:directtax:eusd:v4}DocSpec_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocTypeIndic" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}DocTypeIndic_Type"/&gt;
 *         &lt;element name="DocRefId" type="{urn:cec.eu.int:taxud:directtax:v4}UID_Type"/&gt;
 *         &lt;element name="CorrDocRefId" type="{urn:cec.eu.int:taxud:directtax:v4}UID_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationDocSpec_Type")
public class CancellationDocSpecType
    extends DocSpecType
{


}
