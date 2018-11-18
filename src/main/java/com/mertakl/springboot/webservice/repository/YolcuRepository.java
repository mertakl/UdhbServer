package com.mertakl.springboot.webservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mertakl.springboot.webservice.model.Yolcu;

public interface YolcuRepository extends JpaRepository<Yolcu, Long> {

	List<Yolcu> findAllByGrupId(Long grupId);

	@Query("select y from Yolcu y where y.grup = NULL and y.durum = 0")
	List<Yolcu> findAllWithoutGrupId();
}
