/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaportfoliocit360.JUnit;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

/**
 *
 * @author Gina Udy
 */
public class JSONJunitAssertTests {
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("JUNIT Test Examples:"); 
    }
   
    @Test
    public void myTestMethod(){
        /**
         * we are demonstrating the usage of assertArrayEquals()
         * method here, so we are preparing input data here itself.
         * In real scenario, we will consider the methods returned 
         * value which suppose to be test, as a input. 
         */
        //assume that the below array represents expected result
        String[] expectedOutput = {"apple", "mango", "grape"};
        //assume that the below array is returned from the method 
        //to be tested.
        String[] methodOutput = {"apple", "pineapple", "grape"};
        assertArrayEquals(expectedOutput, methodOutput);
    }
}