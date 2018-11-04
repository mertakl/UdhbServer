
package tr.gov.udhb.unetws.uetds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cstUetdsAriziGrupDetay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cstUetdsAriziGrupDetay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="durumAciklama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="durumKodu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="durumKoduNull" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "cstUetdsAriziGrupDetay", propOrder = {
    "durumAciklama",
    "durumKodu",
    "durumKoduNull",
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
public class CstUetdsAriziGrupDetay {

    protected String durumAciklama;
    protected int durumKodu;
    protected boolean durumKoduNull;
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
     */
    public int getDurumKodu() {
        return durumKodu;
    }

    /**
     * Sets the value of the durumKodu property.
     * 
     */
    public void setDurumKodu(int value) {
        this.durumKodu = value;
    }

    /**
     * Gets the value of the durumKoduNull property.
     * 
     */
    public boolean isDurumKoduNull() {
        return durumKoduNull;
    }

    /**
     * Sets the value of the durumKoduNull property.
     * 
     */
    public void setDurumKoduNull(boolean value) {
        this.durumKoduNull = value;
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
