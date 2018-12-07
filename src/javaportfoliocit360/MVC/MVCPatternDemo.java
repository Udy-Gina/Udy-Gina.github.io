package javaportfoliocit360.MVC;

import javaportfoliocit360.MVC.Controller.StudentController;
import javaportfoliocit360.MVC.Model.Student;
import javaportfoliocit360.MVC.View.StudentView;

/**
 *
 * @author Gina Udy
 */

public class MVCPatternDemo {
   
    public static void main(String[] args) throws Exception {

        // Create a view to enter new students 
        StudentView view = new StudentView();
        Student model = new Student(); 

        // Create Controller 
        StudentController controller = new StudentController(model, view);
        
        StudentView studentView = null; 
        
        studentView = new StudentView();
        studentView.displayStudentView();

    }
}