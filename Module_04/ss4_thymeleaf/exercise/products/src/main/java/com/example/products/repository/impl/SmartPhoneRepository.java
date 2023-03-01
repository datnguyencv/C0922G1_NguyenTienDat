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
@Component
public class SmartPhoneRepository implements ISmartPhoneRepository {
    private static final Map<Integer, SmartPhone> smartPhoneList = new HashMap<>();

    static {
        smartPhoneList.put(1, new SmartPhone(1, "I Phone 13", "Apple", 1300));
        smartPhoneList.put(2, new SmartPhone(2, "I Phone 14", "Apple", 1900));
        smartPhoneList.put(3, new SmartPhone(3, "Nokia X", "Microsoft", 1300));
        smartPhoneList.put(4, new SmartPhone(4, "Nokia XX", "Microsoft", 1990));
        smartPhoneList.put(5, new SmartPhone(5, "Sony N1", "Sony", 1220));


    }

    @Override
    public List<SmartPhone> findAll() {
        return new ArrayList<>(smartPhoneList.values());
    }

    @Override
    public void save(SmartPhone smartPhone) {
        smartPhoneList.put(smartPhone.getId(), smartPhone);
    }

    @Override
    public SmartPhone findById(int id) {
        return smartPhoneList.get(id);
    }

    @Override
    public void update(SmartPhone smartPhone) {
        smartPhoneList.put(smartPhone.getId(), smartPhone);
    }

    @Override
    public void delete(int id) {
        smartPhoneList.remove(id);
    }

    @Override
    public List<SmartPhone> findByName(String name) {
        List<SmartPhone> phones = new ArrayList<>(smartPhoneList.values());
        List<SmartPhone> phoneList = new ArrayList<>();
        for (SmartPhone phone : phones) {
            if (phone.getName().contains(name)) {
                phoneList.add(phone);
            }
        }
        return phoneList;
    }
}