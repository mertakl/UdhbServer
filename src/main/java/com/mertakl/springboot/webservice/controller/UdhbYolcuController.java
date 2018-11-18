package com.mertakl.springboot.webservice.controller;

import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

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

	@GetMapping("/yolcuGrupEkle")
	public String yolcuGrupEkle(@RequestParam(value = "yolcuId") Long yolcuId,
			@RequestParam(value = "grupId") Long grupId) {
		return service.yolcuGrupEkle(yolcuId, grupId);
	}

	@GetMapping("/yolcular")
	public List<Yolcu> getAllYolcu() {
		return service.getAllYolcu();
	}

	@GetMapping("/getYolcuWithGrupId")
	public List<Yolcu> getYolcuWithGrupId(@RequestParam(value = "grupId") Long grupId) {
		return service.getYolcuWithGrupId(grupId);
	}

	@GetMapping("/getAllYolcuWithoutGrupId")
	public List<Yolcu> getAllYolcuWithoutGrupId() {
		return service.getAllYolcuWithoutGrupId();
	}

	@GetMapping("/yolcuIptal")
	public String yolcuIptal(@RequestParam(value = "id") Long id,
			@RequestParam(value = "iptalAciklama") String iptalAciklama) {
		return service.yolcuIptal(id, iptalAciklama);
	}

	@GetMapping("/yolcuIptalUetdsYolcuRefNoIle")
	public String yolcuIptalUetdsYolcuRefNoIle(@RequestParam(value = "yolcuId") Long yolcuId,
			@RequestParam(value = "iptalAciklama") String iptalAciklama) {
		return service.yolcuIptalUetdsYolcuRefNoIle(yolcuId, iptalAciklama);
	}

	@PostMapping("/yolcuBagajEkle")
	public String yolcuBagajEkle(@RequestParam(value = "yolcuId") Long yolcuId, @RequestBody Bagaj bagaj) {
		return service.yolcuBagajEkle(yolcuId, bagaj);
	}

	@GetMapping("/yolcuBagajIptal")
	public String yolcuBagajIptal(@RequestParam(value = "bagajId") Long bagajId, @RequestBody Bagaj bagaj) {
		return service.yolcuBagajIptal(bagajId, bagaj);
	}

	@PutMapping("/yolcu")
	public Yolcu updateYolcu(@RequestBody Yolcu yolcuDetails) {
		return service.updateYolcu(yolcuDetails);
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
