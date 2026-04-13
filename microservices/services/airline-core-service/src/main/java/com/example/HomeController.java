package com.example;

import com.example.payload.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {


    @GetMapping
    public ApiResponse homeController(){

    ApiResponse apiResponse = new ApiResponse(
            "Hey everone im airline core service & i will Manages airline, aircraft fleet, aircraft models, and operational inventory for the airline system."
    );

    return apiResponse;
    }
}
