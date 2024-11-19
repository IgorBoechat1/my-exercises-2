package io.codeforall;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Sandbox {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");

// Open a new database connection by getting a new
// entity manager from the entity manager factory
        EntityManager em = emf.createEntityManager();

// Create a new entity Cadet cadet
        Plane plane = new Plane();
        plane.setName("Boeing");
        plane.setWingType("HIGH WINGS");

        em.getTransaction().begin();
        em.persist(plane);
        em.getTransaction().commit();


        Pilots pilots = new Pilots();
        pilots.setName("John");

        em.getTransaction().begin();
        em.persist(pilots);
        em.getTransaction().commit();


        em.close();
        emf.close();


    }
}