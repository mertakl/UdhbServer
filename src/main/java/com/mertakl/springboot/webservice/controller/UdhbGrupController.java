package com.mertakl.springboot.webservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mertakl.springboot.webservice.model.Grup;
import com.mertakl.springboot.webservice.model.Yolcu;
import com.mertakl.springboot.webservice.service.UdhbGrupService;

import tr.gov.udhb.unetws.uetds.CstUetdsAriziGrupListe;

@RestController
@RequestMapping("/udhb")
public class UdhbGrupController {
	
	@Autowired
	UdhbGrupService service;
	
	@PostMapping("/seferGrupEkle")
	public String seferGrupEkle(@RequestParam(value = "seferId") Long seferId, 
			@RequestParam(value = "grupId") Long grupId) {
		return service.seferGrupEkle(seferId, grupId);
	}
	
	@PutMapping("/grupGuncelle")
	public String seferGrupGuncelle(@RequestParam(value = "grupId") Long grupId, 
			@RequestBody Grup grup) {
		return service.seferGrupGuncelle(grupId, grup);
	}
	
	@DeleteMapping("/grupSil")
	public ResponseEntity<?> grupSil(@RequestParam(value = "grupId") Long grupId) {
		return service.grupSil(grupId);
	}
	
	@PostMapping("/grupEkle")
	public Grup grupEkle(@RequestBody Grup grup) {
		return service.grupEkle(grup);
	}

}
