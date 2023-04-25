package com.example.final_exam.controller;

import com.example.final_exam.model.Music;
import com.example.final_exam.model.MusicType;
import com.example.final_exam.service.IMusicService;
import com.example.final_exam.service.IMusicTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/music")
@CrossOrigin("*")
public class RestMusicController {
    @Autowired
    IMusicService musicService;
    @Autowired
    IMusicTypeService musicTypeService;

    @GetMapping("")
    public Page<Music> findAll(@RequestParam(required = false, defaultValue = "") String search,
                               @PageableDefault(size = 5, direction = Sort.Direction.DESC) Pageable pageable) {
        Page<Music> musicPage = musicService.findAll(search, pageable);
        List<Music> musicList = musicPage.toList();

        return new PageImpl<>(musicList,pageable, musicPage.getTotalElements());
    }

    @GetMapping("/type")
    public List<MusicType> getAll() {
        return this.musicTypeService.findAll();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable(required = false) int id) {
        Music music = musicService.findById(id);
        this.musicService.delete(id, music);
    }

    @PostMapping("/create")
    public void create(@RequestBody Music music) {
        this.musicService.create(music);
    }
}
