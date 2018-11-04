
package tr.gov.udhb.unetws.uetds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for seferGuncelle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="seferGuncelle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsuser" type="{http://uetds.unetws.udhb.gov.tr/}uetdsYtsUser" minOccurs="0"/>
 *         &lt;element name="guncellenecekSeferReferansNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ariziSeferBilgileriInput" type="{http://uetds.unetws.udhb.gov.tr/}uetdsAriziSeferBilgileriInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seferGuncelle", propOrder = {
    "wsuser",
    "guncellenecekSeferReferansNo",
    "ariziSeferBilgileriInput"
})
public class SeferGuncelle {

    protected UetdsYtsUser wsuser;
    protected Long guncellenecekSeferReferansNo;
    protected UetdsAriziSeferBilgileriInput ariziSeferBilgileriInput;

    /**
     * Gets the value of the wsuser property.
     * 
     * @return
     *     possible object is
     *     {@link UetdsYtsUser }
     *     
     */
    public UetdsYtsUser getWsuser() {
        return wsuser;
    }

    /**
     * Sets the value of the wsuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link UetdsYtsUser }
     *     
     */
    public void setWsuser(UetdsYtsUser value) {
        this.wsuser = value;
    }

    /**
     * Gets the value of the guncellenecekSeferReferansNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGuncellenecekSeferReferansNo() {
        return guncellenecekSeferReferansNo;
    }

    /**
     * Sets the value of the guncellenecekSeferReferansNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGuncellenecekSeferReferansNo(Long value) {
        this.guncellenecekSeferReferansNo = value;
    }

    /**
     * Gets the value of the ariziSeferBilgileriInput property.
     * 
     * @return
     *     possible object is
     *     {@link UetdsAriziSeferBilgileriInput }
     *     
     */
    public UetdsAriziSeferBilgileriInput getAriziSeferBilgileriInput() {
        return ariziSeferBilgileriInput;
    }

    /**
     * Sets the value of the ariziSeferBilgileriInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link UetdsAriziSeferBilgileriInput }
     *     
     */
    public void setAriziSeferBilgileriInput(UetdsAriziSeferBilgileriInput value) {
        this.ariziSeferBilgileriInput = value;
    }

}
