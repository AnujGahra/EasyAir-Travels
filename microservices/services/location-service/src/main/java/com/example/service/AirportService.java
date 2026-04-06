package com.example.service;

import com.example.payload.request.AirportRequest;
import com.example.payload.response.AirportResponse;

import java.util.List;

public interface AirportService {


    AirportResponse createAirport(AirportRequest request);
    AirportResponse getAirportById(Long id);

    List<AirportResponse> getAllAirports();

    AirportResponse updateAirport(Long id, AirportRequest request);
    void deleteAirport(Long id);
    List<AirportResponse> getAirportByCityId(Long cityId);
}
