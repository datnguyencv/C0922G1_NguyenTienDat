package com.example.product_discount_calculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ProductDiscountCalculator", value = "/ProductDiscountCalculator")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        double numberFisrt = Double.parseDouble(request.getParameter("list_price"));
        double numberSecond = Double.parseDouble(request.getParameter("discount_price"));

        double discountAmount = numberFisrt * numberSecond * 0.01;
        double discountPrice = numberFisrt - discountAmount;

//        In ra kết quả
        request.setAttribute("description", description);
        request.setAttribute("discountPrice", discountPrice);
//        Gửi kết quả ra Index
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
