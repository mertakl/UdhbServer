package com.mertakl.springboot.webservice.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.mertakl.springboot.webservice.audit.UserDateAudit;

@Entity
@Table(name = "grup")
public class Grup extends UserDateAudit {
	@NotNull
	private String uetdsGrupRefNo;

	@NotBlank
	@Size(max = 100)
	private String grupAdi;

	@NotBlank
	@Size(max = 250)
	private String grupAciklama;

	@NotBlank
	@Size(max = 100)
	private String baslangicUlke;

	private Long baslangicIl;

	private Long baslangicIlce;

	@NotBlank
	@Size(max = 100)
	private String baslangicYer;

	@NotBlank
	@Size(max = 100)
	private String bitisUlke;

	private Long bitisIl;

	private Long bitisIlce;

	@NotBlank
	private String bitisYer;

	@ManyToOne
	private Sefer sefer;

	public Grup() {

	}

	public Grup(@NotBlank @Size(max = 100) String uetdsGrupRefNo, @NotBlank @Size(max = 100) String grupAdi,
			@NotBlank @Size(max = 250) String grupAciklama, @NotBlank @Size(max = 100) String baslangicUlke,
			@NotBlank Long baslangicIl, @NotBlank Long baslangicIlce, @NotBlank @Size(max = 100) String baslangicYer,
			@NotBlank @Size(max = 100) String bitisUlke, @NotBlank Long bitisIl, @NotBlank Long bitisIlce,
			@NotBlank String bitisYer, Sefer sefer) {
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

	public String getBaslangicUlke() {
		return baslangicUlke;
	}

	public void setBaslangicUlke(String baslangicUlke) {
		this.baslangicUlke = baslangicUlke;
	}

	public Long getBaslangicIl() {
		return baslangicIl;
	}

	public void setBaslangicIl(Long baslangicIl) {
		this.baslangicIl = baslangicIl;
	}

	public Long getBaslangicIlce() {
		return baslangicIlce;
	}

	public void setBaslangicIlce(Long baslangicIlce) {
		this.baslangicIlce = baslangicIlce;
	}

	public String getBaslangicYer() {
		return baslangicYer;
	}

	public void setBaslangicYer(String baslangicYer) {
		this.baslangicYer = baslangicYer;
	}

	public String getBitisUlke() {
		return bitisUlke;
	}

	public void setBitisUlke(String bitisUlke) {
		this.bitisUlke = bitisUlke;
	}

	public Long getBitisIl() {
		return bitisIl;
	}

	public void setBitisIl(Long bitisIl) {
		this.bitisIl = bitisIl;
	}

	public Long getBitisIlce() {
		return bitisIlce;
	}

	public void setBitisIlce(Long bitisIlce) {
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

	public void setSefer(Sefer seferId) {
		this.sefer = seferId;
	}

}
