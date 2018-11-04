package com.mertakl.springboot.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mertakl.springboot.webservice.model.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
