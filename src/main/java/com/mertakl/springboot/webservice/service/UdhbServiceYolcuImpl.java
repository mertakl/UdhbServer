package com.mertakl.springboot.webservice.service;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mertakl.springboot.webservice.enums.AktifPasif;
import com.mertakl.springboot.webservice.model.Bagaj;
import com.mertakl.springboot.webservice.model.Grup;
import com.mertakl.springboot.webservice.model.Personel;
import com.mertakl.springboot.webservice.model.Sefer;
import com.mertakl.springboot.webservice.model.Yolcu;
import com.mertakl.springboot.webservice.repository.BagajRepository;
import com.mertakl.springboot.webservice.repository.GrupRepository;
import com.mertakl.springboot.webservice.repository.SeferRepository;
import com.mertakl.springboot.webservice.repository.YolcuRepository;
import com.mertakl.springboot.webservice.util.UdhbUtils;

import tr.gov.udhb.unetws.uetds.UetdsAriziSeferYolcuBilgileriInput;
import tr.gov.udhb.unetws.uetds.UetdsAriziYolcuIptalInput;
import tr.gov.udhb.unetws.uetds.UetdsAriziYolcuIslemSonuc;
import tr.gov.udhb.unetws.uetds.UetdsGenelIslemSonuc;
import tr.gov.udhb.unetws.uetds.UetdsSeferBagajBilgileriInput;

@Service
public class UdhbServiceYolcuImpl implements UdhbServiceYolcu {

	@Autowired
	YolcuRepository yolcuRepository;

	@Autowired
	SeferRepository seferRepository;

	@Autowired
	GrupRepository grupRepository;

	@Autowired
	BagajRepository bagajRepository;

	UdhbUtils utils = new UdhbUtils();

	@Override
	public String yolcuGrupEkle(Long grupId, Long yolcuId) {
		utils.credientials();

		Grup grup = grupRepository.findById(grupId).get();

		Yolcu yolcu = yolcuRepository.findById(yolcuId).get();

		UetdsAriziSeferYolcuBilgileriInput input = new UetdsAriziSeferYolcuBilgileriInput();
		input.setAdi(yolcu.getAdi());
		input.setCinsiyet(yolcu.getCinsiyet().getName());
		input.setGrupId(Long.valueOf(grup.getUetdsGrupRefNo()));
		input.setKoltukNo(yolcu.getKoltukNo());
		input.setSoyadi(yolcu.getSoyadi());
		input.setTcKimlikPasaportNo(yolcu.getTcKimlikPasaportNo());
		input.setTelefonNo(yolcu.getTelefonNo());
		input.setUyrukUlke(yolcu.getUyrukUlke());

		UetdsAriziYolcuIslemSonuc sonuc = utils.port.yolcuEkle(utils.kullaniciBilgileri(),
				grup.getSefer().getUetdsSeferReferansNo(), input);

		if (sonuc.getSonucKodu() == 0) {
			yolcu.setUetdsYolcuRefNo(sonuc.getUetdsYolcuRefNo());
			yolcu.setDurum(AktifPasif.AKTIF);
			yolcu.setGrup(grup);
			yolcuRepository.save(yolcu);
			return sonuc.getSonucMesaji();
		} else {
			return "An error occured " + sonuc.getSonucMesaji();
		}

	}

	@Override
	public List<Yolcu> getAllYolcu() {
		return yolcuRepository.findAll();
	}

	@Override
	public String yolcuIptal(Long yolcuId, String iptalAciklama, Yolcu yolcuDetails) {
		utils.credientials();
		Yolcu yolcu = yolcuRepository.findById(yolcuId).get();
		UetdsAriziYolcuIptalInput input = new UetdsAriziYolcuIptalInput();
		input.setIptalAciklama(iptalAciklama);
		input.setKoltukNo(yolcuDetails.getKoltukNo());
		input.setYolcuTCKimlikPasaportNo(yolcuDetails.getTcKimlikPasaportNo());
		UetdsGenelIslemSonuc sonuc = utils.port.yolcuIptal(utils.kullaniciBilgileri(),
				yolcu.getGrup().getSefer().getUetdsSeferReferansNo(), input);
		if (sonuc.getSonucKodu() == 0) {
			yolcu.setDurum(AktifPasif.PASIF);
			return sonuc.getSonucMesaji();
		} else {
			return "An error occured " + sonuc.getSonucMesaji();
		}
	}

