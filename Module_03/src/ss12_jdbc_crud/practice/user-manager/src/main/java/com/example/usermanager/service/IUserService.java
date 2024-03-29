package com.example.usermanager.service;

import com.example.usermanager.model.User;

import java.util.List;

public interface IUserService {
    boolean insertUser(User user);

    User selectUser(int id);

    List<User> selectAllUser();

    boolean deleteUser(int id);

    boolean updateUser(User user);

    List<User> selectUserByCountry(String country);

    List<User> sortByNameUser();
}
