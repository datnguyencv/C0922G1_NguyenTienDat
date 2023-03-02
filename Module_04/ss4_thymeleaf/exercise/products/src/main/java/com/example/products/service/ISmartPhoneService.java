package com.example.products.service;

import com.example.products.model.SmartPhone;

import java.util.List;

public interface ISmartPhoneService {
    List<SmartPhone> findAll();

    boolean save(SmartPhone smartPhone);

    SmartPhone findById(int id);

    boolean update(SmartPhone smartPhone);

    boolean remove(int id);

    List<SmartPhone> findByName(String name);

}
