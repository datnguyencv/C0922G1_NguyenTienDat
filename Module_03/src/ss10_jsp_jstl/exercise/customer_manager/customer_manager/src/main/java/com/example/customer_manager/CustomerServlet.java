package com.example.customer_manager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value ="/")
public class CustomerServlet extends HttpServlet {
    private List<CustomerModel> customerList = new ArrayList<>();

    public void init() {
        customerList.add(new CustomerModel(1, "Mai Văn Hoàn", "1983-08-20", "Hà Nội",
                "https://phunugioi.com/wp-content/uploads/2020/03/anh-hot-girl-trung-quoc-cuc-tinh-y-451x600.jpg"));
        customerList.add(new CustomerModel(2, "Nguyễn Văn Nam", "1983-08-21", "Bắc Giang",
                "https://phunugioi.com/wp-content/uploads/2020/04/anh-gai-xinh-2k5-deo-kinh-toc-ngan-cute-451x600.jpg"));
        customerList.add(new CustomerModel(3, "Nguyễn Thái Hoà", "1983-08-22", "Nam Định",
                "https://phunugioi.com/wp-content/uploads/2020/04/gai-xinh-deo-kinh-can-toc-ngan-xoan-song-nuoc-604x600.jpg"));
        customerList.add(new CustomerModel(4, "Trần Đăng Khoa", "1983-08-17", "Hà Tây",
                "https://phunugioi.com/wp-content/uploads/2020/04/hot-girl-deo-kinh-toc-dai-ngang-lung-481x600.jpg"));
        customerList.add(new CustomerModel(5, "Nguyên Đinh Thi", "1983-08-19", "Hà Nội",
                "https://phunugioi.com/wp-content/uploads/2020/04/anh-gai-xinh-nhat-ban-toc-ngan-deo-kinh-cute-de-thuong-450x600.jpg"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerList",customerList);
        request.getRequestDispatcher("/manager.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
