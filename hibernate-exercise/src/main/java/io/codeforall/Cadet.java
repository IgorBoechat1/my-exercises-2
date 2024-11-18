package io.codeforall;

import javax.persistence.*;

@Entity
public class Cadet {

    @Id
    private Integer id;
    private String name;
    private Integer age;


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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Cadet saveOrUpdate(Cadet cadet) {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("test");
        EntityManager em = emf.createEntityManager();

        try {

            em.getTransaction().begin(); // open transaction
            Cadet savedCadet = em.merge(cadet);
            em.getTransaction().commit(); // close transaction
            return savedCadet;

        } catch (RollbackException ex) {

            // something went wrong, make sure db is consistent
            em.getTransaction().rollback();
            return null;

        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}