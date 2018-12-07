package javaportfoliocit360.MVC.View;

import java.util.Scanner;
import javaportfoliocit360.MVC.Model.Student;
import static javaportfoliocit360.MVC.View.StudentView.newStudent;

/**
 *
 * @author Gina Udy
 */

public class StudentView {
    
    public void displayStudentView() throws Exception {
        
        Student newStudent = newStudent();
        System.out.println(newStudent);
        
        //StudentController.saveStudent(); 
        
        //displayStudents();
    }

    // Input new student name and ID number 
    public static Student newStudent() throws Exception {
        Scanner systemInScanner = new Scanner(System.in);
        System.out.printf("Enter the student's first name:\n");
        String firstName = systemInScanner.nextLine();
        System.out.printf("Enter %s's last name:\n", firstName);
        String lastName = systemInScanner.nextLine();
        System.out.printf("Enter %s's student 5-digit ID number:\n", firstName);
        int idNo = systemInScanner.nextInt();

        Student aStudent = new Student();
        aStudent.setFirstName(firstName);
        aStudent.setLastName(lastName);
        aStudent.setIdNo(idNo);
        
        return aStudent;
    }
    
    /* public static void displayStudents() {
        System.out.printf("\nIt works!\n");
    } */
}



//  NEED TO STORE STUDENT NAMES SOMEWHERE...SAVE TO FILE?  LATER, IT WILL SAVE TO DATASE (HIBERNATE)

    