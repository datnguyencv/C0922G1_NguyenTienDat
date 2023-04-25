package com.example.final_exam.service.impl;


import com.example.final_exam.model.Music;
import com.example.final_exam.repository.IMusicRepository;
import com.example.final_exam.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MusicService implements IMusicService {
    @Autowired
    private IMusicRepository musicRepository;

    @Override
    public Page<Music> findAll(String search, Pageable pageable) {
        return this.musicRepository.findAllByNameContains(search, pageable);
    }

    @Override
    public Music create(Music music) {
        return this.musicRepository.save(music);
    }

    @Override
    public void delete(int id, Music music) {
        Music music1 = findById(id);
        this.musicRepository.delete(music1);
    }

    @Override
    public Music findById(int id) {
        return this.musicRepository.findById(id).get();
    }
}
