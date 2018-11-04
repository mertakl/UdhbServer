package com.mertakl.springboot.webservice.service;

import java.util.List;

import com.mertakl.springboot.webservice.model.Sefer;

import tr.gov.udhb.unetws.uetds.CstUetdsAriziGrupListe;
import tr.gov.udhb.unetws.uetds.UetdsSeferBildirimOzetSonuc;

public interface UdhbServiceSefer {

	public String servisTest(String message);

	public String seferEkle(Sefer sefer);

	public String seferIptal(Long id, Long uetdsSeferReferansNo, String iptalAciklama);

	public String seferPlakaDegistir(Long id, Long uetdsSeferReferansNo, String tasitPlakaNo);

	public String seferAktif(Long id, Long uetdsSeferReferansNo, String aktifAciklama);

	public List<Sefer> getAllSefer();

	public UetdsSeferBildirimOzetSonuc bildirimOzeti(Long uetdsSeferReferansNo);

	public List<CstUetdsAriziGrupListe> seferGrupListele(Long uetdsSeferReferansNo);

}
