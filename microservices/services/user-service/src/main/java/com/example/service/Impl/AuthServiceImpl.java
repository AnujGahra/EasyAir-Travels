package com.example.service.Impl;

import com.example.dto.UserDTO;
import com.example.payload.response.AuthResponse;
import com.example.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    /**
     * 1. Check if email already exixts
     * 2. Encode password using BCrypt
     * 3. Save user in Database
     * 4. Generate JWT token
     * 5. Return token and user information
     */
    /


    @Override
    public AuthResponse signup(UserDTO req) {
        return null;
    }

    @Override
    public AuthResponse login(String email, String password) {
        return null;
    }

}
