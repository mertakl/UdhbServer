package com.mertakl.springboot.webservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mertakl.springboot.webservice.model.Bagaj;

public interface BagajRepository extends JpaRepository<Bagaj, Long>{

	List<String> findAllByYolcuId(Long yolcuId);

}
