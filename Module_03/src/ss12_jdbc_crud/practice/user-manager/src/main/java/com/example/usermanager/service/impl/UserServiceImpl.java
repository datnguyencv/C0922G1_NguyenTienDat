package com.example.usermanager.service.impl;

import com.example.usermanager.model.User;
import com.example.usermanager.repository.IUserRepository;
import com.example.usermanager.repository.impl.UserRepositoryImpl;
import com.example.usermanager.service.IUserService;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements IUserService {
    private final IUserRepository userRepository = new UserRepositoryImpl();

    @Override
    public boolean insertUser(User user) {
        try {
            this.userRepository.insertUser(user);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public User selectUser(int id) {
        return this.userRepository.selectUser(id);
    }

    @Override
    public List<User> selectAllUser() {
        return this.userRepository.selectAllUser();
    }

    @Override
    public boolean deleteUser(int id) {
        try {
            this.userRepository.deleteUser(id);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        try {
            this.userRepository.updateUser(user);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<User> selectUserByCountry(String country) {
        return this.userRepository.selectUserByCountry(country);
    }

    @Override
    public List<User> sortByNameUser() {
        return this.userRepository.sortByNameUser();
    }
}
