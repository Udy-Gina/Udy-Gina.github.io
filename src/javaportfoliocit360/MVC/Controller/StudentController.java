package javaportfoliocit360.MVC.Controller;

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

    public void setStudentIdNo(int idNo){
       model.setIdNo(idNo);		
    }

    public int getStudentIdNo(){
       return model.getIdNo();		
    }

    /*public static void saveStudent() throws Exception {
        FileWriter studentFile = new FileWriter("student.data");
        try (PrintWriter studentWriter = new PrintWriter(studentFile)) {
            //Student studentData = newStudent;
            //studentWriter.printf(newStudent.firstName, newStudent.lastName, newStudent.idNo);
        }
    }*/
    
  /*  
     public static void studentArrayList() {
        
        // Assign Student ArrayList 
        List<Student> aStudent = new ArrayList<>();
        
        // Add array items to the ArrayList
        aStudent.addAll(Arrays.asList(colorList1));
                
        // Print out original list items 
        System.out.println("A list of colors: ");
        for(int i =0; i<colors1.size(); i++) {
            System.out.printf("%s ", colors1.get(i));
            System.out.println();
    
    
    
    */
    
}