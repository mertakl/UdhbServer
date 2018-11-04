package com.mertakl.springboot.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mertakl.springboot.webservice.model.City;
import com.mertakl.springboot.webservice.model.Country;
import com.mertakl.springboot.webservice.model.District;
import com.mertakl.springboot.webservice.service.PlaceService;

@RestController
@RequestMapping("/place")
public class PlaceController {
	
	@Autowired
	PlaceService placeService;
	
	@GetMapping("/countries")
	public List<Country> getAllCountries() {
		return placeService.getAllCountries();
	}
	
	@GetMapping("/cities/{countryId}")
	public List<City> getCitiesByCountryId(@PathVariable(value="countryId")Long countryId) {
		return placeService.getCityByCountryId(countryId);
	}
	
	@GetMapping("/districts/{cityId}")
	public List<District> getDistrictsByCityId(@PathVariable(value="cityId")Long cityId) {
		return placeService.getDistrictByCityId(cityId);
	}


}
