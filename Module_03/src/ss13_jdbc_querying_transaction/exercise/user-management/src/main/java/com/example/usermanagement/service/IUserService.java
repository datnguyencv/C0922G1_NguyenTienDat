package com.example.usermanagement.service;

import com.example.usermanagement.model.User;

import java.util.List;

public interface IUserService {
    void addUser(User user);

    User selectUser(int id);

    List<User> selectAllUser();

    boolean deleteUser(int id);

    boolean updateUser(User user);

    List<User> searchByCountry(String country);

    List<User> sortByName();
}
