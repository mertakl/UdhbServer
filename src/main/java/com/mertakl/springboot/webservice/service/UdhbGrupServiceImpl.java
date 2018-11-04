package com.mertakl.springboot.webservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mertakl.springboot.webservice.model.Grup;
import com.mertakl.springboot.webservice.model.Sefer;
import com.mertakl.springboot.webservice.repository.GrupRepository;
import com.mertakl.springboot.webservice.repository.SeferRepository;
import com.mertakl.springboot.webservice.util.UdhbUtils;

import tr.gov.udhb.unetws.uetds.UetdsAriziGrupBilgileriInput;
import tr.gov.udhb.unetws.uetds.UetdsAriziGrupIslemSonuc;

@Service
public class UdhbGrupServiceImpl implements UdhbGrupService {

	UdhbUtils utils = new UdhbUtils();

	@Autowired
	SeferRepository seferRepository;

	@Autowired
	GrupRepository grupRepository;

	@Override
	public String seferGrupEkle(Long seferId, Long grupId) {
		utils.credientials();
		Grup grup = grupRepository.findById(grupId).get();
		UetdsAriziGrupBilgileriInput input = new UetdsAriziGrupBilgileriInput();
		input.setBaslangicIl(grup.getBaslangicIl());
		input.setBaslangicIlce(grup.getBaslangicIlce());
		input.setBaslangicUlke(grup.getBaslangicUlke());
		input.setBaslangicYer(grup.getBaslangicYer());
		input.setBitisIl(grup.getBitisIl());
		input.setBitisIlce(grup.getBitisIlce());
		input.setBitisUlke(grup.getBitisUlke());
		input.setBitisYer(grup.getBitisYer());
		input.setGrupAciklama(grup.getGrupAciklama());
		input.setGrupAdi(grup.getGrupAdi());

		Sefer sefer = seferRepository.findById(seferId).get();
		
		UetdsAriziGrupIslemSonuc sonuc = utils.port.seferGrupEkle(utils.kullaniciBilgileri(), sefer.getUetdsSeferReferansNo(),
				input);
		if (sonuc.getSonucKodu() == 0) {
			grup.setUetdsGrupRefNo(sonuc.getUetdsGrupRefNo());
			grup.setSefer(sefer);
			grupRepository.save(grup);
			return sonuc.getSonucMesaji();
		} else {
			return "An error occurred " + sonuc.getSonucMesaji();
		}

	}

	@Override
	public String seferGrupGuncelle(Long grupId,  Grup grupDetails) {
		utils.credientials();

		Grup grup = grupRepository.findById(grupId).get();

		UetdsAriziGrupBilgileriInput input = new UetdsAriziGrupBilgileriInput();
		input.setBaslangicIl(grupDetails.getBaslangicIl());
		input.setBaslangicIlce(grupDetails.getBaslangicIlce());
		input.setBaslangicUlke(grupDetails.getBaslangicUlke());
		input.setBaslangicYer(grupDetails.getBaslangicYer());
		input.setBitisIl(grupDetails.getBitisIl());
		input.setBitisIlce(grupDetails.getBitisIlce());
		input.setBitisUlke(grupDetails.getBitisUlke());
		input.setBitisYer(grupDetails.getBitisYer());
		input.setGrupAciklama(grupDetails.getGrupAciklama());
		input.setGrupAdi(grupDetails.getGrupAdi());

		UetdsAriziGrupIslemSonuc sonuc = utils.port.seferGrupGuncelle(utils.kullaniciBilgileri(),
				grup.getSefer().getUetdsSeferReferansNo(), Long.valueOf(grup.getUetdsGrupRefNo()), input);
		if (sonuc.getSonucKodu() == 0) {
			grupDetails.setUetdsGrupRefNo(sonuc.getUetdsGrupRefNo());
			grupRepository.save(grupDetails);
			return sonuc.getSonucMesaji();
		} else {
			return "An error occurred " + sonuc.getSonucMesaji();
		}

	}

	@Override
	public ResponseEntity<?> grupSil(Long grupId) {
		Grup grup = grupRepository.findById(grupId).get();
		grupRepository.delete(grup);
		return ResponseEntity.ok().build();
	}

	@Override
	public Grup grupEkle(Grup grup) {
		return grupRepository.save(grup);
	}


}
