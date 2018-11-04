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

import com.mertakl.springboot.webservice.model.Personel;
import com.mertakl.springboot.webservice.model.Sefer;
import com.mertakl.springboot.webservice.service.UdhbServicePersonel;

@RestController
@RequestMapping("/udhb")
public class UdhbPersonelController {

	@Autowired
	UdhbServicePersonel service;

	@PostMapping("/personelSeferEkle")
	public String personelSeferEkle(@RequestParam(value = "seferId") Long seferId,
			@RequestParam(value = "personelId") Long personelId) {
		return service.personelSeferEkle(seferId, personelId);
	}

	@GetMapping("/personelIptal")
	public String personelIptal(@RequestParam(value = "personelId") Long personelId,
			@RequestParam(value = "iptalAciklama") String iptalAciklama) {
		return service.personelIptal(personelId, iptalAciklama);
	}

	@GetMapping("/personeller")
	public List<Personel> getAllPersonel() {
		return service.getAllPersonel();
	}

	@PutMapping("/personel")
	public Personel updatePersonel(@RequestParam(value = "personelId") Long personelId,
			@RequestBody Personel personelDetails) {
		return service.updatePersonel(personelId, personelDetails);
	}
	
	@DeleteMapping("/personelSil")
	public ResponseEntity<?> personelSil(@RequestParam(value = "personelId") Long personelId) {
		return service.personelSil(personelId);
	}
	
	@PostMapping("/personelEkle")
	public Personel personelEkle(@RequestBody Personel personel) {
		return service.personelEkle(personel);
	}
	
	
}
