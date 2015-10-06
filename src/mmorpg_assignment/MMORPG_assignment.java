/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmorpg_assignment;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author gover_000
 */
public class MMORPG_assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MMORPG_assignmentPU");
//        EntityManager em = emf.createEntityManager();
//        
//        em.getTransaction().begin();
//        Users checkUser = em.find(Users.class, "Wolfer255");
//
//        if (checkUser != null) {
//            System.out.println("User already exists");
//        }
//        else {
//            System.out.println("User doesn't exist");
//            Users newUser = new Users("Wolfer255", 50, "Luuk", "Tito", "TestIban", new Date(), 5, "Emperor1", Boolean.FALSE, 5);
//            em.persist(newUser);
//        }
//        List usernameList = em.createNamedQuery("Users.findByUserName").setParameter("userName", "Wolfer255").getResultList();
//        if (usernameList.size() > 0) {
//            System.out.println("User already exists");
//        }
//        else {
//            System.out.println("User doesn't exist");
//            Users newUser = new Users("Wolfer255", 50, "Luuk", "Tito", "TestIban", new Date(), 5, "Emperor 1", Boolean.FALSE, 5);
//            em.persist(newUser);
//        }
//        em.getTransaction().commit();
//        em.close();
//        emf.close();
    }
    

    public static void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MMORPG_assignmentPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
//        em.createNativeQuery(null).executeUpdate();
        try {
            
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
}
