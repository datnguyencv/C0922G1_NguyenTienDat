package com.example.final_exam.repository;

import com.example.final_exam.model.MusicType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMusicTypeRepository extends JpaRepository<MusicType, Integer> {

}
