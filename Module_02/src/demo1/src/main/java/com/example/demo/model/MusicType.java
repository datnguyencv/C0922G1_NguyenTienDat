package com.example.demo.model;

import javax.persistence.*;

@Entity
public class MusicType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name_type;
    @OneToMany(mappedBy = "music_type")
    @JoinColumn
    public Music music;

    public MusicType() {
    }

    public MusicType(Integer id, String name_type, Music music) {
        this.id = id;
        this.name_type = name_type;
        this.music = music;
    }
}
