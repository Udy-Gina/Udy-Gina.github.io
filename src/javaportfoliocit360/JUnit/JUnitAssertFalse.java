package javaportfoliocit360.JUnit;

import org.junit.*;
import static org.junit.Assert.*;
import junit.framework.TestCase.*;
import static org.junit.Assert.assertFalse;

/**
 *
 * @author Gina Udy
 */

public class JUnitAssertFalse {
    
    /**
     *
     */
    
    
    // Testing AssertFalse 
    @Test
    public void assertFalseTest() {
        int int1 = 10; 
        int int2 = 10; 
        
        // Are not equal...should pass
        assertFalse(int1 == int2);
    }
}