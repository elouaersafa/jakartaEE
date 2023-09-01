package com.appcuisine.jakartaee.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fname;
    private String lname;
    private String password;
    private String photo;
    private String mail;
    @OneToMany (mappedBy = "user",cascade = CascadeType.ALL)
    private List<Recipe> recipe;

    public User() {
    }

    public User(String fname, String lname, String password, String photo, String mail) {
        this.fname = fname;
        this.lname = lname;
        this.password = password;
        this.photo = photo;
        this.mail = mail;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", password='" + password + '\'' +
                ", photo='" + photo + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
