
package tr.gov.udhb.unetws.uetds;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for personelEkle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personelEkle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsuser" type="{http://uetds.unetws.udhb.gov.tr/}uetdsYtsUser"/>
 *         &lt;element name="uetdsSeferReferansNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="seferPersonelBilgileriInput" type="{http://uetds.unetws.udhb.gov.tr/}uetdsAriziSeferPersonelBilgileriInput" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personelEkle", propOrder = {
    "wsuser",
    "uetdsSeferReferansNo",
    "seferPersonelBilgileriInput"
})
public class PersonelEkle {

    @XmlElement(required = true)
    protected UetdsYtsUser wsuser;
    protected long uetdsSeferReferansNo;
    @XmlElement(required = true)
    protected List<UetdsAriziSeferPersonelBilgileriInput> seferPersonelBilgileriInput;

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

    /**
     * Gets the value of the seferPersonelBilgileriInput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seferPersonelBilgileriInput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeferPersonelBilgileriInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UetdsAriziSeferPersonelBilgileriInput }
     * 
     * 
     */
    public List<UetdsAriziSeferPersonelBilgileriInput> getSeferPersonelBilgileriInput() {
        if (seferPersonelBilgileriInput == null) {
            seferPersonelBilgileriInput = new ArrayList<UetdsAriziSeferPersonelBilgileriInput>();
        }
        return this.seferPersonelBilgileriInput;
    }

}
