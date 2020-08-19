package com.akshay.hospital.service;

import com.akshay.hospital.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
