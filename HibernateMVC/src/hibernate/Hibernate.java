/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author Gina Udy
 */
public class Hibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Session s = connection.Controller.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();

        pojos.Birthyear st1 = new pojos.Birthyear();
        st1.setFirstName("Trisha");
        st1.setLastName("Yearwood");
        st1.setYoB(1964);

        s.save(st1);

        t.commit();
        
        System.out.println("Save successful!");
        System.out.println();

        pojos.Birthyear by = (pojos.Birthyear) s.load(pojos.Birthyear.class, 1111);
        System.out.println("First name: " + by.getFirstName());
        System.out.println("Last name: " + by.getLastName());
        System.out.println("Year of Birth: " + by.getYoB());
        
        s.close();
        t = null;
        
        StandardServiceRegistryBuilder.destroy(s.getSessionFactory().getSessionFactoryOptions().getServiceRegistry());
        
    }
    
}
