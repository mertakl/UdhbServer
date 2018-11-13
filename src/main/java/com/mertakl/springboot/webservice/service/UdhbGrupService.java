package com.mertakl.springboot.webservice.service;


import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mertakl.springboot.webservice.model.Grup;

public interface UdhbGrupService {

	public String seferGrupEkle(Grup grup);

	public String seferGrupGuncelle(Grup grup);

	public ResponseEntity<?> grupSil(Long grupId);

	public Grup grupEkle(Grup grup);

	public List<Grup> getAllGrup();

}
