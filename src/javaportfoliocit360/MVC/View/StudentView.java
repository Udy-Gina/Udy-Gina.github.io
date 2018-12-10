package javaportfoliocit360.MVC.View;

import java.util.Scanner;
import javaportfoliocit360.MVC.Controller.StudentController;
import javaportfoliocit360.MVC.Model.Student;

/**
 *
 * @author Gina Udy
 */

public class StudentView {
    
    public void StudentView() throws Exception {
        
        // Create new instance of Student 
        Student studentData = new Student();
        
        // Send new Student to newStudent() for input from user 
        newStudent(studentData);
        
        // Send input from user to the controller to be saved in a file  
        StudentController.saveStudent(studentData);
    }

    public static Student newStudent(Student studentData) throws Exception {
        
        // Add scanner 
        Scanner systemInScanner = new Scanner(System.in);
        
        // Get first name
        System.out.printf("Enter the student's first name:\n");
        String first = systemInScanner.nextLine();
            
        // Get last name 
        System.out.printf("Enter %s's last name:\n", first);
        String last = systemInScanner.nextLine();
        
        // Get id#
        System.out.printf("Enter %s's student 5-digit ID number:\n", first);
        long id = systemInScanner.nextLong();

        // Set student data 
        studentData.setFirstName(first);
        studentData.setLastName(last);
        studentData.setIdNo(id);
        
        // Return student data to view 
        return studentData;
    }
}    