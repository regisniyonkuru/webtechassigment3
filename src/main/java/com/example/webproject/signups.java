package com.example.webproject;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet("/signups")
public class signups extends HelloServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String email = request.getParameter("email");
        String passwd = request.getParameter("password");


        HttpSession ss = request.getSession();
        ss.setAttribute("useremail",email);
        ss.setAttribute("password",passwd);


        RequestDispatcher dispatche = request.getRequestDispatcher("LOGIN.jsp");
        dispatche.forward(request,response);
}

}
