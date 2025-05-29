//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:03 AM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import _int.eu.cec.taxud.directtax.v4.BodyType;


/**
 * <p>Classe Java per RejectionBody_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RejectionBody_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{urn:cec.eu.int:taxud:directtax:v4}Body_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:cec.eu.int:taxud:directtax:eusd:v4}RejectionElement" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="applicationId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="DIRECTIVE 2003/48/EC -- REJECTION" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectionBody_Type")
public class RejectionBodyType
    extends BodyType
{


}
