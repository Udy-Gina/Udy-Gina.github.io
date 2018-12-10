package javaportfoliocit360.MVC.Controller;

import java.io.FileWriter;
import java.io.PrintWriter;
import javaportfoliocit360.MVC.Model.Student;
import javaportfoliocit360.MVC.View.StudentView;

/**
 *
 * @author Gina Udy
 */ 

public class StudentController {

    private Student model;
    private StudentView view;
    
    public StudentController(Student model, StudentView view){
       this.model = model;
       this.view = view;
    }

    public void setStudentFirstName(String firstName){
       model.setFirstName(firstName);		
    }

    public String getStudentFirstName(){
       return model.getFirstName();		
    }

    public void setStudentLastName(String lastName){
       model.setLastName(lastName);		
    }

    public String getStudentLastName(){
       return model.getLastName();		
    }

    public void setStudentIdNo(long idNo){
       model.setIdNo(idNo);		
    }

    public long getStudentIdNo(){
       return model.getIdNo();		
    }

    /**
     *
     * @param studentData
     */
    public static void saveStudent(Student studentData) {
        System.out.println(studentData);
    }
    
    // UPDATE THIS SO IT SAVES THE NEW STUDENT DATA TO A FILE AND PRINTS FULL LIST TO VIEW 
    
    /* public static void saveStudent(Student newStudent) throws Exception {
        FileWriter studentFile = new FileWriter("student.data");
        try (PrintWriter studentWriter = new PrintWriter(studentFile)) {
            //Student studentData = newStudent;
            //studentWriter.printf(newStudent.firstName, newStudent.lastName, newStudent.idNo);
        }
    } */
}