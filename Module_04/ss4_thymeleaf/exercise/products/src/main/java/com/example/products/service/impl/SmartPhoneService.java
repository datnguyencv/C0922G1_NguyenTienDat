package com.example.products.service.impl;

import com.example.products.model.SmartPhone;
import com.example.products.repository.ISmartPhoneRepository;
import com.example.products.service.ISmartPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SmartPhoneService implements ISmartPhoneService {
    @Autowired
    private ISmartPhoneRepository smartPhoneRepository;

    @Override
    public List<SmartPhone> findAll() {
        return this.smartPhoneRepository.findAll();
    }

    @Override
    public void save(SmartPhone smartPhone) {
        this.smartPhoneRepository.save(smartPhone);
    }

    @Override
    public SmartPhone findById(int id) {
        return this.smartPhoneRepository.findById(id);
    }

    @Override
    public void update(SmartPhone smartPhone) {
        this.smartPhoneRepository.update(smartPhone);
    }

    @Override
    public void delete(int id) {
        this.smartPhoneRepository.delete(id);
    }

    @Override
    public List<SmartPhone> findByName(String name) {
        return this.smartPhoneRepository.findByName(name);
    }
}