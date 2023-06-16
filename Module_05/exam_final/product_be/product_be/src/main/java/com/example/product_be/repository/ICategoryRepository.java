package com.example.product_be.repository;

import com.example.product_be.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {
    @Query(value = "select * from category", nativeQuery = true)
    List<Category> getAll();

    @Query(value = "select * from book_type where id = :id", nativeQuery = true)
    Category getWithId(@Param("id") Integer id);
}
