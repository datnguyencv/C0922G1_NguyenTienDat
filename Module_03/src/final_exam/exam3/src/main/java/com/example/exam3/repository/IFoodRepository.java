package com.example.exam3.repository;

import com.example.exam3.model.Food;

import java.util.List;

public interface IFoodRepository {
    List<Food> sellectAllFood();

    void createFood(Food food);

    void editFood(Food food);

}
