package com.example.controller;


import com.example.payload.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {




    @GetMapping
    public ApiResponse HomeController(){

        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("Hello I am location service of airline ticket booking System");
        return apiResponse;
    }
}
