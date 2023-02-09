import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "DemoServlet", value = "/DemoServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Xử lý đăng nhập tại đây, ví dụ như so sánh với dữ liệu trong cơ sở dữ liệu

        if (username.equals("admin") && password.equals("admin")) {
            response.sendRedirect("Welcome");
        } else {
            response.sendRedirect("Login");
        }
    }
}
