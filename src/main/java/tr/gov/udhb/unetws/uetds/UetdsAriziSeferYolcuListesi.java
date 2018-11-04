
package tr.gov.udhb.unetws.uetds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uetdsAriziSeferYolcuListesi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uetdsAriziSeferYolcuListesi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="binisYeriAciklama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cinsiyet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="durumAciklama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="durumKodu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inisYeriAciklama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="koltukNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soyadi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tckimlikno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uetdsBiletRefNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ulkeKodu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uetdsAriziSeferYolcuListesi", propOrder = {
    "adi",
    "binisYeriAciklama",
    "cinsiyet",
    "durumAciklama",
    "durumKodu",
    "inisYeriAciklama",
    "koltukNo",
    "soyadi",
    "tckimlikno",
    "telefonNo",
    "uetdsBiletRefNo",
    "ulkeKodu"
})
public class UetdsAriziSeferYolcuListesi {

    protected String adi;
    protected String binisYeriAciklama;
    protected String cinsiyet;
    protected String durumAciklama;
    protected Integer durumKodu;
    protected String inisYeriAciklama;
    protected String koltukNo;
    protected String soyadi;
    protected String tckimlikno;
    protected String telefonNo;
    protected Long uetdsBiletRefNo;
    protected String ulkeKodu;

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
     * Gets the value of the binisYeriAciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinisYeriAciklama() {
        return binisYeriAciklama;
    }

    /**
     * Sets the value of the binisYeriAciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinisYeriAciklama(String value) {
        this.binisYeriAciklama = value;
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
     * Gets the value of the durumAciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurumAciklama() {
        return durumAciklama;
    }

    /**
     * Sets the value of the durumAciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurumAciklama(String value) {
        this.durumAciklama = value;
    }

    /**
     * Gets the value of the durumKodu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDurumKodu() {
        return durumKodu;
    }

    /**
     * Sets the value of the durumKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDurumKodu(Integer value) {
        this.durumKodu = value;
    }

    /**
     * Gets the value of the inisYeriAciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInisYeriAciklama() {
        return inisYeriAciklama;
    }

    /**
     * Sets the value of the inisYeriAciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInisYeriAciklama(String value) {
        this.inisYeriAciklama = value;
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
     * Gets the value of the tckimlikno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTckimlikno() {
        return tckimlikno;
    }

    /**
     * Sets the value of the tckimlikno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTckimlikno(String value) {
        this.tckimlikno = value;
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
     * Gets the value of the uetdsBiletRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUetdsBiletRefNo() {
        return uetdsBiletRefNo;
    }

    /**
     * Sets the value of the uetdsBiletRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUetdsBiletRefNo(Long value) {
        this.uetdsBiletRefNo = value;
    }

    /**
     * Gets the value of the ulkeKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlkeKodu() {
        return ulkeKodu;
    }

    /**
     * Sets the value of the ulkeKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlkeKodu(String value) {
        this.ulkeKodu = value;
    }

}
