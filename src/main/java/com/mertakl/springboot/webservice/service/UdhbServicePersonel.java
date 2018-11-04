package com.mertakl.springboot.webservice.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import com.mertakl.springboot.webservice.model.Personel;


public interface UdhbServicePersonel {

	public String personelSeferEkle(Long seferId, Long personelId);

	public String personelIptal(Long personelId, String iptalAciklama);

	public List<Personel> getAllPersonel();

	public Personel updatePersonel(Long personelId, Personel personelDetails);

	public ResponseEntity<?> personelSil(Long personelId);

	public Personel personelEkle(Personel personel);

}
