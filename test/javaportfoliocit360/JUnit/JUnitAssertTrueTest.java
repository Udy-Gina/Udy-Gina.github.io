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

public class JUnitAssertTrueTest {
    
    public JUnitAssertTrueTest() {
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

    /**
     * Test of assertTrueTest method, of class JUnitAssertTrue.
     */
    @Test
    public void testAssertTrueTest() {
        System.out.println("assertTrueTest");
        JUnitAssertTrue instance = new JUnitAssertTrue();
        instance.assertTrueTest();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
