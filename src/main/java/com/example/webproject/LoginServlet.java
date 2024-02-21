package com.example.webproject;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        HttpSession ss = request.getSession();
        Object passwd = ss.getAttribute("password");
        Object emaill = ss.getAttribute("useremail");

        if(passwd.equals(password) && emaill.equals(email))
        {
            HttpSession ssdata = request.getSession();
            ssdata.setAttribute("email",email);

            Emaildata emaildata=new Emaildata();
            emaildata.sendEmail(email);

            RequestDispatcher dispatcher = request.getRequestDispatcher("Admission.jsp");
            dispatcher.forward(request,response);
        }
        else
        {
            request.setAttribute("result","password or username is incorrect try again");
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
        dispatcher.forward(request,response);
}

}
