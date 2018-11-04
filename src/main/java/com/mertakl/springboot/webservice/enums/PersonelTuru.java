package com.mertakl.springboot.webservice.enums;

public enum PersonelTuru {
	
	KAPTAN(0,"Kaptan"),
	SOFOR(1,"Şoför"),
	HOST(2,"Host"),
	HOSTES(3,"Hostes"),
	DIGER(4,"Diğer");
	
	
	private java.lang.String name;

    private java.lang.Integer id;

    PersonelTuru(Integer id, java.lang.String name) {
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
