
package tr.gov.udhb.unetws.uetds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for seferGuncelleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="seferGuncelleResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://uetds.unetws.udhb.gov.tr/}uetdsTarifeliSeferBildirSonuc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seferGuncelleResponse", propOrder = {
    "_return"
})
public class SeferGuncelleResponse {

    @XmlElement(name = "return")
    protected UetdsTarifeliSeferBildirSonuc _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link UetdsTarifeliSeferBildirSonuc }
     *     
     */
    public UetdsTarifeliSeferBildirSonuc getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link UetdsTarifeliSeferBildirSonuc }
     *     
     */
    public void setReturn(UetdsTarifeliSeferBildirSonuc value) {
        this._return = value;
    }

}
