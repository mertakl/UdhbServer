
package tr.gov.udhb.unetws.uetds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uetdsAriziSeferYolcuBilgileriInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uetdsAriziSeferYolcuBilgileriInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uyrukUlke" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tcKimlikPasaportNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cinsiyet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="soyadi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="koltukNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telefonNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grupId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uetdsAriziSeferYolcuBilgileriInput", propOrder = {
    "uyrukUlke",
    "tcKimlikPasaportNo",
    "cinsiyet",
    "adi",
    "soyadi",
    "koltukNo",
    "telefonNo",
    "grupId"
})
public class UetdsAriziSeferYolcuBilgileriInput {

    @XmlElement(required = true)
    protected String uyrukUlke;
    @XmlElement(required = true)
    protected String tcKimlikPasaportNo;
    protected String cinsiyet;
    @XmlElement(required = true)
    protected String adi;
    @XmlElement(required = true)
    protected String soyadi;
    @XmlElement(required = true)
    protected String koltukNo;
    protected String telefonNo;
    protected long grupId;

    /**
     * Gets the value of the uyrukUlke property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUyrukUlke() {
        return uyrukUlke;
    }

    /**
     * Sets the value of the uyrukUlke property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUyrukUlke(String value) {
        this.uyrukUlke = value;
    }

    /**
     * Gets the value of the tcKimlikPasaportNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcKimlikPasaportNo() {
        return tcKimlikPasaportNo;
    }

    /**
     * Sets the value of the tcKimlikPasaportNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcKimlikPasaportNo(String value) {
        this.tcKimlikPasaportNo = value;
    }

    /**
     * Gets the value of the cinsiyet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCinsiyet() {
        return cinsiyet;
    }

    /**
     * Sets the value of the cinsiyet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCinsiyet(String value) {
        this.cinsiyet = value;
    }

    /**
     * Gets the value of the adi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdi() {
        return adi;
    }

    /**
     * Sets the value of the adi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdi(String value) {
        this.adi = value;
    }

    /**
     * Gets the value of the soyadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoyadi() {
        return soyadi;
    }

    /**
     * Sets the value of the soyadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoyadi(String value) {
        this.soyadi = value;
    }

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
     * Gets the value of the telefonNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonNo() {
        return telefonNo;
    }

    /**
     * Sets the value of the telefonNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonNo(String value) {
        this.telefonNo = value;
    }

    /**
     * Gets the value of the grupId property.
     * 
     */
    public long getGrupId() {
        return grupId;
    }

    /**
     * Sets the value of the grupId property.
     * 
     */
    public void setGrupId(long value) {
        this.grupId = value;
    }

}
