
package tr.gov.udhb.unetws.uetds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for uetdsAriziSeferBilgileriInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uetdsAriziSeferBilgileriInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aracPlaka" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seferAciklama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hareketTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="hareketSaati" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aracTelefonu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firmaSeferNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seferBitisTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="seferBitisSaati" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uetdsAriziSeferBilgileriInput", propOrder = {
    "aracPlaka",
    "seferAciklama",
    "hareketTarihi",
    "hareketSaati",
    "aracTelefonu",
    "firmaSeferNo",
    "seferBitisTarihi",
    "seferBitisSaati"
})
public class UetdsAriziSeferBilgileriInput {

    @XmlElement(required = true)
    protected String aracPlaka;
    protected String seferAciklama;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar hareketTarihi;
    @XmlElement(required = true)
    protected String hareketSaati;
    protected String aracTelefonu;
    @XmlElement(required = true)
    protected String firmaSeferNo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar seferBitisTarihi;
    @XmlElement(required = true)
    protected String seferBitisSaati;

    /**
     * Gets the value of the aracPlaka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAracPlaka() {
        return aracPlaka;
    }

    /**
     * Sets the value of the aracPlaka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAracPlaka(String value) {
        this.aracPlaka = value;
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
     * Gets the value of the hareketTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHareketTarihi() {
        return hareketTarihi;
    }

    /**
     * Sets the value of the hareketTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHareketTarihi(XMLGregorianCalendar value) {
        this.hareketTarihi = value;
    }

    /**
     * Gets the value of the hareketSaati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHareketSaati() {
        return hareketSaati;
    }

    /**
     * Sets the value of the hareketSaati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHareketSaati(String value) {
        this.hareketSaati = value;
    }

    /**
     * Gets the value of the aracTelefonu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAracTelefonu() {
        return aracTelefonu;
    }

    /**
     * Sets the value of the aracTelefonu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAracTelefonu(String value) {
        this.aracTelefonu = value;
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
     * Gets the value of the seferBitisTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSeferBitisTarihi() {
        return seferBitisTarihi;
    }

    /**
     * Sets the value of the seferBitisTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSeferBitisTarihi(XMLGregorianCalendar value) {
        this.seferBitisTarihi = value;
    }

    /**
     * Gets the value of the seferBitisSaati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeferBitisSaati() {
        return seferBitisSaati;
    }

    /**
     * Sets the value of the seferBitisSaati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeferBitisSaati(String value) {
        this.seferBitisSaati = value;
    }

}
