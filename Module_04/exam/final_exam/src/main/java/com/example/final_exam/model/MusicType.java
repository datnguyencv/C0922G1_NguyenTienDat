package com.example.final_exam.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class MusicType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name_type;
    @OneToMany(mappedBy = "musicType", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Music> musicSet;

    public MusicType() {
    }

    public MusicType(Integer id, String name_type, Set<Music> musicSet) {
        this.id = id;
        this.name_type = name_type;
        this.musicSet = musicSet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName_type() {
        return name_type;
    }

    public void setName_type(String name_type) {
        this.name_type = name_type;
    }

    public Set<Music> getMusicSet() {
        return musicSet;
    }

    public void setMusicSet(Set<Music> musicSet) {
        this.musicSet = musicSet;
    }
}
