/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaportfoliocit360.JUnit;

import org.junit.Test;

/**
 *
 * @author Gina Udy
 */
public class JUnitTests {
    
    public JUnitTests() {
    }
    
    /***************************************************************************
                 Test of addNumbers method from Calculator.java file
    ****************************************************************************/
    
   @Test
    public void TestCalculator() {
    
    System.out.println("Testing addNumbers function:");
    System.out.println();
    System.out.println();
    
    /*****************
       Test Case #1  
    ******************/
    
    System.out.println("/tTest Case #1");
    
    Calculator testCalculator = new Calculator();
    
    String result = testCalculator.addNumbers();
    
    
}
    
    }


}



        
        System.out.println("\tTest Case #1");
        
        double diameter = -1.0; // input values for test case #1
        
        DangerControl instance = new DangerControl(); // create instance of DangerControl class
        
        double expResult = -1.0; // expected output returned value
        
        double result = instance.calcLightningSand(diameter); // call function to run test 
        
        assertEquals(expResult, result, 0.1); // compare expected return value with actual value returned