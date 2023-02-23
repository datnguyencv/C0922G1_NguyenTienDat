package com.example.exam3.repository.impl;

import com.example.exam3.model.Food;
import com.example.exam3.repository.BaseRepository;
import com.example.exam3.repository.IFoodRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FoodRepository implements IFoodRepository {
    @Override
    public List<Food> sellectAllFood(HttpServletRequest request, HttpServletResponse response) {
        Connection connection = BaseRepository.getConnection();
        List<Food> foodList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT food (code_id,name,start_date,end_date,food_type.name, description) from food JOIN food_type ON (id) ");
            String code = request.("code_id");
            String name = request.setAttribute("name");
            String startdate = request.setAttribute("start_date");
            String enddate = request.setAttribute("end_date");
            String descrip = request.setAttribute("description");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return foodList;
    }

    @Override
    public List<Food> sellectAllFood() {
        return null;
    }

    @Override
    public void createFood(Food food) {
        voicecreate
    }
    private void listO(HttpServletRequest request, HttpServletResponse response) {
        List<O> Os = this.OService.selectAllO();
        List<Classes> classesList = this.OService.selectAllClasses();
        request.setAttribute("Os",Os);
        request.setAttribute("classesList",classesList);
        try {
            request.getRequestDispatcher("view/list.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
    private void createO(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        O O = new O(name,);
        request.setAttribute("mess","Thêm mới thành công");
        if(!this.OService.insertO(O)){
            request.setAttribute("mess","Thêm mới thất bại");
        }
        List<O> Os = this.OService.selectAllO();
        List<Classes> classesList = this.OService.selectAllClasses();
        request.setAttribute("Os",Os);
        request.setAttribute("classesList",classesList);

        @Override
    public void editFood(Food food) {

    }

