package com.example.exam3.controller;

import com.example.exam3.model.Food;
import com.example.exam3.service.IFoodService;
import com.example.exam3.service.impl.FoodService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FoodServlet", value = "/FoodServlet")
public class FoodServlet extends HttpServlet {
    private final IFoodService foodService = new FoodService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = "";
        switch (action) {
            case "edit":
                break;
            case "delete":
                break;
            default:

        }

    }
    public void selectAllFood(){

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = "";
        switch (action) {
            case "edit":
                break;
            case "delete":
                break;
            default:
                ShowList(request,response);

        }
    }

    private List<Food> ShowList(HttpServletRequest request, HttpServletResponse response) {
        List<Food> foodList = this.foodService.sellectAllFood();
        request.setAttribute("foodList", foodList);
        try {
            request.getRequestDispatcher("view/list.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
        return foodList;
    }
}
