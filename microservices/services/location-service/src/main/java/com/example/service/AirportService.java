package com.example.service;

import com.example.payload.request.AirportRequest;
import com.example.payload.response.AirportResponse;

public interface AirportService {

    AirportResponse createAirport(AirportRequest request);
}
