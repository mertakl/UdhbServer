
package tr.gov.udhb.unetws.uetds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uetdsPersonelIptalInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uetdsPersonelIptalInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personelTCKimlikPasaportNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iptalAciklama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uetdsSeferReferansNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uetdsPersonelIptalInput", propOrder = {
    "personelTCKimlikPasaportNo",
    "iptalAciklama",
    "uetdsSeferReferansNo"
})
public class UetdsPersonelIptalInput {

    @XmlElement(required = true)
    protected String personelTCKimlikPasaportNo;
    protected String iptalAciklama;
    protected long uetdsSeferReferansNo;

    /**
     * Gets the value of the personelTCKimlikPasaportNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonelTCKimlikPasaportNo() {
        return personelTCKimlikPasaportNo;
    }

    /**
     * Sets the value of the personelTCKimlikPasaportNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonelTCKimlikPasaportNo(String value) {
        this.personelTCKimlikPasaportNo = value;
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
     * Gets the value of the uetdsSeferReferansNo property.
     * 
     */
    public long getUetdsSeferReferansNo() {
        return uetdsSeferReferansNo;
    }

    /**
     * Sets the value of the uetdsSeferReferansNo property.
     * 
     */
    public void setUetdsSeferReferansNo(long value) {
        this.uetdsSeferReferansNo = value;
    }

}
