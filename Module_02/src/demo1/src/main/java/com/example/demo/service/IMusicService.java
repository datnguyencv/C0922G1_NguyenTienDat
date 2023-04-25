package com.example.demo.service;

import com.example.demo.model.Music;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IMusicService {
    Page<Music> findAll(String search, Pageable pageable);

    Music create(Music music);

    void delete(int id, Music music);

    Music findById(int id);

}
