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
        plane.setId(1);

        em.getTransaction().begin();
        em.persist(plane);
        em.getTransaction().commit();


        DomesticAirport domesticAirport1 = new DomesticAirport();
        domesticAirport1.setAirportName("JFK");
        domesticAirport1.setId(3);

        em.getTransaction().begin();
        em.persist(domesticAirport1);
        em.getTransaction().commit();


        InternationalAirport internationalAirport = new InternationalAirport();
        internationalAirport.setAirportName("OPORTO");
        internationalAirport.setId(4);


        em.getTransaction().begin();
        em.persist(internationalAirport);
        em.getTransaction().commit();

        Pilot pilots = new Pilot();
        pilots.setName("John");

        pilots.setLicenseType("HIGH WINGS");
        pilots.setId(2);

        em.getTransaction().begin();
        em.persist(pilots);
        em.getTransaction().commit();


        em.close();
        emf.close();


/* QUERIES
SELECT * FROM planes WHERE domestic_airport_id = 1;

SELECT * FROM pilots WHERE id = (SELECT pilot_id FROM domestic_airport WHERE id = 3);

SELECT * FROM domestic_airport WHERE id = (SELECT domestic_airport_id FROM planes WHERE id = 1);

SELECT * FROM pilots WHERE id IN (SELECT pilot_id FROM pilot_plane WHERE plane_id = 1);

SELECT plane_name, domestic_airport_id FROM planes;

SELECT COUNT(*) FROM planes WHERE domestic_airport_id = 1;

SELECT * FROM planes WHERE domestic_airport_id IS NULL AND international_airport_id IS NULL;

 */


    }
}