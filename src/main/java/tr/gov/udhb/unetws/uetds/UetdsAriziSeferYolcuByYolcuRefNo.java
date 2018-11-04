
package tr.gov.udhb.unetws.uetds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uetdsAriziSeferYolcuByYolcuRefNo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uetdsAriziSeferYolcuByYolcuRefNo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="binisYerAciklama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cinsiyet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="durum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="inisYerAciklama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iptalAciklama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="koltukNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seferYolcuRefNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tarih" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tcKimlikPasaportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ulkeKodu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="yolcuAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="yolcuSoyadi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uetdsAriziSeferYolcuByYolcuRefNo", propOrder = {
    "binisYerAciklama",
    "cinsiyet",
    "durum",
    "grupId",
    "inisYerAciklama",
    "iptalAciklama",
    "koltukNo",
    "seferYolcuRefNo",
    "tarih",
    "tcKimlikPasaportNo",
    "telefon",
    "ulkeKodu",
    "yolcuAdi",
    "yolcuSoyadi"
})
public class UetdsAriziSeferYolcuByYolcuRefNo {

    protected String binisYerAciklama;
    protected String cinsiyet;
    protected String durum;
    protected Long grupId;
    protected String inisYerAciklama;
    protected String iptalAciklama;
    protected String koltukNo;
    protected Long seferYolcuRefNo;
    protected String tarih;
    protected String tcKimlikPasaportNo;
    protected String telefon;
    protected String ulkeKodu;
    protected String yolcuAdi;
    protected String yolcuSoyadi;

    /**
     * Gets the value of the binisYerAciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinisYerAciklama() {
        return binisYerAciklama;
    }

    /**
     * Sets the value of the binisYerAciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinisYerAciklama(String value) {
        this.binisYerAciklama = value;
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
     * Gets the value of the durum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurum() {
        return durum;
    }

    /**
     * Sets the value of the durum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurum(String value) {
        this.durum = value;
    }

    /**
     * Gets the value of the grupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGrupId() {
        return grupId;
    }

    /**
     * Sets the value of the grupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGrupId(Long value) {
        this.grupId = value;
    }

    /**
     * Gets the value of the inisYerAciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInisYerAciklama() {
        return inisYerAciklama;
    }

    /**
     * Sets the value of the inisYerAciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInisYerAciklama(String value) {
        this.inisYerAciklama = value;
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
     * Gets the value of the seferYolcuRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeferYolcuRefNo() {
        return seferYolcuRefNo;
    }

    /**
     * Sets the value of the seferYolcuRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeferYolcuRefNo(Long value) {
        this.seferYolcuRefNo = value;
    }

    /**
     * Gets the value of the tarih property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarih() {
        return tarih;
    }

    /**
     * Sets the value of the tarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarih(String value) {
        this.tarih = value;
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
     * Gets the value of the telefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * Sets the value of the telefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefon(String value) {
        this.telefon = value;
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

    /**
     * Gets the value of the yolcuAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYolcuAdi() {
        return yolcuAdi;
    }

    /**
     * Sets the value of the yolcuAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYolcuAdi(String value) {
        this.yolcuAdi = value;
    }

    /**
     * Gets the value of the yolcuSoyadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYolcuSoyadi() {
        return yolcuSoyadi;
    }

    /**
     * Sets the value of the yolcuSoyadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYolcuSoyadi(String value) {
        this.yolcuSoyadi = value;
    }

}
