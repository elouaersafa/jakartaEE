package com.appcuisine.jakartaee.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CRecipeServlet", value = "/CRecipeServlet")
public class CRecipeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //affiche la page "Bobo cherche une recette selon ses critères"


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Récupèrer les critères de l'utilisateur et les passer dans la méthode DAO.
        // Récupérer la data de la méthode DAO (résultat)
        // Résultat => l'afficher dans mon HTML
        // Rediriger sur la même page.


    }
}