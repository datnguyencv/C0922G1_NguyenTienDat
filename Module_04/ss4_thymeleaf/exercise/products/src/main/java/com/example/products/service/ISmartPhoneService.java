package com.example.products.service;

import com.example.products.model.SmartPhone;

import java.util.List;

public interface ISmartPhoneService {
    List<SmartPhone> findAll();
    void save(SmartPhone smartPhone);
    SmartPhone findById(int id);
    void update(SmartPhone smartPhone);
    void delete(int id);
    List<SmartPhone> findByName(String name);

}
