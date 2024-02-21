package com.example.webproject;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
public class AuthaFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        HttpSession session = req.getSession(false);
        boolean isLoggedIn = (session != null && session.getAttribute("email") != null);

        if (!isLoggedIn && (req.getRequestURI().endsWith("Admission.jsp"))){
            RequestDispatcher dispatcher = request.getRequestDispatcher("LOGIN.jsp");
            dispatcher.forward(request,response);

        } else {
            chain.doFilter(request, response);
        }
    }
}
