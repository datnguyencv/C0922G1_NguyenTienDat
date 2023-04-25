package com.example.final_exam.service.impl;


import com.example.final_exam.model.MusicType;
import com.example.final_exam.repository.IMusicTypeRepository;
import com.example.final_exam.service.IMusicTypeService;
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
