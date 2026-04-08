package com.example.service;

import com.example.model.User;

import java.util.List;

public interface UserService {

    User getUserByEmail(String email);
    User getUserById(Long id);
    List<User> getAllUsers();
}
