package com.mertakl.springboot.webservice.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mertakl.springboot.webservice.model.City;

public interface CityRepository extends JpaRepository<City, Long> {

	List<City> findByCountryId(Long id);

}
