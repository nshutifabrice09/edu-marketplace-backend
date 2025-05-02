package com.edumarketplace.backend.service;

import com.edumarketplace.backend.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User saveUser (User user);
    User updateUser(Long id, User user);
    void removeById(Long id);
}
