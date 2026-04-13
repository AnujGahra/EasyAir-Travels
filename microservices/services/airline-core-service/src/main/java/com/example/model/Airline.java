package com.example.model;


import com.example.enums.AirlineStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Airline {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(unique = true, nullable = false)
    private String iataCode;


    @Column(unique = true, nullable = false)
    private String icaoCode;


    @Column(nullable = false)
    private String name;


    private String alias;

    private String logoUrl;

    private String website;


    @Enumerated(EnumType.STRING)
    private AirlineStatus status= AirlineStatus.ACTIVE;

    private String alliance;


    private Long headquartersCityId;


    private Long updatedById;


    @CreatedDate
    @Column(updatable = false, nullable = false)
    private Instant createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    private Instant updatedAt;




}
