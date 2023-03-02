package com.example.products.service.impl;

import com.example.products.model.SmartPhone;
import com.example.products.repository.ISmartPhoneRepository;
import com.example.products.service.ISmartPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartPhoneService implements ISmartPhoneService {
    @Autowired
    private ISmartPhoneRepository smartPhoneRepository;

    @Override
    public List<SmartPhone> findAll() {
        return this.smartPhoneRepository.findAll();
    }

    @Override
    public boolean save(SmartPhone smartPhone) {
        return this.smartPhoneRepository.save(smartPhone);
    }

    @Override
    public SmartPhone findById(int id) {
        return this.smartPhoneRepository.findById(id);
    }

    @Override
    public boolean update(SmartPhone smartPhone) {
        return this.smartPhoneRepository.update(smartPhone);
    }

    @Override
    public boolean remove(int id) {
        return this.smartPhoneRepository.remove(id);
    }

    @Override
    public List<SmartPhone> findByName(String name) {
        return this.smartPhoneRepository.findByName(name);
    }
}