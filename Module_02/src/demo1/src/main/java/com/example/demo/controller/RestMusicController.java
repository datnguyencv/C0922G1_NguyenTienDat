package com.example.demo.controller;

import com.example.demo.model.Music;
import com.example.demo.model.MusicType;
import com.example.demo.service.IMusicService;
import com.example.demo.service.IMusicTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
                               @PageableDefault(size = 5, direction = Sort.Direction.DESC)Pageable pageable){
        Page<Music> musicPage = musicService.findAll(search, pageable);
//        List<Music> musicList = musicPage.getTotalElements()

        return musicPage;
    }

    @GetMapping("/type")
    public List<MusicType> getAll(){
        return this.musicTypeService.findAll();
    }
    @DeleteMapping("${id}")
    public void delete(@PathVariable(required = false)int id){
        Music music = musicService.findById(id);
        this.musicService.delete(id,music);
    }
    @PostMapping("/create")
    public void create(@RequestBody Music music) {
        this.musicService.create(music);
    }
}