	@Override
	public String yolcuIptal(Long yolcuId, String iptalAciklama) {

		utils.credientials();
		Yolcu yolcu = yolcuRepository.findById(yolcuId).get();

		UetdsGenelIslemSonuc sonuc = utils.port.yolcuIptalUetdsYolcuRefNoIle(utils.kullaniciBilgileri(),
				yolcu.getGrup().getSefer().getUetdsSeferReferansNo(), Long.valueOf(yolcu.getUetdsYolcuRefNo()),
				iptalAciklama);

		if (sonuc.getSonucKodu() == 0) {
			yolcu.setDurum(AktifPasif.PASIF);
			return sonuc.getSonucMesaji();
		} else {
			return "An error occured " + sonuc.getSonucMesaji();
		}
	}

	@Override
	public String yolcuBagajEkle(Long yolcuId, Bagaj bagaj) {
		utils.credientials();
		Yolcu yolcu = yolcuRepository.findById(yolcuId).get();
		UetdsSeferBagajBilgileriInput input = new UetdsSeferBagajBilgileriInput();
		input.setKoltukNo(yolcu.getKoltukNo());
		input.setYolcuTCKimlikPasaportNo(yolcu.getTcKimlikPasaportNo());
		input.getBagajBarkodNumaralari().addAll(bagaj.getBagajBarkodNumaralari());
		List<UetdsSeferBagajBilgileriInput> bagajBilgileri = new ArrayList<>();
		bagajBilgileri.add(input);

		UetdsGenelIslemSonuc sonuc = utils.port.yolcuBagajEkle(utils.kullaniciBilgileri(),
				yolcu.getGrup().getSefer().getUetdsSeferReferansNo(), bagajBilgileri);

		if (sonuc.getSonucKodu() == 0) {
			bagaj.setBagajBarkodNumaralari(bagaj.getBagajBarkodNumaralari());
			bagaj.setYolcu(yolcu);
			bagaj.setDurum(AktifPasif.AKTIF);
			bagajRepository.save(bagaj);
			return sonuc.getSonucMesaji();
		} else {
			return "An error occured " + sonuc.getSonucMesaji();
		}

	}

	@Override
	public String yolcuBagajIptal(Long bagajId, Bagaj bagajDetails) {
		utils.credientials();
		Bagaj bagaj = bagajRepository.findById(bagajId).get();
		UetdsSeferBagajBilgileriInput input = new UetdsSeferBagajBilgileriInput();
		input.setKoltukNo(bagaj.getYolcu().getKoltukNo());
		input.setYolcuTCKimlikPasaportNo(bagaj.getYolcu().getTcKimlikPasaportNo());
		input.getBagajBarkodNumaralari().addAll(bagajDetails.getBagajBarkodNumaralari());

		UetdsGenelIslemSonuc sonuc = utils.port.yolcuBagajIptal(utils.kullaniciBilgileri(),
				bagaj.getYolcu().getGrup().getSefer().getUetdsSeferReferansNo(), input);

		if (sonuc.getSonucKodu() == 0) {
			bagaj.setDurum(AktifPasif.PASIF);
			return sonuc.getSonucMesaji();
		} else {
			return "An error occured " + sonuc.getSonucMesaji();
		}
	}

	@Override
	public Yolcu updateYolcu(Long yolcuId, Yolcu yolcuDetails) {

		Yolcu yolcu = yolcuRepository.findById(yolcuId).get();
		yolcu.setAdi(yolcuDetails.getAdi());
		yolcu.setCinsiyet(yolcuDetails.getCinsiyet());
		yolcu.setDurum(yolcuDetails.getDurum());
		yolcu.setKoltukNo(yolcuDetails.getKoltukNo());
		yolcu.setSoyadi(yolcuDetails.getSoyadi());
		yolcu.setTcKimlikPasaportNo(yolcuDetails.getTcKimlikPasaportNo());
		yolcu.setTelefonNo(yolcuDetails.getTelefonNo());
		yolcu.setUyrukUlke(yolcuDetails.getUyrukUlke());

		Yolcu updatedYolcu = yolcuRepository.save(yolcu);
		return updatedYolcu;
	}

	@Override
	public ResponseEntity<?> yolcuSil(Long yolcuId) {
		Yolcu yolcu = yolcuRepository.findById(yolcuId).get();
		yolcuRepository.delete(yolcu);
		return ResponseEntity.ok().build();
	}

	@Override
	public Yolcu yolcuEkle(Yolcu yolcu) {
		return yolcuRepository.save(yolcu);
	}

}
