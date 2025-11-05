package com.example.servlet;

import com.example.model.User;
import com.example.util.XMLHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * LoginServlet handles user and admin login functionality
 * Authenticates against users.xml data
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String role = request.getParameter("role"); // "user" or "admin"

        // TODO: Implement XML-based authentication using XMLHelper
        // XMLHelper xmlHelper = new XMLHelper();
        // User user = xmlHelper.authenticateUser(username, password, role);

        // Placeholder authentication logic
        boolean isAuthenticated = false;

        // Check for admin credentials
        if ("admin".equals(role) && "9262821600".equals(username) && "Sujeet@2002".equals(password)) {
            isAuthenticated = true;
        }

        if (isAuthenticated) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            session.setAttribute("role", role);

            if ("admin".equals(role)) {
                response.sendRedirect("pages/adminDashboard.jsp");
            } else {
                response.sendRedirect("pages/userDashboard.jsp");
            }
        } else {
            request.setAttribute("errorMessage", "Invalid credentials!");
            request.getRequestDispatcher("pages/login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("pages/login.jsp");
    }
}
