package com.example.service;

import com.example.dto.UserDTO;
import com.example.payload.response.AuthResponse;

public interface AuthService {

    AuthResponse login(String email, String password) throws Exception;
    AuthResponse signup(UserDTO req) throws Exception;
}
