package com.example.service.impl;

import com.example.payload.request.CityRequest;
import com.example.payload.response.CityResponse;
import com.example.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    @Override
    public CityResponse createCity(CityRequest request) {
        return null;
    }

    @Override
    public CityResponse getCityById(Long id) {
        return null;
    }

    @Override
    public CityResponse updateCity(Long id, CityRequest cityRequest) {
        return null;
    }

    @Override
    public void deleteCity(Long id) {

    }

    @Override
    public Page<CityResponse> searchCities(String keyword, Pageable pageable) {
        return null;
    }

    @Override
    public Page<CityResponse> getCitiesByCountryCode(String countryCode, Pageable pageable) {
        return null;
    }

    @Override
    public boolean cityExists(String cityCode) {
        return false;
    }

    @Override
    public boolean validateCityCode(String cityCode) {
        return false;
    }
}
