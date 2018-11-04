
package tr.gov.udhb.unetws.uetds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uetdsGenelIslemSonuc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uetdsGenelIslemSonuc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sonucKodu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sonucMesaji" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uetdsGenelIslemSonuc", propOrder = {
    "sonucKodu",
    "sonucMesaji"
})
public class UetdsGenelIslemSonuc {

    protected int sonucKodu;
    protected String sonucMesaji;

    /**
     * Gets the value of the sonucKodu property.
     * 
     */
    public int getSonucKodu() {
        return sonucKodu;
    }

    /**
     * Sets the value of the sonucKodu property.
     * 
     */
    public void setSonucKodu(int value) {
        this.sonucKodu = value;
    }

    /**
     * Gets the value of the sonucMesaji property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonucMesaji() {
        return sonucMesaji;
    }

    /**
     * Sets the value of the sonucMesaji property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonucMesaji(String value) {
        this.sonucMesaji = value;
    }

}
