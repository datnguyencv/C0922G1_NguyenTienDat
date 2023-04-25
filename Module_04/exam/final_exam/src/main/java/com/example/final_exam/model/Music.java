package com.example.final_exam.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String code;
    private String name;
    private String name_person;
    private String date;
    private String description;
    @ManyToOne
    @JoinColumn(name = "music_Type_id", referencedColumnName = "id", nullable = false)
    @JsonManagedReference
    private MusicType musicType;

    public Music() {
    }

    public Music(Integer id, String code, String name, String name_person, String date, String description, MusicType musicType) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.name_person = name_person;
        this.date = date;
        this.description = description;
        this.musicType = musicType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public MusicType getMusicType() {
        return musicType;
    }

    public void setMusicType(MusicType musicType) {
        this.musicType = musicType;
    }
}
