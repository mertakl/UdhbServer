
package tr.gov.udhb.unetws.uetds;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uetdsAriziSeferPersonelBilgileriInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uetdsAriziSeferPersonelBilgileriInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="turKodu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="uyrukUlke" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tcKimlikPasaportNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cinsiyet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="soyadi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telefon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zorunluAlanlar" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uetdsAriziSeferPersonelBilgileriInput", propOrder = {
    "turKodu",
    "uyrukUlke",
    "tcKimlikPasaportNo",
    "cinsiyet",
    "adi",
    "soyadi",
    "telefon",
    "adres",
    "zorunluAlanlar"
})
public class UetdsAriziSeferPersonelBilgileriInput {

    protected int turKodu;
    @XmlElement(required = true)
    protected String uyrukUlke;
    @XmlElement(required = true)
    protected String tcKimlikPasaportNo;
    @XmlElement(required = true)
    protected String cinsiyet;
    @XmlElement(required = true)
    protected String adi;
    @XmlElement(required = true)
    protected String soyadi;
    protected String telefon;
    protected String adres;
    @XmlElement(nillable = true)
    protected List<String> zorunluAlanlar;

    /**
     * Gets the value of the turKodu property.
     * 
     */
    public int getTurKodu() {
        return turKodu;
    }

    /**
     * Sets the value of the turKodu property.
     * 
     */
    public void setTurKodu(int value) {
        this.turKodu = value;
    }

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
     * Gets the value of the adres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdres() {
        return adres;
    }

    /**
     * Sets the value of the adres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdres(String value) {
        this.adres = value;
    }

    /**
     * Gets the value of the zorunluAlanlar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zorunluAlanlar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZorunluAlanlar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getZorunluAlanlar() {
        if (zorunluAlanlar == null) {
            zorunluAlanlar = new ArrayList<String>();
        }
        return this.zorunluAlanlar;
    }

}
