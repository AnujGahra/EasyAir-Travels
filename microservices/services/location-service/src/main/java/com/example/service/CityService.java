package com.example.service;

import com.example.payload.request.CityRequest;
import com.example.payload.response.CityResponse;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface CityService {

    CityResponse createCity(CityRequest request);
    CityResponse getCityById(Long id);

    CityResponse updateCity(Long id, CityRequest cityRequest);
    void deleteCity(Long id);

    Page<CityResponse> searchCities(String keyword, Pageable pageable);
    Page<CityResponse> getCitiesByCountryCode(String countryCode, Pageable pageable);

    boolean cityExists(String cityCode);
    boolean validateCityCode(String cityCode);
}
