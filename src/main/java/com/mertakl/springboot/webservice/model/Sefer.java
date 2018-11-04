package com.mertakl.springboot.webservice.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;

import com.mertakl.springboot.webservice.audit.UserDateAudit;
import com.mertakl.springboot.webservice.enums.AktifPasif;

@Entity
@Table(name = "sefer")
public class Sefer extends UserDateAudit {

	private Long uetdsSeferReferansNo;
	@NotBlank
	@Size(max = 100)
	private String aracPlaka;
	private Date hareketTarihi;
	@NotBlank
	@Size(max = 20)
	private String hareketSaati;
	@Size(max = 250)
	private String seferAciklama;
	@Size(max = 100)
	private String aracTelefonu;
	@Size(max = 200)
	private String firmaSeferNo;
	private Date seferBitisTarihi;
	@Size(max = 20)
	private String seferBitisSaati;

	private AktifPasif durum;

	public Sefer() {

	}

	public Sefer(@NotBlank @Size(max = 100) Long uetdsSeferReferansNo, @NotBlank @Size(max = 100) String aracPlaka,
			@NotBlank Date hareketTarihi, @NotBlank @Size(max = 20) String hareketSaati,
			@Size(max = 250) String seferAciklama, @Size(max = 100) String aracTelefonu,
			@Size(max = 200) String firmaSeferNo, @NotBlank Date seferBitisTarihi,
			@NotBlank @Size(max = 20) String seferBitisSaati, AktifPasif durum) {
		super();
		this.uetdsSeferReferansNo = uetdsSeferReferansNo;
		this.aracPlaka = aracPlaka;
		this.hareketTarihi = hareketTarihi;
		this.hareketSaati = hareketSaati;
		this.seferAciklama = seferAciklama;
		this.aracTelefonu = aracTelefonu;
		this.firmaSeferNo = firmaSeferNo;
		this.seferBitisTarihi = seferBitisTarihi;
		this.seferBitisSaati = seferBitisSaati;
		this.durum = durum;
	}

	public Long getUetdsSeferReferansNo() {
		return uetdsSeferReferansNo;
	}

	public void setUetdsSeferReferansNo(Long uetdsSeferReferansNo) {
		this.uetdsSeferReferansNo = uetdsSeferReferansNo;
	}

	public String getAracPlaka() {
		return aracPlaka;
	}

	public void setAracPlaka(String aracPlaka) {
		this.aracPlaka = aracPlaka;
	}

	public Date getHareketTarihi() {
		return hareketTarihi;
	}

	public void setHareketTarihi(Date hareketTarihi) {
		this.hareketTarihi = hareketTarihi;
	}

	public String getHareketSaati() {
		return hareketSaati;
	}

	public void setHareketSaati(String hareketSaati) {
		this.hareketSaati = hareketSaati;
	}

	public String getSeferAciklama() {
		return seferAciklama;
	}

	public void setSeferAciklama(String seferAciklama) {
		this.seferAciklama = seferAciklama;
	}

	public String getAracTelefonu() {
		return aracTelefonu;
	}

	public void setAracTelefonu(String aracTelefonu) {
		this.aracTelefonu = aracTelefonu;
	}

	public String getFirmaSeferNo() {
		return firmaSeferNo;
	}

	public void setFirmaSeferNo(String firmaSeferNo) {
		this.firmaSeferNo = firmaSeferNo;
	}

	public Date getSeferBitisTarihi() {
		return seferBitisTarihi;
	}

	public void setSeferBitisTarihi(Date seferBitisTarihi) {
		this.seferBitisTarihi = seferBitisTarihi;
	}

	public String getSeferBitisSaati() {
		return seferBitisSaati;
	}

	public void setSeferBitisSaati(String seferBitisSaati) {
		this.seferBitisSaati = seferBitisSaati;
	}

	public AktifPasif getDurum() {
		return durum;
	}

	public void setDurum(AktifPasif durum) {
		this.durum = durum;
	}
}
