package io.codeforall;

import io.codeforall.fanstatics.Airports.Airport;
import io.codeforall.fanstatics.Airports.DomesticAirport;
import io.codeforall.fanstatics.Airports.InternationalAirport;
import io.codeforall.fanstatics.Pilot;
import io.codeforall.fanstatics.Plane;

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


        DomesticAirport domesticAirport1 = new DomesticAirport();
        domesticAirport1.setAirportName("JFK");

        em.getTransaction().begin();
        em.persist(domesticAirport1);
        em.getTransaction().commit();


        InternationalAirport internationalAirport = new InternationalAirport();
        internationalAirport.setAirportName("OPORTO");

        em.getTransaction().begin();
        em.persist(internationalAirport);
        em.getTransaction().commit();

        Pilot pilots = new Pilot();
        pilots.setName("John");
        pilots.setLicenseType("HIGH WINGS");

        em.getTransaction().begin();
        em.persist(pilots);
        em.getTransaction().commit();


        em.close();
        emf.close();


    }
}