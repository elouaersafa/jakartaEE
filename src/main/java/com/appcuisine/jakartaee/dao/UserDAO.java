package com.appcuisine.jakartaee.dao;

import com.appcuisine.jakartaee.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


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


    public User loginUser(User newuser) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("appcuisine");
        EntityManager em = null;
        User resultatuser = null;
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();
            TypedQuery<User> query = em.createQuery("SELECT u FROM User u WHERE u.mail = :mail AND u.password = :password", User.class);
            query.setParameter("mail",newuser.getMail());
            query.setParameter("password",newuser.getPassword());
            resultatuser = query.getSingleResult();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        emf.close();


        return resultatuser;
    }




}
