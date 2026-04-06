package com.example.mapper;

import com.example.model.Airport;
import com.example.payload.request.AirportRequest;
import com.example.payload.response.AirportResponse;

public class AirportMapper {

    public static Airport toEntity(AirportRequest request){
        if(request == null){return null;}

        return Airport.builder()
                .iataCode(request.getIataCode())
                .name(request.getName())
//                .timeZone(request.getTimeZone())
                .address(request.getAddress())
                .geoCode(request.getGeoCode())
                .build();
    }

    public static AirportResponse toResponse(Airport airport){
        if(airport == null){return null;}
        return AirportResponse.builder()
                .id(airport.getId())
                .iataCode(airport.getIataCode())
                .name(airport.getName())
                .detailedName(airport.getDetailedName())
//                .timeZone(airport.getTimeZone())
                .address(airport.getAddress())
                .city(CityMapper.toResponse(airport.getCity()))
                .geoCode(airport.getGeoCode())
                .build();
    }
}
