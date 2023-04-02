package com.example.springboot_2_3_1.dao;

import com.example.springboot_2_3_1.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();
    User getUserById(Long id);
    void addUser(User user);
    void deleteUser(Long id);
    void updateUser(User user);
}
