
package tr.gov.udhb.unetws.uetds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for seferGrupGuncelle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="seferGrupGuncelle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsuser" type="{http://uetds.unetws.udhb.gov.tr/}uetdsYtsUser" minOccurs="0"/>
 *         &lt;element name="uetdsSeferReferansNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="grupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="seferGrupBilgileriInput" type="{http://uetds.unetws.udhb.gov.tr/}uetdsAriziGrupBilgileriInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seferGrupGuncelle", propOrder = {
    "wsuser",
    "uetdsSeferReferansNo",
    "grupId",
    "seferGrupBilgileriInput"
})
public class SeferGrupGuncelle {

    protected UetdsYtsUser wsuser;
    protected Long uetdsSeferReferansNo;
    protected Long grupId;
    protected UetdsAriziGrupBilgileriInput seferGrupBilgileriInput;

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
     * Gets the value of the uetdsSeferReferansNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUetdsSeferReferansNo() {
        return uetdsSeferReferansNo;
    }

    /**
     * Sets the value of the uetdsSeferReferansNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUetdsSeferReferansNo(Long value) {
        this.uetdsSeferReferansNo = value;
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
     * Gets the value of the seferGrupBilgileriInput property.
     * 
     * @return
     *     possible object is
     *     {@link UetdsAriziGrupBilgileriInput }
     *     
     */
    public UetdsAriziGrupBilgileriInput getSeferGrupBilgileriInput() {
        return seferGrupBilgileriInput;
    }

    /**
     * Sets the value of the seferGrupBilgileriInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link UetdsAriziGrupBilgileriInput }
     *     
     */
    public void setSeferGrupBilgileriInput(UetdsAriziGrupBilgileriInput value) {
        this.seferGrupBilgileriInput = value;
    }

}
