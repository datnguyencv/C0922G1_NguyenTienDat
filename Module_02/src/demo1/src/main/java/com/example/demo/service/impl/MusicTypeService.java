package com.example.demo.service.impl;

import com.example.demo.model.MusicType;
import com.example.demo.repository.IMusicTypeRepository;
import com.example.demo.service.IMusicTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicTypeService implements IMusicTypeService {
    @Autowired
    private IMusicTypeRepository musicTypeRepository;
    @Override
    public List<MusicType> findAll() {
        return this.musicTypeRepository.findAll();
    }
}
