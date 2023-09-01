package com.appcuisine.jakartaee.servlets;

import com.appcuisine.jakartaee.dao.RecipeDAO;
import com.appcuisine.jakartaee.entities.Recipe;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AllRecipeServlet", value = "/AllRecipeServlet")
public class AllRecipeServlet extends HttpServlet {

    RecipeDAO recipecrud = new RecipeDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Recipe> recipeList = recipecrud.findAll();
        request.setAttribute("recipeList", recipeList);
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/index.jsp");
        rd.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Ajoute une recette

    }
}