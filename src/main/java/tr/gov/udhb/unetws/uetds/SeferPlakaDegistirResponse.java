
package tr.gov.udhb.unetws.uetds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for seferPlakaDegistirResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="seferPlakaDegistirResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://uetds.unetws.udhb.gov.tr/}uetdsGenelIslemSonuc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seferPlakaDegistirResponse", propOrder = {
    "_return"
})
public class SeferPlakaDegistirResponse {

    @XmlElement(name = "return")
    protected UetdsGenelIslemSonuc _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link UetdsGenelIslemSonuc }
     *     
     */
    public UetdsGenelIslemSonuc getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link UetdsGenelIslemSonuc }
     *     
     */
    public void setReturn(UetdsGenelIslemSonuc value) {
        this._return = value;
    }

}
