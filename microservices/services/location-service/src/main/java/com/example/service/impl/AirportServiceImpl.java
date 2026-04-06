package com.example.service.impl;

import com.example.payload.request.AirportRequest;
import com.example.payload.response.AirportResponse;
import com.example.service.AirportService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AirportServiceImpl implements AirportService {

    
    @Override
    public AirportResponse createAirport(AirportRequest request) {
        return null;
    }

    @Override
    public AirportResponse getAirportById(Long id) {
        return null;
    }

    @Override
    public List<AirportResponse> getAllAirports() {
        return List.of();
    }

    @Override
    public AirportResponse updateAirport(Long id, AirportRequest request) {
        return null;
    }

    @Override
    public void deleteAirport(Long id) {

    }

    @Override
    public List<AirportResponse> getAirportByCityId(Long cityId) {
        return List.of();
    }
}
