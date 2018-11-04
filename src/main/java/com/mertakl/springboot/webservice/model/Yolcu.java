package com.mertakl.springboot.webservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;

import com.mertakl.springboot.webservice.audit.UserDateAudit;
import com.mertakl.springboot.webservice.enums.AktifPasif;
import com.mertakl.springboot.webservice.enums.Cinsiyet;

@Entity
@Table(name = "yolcu")
public class Yolcu extends UserDateAudit {

	@NotBlank
	@Size(max = 100)
	private String uetdsYolcuRefNo;

	private String uyrukUlke;

	@NotNull
	private Cinsiyet cinsiyet;

	@NotBlank
	@Size(max = 100)
	private String tcKimlikPasaportNo;

	@NotBlank
	@Size(max = 100)
	private String adi;

	@NotBlank
	@Size(max = 100)
	private String soyadi;

	@NotBlank
	@Size(max = 10)
	private String koltukNo;

	@NotBlank
	@Size(max = 20)
	private String telefonNo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinTable(name = "yolcu_grup", joinColumns = @JoinColumn(name = "yolcu_id"), inverseJoinColumns = @JoinColumn(name = "grup_id"))
	private Grup grup;

	private AktifPasif durum;

	public Yolcu() {
	}

	public Yolcu(@NotBlank @Size(max = 100) String uetdsYolcuRefNo, @NotBlank @Size(max = 100) String uyrukUlke,
			@NotNull Cinsiyet cinsiyet, @NotBlank @Size(max = 100) String tcKimlikPasaportNo,
			@NotBlank @Size(max = 100) String adi, @NotBlank @Size(max = 100) String soyadi,
			@NotBlank @Size(max = 10) String koltukNo, @NotBlank @Size(max = 20) String telefonNo, Grup grup,
			AktifPasif durum) {
		super();
		this.uetdsYolcuRefNo = uetdsYolcuRefNo;
		this.uyrukUlke = uyrukUlke;
		this.cinsiyet = cinsiyet;
		this.tcKimlikPasaportNo = tcKimlikPasaportNo;
		this.adi = adi;
		this.soyadi = soyadi;
		this.koltukNo = koltukNo;
		this.telefonNo = telefonNo;
		this.grup = grup;
		this.durum = durum;
	}

	public String getUetdsYolcuRefNo() {
		return uetdsYolcuRefNo;
	}

	public void setUetdsYolcuRefNo(String uetdsYolcuRefNo) {
		this.uetdsYolcuRefNo = uetdsYolcuRefNo;
	}

	public String getUyrukUlke() {
		return uyrukUlke;
	}

	public void setUyrukUlke(String uyrukUlke) {
		this.uyrukUlke = uyrukUlke;
	}

	public Cinsiyet getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(Cinsiyet cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public String getTcKimlikPasaportNo() {
		return tcKimlikPasaportNo;
	}

	public void setTcKimlikPasaportNo(String tcKimlikPasaportNo) {
		this.tcKimlikPasaportNo = tcKimlikPasaportNo;
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

	public String getKoltukNo() {
		return koltukNo;
	}

	public void setKoltukNo(String koltukNo) {
		this.koltukNo = koltukNo;
	}

	public String getTelefonNo() {
		return telefonNo;
	}

	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
	}

	public Grup getGrup() {
		return grup;
	}

	public void setGrup(Grup grup) {
		this.grup = grup;
	}

	public AktifPasif getDurum() {
		return durum;
	}

	public void setDurum(AktifPasif durum) {
		this.durum = durum;
	}

}
