
package tr.gov.udhb.unetws.uetds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cstUetdsAriziGrupListe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cstUetdsAriziGrupListe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baslangicIlAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baslangicIlId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="baslangicIlceAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baslangicIlceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="baslangicUlkeAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baslangicUlkeKodu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baslangicYeri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bitisIlAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bitisIlId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bitisIlceAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bitisIlceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bitisUlkeAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bitisUlkeKodu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bitisYeri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grupAciklama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grupAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="seferBasSaati" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seferBasTarihi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seferBasYeri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seferBitSaati" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seferBitTarihi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seferBitYeri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cstUetdsAriziGrupListe", propOrder = {
    "baslangicIlAdi",
    "baslangicIlId",
    "baslangicIlceAdi",
    "baslangicIlceId",
    "baslangicUlkeAdi",
    "baslangicUlkeKodu",
    "baslangicYeri",
    "bitisIlAdi",
    "bitisIlId",
    "bitisIlceAdi",
    "bitisIlceId",
    "bitisUlkeAdi",
    "bitisUlkeKodu",
    "bitisYeri",
    "grupAciklama",
    "grupAdi",
    "grupId",
    "seferBasSaati",
    "seferBasTarihi",
    "seferBasYeri",
    "seferBitSaati",
    "seferBitTarihi",
    "seferBitYeri"
})
public class CstUetdsAriziGrupListe {

    protected String baslangicIlAdi;
    protected Long baslangicIlId;
    protected String baslangicIlceAdi;
    protected Long baslangicIlceId;
    protected String baslangicUlkeAdi;
    protected String baslangicUlkeKodu;
    protected String baslangicYeri;
    protected String bitisIlAdi;
    protected Long bitisIlId;
    protected String bitisIlceAdi;
    protected Long bitisIlceId;
    protected String bitisUlkeAdi;
    protected String bitisUlkeKodu;
    protected String bitisYeri;
    protected String grupAciklama;
    protected String grupAdi;
    protected Long grupId;
    protected String seferBasSaati;
    protected String seferBasTarihi;
    protected String seferBasYeri;
    protected String seferBitSaati;
    protected String seferBitTarihi;
    protected String seferBitYeri;

    /**
     * Gets the value of the baslangicIlAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaslangicIlAdi() {
        return baslangicIlAdi;
    }

    /**
     * Sets the value of the baslangicIlAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaslangicIlAdi(String value) {
        this.baslangicIlAdi = value;
    }

    /**
     * Gets the value of the baslangicIlId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBaslangicIlId() {
        return baslangicIlId;
    }

    /**
     * Sets the value of the baslangicIlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBaslangicIlId(Long value) {
        this.baslangicIlId = value;
    }

    /**
     * Gets the value of the baslangicIlceAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaslangicIlceAdi() {
        return baslangicIlceAdi;
    }

    /**
     * Sets the value of the baslangicIlceAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaslangicIlceAdi(String value) {
        this.baslangicIlceAdi = value;
    }

    /**
     * Gets the value of the baslangicIlceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBaslangicIlceId() {
        return baslangicIlceId;
    }

    /**
     * Sets the value of the baslangicIlceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBaslangicIlceId(Long value) {
        this.baslangicIlceId = value;
    }

    /**
     * Gets the value of the baslangicUlkeAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaslangicUlkeAdi() {
        return baslangicUlkeAdi;
    }

    /**
     * Sets the value of the baslangicUlkeAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaslangicUlkeAdi(String value) {
        this.baslangicUlkeAdi = value;
    }

    /**
     * Gets the value of the baslangicUlkeKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaslangicUlkeKodu() {
        return baslangicUlkeKodu;
    }

    /**
     * Sets the value of the baslangicUlkeKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaslangicUlkeKodu(String value) {
        this.baslangicUlkeKodu = value;
    }

    /**
     * Gets the value of the baslangicYeri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaslangicYeri() {
        return baslangicYeri;
    }

    /**
     * Sets the value of the baslangicYeri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaslangicYeri(String value) {
        this.baslangicYeri = value;
    }

    /**
     * Gets the value of the bitisIlAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBitisIlAdi() {
        return bitisIlAdi;
    }

    /**
     * Sets the value of the bitisIlAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBitisIlAdi(String value) {
        this.bitisIlAdi = value;
    }

    /**
     * Gets the value of the bitisIlId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBitisIlId() {
        return bitisIlId;
    }

    /**
     * Sets the value of the bitisIlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBitisIlId(Long value) {
        this.bitisIlId = value;
    }

    /**
     * Gets the value of the bitisIlceAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBitisIlceAdi() {
        return bitisIlceAdi;
    }

    /**
     * Sets the value of the bitisIlceAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBitisIlceAdi(String value) {
        this.bitisIlceAdi = value;
    }

    /**
     * Gets the value of the bitisIlceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBitisIlceId() {
        return bitisIlceId;
    }

    /**
     * Sets the value of the bitisIlceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBitisIlceId(Long value) {
        this.bitisIlceId = value;
    }

    /**
     * Gets the value of the bitisUlkeAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBitisUlkeAdi() {
        return bitisUlkeAdi;
    }

    /**
     * Sets the value of the bitisUlkeAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBitisUlkeAdi(String value) {
        this.bitisUlkeAdi = value;
    }

    /**
     * Gets the value of the bitisUlkeKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBitisUlkeKodu() {
        return bitisUlkeKodu;
    }

    /**
     * Sets the value of the bitisUlkeKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBitisUlkeKodu(String value) {
        this.bitisUlkeKodu = value;
    }

    /**
     * Gets the value of the bitisYeri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBitisYeri() {
        return bitisYeri;
    }

    /**
     * Sets the value of the bitisYeri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBitisYeri(String value) {
        this.bitisYeri = value;
    }

    /**
     * Gets the value of the grupAciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupAciklama() {
        return grupAciklama;
    }

    /**
     * Sets the value of the grupAciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupAciklama(String value) {
        this.grupAciklama = value;
    }

    /**
     * Gets the value of the grupAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupAdi() {
        return grupAdi;
    }

    /**
     * Sets the value of the grupAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupAdi(String value) {
        this.grupAdi = value;
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
     * Gets the value of the seferBasSaati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeferBasSaati() {
        return seferBasSaati;
    }

    /**
     * Sets the value of the seferBasSaati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeferBasSaati(String value) {
        this.seferBasSaati = value;
    }

    /**
     * Gets the value of the seferBasTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeferBasTarihi() {
        return seferBasTarihi;
    }

    /**
     * Sets the value of the seferBasTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeferBasTarihi(String value) {
        this.seferBasTarihi = value;
    }

    /**
     * Gets the value of the seferBasYeri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeferBasYeri() {
        return seferBasYeri;
    }

    /**
     * Sets the value of the seferBasYeri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeferBasYeri(String value) {
        this.seferBasYeri = value;
    }

    /**
     * Gets the value of the seferBitSaati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeferBitSaati() {
        return seferBitSaati;
    }

    /**
     * Sets the value of the seferBitSaati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeferBitSaati(String value) {
        this.seferBitSaati = value;
    }

    /**
     * Gets the value of the seferBitTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeferBitTarihi() {
        return seferBitTarihi;
    }

    /**
     * Sets the value of the seferBitTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeferBitTarihi(String value) {
        this.seferBitTarihi = value;
    }

    /**
     * Gets the value of the seferBitYeri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeferBitYeri() {
        return seferBitYeri;
    }

    /**
     * Sets the value of the seferBitYeri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeferBitYeri(String value) {
        this.seferBitYeri = value;
    }

}
