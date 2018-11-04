package com.mertakl.springboot.webservice.service;

import java.util.List;

import com.mertakl.springboot.webservice.model.City;
import com.mertakl.springboot.webservice.model.Country;
import com.mertakl.springboot.webservice.model.District;

public interface PlaceService {

	List<Country> getAllCountries();

	List<City> getCityByCountryId(Long countryId);

	List<District> getDistrictByCityId(Long cityId);

}
