
package tr.gov.udhb.unetws.uetds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uetdsYtsUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uetdsYtsUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kullaniciAdi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sifre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uetdsYtsUser", propOrder = {
    "kullaniciAdi",
    "sifre"
})
public class UetdsYtsUser {

    @XmlElement(required = true)
    protected String kullaniciAdi;
    @XmlElement(required = true)
    protected String sifre;

    /**
     * Gets the value of the kullaniciAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    /**
     * Sets the value of the kullaniciAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKullaniciAdi(String value) {
        this.kullaniciAdi = value;
    }

    /**
     * Gets the value of the sifre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSifre() {
        return sifre;
    }

    /**
     * Sets the value of the sifre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSifre(String value) {
        this.sifre = value;
    }

}
