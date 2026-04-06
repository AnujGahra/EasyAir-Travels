package com.example.repository;

import com.example.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AirportRepository extends JpaRepository<Airport, Long> {

    public Airport findByIataCode(String iataCode);

    List<Airport> findByCityId(Long cityId);
}
