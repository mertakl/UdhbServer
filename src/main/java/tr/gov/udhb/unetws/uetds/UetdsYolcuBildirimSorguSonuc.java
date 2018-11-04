
package tr.gov.udhb.unetws.uetds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uetdsYolcuBildirimSorguSonuc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uetdsYolcuBildirimSorguSonuc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seferYolcuBilgi" type="{http://uetds.unetws.udhb.gov.tr/}uetdsAriziSeferYolcuByYolcuRefNo" minOccurs="0"/>
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
@XmlType(name = "uetdsYolcuBildirimSorguSonuc", propOrder = {
    "seferYolcuBilgi",
    "sonucKodu",
    "sonucMesaji"
})
public class UetdsYolcuBildirimSorguSonuc {

    protected UetdsAriziSeferYolcuByYolcuRefNo seferYolcuBilgi;
    protected int sonucKodu;
    protected String sonucMesaji;

    /**
     * Gets the value of the seferYolcuBilgi property.
     * 
     * @return
     *     possible object is
     *     {@link UetdsAriziSeferYolcuByYolcuRefNo }
     *     
     */
    public UetdsAriziSeferYolcuByYolcuRefNo getSeferYolcuBilgi() {
        return seferYolcuBilgi;
    }

    /**
     * Sets the value of the seferYolcuBilgi property.
     * 
     * @param value
     *     allowed object is
     *     {@link UetdsAriziSeferYolcuByYolcuRefNo }
     *     
     */
    public void setSeferYolcuBilgi(UetdsAriziSeferYolcuByYolcuRefNo value) {
        this.seferYolcuBilgi = value;
    }

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
