package com.mertakl.springboot.webservice.controller;

import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mertakl.springboot.webservice.model.Sefer;
import com.mertakl.springboot.webservice.service.UdhbServiceSefer;

import tr.gov.udhb.unetws.uetds.CstUetdsAriziGrupListe;
import tr.gov.udhb.unetws.uetds.UetdsSeferBildirimOzetSonuc;

@RestController
@RequestMapping("/udhb")
public class UdhbSeferController {

	@Autowired
	UdhbServiceSefer service;

	@GetMapping("/servisTest")
	public String servisTest(@RequestParam(value = "message") String message) {
		return service.servisTest(message);
	}

	@PostMapping("/seferEkle")
	public String seferEkle(@RequestBody Sefer sefer) {
		return service.seferEkle(sefer);
	}

	@GetMapping("/seferIptal")
	public String seferIptal(@RequestParam(value = "id") Long id,
			@RequestParam(value = "uetdsSeferReferansNo") Long uetdsSeferReferansNo,
			@RequestParam(value = "iptalAciklama") String iptalAciklama) {
		return service.seferIptal(id, uetdsSeferReferansNo, iptalAciklama);
	}

	@PutMapping("/seferPlakaDegistir")
	public String seferPlakaDegistir(@RequestParam(value = "id") Long id,
			@RequestParam(value = "uetdsSeferReferansNo") Long uetdsSeferReferansNo,
			@RequestParam(value = "tasitPlakaNo") String tasitPlakaNo) {
		return service.seferPlakaDegistir(id, uetdsSeferReferansNo, tasitPlakaNo);
	}

	@GetMapping("/seferAktif")
	public String seferAktif(@RequestParam(value = "id") Long id,
			@RequestParam(value = "uetdsSeferReferansNo") Long uetdsSeferReferansNo,
			@RequestParam(value = "aktifAciklama") String aktifAciklama) {
		return service.seferAktif(id, uetdsSeferReferansNo, aktifAciklama);
	}

	@GetMapping("/seferler")
	public List<Sefer> getAllSefer() {
		return service.getAllSefer();
	}

	@GetMapping("/bildirimOzeti")
	public UetdsSeferBildirimOzetSonuc bildirimOzeti(
			@RequestParam(value = "uetdsSeferReferansNo") Long uetdsSeferReferansNo) {
		return service.bildirimOzeti(uetdsSeferReferansNo);
	}

	@GetMapping("/seferGrupListele")
	public List<CstUetdsAriziGrupListe> seferGrupListele(
			@RequestParam(value = "uetdsSeferReferansNo") Long uetdsSeferReferansNo) {
		return service.seferGrupListele(uetdsSeferReferansNo);
	}

}
