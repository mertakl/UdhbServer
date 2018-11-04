package com.mertakl.springboot.webservice.service;


import org.springframework.http.ResponseEntity;

import com.mertakl.springboot.webservice.model.Grup;

public interface UdhbGrupService {

	public String seferGrupEkle(Long seferId, Long grupId);

	public String seferGrupGuncelle(Long grupId, Grup grup);

	public ResponseEntity<?> grupSil(Long grupId);

	public Grup grupEkle(Grup grup);

}
