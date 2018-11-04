
package tr.gov.udhb.unetws.uetds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uetdsAriziYolcuGelmeyenInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uetdsAriziYolcuGelmeyenInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="koltukNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="yolcuTCKimlikPasaportNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aciklama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uetdsAriziYolcuGelmeyenInput", propOrder = {
    "koltukNo",
    "yolcuTCKimlikPasaportNo",
    "aciklama"
})
public class UetdsAriziYolcuGelmeyenInput {

    @XmlElement(required = true)
    protected String koltukNo;
    @XmlElement(required = true)
    protected String yolcuTCKimlikPasaportNo;
    protected String aciklama;

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
     * Gets the value of the aciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAciklama() {
        return aciklama;
    }

    /**
     * Sets the value of the aciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAciklama(String value) {
        this.aciklama = value;
    }

}
