package com.appcuisine.jakartaee.dao;

import com.appcuisine.jakartaee.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class UserDAO {


    public void registerUser(User newuser) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("appcuisine");
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(newuser);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        emf.close();
    }

}
