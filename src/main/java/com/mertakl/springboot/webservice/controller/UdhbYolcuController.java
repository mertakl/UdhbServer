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

import com.mertakl.springboot.webservice.model.Bagaj;
import com.mertakl.springboot.webservice.model.Personel;
import com.mertakl.springboot.webservice.model.Sefer;
import com.mertakl.springboot.webservice.model.Yolcu;
import com.mertakl.springboot.webservice.service.UdhbServiceYolcu;

@RestController
@RequestMapping("/udhb")
public class UdhbYolcuController {

	@Autowired
	UdhbServiceYolcu service;

	@PostMapping("/yolcuGrupEkle")
	public String yolcuGrupEkle(@RequestParam(value = "grupId") Long grupId, 
			@RequestParam(value = "yolcuId") Long yolcuId) {
		return service.yolcuGrupEkle(grupId, yolcuId);
	}
	
	@GetMapping("/yolcular")
	public List<Yolcu> getAllYolcu() {
		return service.getAllYolcu();
	}
	
	@GetMapping("/yolcuIptal")
	public String yolcuIptal(@RequestParam(value = "yolcuId") Long yolcuId,
			@RequestParam(value = "iptalAciklama") String iptalAciklama,
			@RequestBody Yolcu yolcu) {
		return service.yolcuIptal(yolcuId, iptalAciklama, yolcu);
	}
	
	@GetMapping("/yolcuIptalUetdsYolcuRefNoIle")
	public String yolcuIptalUetdsYolcuRefNoIle(@RequestParam(value = "yolcuId") Long yolcuId,
			@RequestParam(value = "iptalAciklama") String iptalAciklama) {
		return service.yolcuIptal(yolcuId, iptalAciklama);
	}
	
	@PostMapping("/yolcuBagajEkle")
	public String yolcuBagajEkle(@RequestParam(value = "yolcuId") Long yolcuId,
			@RequestBody Bagaj bagaj) {
		return service.yolcuBagajEkle(yolcuId, bagaj);
	}
	
	@GetMapping("/yolcuBagajIptal")
	public String yolcuBagajIptal(@RequestParam(value = "bagajId") Long bagajId,
			@RequestBody Bagaj bagaj) {
		return service.yolcuBagajIptal(bagajId, bagaj);
	}
	
	@PutMapping("/yolcu")
	public Yolcu updateYolcu(@RequestParam(value = "yolcuId") Long yolcuId,
			@RequestBody Yolcu yolcuDetails) {
		return service.updateYolcu(yolcuId, yolcuDetails);
	}
	
	@DeleteMapping("/yolcuSil")
	public ResponseEntity<?> yolcuSil(@RequestParam(value = "yolcuId") Long yolcuId) {
		return service.yolcuSil(yolcuId);
	}
	
	@PostMapping("/yolcuEkle")
	public Yolcu personelEkle(@RequestBody Yolcu yolcu) {
		return service.yolcuEkle(yolcu);
	}
}
