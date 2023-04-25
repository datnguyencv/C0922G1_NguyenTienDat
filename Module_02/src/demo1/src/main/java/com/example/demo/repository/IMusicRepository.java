package com.example.demo.repository;


import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface IMusicRepository extends JpaRepository<Music, Integer> {
    Page<Music> findAllByNameContains(String search, Pageable pageable);
}
