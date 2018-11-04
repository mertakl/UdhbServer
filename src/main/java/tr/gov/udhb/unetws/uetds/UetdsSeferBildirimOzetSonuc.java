
package tr.gov.udhb.unetws.uetds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for uetdsSeferBildirimOzetSonuc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uetdsSeferBildirimOzetSonuc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seferTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="firmaUnvan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firmaSeferNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seferSaati" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guzergahKodu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="seferDurumKodu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="seferDurumAciklama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bildirilenYolcuSayisi" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="iptalYolcuSayisi" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="gelmeyenYolcuSayisi" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="personelKayitSayisi" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="iptalPersonelKayitSayisi" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bagajAdedi" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="iptalBagajAdedi" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "uetdsSeferBildirimOzetSonuc", propOrder = {
    "seferTarihi",
    "firmaUnvan",
    "firmaSeferNo",
    "seferSaati",
    "guzergahKodu",
    "seferDurumKodu",
    "seferDurumAciklama",
    "bildirilenYolcuSayisi",
    "iptalYolcuSayisi",
    "gelmeyenYolcuSayisi",
    "personelKayitSayisi",
    "iptalPersonelKayitSayisi",
    "bagajAdedi",
    "iptalBagajAdedi",
    "sonucKodu",
    "sonucMesaji"
})
public class UetdsSeferBildirimOzetSonuc {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar seferTarihi;
    protected String firmaUnvan;
    protected String firmaSeferNo;
    protected String seferSaati;
    protected Long guzergahKodu;
    protected Integer seferDurumKodu;
    protected String seferDurumAciklama;
    protected Long bildirilenYolcuSayisi;
    protected Long iptalYolcuSayisi;
    protected Long gelmeyenYolcuSayisi;
    protected Long personelKayitSayisi;
    protected Long iptalPersonelKayitSayisi;
    protected Long bagajAdedi;
    protected Long iptalBagajAdedi;
    protected int sonucKodu;
    protected String sonucMesaji;

    /**
     * Gets the value of the seferTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSeferTarihi() {
        return seferTarihi;
    }

    /**
     * Sets the value of the seferTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSeferTarihi(XMLGregorianCalendar value) {
        this.seferTarihi = value;
    }

    /**
     * Gets the value of the firmaUnvan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmaUnvan() {
        return firmaUnvan;
    }

    /**
     * Sets the value of the firmaUnvan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmaUnvan(String value) {
        this.firmaUnvan = value;
    }

    /**
     * Gets the value of the firmaSeferNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmaSeferNo() {
        return firmaSeferNo;
    }

    /**
     * Sets the value of the firmaSeferNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmaSeferNo(String value) {
        this.firmaSeferNo = value;
    }

    /**
     * Gets the value of the seferSaati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeferSaati() {
        return seferSaati;
    }

    /**
     * Sets the value of the seferSaati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeferSaati(String value) {
        this.seferSaati = value;
    }

    /**
     * Gets the value of the guzergahKodu property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGuzergahKodu() {
        return guzergahKodu;
    }

    /**
     * Sets the value of the guzergahKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGuzergahKodu(Long value) {
        this.guzergahKodu = value;
    }

    /**
     * Gets the value of the seferDurumKodu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeferDurumKodu() {
        return seferDurumKodu;
    }

    /**
     * Sets the value of the seferDurumKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeferDurumKodu(Integer value) {
        this.seferDurumKodu = value;
    }

    /**
     * Gets the value of the seferDurumAciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeferDurumAciklama() {
        return seferDurumAciklama;
    }

    /**
     * Sets the value of the seferDurumAciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeferDurumAciklama(String value) {
        this.seferDurumAciklama = value;
    }

    /**
     * Gets the value of the bildirilenYolcuSayisi property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBildirilenYolcuSayisi() {
        return bildirilenYolcuSayisi;
    }

    /**
     * Sets the value of the bildirilenYolcuSayisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBildirilenYolcuSayisi(Long value) {
        this.bildirilenYolcuSayisi = value;
    }

    /**
     * Gets the value of the iptalYolcuSayisi property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIptalYolcuSayisi() {
        return iptalYolcuSayisi;
    }

    /**
     * Sets the value of the iptalYolcuSayisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIptalYolcuSayisi(Long value) {
        this.iptalYolcuSayisi = value;
    }

    /**
     * Gets the value of the gelmeyenYolcuSayisi property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGelmeyenYolcuSayisi() {
        return gelmeyenYolcuSayisi;
    }

    /**
     * Sets the value of the gelmeyenYolcuSayisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGelmeyenYolcuSayisi(Long value) {
        this.gelmeyenYolcuSayisi = value;
    }

    /**
     * Gets the value of the personelKayitSayisi property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersonelKayitSayisi() {
        return personelKayitSayisi;
    }

    /**
     * Sets the value of the personelKayitSayisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersonelKayitSayisi(Long value) {
        this.personelKayitSayisi = value;
    }

    /**
     * Gets the value of the iptalPersonelKayitSayisi property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIptalPersonelKayitSayisi() {
        return iptalPersonelKayitSayisi;
    }

    /**
     * Sets the value of the iptalPersonelKayitSayisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIptalPersonelKayitSayisi(Long value) {
        this.iptalPersonelKayitSayisi = value;
    }

    /**
     * Gets the value of the bagajAdedi property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBagajAdedi() {
        return bagajAdedi;
    }

    /**
     * Sets the value of the bagajAdedi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBagajAdedi(Long value) {
        this.bagajAdedi = value;
    }

    /**
     * Gets the value of the iptalBagajAdedi property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIptalBagajAdedi() {
        return iptalBagajAdedi;
    }

    /**
     * Sets the value of the iptalBagajAdedi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIptalBagajAdedi(Long value) {
        this.iptalBagajAdedi = value;
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
