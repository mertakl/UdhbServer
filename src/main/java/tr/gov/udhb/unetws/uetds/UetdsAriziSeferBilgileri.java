
package tr.gov.udhb.unetws.uetds;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uetdsAriziSeferBilgileri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uetdsAriziSeferBilgileri">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aracTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bakSeferNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="durum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="durumKodu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="durumKoduNull" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="firmaSeferNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plaka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seferAciklama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seferBasTarihi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seferBitTarihi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unetNo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uetdsAriziSeferBilgileri", propOrder = {
    "aracTel",
    "bakSeferNo",
    "durum",
    "durumKodu",
    "durumKoduNull",
    "firmaSeferNo",
    "plaka",
    "seferAciklama",
    "seferBasTarihi",
    "seferBitTarihi",
    "unetNo"
})
public class UetdsAriziSeferBilgileri {

    protected String aracTel;
    protected String bakSeferNo;
    protected String durum;
    protected int durumKodu;
    protected boolean durumKoduNull;
    protected String firmaSeferNo;
    protected String plaka;
    protected String seferAciklama;
    protected String seferBasTarihi;
    protected String seferBitTarihi;
    protected BigDecimal unetNo;

    /**
     * Gets the value of the aracTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAracTel() {
        return aracTel;
    }

    /**
     * Sets the value of the aracTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAracTel(String value) {
        this.aracTel = value;
    }

    /**
     * Gets the value of the bakSeferNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBakSeferNo() {
        return bakSeferNo;
    }

    /**
     * Sets the value of the bakSeferNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBakSeferNo(String value) {
        this.bakSeferNo = value;
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
     * Gets the value of the plaka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaka() {
        return plaka;
    }

    /**
     * Sets the value of the plaka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaka(String value) {
        this.plaka = value;
    }

    /**
     * Gets the value of the seferAciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeferAciklama() {
        return seferAciklama;
    }

    /**
     * Sets the value of the seferAciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeferAciklama(String value) {
        this.seferAciklama = value;
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
     * Gets the value of the unetNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnetNo() {
        return unetNo;
    }

    /**
     * Sets the value of the unetNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnetNo(BigDecimal value) {
        this.unetNo = value;
    }

}
