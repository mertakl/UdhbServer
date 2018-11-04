
package tr.gov.udhb.unetws.uetds;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uetdsAriziGrupIslemSonuc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uetdsAriziGrupIslemSonuc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sonucKodu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sonucMesaji" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uetdsGrupRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seferBilgisi" type="{http://uetds.unetws.udhb.gov.tr/}uetdsAriziSeferBilgileri" minOccurs="0"/>
 *         &lt;element name="grupListe" type="{http://uetds.unetws.udhb.gov.tr/}cstUetdsAriziGrupListe" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "uetdsAriziGrupIslemSonuc", propOrder = {
    "sonucKodu",
    "sonucMesaji",
    "uetdsGrupRefNo",
    "seferBilgisi",
    "grupListe",
    "grupDetay"
})
public class UetdsAriziGrupIslemSonuc {

    protected int sonucKodu;
    protected String sonucMesaji;
    protected String uetdsGrupRefNo;
    protected UetdsAriziSeferBilgileri seferBilgisi;
    @XmlElement(nillable = true)
    protected List<CstUetdsAriziGrupListe> grupListe;
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
     * Gets the value of the uetdsGrupRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUetdsGrupRefNo() {
        return uetdsGrupRefNo;
    }

    /**
     * Sets the value of the uetdsGrupRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUetdsGrupRefNo(String value) {
        this.uetdsGrupRefNo = value;
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
     * Gets the value of the grupListe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grupListe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrupListe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CstUetdsAriziGrupListe }
     * 
     * 
     */
    public List<CstUetdsAriziGrupListe> getGrupListe() {
        if (grupListe == null) {
            grupListe = new ArrayList<CstUetdsAriziGrupListe>();
        }
        return this.grupListe;
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
