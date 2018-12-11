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
public class JUnitAssertArrayEqualsTest {
    
    public JUnitAssertArrayEqualsTest() {
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
    * Test of assertArrayEquals method, of class JUnitAssertArrayEquals.           *
    ***************************************************************************/
    
    // Test with the correct parameters 
    @Test
    public void testAssertArrayEqualsTest1() {
        System.out.println("alphabetize");
        JUnitAssertArrayEquals instance = new JUnitAssertArrayEquals();
        instance.assertArrayEqualsTest();
        
        //assume that the below array represents expected result
        String[] expectedOutput = {"mace", "made", "mage", "make", "male", "mane", "mare", "max", "maybe", "maze"};
        //assuem that the below array is returned from the method 
        //to be tested.
        String[] methodOutput = {"mace", "made", "mage", "make", "male", "mane", "mare", "max", "maybe", "maze"};
        assertArrayEquals(expectedOutput, methodOutput);
    }
    
    // Test with the items out of order 
    @Test
    public void testAssertArrayEqualsTest2() {
        System.out.println("alphabetize");
        JUnitAssertArrayEquals instance = new JUnitAssertArrayEquals();
        instance.assertArrayEqualsTest();
        
        //assume that the below array represents expected result
        String[] expectedOutput = {"mace", "made", "mage", "make", "male", "mane", "mare", "max", "maybe", "maze"};
        //assuem that the below array is returned from the method 
        //to be tested.
        String[] methodOutput = {"mace", "made", "mage", "make", "maze", "male", "mane", "mare", "max", "maybe"};
        assertArrayEquals(expectedOutput, methodOutput);
    }

    // Test with ints instead of strings
    @Test
    public void testAssertArrayEqualsTest3() {
        System.out.println("alphabetize");
        JUnitAssertArrayEquals instance = new JUnitAssertArrayEquals();
        instance.assertArrayEqualsTest();
        
        //assume that the below array represents expected result
        String[] expectedOutput = {"mace", "made", "mage", "make", "male", "mane", "mare", "max", "maybe", "maze"};
        //assuem that the below array is returned from the method 
        //to be tested.
        String[] methodOutput = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        assertArrayEquals(expectedOutput, methodOutput);
    }
    
    // Test with not the right amount of indexes
    @Test
    public void testAssertArrayEqualsTest4() {
        System.out.println("alphabetize");
        JUnitAssertArrayEquals instance = new JUnitAssertArrayEquals();
        instance.assertArrayEqualsTest();
        
        //assume that the below array represents expected result
        String[] expectedOutput = {"mace", "made", "mage", "make", "male", "mane", "mare", "max", "maybe", "maze"};
        //assuem that the below array is returned from the method 
        //to be tested.
        String[] methodOutput = {"mace", "made", "mage", "make", "male", "mane", "mare", "max", "maybe"};
        assertArrayEquals(expectedOutput, methodOutput);
    }
}