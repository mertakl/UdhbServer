package com.mertakl.springboot.webservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mertakl.springboot.webservice.enums.AktifPasif;
import com.mertakl.springboot.webservice.model.Sefer;

import com.mertakl.springboot.webservice.repository.SeferRepository;

import com.mertakl.springboot.webservice.util.UdhbUtils;

import tr.gov.udhb.unetws.uetds.CstUetdsAriziGrupListe;
import tr.gov.udhb.unetws.uetds.UetdsAriziGrupIslemSonuc;
import tr.gov.udhb.unetws.uetds.UetdsAriziSeferBildirSonuc;
import tr.gov.udhb.unetws.uetds.UetdsAriziSeferBilgileriInput;
import tr.gov.udhb.unetws.uetds.UetdsGenelIslemSonuc;
import tr.gov.udhb.unetws.uetds.UetdsSeferBildirimOzetSonuc;

@Service
public class UdhbServiceSeferImpl implements UdhbServiceSefer {

	@Autowired
	SeferRepository seferRepository;

	UdhbUtils utils = new UdhbUtils();

	@Override
	public String servisTest(String message) {
		utils.credientials();
		return utils.port.servisTest(message);
	}

	@Override
	public String seferEkle(Sefer sefer) {
		utils.credientials();
		UetdsAriziSeferBilgileriInput input = new UetdsAriziSeferBilgileriInput();
		input.setAracPlaka(sefer.getAracPlaka());
		input.setAracTelefonu(sefer.getAracTelefonu());
		input.setFirmaSeferNo(sefer.getFirmaSeferNo());
		input.setHareketSaati(sefer.getHareketSaati());
		input.setHareketTarihi(utils.calendar(sefer.getHareketTarihi()));
		input.setSeferAciklama(sefer.getSeferAciklama());
		input.setSeferBitisSaati(sefer.getSeferBitisSaati());
		input.setSeferBitisTarihi(utils.calendar(sefer.getSeferBitisTarihi()));

		UetdsAriziSeferBildirSonuc sonuc = utils.port.seferEkle(utils.kullaniciBilgileri(), input);

		if (sonuc.getSonucKodu() == 0) {
			sefer.setUetdsSeferReferansNo(sonuc.getUetdsSeferReferansNo());
			sefer.setDurum(AktifPasif.AKTIF);
			seferRepository.save(sefer);
			return sonuc.getSonucMesaji();
		} else {
			return "Some error occured " + sonuc.getSonucMesaji();
		}

	}

	@Override
	public String seferIptal(Long id, Long uetdsSeferReferansNo, String iptalAciklama) {
		utils.credientials();
		UetdsGenelIslemSonuc sonuc = utils.port.seferIptal(utils.kullaniciBilgileri(), uetdsSeferReferansNo,
				iptalAciklama);
		if (sonuc.getSonucKodu() == 0) {
			Sefer sefer = seferRepository.findById(id).get();
			sefer.setDurum(AktifPasif.PASIF);
			seferRepository.save(sefer);
			return sonuc.getSonucMesaji();
		} else {
			return "Some error occured " + sonuc.getSonucMesaji();
		}

	}

	@Override
	public String seferPlakaDegistir(Long id, Long uetdsSeferReferansNo, String tasitPlakaNo) {
		utils.credientials();
		UetdsGenelIslemSonuc sonuc = utils.port.seferPlakaDegistir(utils.kullaniciBilgileri(), uetdsSeferReferansNo,
				tasitPlakaNo);
		if (sonuc.getSonucKodu() == 0) {
			Sefer sefer = seferRepository.findById(id).get();
			sefer.setAracPlaka(tasitPlakaNo);
			seferRepository.save(sefer);
			return sonuc.getSonucMesaji();
		} else {
			return "Some error occured " + sonuc.getSonucMesaji();
		}
	}

	@Override
	public String seferAktif(Long id, Long uetdsSeferReferansNo, String aktifAciklama) {
		utils.credientials();
		UetdsGenelIslemSonuc sonuc = utils.port.seferAktif(utils.kullaniciBilgileri(), uetdsSeferReferansNo,
				aktifAciklama);
		if (sonuc.getSonucKodu() == 0) {
			Sefer sefer = seferRepository.findById(id).get();
			sefer.setDurum(AktifPasif.AKTIF);
			seferRepository.save(sefer);
			return sonuc.getSonucMesaji();
		} else {
			return "Some error occured " + sonuc.getSonucMesaji();
		}
	}

	@Override
	public UetdsSeferBildirimOzetSonuc bildirimOzeti(Long uetdsSeferReferansNo) {
		utils.credientials();
		UetdsSeferBildirimOzetSonuc sonuc = utils.port.bildirimOzeti(utils.kullaniciBilgileri(), uetdsSeferReferansNo);
		return sonuc;
	}

	@Override
	public List<CstUetdsAriziGrupListe> seferGrupListele(Long uetdsSeferReferansNo) {
		utils.credientials();

		UetdsAriziGrupIslemSonuc sonuc = utils.port.seferGrupListesi(utils.kullaniciBilgileri(), uetdsSeferReferansNo);

		return sonuc.getGrupListe();
	}

	@Override
	public List<Sefer> getAllSefer() {
		return seferRepository.findAll();
	}

}
