package com.mertakl.springboot.webservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mertakl.springboot.webservice.model.City;
import com.mertakl.springboot.webservice.model.Country;
import com.mertakl.springboot.webservice.model.District;
import com.mertakl.springboot.webservice.repository.CityRepository;
import com.mertakl.springboot.webservice.repository.CountryRepository;
import com.mertakl.springboot.webservice.repository.DistrictRepository;

@Service
public class PlaceServiceImpl implements PlaceService {

	@Autowired
	CountryRepository countryRepository;

	@Autowired
	CityRepository cityRepository;

	@Autowired
	DistrictRepository districtRepository;

	@Override
	public List<Country> getAllCountries() {
		return countryRepository.findAll();
	}

	@Override
	public List<City> getCityByCountryId(Long countryId) {
		return cityRepository.findByCountryId(countryId);
	}

	@Override
	public List<District> getDistrictByCityId(Long cityId) {
		return districtRepository.findByCityId(cityId);
	}

}
