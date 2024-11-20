package io.codeforall;

import io.codeforall.fanstatics.Airports.Airport;
import io.codeforall.fanstatics.Airports.DomesticAirport;

import io.codeforall.fanstatics.Pilot;
import io.codeforall.fanstatics.Plane;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Sandbox {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        //PLANES
        Plane plane = new Plane();
        plane.setName("Pitts Special");
        plane.setWingType("DOUBLE WINGS");
        plane.setId(1);
        em.persist(plane);

        Plane plane1 = new Plane();
        plane1.setName("Cessna 174");
        plane1.setWingType("HIGH WINGS");
        plane1.setId(2);
        em.persist(plane1);

        Plane plane2 = new Plane();
        plane2.setName("Super Tucano");
        plane2.setWingType("MEDIUM WINGS");
        plane2.setId(3);
        em.persist(plane2);

        //AIRPORTS
        DomesticAirport domesticAirport1 = new DomesticAirport();
        domesticAirport1.setAirportName("JFK");
        domesticAirport1.setId(1);
        domesticAirport1.addPlane(plane);
        domesticAirport1.addPlane(plane1);
        em.persist(domesticAirport1);

        DomesticAirport domesticAirport2 = new DomesticAirport();
        domesticAirport2.setAirportName("Aeroporto Internacional de Cabo frio");
        domesticAirport2.setId(2);
        domesticAirport2.addPlane(plane);
        domesticAirport2.addPlane(plane2);
        em.persist(domesticAirport2);

        //PILOTS
        Pilot pilot1 = new Pilot();
        pilot1.setName("John");
        pilot1.setLicenseType("HIGH WINGS");
        pilot1.setId(2);
        pilot1.setPlanes(List.of(plane, plane1));
        pilot1.setDomesticAirport(domesticAirport2);
        em.persist(pilot1);

        Pilot pilot2 = new Pilot();
        pilot2.setName("Creg");
        pilot2.setLicenseType("DOUBLE WINGS");
        pilot2.setId(3);
        pilot2.setPlanes(List.of(plane2));
        pilot2.setDomesticAirport(domesticAirport1);
        em.persist(pilot2);

        Pilot pilot3 = new Pilot();
        pilot3.setName("Aida");
        pilot3.setLicenseType("MEDIUM WINGS");
        pilot3.setId(7);
        pilot3.setPlanes(List.of(plane2, plane, plane1));
        pilot3.setDomesticAirport(domesticAirport1);
        em.persist(pilot3);


        em.getTransaction().commit();
        em.close();
        emf.close();


/* QUERIES
SELECT * FROM planes WHERE domesticAirport_id = 1;

SELECT * FROM pilots WHERE id = (SELECT pilot_id FROM domestic_airport WHERE id = 3);

SELECT * FROM domestic_airport WHERE id = (SELECT domestic_airport_id FROM planes WHERE id = 1);

SELECT * FROM pilots WHERE id IN (SELECT pilot_id FROM pilot_plane WHERE plane_id = 1);

SELECT plane_name, domestic_airport_id FROM planes;

SELECT COUNT(*) FROM planes WHERE domestic_airport_id = 1;

SELECT * FROM planes WHERE domestic_airport_id IS NULL AND international_airport_id IS NULL;

 */


    }
}