package com.example.final_exam.repository;


import com.example.final_exam.model.Music;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMusicRepository extends JpaRepository<Music, Integer> {
    Page<Music> findAllByNameContains(String search, Pageable pageable);
}
