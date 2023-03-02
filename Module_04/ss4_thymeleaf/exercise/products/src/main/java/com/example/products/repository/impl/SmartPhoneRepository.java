package com.example.products.repository.impl;

import com.example.products.model.SmartPhone;
import com.example.products.repository.ISmartPhoneRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class SmartPhoneRepository implements ISmartPhoneRepository {
    private static final Map<Integer, SmartPhone> smartphones = new HashMap<>();

    static {
        smartphones.put(1, new SmartPhone(1, "I Phone 13", "Apple","New 2021", 1300));
        smartphones.put(2, new SmartPhone(2, "I Phone 14", "Apple","New 2022", 1900));
        smartphones.put(3, new SmartPhone(3, "Nokia X", "Microsoft","New 2023", 1300));
        smartphones.put(4, new SmartPhone(4, "Nokia XX", "Microsoft", "New 2025",1990));
        smartphones.put(5, new SmartPhone(5, "Sony N1", "Sony","New 2025", 1220));
    }

    @Override
    public List<SmartPhone> findAll() {
        return new ArrayList<>(smartphones.values());
    }

    @Override
    public void save(SmartPhone smartPhone) {
        smartphones.put(smartPhone.getId(), smartPhone);
    }

    @Override
    public SmartPhone findById(int id) {
        return smartphones.get(id);
    }

    @Override
    public void update(SmartPhone smartPhone) {
        smartphones.put(smartPhone.getId(), smartPhone);
    }

    @Override
    public void delete(int id) {
        smartphones.remove(id);
    }

    @Override
    public List<SmartPhone> findByName(String name) {
        List<SmartPhone> phones = new ArrayList<>(smartphones.values());
        List<SmartPhone> phoneList = new ArrayList<>();
        for (SmartPhone phone : phones) {
            if (phone.getName().contains(name)) {
                phoneList.add(phone);
            }
        }
        return phoneList;
    }
}