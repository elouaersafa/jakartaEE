package com.appcuisine.jakartaee.dao;


import com.appcuisine.jakartaee.entities.Recipe;

import javax.persistence.*;
import java.util.List;

public class RecipeDAO {

    /*
        public void create(Recipe recipe) {
            EntityManager em = null;
            EntityTransaction tx = null;
            try {
                em = emf.createEntityManager();
                tx = em.getTransaction();
                tx.begin();

                em.persist(recipe);

                tx.commit();
            } catch (Exception ex) {
                ex.printStackTrace();
                if (tx != null && tx.isActive()) {
                    tx.rollback();
                }
            } finally {
                if (em != null) {
                    em.close();
                }
            }
        }

        public Recipe findById(Integer id) {
            Recipe recipe = null;
            EntityManager em = null;
            EntityTransaction tx = null;
            try {
                em = emf.createEntityManager();
                tx = em.getTransaction();
                tx.begin();

                recipe = em.find(Recipe.class, id);

                tx.commit();

                em.close();
            } catch (Exception ex) {
                ex.printStackTrace();
                if (tx != null && tx.isActive()) {
                    tx.rollback();
                }
            } finally {
                if (em != null) {
                    em.close();
                }
            }
            return recipe;
        }

    */
    public List<Recipe> findAll() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("appcuisine");
        EntityManager em = null;
        List recipeList = null;
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();
            TypedQuery<Recipe> query = em.createQuery("SELECT r FROM Recipe r", Recipe.class);
            recipeList = query.getResultList();
            System.out.println(recipeList);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        emf.close();
        return recipeList;

    }
}
    /*

    public List<Recipe> findRecipeCooked() {
        List<Recipe> recipes = null;
        EntityManager em = null;
        EntityTransaction tx = null;
        try {
            em = emf.createEntityManager();
            tx = em.getTransaction();
            tx.begin();

            Query q = em.createNativeQuery("SELECT * FROM Recipe recipe WHERE dateCook IS NULL OR dateCook < DATE_SUB(NOW(), INTERVAL 6 DAY)", Recipe.class);

            recipes = q.getResultList();

            tx.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return recipes;
    }

    public List<Recipe> findHistoricRecipeCooked() {
        List<Recipe> recipes = null;
        EntityManager em = null;
        EntityTransaction tx = null;
        try {
            em = emf.createEntityManager();
            tx = em.getTransaction();
            tx.begin();

            Query q = em.createNativeQuery("SELECT * FROM Recipe recipe WHERE dateCook IS NOT NULL", Recipe.class);

            recipes = q.getResultList();

            tx.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return recipes;
    }

    public List<Recipe> findByKeywords() {
        List<Recipe> recipes = null;
        EntityManager em = null;
        EntityTransaction tx = null;
        try {
            em = emf.createEntityManager();
            tx = em.getTransaction();
            tx.begin();

            Query q = em.createNativeQuery("SELECT * FROM  recipe WHERE name LIKE CONCAT('%', :keywords, '%') ", Recipe.class);

            recipes = q.getResultList();

            tx.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return recipes;
    }

    public List<Recipe> findByCategoryAndMealType() {
        List<Recipe> recipes = null;
        EntityManager em = null;
        EntityTransaction tx = null;
        try {
            em = emf.createEntityManager();
            tx = em.getTransaction();
            tx.begin();

            Query q = em.createNativeQuery("SELECT * FROM Recipe recipe WHERE category=:category AND mealType=:mealType ", Recipe.class);

            recipes = q.getResultList();

            tx.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return recipes;
    }
}

*/