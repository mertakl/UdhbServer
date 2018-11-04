package com.mertakl.springboot.webservice.enums;

public enum AktifPasif {
	AKTIF(0, "Aktif"), 
	PASIF(1, "Pasif");

	private java.lang.String name;

	private java.lang.Integer id;

	AktifPasif(Integer id, java.lang.String name) {
		this.name = name;
		this.id = id;
	}

	public java.lang.String getName() {
		return name;
	}

	public java.lang.Integer getId() {
		return id;
	}
}
