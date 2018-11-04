package com.mertakl.springboot.webservice.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;

import com.mertakl.springboot.webservice.audit.UserDateAudit;
import com.mertakl.springboot.webservice.enums.AktifPasif;

@Entity
@Table(name = "bagaj")
public class Bagaj extends UserDateAudit {

	@ElementCollection(targetClass = String.class)
	private List<String> bagajBarkodNumaralari;

	private AktifPasif durum;

	@ManyToOne
	private Yolcu yolcu;

	public Bagaj() {

	}

	public Bagaj(List<String> bagajBarkodNumaralari, AktifPasif durum, @NotBlank Yolcu yolcuId) {
		super();
		this.bagajBarkodNumaralari = bagajBarkodNumaralari;
		this.durum = durum;
		this.yolcu = yolcu;
	}

	public List<String> getBagajBarkodNumaralari() {
		return bagajBarkodNumaralari;
	}

	public void setBagajBarkodNumaralari(List<String> bagajBarkodNumaralari) {
		this.bagajBarkodNumaralari = bagajBarkodNumaralari;
	}

	public AktifPasif getDurum() {
		return durum;
	}

	public void setDurum(AktifPasif durum) {
		this.durum = durum;
	}

	public Yolcu getYolcu() {
		return yolcu;
	}

	public void setYolcu(Yolcu yolcuId) {
		this.yolcu = yolcuId;
	}

}
