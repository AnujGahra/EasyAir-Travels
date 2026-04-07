package com.example.service.Impl;

import com.example.config.JwtProvider;
import com.example.dto.UserDTO;
import com.example.enums.UserRole;
import com.example.mapper.UserMapper;
import com.example.model.User;import com.example.payload.response.AuthResponse;
import com.example.repository.UserRepository;import com.example.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtProvider jwtProvider;

    /**
     * 1. Check if email already exists
     * 2. Encode password using bCrypt
     * 3. Save user in Database
     * 4. Generate JWT token
     * 5. Return token and user information
     */



    @Override
    public AuthResponse signup(UserDTO req) throws Exception {
        User existingUser=userRepository.findByEmail(req.getEmail());
        if(existingUser!=null){
            throw new Exception("email already registered!");
        }
        if(req.getRole()== UserRole.ROLE_SYSTEM_ADMIN){
            throw new Exception("You cannot sign up system admins!");
        }

        User newUser=User.builder()
                .email(req.getEmail())
                .password(passwordEncoder.encode(req.getPassword()))
                .phone(req.getPhone())
                .role(req.getRole())
                .fullName(req.getFullName())
                .lastLogin(LocalDateTime.now())
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();

        User savedUser = userRepository.save(newUser);


        Authentication authentication = new UsernamePasswordAuthenticationToken(
                savedUser.getEmail(),savedUser.getPassword()
        );

        String jwt = jwtProvider.generateToken(
                authentication, savedUser.getId()
        );
        AuthResponse authResponse = new AuthResponse();
        authResponse.setJwt(jwt);
      authResponse.setUser(UserMapper.toDTO(savedUser));
        authResponse.setTitle("Welcome "+savedUser.getFullName());
        authResponse.setMessage("Registered Successfully!");
        return authResponse;
    }

    @Override
    public AuthResponse login(String email, String password) {
        return null;
    }

}
