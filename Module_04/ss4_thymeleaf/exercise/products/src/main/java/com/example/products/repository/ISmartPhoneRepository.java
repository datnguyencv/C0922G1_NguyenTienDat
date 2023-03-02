package com.example.products.repository;

import com.example.products.model.SmartPhone;

import java.util.List;

public interface ISmartPhoneRepository {
    List<SmartPhone> findAll();

    boolean save(SmartPhone smartPhone);

    SmartPhone findById(int id);

    boolean update(SmartPhone smartPhone);

    boolean remove(int id);

    List<SmartPhone> findByName(String name);

}
