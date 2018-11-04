package com.mertakl.springboot.webservice.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mertakl.springboot.webservice.model.UdhbKullanici;
import com.mertakl.springboot.webservice.repository.UdhbKullaniciRepository;

@RestController
@RequestMapping("/udhb")
public class UdhbKullaniciController {

	@Autowired
	UdhbKullaniciRepository udhbKullaniciRepository;
 
	@GetMapping("/udhbKullanici")
	public List<UdhbKullanici> getAllKullanici() {

		List<UdhbKullanici> kullanicilar = new ArrayList<>();
		udhbKullaniciRepository.findAll().forEach(kullanicilar::add);
 
		return kullanicilar;
	}

 
	@PutMapping("/udhbKullanici/{id}")
	public ResponseEntity<UdhbKullanici> updateUdhbKullanici(@PathVariable("id") Long id, @RequestBody UdhbKullanici kullanici) {
 
		Optional<UdhbKullanici> kullaniciData = udhbKullaniciRepository.findById(id);
 
		if (kullaniciData.isPresent()) {
			UdhbKullanici _kullanici = kullaniciData.get();
			_kullanici.setKullaniciAdi(kullanici.getKullaniciAdi());
			_kullanici.setSifre(kullanici.getSifre());
			return new ResponseEntity<>(udhbKullaniciRepository.save(_kullanici), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
}
