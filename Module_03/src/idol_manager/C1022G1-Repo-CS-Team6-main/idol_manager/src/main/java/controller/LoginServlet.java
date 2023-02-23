package controller;

import Service.ICustomerService;
import Service.impl.CustomerService;
import model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    private static ICustomerService iCustomerService = new CustomerService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "register":
                showCustomerForm(request,response);
                break;
            default:
                showLoginForm(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "register":
                createCustomer(request,response);
                break;
            case "logout":
                logout(request,response);
                break;
            default:
        }
    }

    private void showLoginForm(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Customer customer = iCustomerService.loginCustomer(username, password);
        if (customer == null) {
            request.setAttribute("mess","Sai tài khoản hoặc mật khẩu");
            try {
                request.getRequestDispatcher("/view/customer/login.jsp").forward(request, response);
            } catch (ServletException | IOException e) {
                e.printStackTrace();
            }
        }else {
            try {
                HttpSession session = request.getSession();
                session.setAttribute("acc",customer);
                request.getRequestDispatcher("/view/home.jsp").forward(request,response);
            } catch (ServletException | IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response){
        try {
            request.getRequestDispatcher("/view/customer/register.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
    private void showCustomerForm(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");
        String dateOfBirth = request.getParameter("dateOfBirth");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String newPassword = request.getParameter("newPassword");
        Customer newCustomer = iCustomerService.checkCustomer(email);
        if (newCustomer == null){
            iCustomerService.createCustomer(new Customer(name,dateOfBirth,gender,email,newPassword));
                try {
                    try {
                        request.setAttribute("c",new Customer(name,dateOfBirth,gender,email,newPassword));
                        request.getRequestDispatcher("/view/customer/login.jsp").forward(request,response);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } catch (ServletException e) {
                    throw new RuntimeException(e);
                }
        }else {
            try {
                request.setAttribute("alo","Email already exists");
                try {
                    request.getRequestDispatcher("/view/customer/register.jsp").forward(request,response);
                } catch (ServletException e) {
                    throw new RuntimeException(e);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    private void logout(HttpServletRequest request, HttpServletResponse response){
        HttpSession httpSession = request.getSession();
        httpSession.removeAttribute("acc");
        try {
            response.sendRedirect("/view/home.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
