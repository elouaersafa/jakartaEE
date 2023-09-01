package com.appcuisine.jakartaee.entities;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Recipe {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String description;
    private String photo;
    private String mealType;
    private LocalDate dateCook;
    private String category;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "recipe")
    private List<Ingredient> ingredients;

    public Recipe() {
    }

    public Recipe(String name, String description, String photo, String mealType, LocalDate dateCook, String category, User user, List<Ingredient> ingredients) {
        this.name = name;
        this.description = description;
        this.photo = photo;
        this.mealType = mealType;
        this.dateCook = dateCook;
        this.category = category;
        this.user = user;
        this.ingredients = ingredients;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public LocalDate getDateCook() {
        return dateCook;
    }

    public void setDateCook(LocalDate dateCook) {
        this.dateCook = dateCook;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

}
