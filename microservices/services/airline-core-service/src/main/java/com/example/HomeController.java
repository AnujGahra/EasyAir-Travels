package com.example;

import com.example.payload.response.ApiResponse;

public class HomeController {


    public ApiResponse homeController(){

    ApiResponse apiResponse = new ApiResponse(
            "Hey everone im airline core service & i will Manages airline, aircraft fleet, aircraft models, and operational inventory for the airline system."
    );

    return apiResponse;
    }
}
