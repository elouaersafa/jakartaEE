package com.appcuisine.jakartaee.servlets;

import com.appcuisine.jakartaee.dao.UserDAO;
import com.appcuisine.jakartaee.entities.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UserServlet", value = "/UserServlet")
public class UserServlet extends HttpServlet {

    UserDAO usercrud = new UserDAO();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Affiche la page jsp de l'inscription

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       String lname = request.getParameter("lname");
       String fname = request.getParameter("fname");

       usercrud.registerUser(new User(fname,lname,"password","photo","mail"));
    }
}