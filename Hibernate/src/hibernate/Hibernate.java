/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.util.List;
import java.util.Scanner;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author Gina Udy
 */
public class Hibernate {

    public static void main(String[] args) { 
        
        // Start session 
        Session s = connection.Controller.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        
        // Have user enter an artist 
        pojos.Birthyear by1 = new pojos.Birthyear();
        
        // Create new scanner 
        Scanner systemInScanner = new Scanner(System.in);
        
        // Get first name
        System.out.printf("Enter the artist's first name:\n");
        String first = systemInScanner.nextLine();
            
        // Get last name 
        System.out.printf("Enter %s's last name:\n", first);
        String last = systemInScanner.nextLine();
        
        // Get YOB
        System.out.printf("Enter %s's four-digit birth year: \n", first);
        int yob = systemInScanner.nextInt();

        // Set artist data 
        by1.setFirstName(first);
        by1.setLastName(last);
        by1.setYoB(yob);
        
        // Save artist to database 
        s.save(by1);
        
        // Add artist "behind the scenes" 
        pojos.Birthyear by2 = new pojos.Birthyear();
        by2.setFirstName("Trisha");
        by2.setLastName("Yearwood");
        by2.setYoB(1964);

        // Save artist to database 
        s.save(by2);

        // Commit transaction
        t.commit();
        
        // Print "Save Successful!" message 
        System.out.println();
        System.out.println("Save successful!");
        System.out.println();
        
        // Print list of all artists in database
        pojos.Birthyear by3 = (pojos.Birthyear) s.load(pojos.Birthyear.class, 1111); 
        System.out.println();
        System.out.println(by3.getFirstName() + " " + by3.getLastName() + " was born in " + by3.getYoB() + ".");
        System.out.println();
        
        String HQL="from Birthyear"; 
        Query q=s.createQuery(HQL);
        
        List<pojos.Birthyear> list=q.list(); 
        
        System.out.println("List of all artists in the database:");
        System.out.println();
        for(pojos.Birthyear stu : list) {
            System.out.println(stu.getFirstName() + " " + stu.getLastName() + ", born: " + stu.getYoB());
        }
        System.out.println();
        System.out.println();
        
        // Close the session 
        s.close();
        t = null;
        
        StandardServiceRegistryBuilder.destroy(s.getSessionFactory().getSessionFactoryOptions().getServiceRegistry());
    }
}
