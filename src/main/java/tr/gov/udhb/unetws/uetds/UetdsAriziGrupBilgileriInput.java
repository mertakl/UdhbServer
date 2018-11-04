
package tr.gov.udhb.unetws.uetds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uetdsAriziGrupBilgileriInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uetdsAriziGrupBilgileriInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="grupAciklama" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="baslangicUlke" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="baslangicIl" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="baslangicIlce" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="baslangicYer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bitisUlke" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bitisIl" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="bitisIlce" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="bitisYer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grupAdi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uetdsAriziGrupBilgileriInput", propOrder = {
    "grupAciklama",
    "baslangicUlke",
    "baslangicIl",
    "baslangicIlce",
    "baslangicYer",
    "bitisUlke",
    "bitisIl",
    "bitisIlce",
    "bitisYer",
    "grupAdi"
})
public class UetdsAriziGrupBilgileriInput {

    @XmlElement(required = true)
    protected String grupAciklama;
    @XmlElement(required = true)
    protected String baslangicUlke;
    protected long baslangicIl;
    protected long baslangicIlce;
    protected String baslangicYer;
    @XmlElement(required = true)
    protected String bitisUlke;
    protected long bitisIl;
    protected long bitisIlce;
    @XmlElement(required = true)
    protected String bitisYer;
    @XmlElement(required = true)
    protected String grupAdi;

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
     * Gets the value of the baslangicUlke property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaslangicUlke() {
        return baslangicUlke;
    }

    /**
     * Sets the value of the baslangicUlke property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaslangicUlke(String value) {
        this.baslangicUlke = value;
    }

    /**
     * Gets the value of the baslangicIl property.
     * 
     */
    public long getBaslangicIl() {
        return baslangicIl;
    }

    /**
     * Sets the value of the baslangicIl property.
     * 
     */
    public void setBaslangicIl(long value) {
        this.baslangicIl = value;
    }

    /**
     * Gets the value of the baslangicIlce property.
     * 
     */
    public long getBaslangicIlce() {
        return baslangicIlce;
    }

    /**
     * Sets the value of the baslangicIlce property.
     * 
     */
    public void setBaslangicIlce(long value) {
        this.baslangicIlce = value;
    }

    /**
     * Gets the value of the baslangicYer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaslangicYer() {
        return baslangicYer;
    }

    /**
     * Sets the value of the baslangicYer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaslangicYer(String value) {
        this.baslangicYer = value;
    }

    /**
     * Gets the value of the bitisUlke property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBitisUlke() {
        return bitisUlke;
    }

    /**
     * Sets the value of the bitisUlke property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBitisUlke(String value) {
        this.bitisUlke = value;
    }

    /**
     * Gets the value of the bitisIl property.
     * 
     */
    public long getBitisIl() {
        return bitisIl;
    }

    /**
     * Sets the value of the bitisIl property.
     * 
     */
    public void setBitisIl(long value) {
        this.bitisIl = value;
    }

    /**
     * Gets the value of the bitisIlce property.
     * 
     */
    public long getBitisIlce() {
        return bitisIlce;
    }

    /**
     * Sets the value of the bitisIlce property.
     * 
     */
    public void setBitisIlce(long value) {
        this.bitisIlce = value;
    }

    /**
     * Gets the value of the bitisYer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBitisYer() {
        return bitisYer;
    }

    /**
     * Sets the value of the bitisYer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBitisYer(String value) {
        this.bitisYer = value;
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

}
