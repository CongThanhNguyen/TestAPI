package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    User add(User user);

    List<User> getAll();

    User getOne(Integer id);

    void updateUser(Integer id, User user);

    void deleteUser(Integer id);
}
