
package tr.gov.udhb.unetws.uetds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uetdsAriziYolcuIptalInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uetdsAriziYolcuIptalInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="koltukNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="yolcuTCKimlikPasaportNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iptalAciklama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uetdsAriziYolcuIptalInput", propOrder = {
    "koltukNo",
    "yolcuTCKimlikPasaportNo",
    "iptalAciklama"
})
public class UetdsAriziYolcuIptalInput {

    @XmlElement(required = true)
    protected String koltukNo;
    @XmlElement(required = true)
    protected String yolcuTCKimlikPasaportNo;
    protected String iptalAciklama;

    /**
     * Gets the value of the koltukNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoltukNo() {
        return koltukNo;
    }

    /**
     * Sets the value of the koltukNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoltukNo(String value) {
        this.koltukNo = value;
    }

    /**
     * Gets the value of the yolcuTCKimlikPasaportNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYolcuTCKimlikPasaportNo() {
        return yolcuTCKimlikPasaportNo;
    }

    /**
     * Sets the value of the yolcuTCKimlikPasaportNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYolcuTCKimlikPasaportNo(String value) {
        this.yolcuTCKimlikPasaportNo = value;
    }

    /**
     * Gets the value of the iptalAciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIptalAciklama() {
        return iptalAciklama;
    }

    /**
     * Sets the value of the iptalAciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIptalAciklama(String value) {
        this.iptalAciklama = value;
    }

}
