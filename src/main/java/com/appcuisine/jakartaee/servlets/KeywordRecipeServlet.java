package com.appcuisine.jakartaee.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "KeywordRecipeServlet", value = "/KeywordRecipeServlet")
public class KeywordRecipeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Recuperer le mot clé de l'utilisateur et passer le mot clé dans la méthode DAO
        // Récuperer la data (résultat de la méthode DAO)
        // Afficher la data dans le fichier hmtl
        // Rediriger sur ce fichier html

    }
}