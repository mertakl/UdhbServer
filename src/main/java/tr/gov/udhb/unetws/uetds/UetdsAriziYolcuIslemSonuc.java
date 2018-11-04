
package tr.gov.udhb.unetws.uetds;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uetdsAriziYolcuIslemSonuc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uetdsAriziYolcuIslemSonuc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sonucKodu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sonucMesaji" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uetdsYolcuRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seferBilgisi" type="{http://uetds.unetws.udhb.gov.tr/}uetdsAriziSeferBilgileri" minOccurs="0"/>
 *         &lt;element name="yolcuList" type="{http://uetds.unetws.udhb.gov.tr/}uetdsAriziSeferYolcuListesi" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="yolcuDetay" type="{http://uetds.unetws.udhb.gov.tr/}uetdsAriziSeferYolcuByYolcuRefNo" minOccurs="0"/>
 *         &lt;element name="grupDetay" type="{http://uetds.unetws.udhb.gov.tr/}cstUetdsAriziGrupDetay" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uetdsAriziYolcuIslemSonuc", propOrder = {
    "sonucKodu",
    "sonucMesaji",
    "uetdsYolcuRefNo",
    "seferBilgisi",
    "yolcuList",
    "yolcuDetay",
    "grupDetay"
})
public class UetdsAriziYolcuIslemSonuc {

    protected int sonucKodu;
    protected String sonucMesaji;
    protected String uetdsYolcuRefNo;
    protected UetdsAriziSeferBilgileri seferBilgisi;
    @XmlElement(nillable = true)
    protected List<UetdsAriziSeferYolcuListesi> yolcuList;
    protected UetdsAriziSeferYolcuByYolcuRefNo yolcuDetay;
    protected CstUetdsAriziGrupDetay grupDetay;

    /**
     * Gets the value of the sonucKodu property.
     * 
     */
    public int getSonucKodu() {
        return sonucKodu;
    }

    /**
     * Sets the value of the sonucKodu property.
     * 
     */
    public void setSonucKodu(int value) {
        this.sonucKodu = value;
    }

    /**
     * Gets the value of the sonucMesaji property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonucMesaji() {
        return sonucMesaji;
    }

    /**
     * Sets the value of the sonucMesaji property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonucMesaji(String value) {
        this.sonucMesaji = value;
    }

    /**
     * Gets the value of the uetdsYolcuRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUetdsYolcuRefNo() {
        return uetdsYolcuRefNo;
    }

    /**
     * Sets the value of the uetdsYolcuRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUetdsYolcuRefNo(String value) {
        this.uetdsYolcuRefNo = value;
    }

    /**
     * Gets the value of the seferBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link UetdsAriziSeferBilgileri }
     *     
     */
    public UetdsAriziSeferBilgileri getSeferBilgisi() {
        return seferBilgisi;
    }

    /**
     * Sets the value of the seferBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link UetdsAriziSeferBilgileri }
     *     
     */
    public void setSeferBilgisi(UetdsAriziSeferBilgileri value) {
        this.seferBilgisi = value;
    }

    /**
     * Gets the value of the yolcuList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the yolcuList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getYolcuList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UetdsAriziSeferYolcuListesi }
     * 
     * 
     */
    public List<UetdsAriziSeferYolcuListesi> getYolcuList() {
        if (yolcuList == null) {
            yolcuList = new ArrayList<UetdsAriziSeferYolcuListesi>();
        }
        return this.yolcuList;
    }

    /**
     * Gets the value of the yolcuDetay property.
     * 
     * @return
     *     possible object is
     *     {@link UetdsAriziSeferYolcuByYolcuRefNo }
     *     
     */
    public UetdsAriziSeferYolcuByYolcuRefNo getYolcuDetay() {
        return yolcuDetay;
    }

    /**
     * Sets the value of the yolcuDetay property.
     * 
     * @param value
     *     allowed object is
     *     {@link UetdsAriziSeferYolcuByYolcuRefNo }
     *     
     */
    public void setYolcuDetay(UetdsAriziSeferYolcuByYolcuRefNo value) {
        this.yolcuDetay = value;
    }

    /**
     * Gets the value of the grupDetay property.
     * 
     * @return
     *     possible object is
     *     {@link CstUetdsAriziGrupDetay }
     *     
     */
    public CstUetdsAriziGrupDetay getGrupDetay() {
        return grupDetay;
    }

    /**
     * Sets the value of the grupDetay property.
     * 
     * @param value
     *     allowed object is
     *     {@link CstUetdsAriziGrupDetay }
     *     
     */
    public void setGrupDetay(CstUetdsAriziGrupDetay value) {
        this.grupDetay = value;
    }

}
