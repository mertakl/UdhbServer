package com.mertakl.springboot.webservice.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import com.mertakl.springboot.webservice.model.Bagaj;
import com.mertakl.springboot.webservice.model.Yolcu;


public interface UdhbServiceYolcu {

	public String yolcuGrupEkle(Long yolcuId, Long grupId);

	public List<Yolcu> getAllYolcu();

	public String yolcuIptal(Long id, String iptalAciklama);

	public String yolcuIptalUetdsYolcuRefNoIle(Long yolcuId, String iptalAciklama);

	public String yolcuBagajEkle(Long yolcuId, Bagaj bagaj);

	public String yolcuBagajIptal(Long bagajId, Bagaj bagaj);

	public Yolcu updateYolcu(Yolcu yolcuDetails);

	public ResponseEntity<?> yolcuSil(Long yolcuId);

	public Yolcu yolcuEkle(Yolcu yolcu);


}
