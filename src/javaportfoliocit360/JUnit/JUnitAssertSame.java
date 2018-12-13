package javaportfoliocit360.JUnit;

/**
 *
 * @author Gina Udy
 */

public class JUnitAssertSame {
    
    // Testing AssertSame
    public int assertSameTest() {
        return 0;
    }
}


/*

public class SameOrEquals {
 
  BigDecimal b1 = new BigDecimal("1.0");
  BigDecimal b2 = new BigDecimal("1.0");
  BigDecimal b3 = b1;
 
  int i1 = 10;
  int i2 = 10;
 
  @Test
  public void BigDecimaltest() throws Exception {
    // if(b1 == b2)
    assertSame(b1, b2);    // THIS TEST WILL FAIL
 
    // b1.equals(b2)
    assertEquals(b1, b2);  // should pass
 
    // (b1 == b3)
    assertSame(b1, b3);    // will pass
 
    //(b1.equals(b3))
    assertEquals(b1, b3);  // will pass
  }
 
  @Test
  public void intTest() throws Exception {
    // if(i1 == i2)
    assertSame(i1, i2);    // will pass
 
    // if(i1 == i2)
    assertEquals(i1, i2);  // will pass
  }

*/