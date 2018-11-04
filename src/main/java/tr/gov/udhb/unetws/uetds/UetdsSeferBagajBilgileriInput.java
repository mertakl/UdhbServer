
package tr.gov.udhb.unetws.uetds;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uetdsSeferBagajBilgileriInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uetdsSeferBagajBilgileriInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="yolcuTCKimlikPasaportNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="koltukNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bagajBarkodNumaralari" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uetdsSeferBagajBilgileriInput", propOrder = {
    "yolcuTCKimlikPasaportNo",
    "koltukNo",
    "bagajBarkodNumaralari"
})
public class UetdsSeferBagajBilgileriInput {

    @XmlElement(required = true)
    protected String yolcuTCKimlikPasaportNo;
    @XmlElement(required = true)
    protected String koltukNo;
    @XmlElement(required = true)
    protected List<String> bagajBarkodNumaralari;

    /**
     * Gets the value of the yolcuTCKimlikPasaportNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYolcuTCKimlikPasaportNo() {
        return yolcuTCKimlikPasaportNo;
    }

    /**
     * Sets the value of the yolcuTCKimlikPasaportNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYolcuTCKimlikPasaportNo(String value) {
        this.yolcuTCKimlikPasaportNo = value;
    }

    /**
     * Gets the value of the koltukNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoltukNo() {
        return koltukNo;
    }

    /**
     * Sets the value of the koltukNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoltukNo(String value) {
        this.koltukNo = value;
    }

    /**
     * Gets the value of the bagajBarkodNumaralari property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bagajBarkodNumaralari property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBagajBarkodNumaralari().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBagajBarkodNumaralari() {
        if (bagajBarkodNumaralari == null) {
            bagajBarkodNumaralari = new ArrayList<String>();
        }
        return this.bagajBarkodNumaralari;
    }

}
