package com.mertakl.springboot.webservice.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.mertakl.springboot.webservice.audit.UserDateAudit;

@Entity
@Table(name = "udhb_kullanici")
public class UdhbKullanici extends UserDateAudit{

	private String kullaniciAdi;

	private String sifre;

	public UdhbKullanici() {

	}

	public UdhbKullanici(String kullaniciAdi, String sifre) {
		super();
		this.kullaniciAdi = kullaniciAdi;
		this.sifre = sifre;
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

}
