package io.codeforall;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Sandbox {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

// Open a new database connection by getting a new
// entity manager from the entity manager factory
        EntityManager em = emf.createEntityManager();

// Create a new entity Cadet cadet
        Cadet cadet = new Cadet();
        cadet.setId(1);
        cadet.setName("Cristiano");
        cadet.setAge(29);
       em.getTransaction().begin();
        em.persist(cadet);
        em.getTransaction().commit();


// Cl
        Address address = new Address();
        address.setZipcode(12345);
        address.setStreet("Main Street");
        address.setCity("New York");
        address.setState("NY");
        em.getTransaction().begin();
        em.persist(address);
        em.getTransaction().commit();



        em.close();

// Shutdown JPA
        emf.close();

    }

}
