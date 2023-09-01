package com.appcuisine.jakartaee.entities;

import javax.persistence.*;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String quantite;
    private String photo;
    private String categorie;

    @ManyToOne
    @JoinColumn(name="recipe_id")
    private Recipe recipe;

    public Ingredient() {
    }

    public Ingredient(String name, String quantite, String photo, String categorie, Recipe recipe) {
        this.name = name;
        this.quantite = quantite;
        this.photo = photo;
        this.categorie = categorie;
        this.recipe = recipe;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantite() {
        return quantite;
    }

    public void setQuantite(String quantite) {
        this.quantite = quantite;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
