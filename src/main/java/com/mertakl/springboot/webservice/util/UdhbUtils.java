package com.mertakl.springboot.webservice.util;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mertakl.springboot.webservice.controller.UdhbKullaniciController;
import com.mertakl.springboot.webservice.model.UdhbKullanici;
import com.mertakl.springboot.webservice.repository.UdhbKullaniciRepository;

import tr.gov.udhb.unetws.uetds.UdhbUetdsAriziService;
import tr.gov.udhb.unetws.uetds.UdhbUetdsAriziService_Service;
import tr.gov.udhb.unetws.uetds.UetdsYtsUser;

public class UdhbUtils {
	
	UdhbUetdsAriziService_Service service = new UdhbUetdsAriziService_Service();

	public UdhbUetdsAriziService port = service.getUdhbUetdsAriziServicePort();

	public Map<String, Object> credientials() {
		
		BindingProvider bp = (BindingProvider) port;

		Map<String, Object> map = bp.getRequestContext();

		map.put(BindingProvider.USERNAME_PROPERTY, "999999");
		map.put(BindingProvider.PASSWORD_PROPERTY, "999999testtest");
		return map;
	}

	public XMLGregorianCalendar calendar(Date date) {
		XMLGregorianCalendar xmlDate = null;
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(date);
		try {
			xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return xmlDate;
	}

	public UetdsYtsUser kullaniciBilgileri() {
		UetdsYtsUser user = new UetdsYtsUser();
		user.setKullaniciAdi("999999");
		user.setSifre("999999testtest");
		return user;
	}

}
