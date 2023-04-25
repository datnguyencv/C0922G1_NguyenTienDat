package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String name_person;
    private String date;
    private String description;
    @ManyToOne
    @JoinColumn(name = "music_type_id", referencedColumnName = "id")
    @JsonBackReference
    public Set<MusicType> musicList;

    public Music() {
    }

    public Music(Integer id, String name, String name_person, String date, String description, Set<MusicType> musicList) {
        this.id = id;
        this.name = name;
        this.name_person = name_person;
        this.date = date;
        this.description = description;
        this.musicList = musicList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_person() {
        return name_person;
    }

    public void setName_person(String name_person) {
        this.name_person = name_person;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<MusicType> getMusicList() {
        return musicList;
    }

    public void setMusicList(Set<MusicType> musicList) {
        this.musicList = musicList;
    }
}
