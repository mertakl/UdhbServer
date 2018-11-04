
package tr.gov.udhb.unetws.uetds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for personelIptal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personelIptal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsuser" type="{http://uetds.unetws.udhb.gov.tr/}uetdsYtsUser"/>
 *         &lt;element name="iptalPersonelInput" type="{http://uetds.unetws.udhb.gov.tr/}uetdsPersonelIptalInput"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personelIptal", propOrder = {
    "wsuser",
    "iptalPersonelInput"
})
public class PersonelIptal {

    @XmlElement(required = true)
    protected UetdsYtsUser wsuser;
    @XmlElement(required = true)
    protected UetdsPersonelIptalInput iptalPersonelInput;

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
     * Gets the value of the iptalPersonelInput property.
     * 
     * @return
     *     possible object is
     *     {@link UetdsPersonelIptalInput }
     *     
     */
    public UetdsPersonelIptalInput getIptalPersonelInput() {
        return iptalPersonelInput;
    }

    /**
     * Sets the value of the iptalPersonelInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link UetdsPersonelIptalInput }
     *     
     */
    public void setIptalPersonelInput(UetdsPersonelIptalInput value) {
        this.iptalPersonelInput = value;
    }

}
