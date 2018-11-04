package com.mertakl.springboot.webservice.enums;

public enum Cinsiyet {
	ERKEK(0,"Erkek"),
	KADIN(1,"Kadın");
	
	private java.lang.String name;

    private java.lang.Integer id;

    Cinsiyet(Integer id, java.lang.String name) {
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
