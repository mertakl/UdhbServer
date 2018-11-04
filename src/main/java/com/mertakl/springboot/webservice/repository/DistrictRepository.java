package com.mertakl.springboot.webservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mertakl.springboot.webservice.model.District;

public interface DistrictRepository extends JpaRepository<District, Long> {
	List<District> findByCityId(Long cityId);
}
