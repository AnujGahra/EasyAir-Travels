package com.example.service.impl;

import com.example.mapper.CityMapper;
import com.example.model.City;
import com.example.payload.request.CityRequest;
import com.example.payload.response.CityResponse;
import com.example.repository.CityRepository;
import com.example.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    @Override
    public CityResponse createCity(CityRequest request) throws Exception {

        if(cityRepository.existsByCityCode(request.getCityCode())) {
            throw new Exception("City with given code already exist");
        }

        City city = CityMapper.toEntity(request);
        City result = cityRepository.save(city);

        return CityMapper.toResponse(result);
    }

    @Override
    public CityResponse getCityById(Long id) throws Exception {
        City city = cityRepository.findById(id).orElseThrow(
                ()-> new Exception("City not exit with given id")
        );
        return CityMapper.toResponse(city);
    }

    @Override
    public CityResponse updateCity(Long id, CityRequest cityRequest) throws Exception {

        City city = cityRepository.findById(id).orElseThrow(
                ()-> new Exception("city not exit with given id")
        );

        if(cityRepository.existsByCityCode(cityRequest.getCityCode())) {
            throw new Exception("city with given code already exists");
        }

        City updateCity = cityRepository.save(CityMapper.updateEntity(city, cityRequest));
        return CityMapper.toResponse(updateCity);
    }

    @Override
    public void deleteCity(Long id) throws Exception {
        City city = cityRepository.findById(id).orElseThrow(
                ()-> new Exception("city not exit with given id")
        );

        cityRepository.delete(city);
    }

    @Override
    public Page<CityResponse> getAllCities(Pageable pageable) {
        return cityRepository.findAll(pageable).map(CityMapper::toResponse);
    }

    @Override
    public Page<CityResponse> searchCities(String keyword, Pageable pageable) {
        return cityRepository.searchByKeyword(keyword, pageable).map(CityMapper::toResponse);
    }

    @Override
    public Page<CityResponse> getCitiesByCountryCode(String countryCode, Pageable pageable) {
        return cityRepository.findByCountryCodeIgnoreCase(countryCode, pageable).map(CityMapper::toResponse);
    }

    @Override
    public boolean cityExists(String cityCode) {
        return cityRepository.existsByCityCode(cityCode);
    }

}
