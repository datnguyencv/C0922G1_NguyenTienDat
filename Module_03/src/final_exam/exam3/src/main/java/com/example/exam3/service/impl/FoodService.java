package com.example.exam3.service.impl;

import com.example.exam3.model.Food;
import com.example.exam3.repository.IFoodRepository;
import com.example.exam3.repository.impl.FoodRepository;
import com.example.exam3.service.IFoodService;

import java.util.List;

public class FoodService implements IFoodService {
    private final IFoodRepository foodRepository = new FoodRepository();

    @Override
    public List<Food> sellectAllFood() {
       return this.foodRepository.sellectAllFood();


    }
}
