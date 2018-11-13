package com.mertakl.springboot.webservice.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.mertakl.springboot.webservice.audit.UserDateAudit;
import com.mertakl.springboot.webservice.enums.Cinsiyet;
import com.mertakl.springboot.webservice.enums.PersonelTuru;

@Entity
@Table(name = "personel")
public class Personel extends UserDateAudit {
	@NotNull
	private PersonelTuru turKodu;

	@OneToOne(cascade=CascadeType.ALL)
	private Country uyrukUlke;

	@NotNull
	@Size(max = 50)
	private String tcKimlikPasaportNo;

	@NotNull
	private Cinsiyet cinsiyet;

	@NotNull
	@Size(max = 100)
	private String adi;

	@NotNull
	@Size(max = 100)
	private String soyadi;

	@NotNull
	@Size(max = 100)
	private String telefon;

	@NotNull
	@Size(max = 200)
	private String adres;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinTable(name = "personel_sefer", joinColumns = @JoinColumn(name = "personel_id"), inverseJoinColumns = @JoinColumn(name = "sefer_id"))
	private Sefer sefer;

	public Personel() {

	}

	public Personel(@NotNull PersonelTuru turKodu, @NotNull @Size(max = 50) Country uyrukUlke,
			@NotNull @Size(max = 50) String tcKimlikPasaportNo, @NotNull Cinsiyet cinsiyet,
			@NotNull @Size(max = 100) String adi, @NotNull @Size(max = 100) String soyadi,
			@NotNull @Size(max = 100) String telefon, @NotNull @Size(max = 200) String adres, Sefer sefer) {
		super();
		this.turKodu = turKodu;
		this.uyrukUlke = uyrukUlke;
		this.tcKimlikPasaportNo = tcKimlikPasaportNo;
		this.cinsiyet = cinsiyet;
		this.adi = adi;
		this.soyadi = soyadi;
		this.telefon = telefon;
		this.adres = adres;
		this.sefer = sefer;
	}

	public PersonelTuru getTurKodu() {
		return turKodu;
	}

	public void setTurKodu(PersonelTuru turKodu) {
		this.turKodu = turKodu;
	}

	public Country getUyrukUlke() {
		return uyrukUlke;
	}

	public void setUyrukUlke(Country uyrukUlke) {
		this.uyrukUlke = uyrukUlke;
	}

	public String getTcKimlikPasaportNo() {
		return tcKimlikPasaportNo;
	}

	public void setTcKimlikPasaportNo(String tcKimlikPasaportNo) {
		this.tcKimlikPasaportNo = tcKimlikPasaportNo;
	}

	public Cinsiyet getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(Cinsiyet cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public Sefer getSefer() {
		return sefer;
	}

	public void setSefer(Sefer sefer) {
		this.sefer = sefer;
	}

}
