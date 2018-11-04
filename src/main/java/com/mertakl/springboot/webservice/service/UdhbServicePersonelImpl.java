package com.mertakl.springboot.webservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.mertakl.springboot.webservice.model.Personel;
import com.mertakl.springboot.webservice.model.Sefer;
import com.mertakl.springboot.webservice.repository.PersonelRepository;
import com.mertakl.springboot.webservice.repository.SeferRepository;
import com.mertakl.springboot.webservice.util.UdhbUtils;
import tr.gov.udhb.unetws.uetds.UetdsAriziSeferPersonelBilgileriInput;
import tr.gov.udhb.unetws.uetds.UetdsGenelIslemSonuc;
import tr.gov.udhb.unetws.uetds.UetdsPersonelIptalInput;

@Service
public class UdhbServicePersonelImpl implements UdhbServicePersonel {

	@Autowired
	PersonelRepository personelRepository;

	@Autowired
	SeferRepository seferRepository;

	UdhbUtils utils = new UdhbUtils();

	@Override
	public String personelSeferEkle(Long seferId, Long personelId) {

		utils.credientials();

		Personel personel = personelRepository.findById(personelId).get();

		UetdsAriziSeferPersonelBilgileriInput input = new UetdsAriziSeferPersonelBilgileriInput();
		input.setAdi(personel.getAdi());
		input.setAdres(personel.getAdres());
		input.setCinsiyet(personel.getCinsiyet().getName());
		input.setSoyadi(personel.getSoyadi());
		input.setTcKimlikPasaportNo(personel.getTcKimlikPasaportNo());
		input.setTelefon(input.getTelefon());
		input.setTurKodu(personel.getTurKodu().getId());
		input.setUyrukUlke(personel.getUyrukUlke());

		List<UetdsAriziSeferPersonelBilgileriInput> inputList = new ArrayList<>();
		inputList.add(input);

		Sefer sefer = seferRepository.findById(seferId).get();

		UetdsGenelIslemSonuc sonuc = utils.port.personelEkle(utils.kullaniciBilgileri(),
				sefer.getUetdsSeferReferansNo(), inputList);
		if (sonuc.getSonucKodu() == 0) {
			personel.setSefer(sefer);
			personelRepository.save(personel);
			return sonuc.getSonucMesaji();
		} else {
			return "An error occured " + sonuc.getSonucMesaji();
		}
	}

	@Override
	public String personelIptal(Long personelId, String iptalAciklama) {

		utils.credientials();
		Personel personel = personelRepository.findById(personelId).get();
		Sefer sefer = personel.getSefer();
		UetdsPersonelIptalInput input = new UetdsPersonelIptalInput();
		input.setIptalAciklama(iptalAciklama);
		input.setPersonelTCKimlikPasaportNo(personel.getTcKimlikPasaportNo());
		input.setUetdsSeferReferansNo(sefer.getUetdsSeferReferansNo());

		UetdsGenelIslemSonuc sonuc = utils.port.personelIptal(utils.kullaniciBilgileri(), input);

		if (sonuc.getSonucKodu() == 0) {
			personel.setSefer(null);
			return sonuc.getSonucMesaji();
		} else {
			return "An error occured " + sonuc.getSonucMesaji();
		}
	}

	@Override
	public List<Personel> getAllPersonel() {
		return personelRepository.findAll();
	}

	@Override
	public Personel updatePersonel(Long personelId, Personel personelDetails) {

		Personel personel = personelRepository.findById(personelId).get();
		personel.setAdi(personelDetails.getAdi());
		personel.setAdres(personelDetails.getAdres());
		personel.setCinsiyet(personelDetails.getCinsiyet());
		personel.setSoyadi(personelDetails.getSoyadi());
		personel.setTcKimlikPasaportNo(personelDetails.getTcKimlikPasaportNo());
		personel.setTelefon(personelDetails.getTelefon());
		personel.setTurKodu(personelDetails.getTurKodu());
		personel.setUyrukUlke(personelDetails.getUyrukUlke());

		Personel updatedPersonel = personelRepository.save(personel);
		return updatedPersonel;
	}

	@Override
	public ResponseEntity<?> personelSil(Long personelId) {
		Personel personel = personelRepository.findById(personelId).get();
		personelRepository.delete(personel);
		return ResponseEntity.ok().build();
	}

	@Override
	public Personel personelEkle(Personel personel) {
		return personelRepository.save(personel);
	}

}
