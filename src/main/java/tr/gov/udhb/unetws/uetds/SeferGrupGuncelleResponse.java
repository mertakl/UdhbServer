
package tr.gov.udhb.unetws.uetds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for seferGrupGuncelleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="seferGrupGuncelleResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://uetds.unetws.udhb.gov.tr/}uetdsAriziGrupIslemSonuc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seferGrupGuncelleResponse", propOrder = {
    "_return"
})
public class SeferGrupGuncelleResponse {

    @XmlElement(name = "return")
    protected UetdsAriziGrupIslemSonuc _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link UetdsAriziGrupIslemSonuc }
     *     
     */
    public UetdsAriziGrupIslemSonuc getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link UetdsAriziGrupIslemSonuc }
     *     
     */
    public void setReturn(UetdsAriziGrupIslemSonuc value) {
        this._return = value;
    }

}
