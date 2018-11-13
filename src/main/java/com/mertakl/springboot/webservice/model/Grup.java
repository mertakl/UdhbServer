package com.mertakl.springboot.webservice.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.mertakl.springboot.webservice.audit.UserDateAudit;

@Entity
@Table(name = "grup")
public class Grup extends UserDateAudit {
	
	private String uetdsGrupRefNo;

	@NotBlank
	@Size(max = 100)
	private String grupAdi;

	@NotBlank
	@Size(max = 250)
	private String grupAciklama;

	@OneToOne
	private Country baslangicUlke;

	@OneToOne
	private City baslangicIl;

	@OneToOne
	private District baslangicIlce;

	@NotBlank
	@Size(max = 100)
	private String baslangicYer;

	@OneToOne
	private Country bitisUlke;

	@OneToOne
	private City bitisIl;

	@OneToOne
	private District bitisIlce;

	@NotBlank
	private String bitisYer;

	@ManyToOne
	private Sefer sefer;

	public Grup() {

	}

	public Grup(@NotNull String uetdsGrupRefNo, @NotBlank @Size(max = 100) String grupAdi,
			@NotBlank @Size(max = 250) String grupAciklama, Country baslangicUlke, City baslangicIl,
			District baslangicIlce, @NotBlank @Size(max = 100) String baslangicYer, Country bitisUlke, City bitisIl,
			District bitisIlce, @NotBlank String bitisYer, Sefer sefer) {
		super();
		this.uetdsGrupRefNo = uetdsGrupRefNo;
		this.grupAdi = grupAdi;
		this.grupAciklama = grupAciklama;
		this.baslangicUlke = baslangicUlke;
		this.baslangicIl = baslangicIl;
		this.baslangicIlce = baslangicIlce;
		this.baslangicYer = baslangicYer;
		this.bitisUlke = bitisUlke;
		this.bitisIl = bitisIl;
		this.bitisIlce = bitisIlce;
		this.bitisYer = bitisYer;
		this.sefer = sefer;
	}

	public String getUetdsGrupRefNo() {
		return uetdsGrupRefNo;
	}

	public void setUetdsGrupRefNo(String uetdsGrupRefNo) {
		this.uetdsGrupRefNo = uetdsGrupRefNo;
	}

	public String getGrupAdi() {
		return grupAdi;
	}

	public void setGrupAdi(String grupAdi) {
		this.grupAdi = grupAdi;
	}

	public String getGrupAciklama() {
		return grupAciklama;
	}

	public void setGrupAciklama(String grupAciklama) {
		this.grupAciklama = grupAciklama;
	}

	public Country getBaslangicUlke() {
		return baslangicUlke;
	}

	public void setBaslangicUlke(Country baslangicUlke) {
		this.baslangicUlke = baslangicUlke;
	}

	public City getBaslangicIl() {
		return baslangicIl;
	}

	public void setBaslangicIl(City baslangicIl) {
		this.baslangicIl = baslangicIl;
	}

	public District getBaslangicIlce() {
		return baslangicIlce;
	}

	public void setBaslangicIlce(District baslangicIlce) {
		this.baslangicIlce = baslangicIlce;
	}

	public String getBaslangicYer() {
		return baslangicYer;
	}

	public void setBaslangicYer(String baslangicYer) {
		this.baslangicYer = baslangicYer;
	}

	public Country getBitisUlke() {
		return bitisUlke;
	}

	public void setBitisUlke(Country bitisUlke) {
		this.bitisUlke = bitisUlke;
	}

	public City getBitisIl() {
		return bitisIl;
	}

	public void setBitisIl(City bitisIl) {
		this.bitisIl = bitisIl;
	}

	public District getBitisIlce() {
		return bitisIlce;
	}

	public void setBitisIlce(District bitisIlce) {
		this.bitisIlce = bitisIlce;
	}

	public String getBitisYer() {
		return bitisYer;
	}

	public void setBitisYer(String bitisYer) {
		this.bitisYer = bitisYer;
	}

	public Sefer getSefer() {
		return sefer;
	}

	public void setSefer(Sefer sefer) {
		this.sefer = sefer;
	}

}
