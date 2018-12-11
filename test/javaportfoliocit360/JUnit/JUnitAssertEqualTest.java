/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaportfoliocit360.JUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gina Udy
 */
public class JUnitAssertEqualTest {
    
    public JUnitAssertEqualTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /***************************************************************************
    * Test of assertEquals method, of class JUnitAssertEquals.                *
    ***************************************************************************/
    
    // Test with the correct parameters
    @Test
    public void testAssertEqualsTest1() throws Exception {
        System.out.println("add");
        String s1 = "2";
        String s2 = "3";
        JUnitAssertEquals instance = new JUnitAssertEquals();
        int expResult = 5;
        int result = instance.assertEqualsTest(s1, s2);
        assertEquals(expResult, result);
    }
    
    // Test with wrong sum 
    @Test
    public void testAssertEqualsTest2() throws Exception {
        System.out.println("add");
        String s1 = "2";
        String s2 = "3";
        JUnitAssertEquals instance = new JUnitAssertEquals();
        int expResult = 6;
        int result = instance.assertEqualsTest(s1, s2);
        assertEquals(expResult, result);
    }
    
    // Test with string instead of int
    @Test
    public void testAssertEqualsTest3() throws Exception {
        System.out.println("add");
        String s1 = "word";
        String s2 = "3";
        JUnitAssertEquals instance = new JUnitAssertEquals();
        int expResult = 5;
        int result = instance.assertEqualsTest(s1, s2);
        assertEquals(expResult, result);
    }
    
    // Test with dec instead of int
    @Test
    public void testAssertEqualsTest4() throws Exception {
        System.out.println("add");
        String s1 = "4.2";
        String s2 = "3";
        JUnitAssertEquals instance = new JUnitAssertEquals();
        int expResult = 7;
        int result = instance.assertEqualsTest(s1, s2);
        assertEquals(expResult, result);
    }
}
