package javaportfoliocit360.ApplicationControllerPattern;

/**
 *
 * @author Gina Udy
 */

public class ACP_Zero implements ACP_Handler { 
    
    /**
     *
     * @param num1
     * @param num2
     */
    @Override
    public void execute(Integer num1, Integer num2) {
        System.out.println("Your numbers are " + num1 + " and " + num2 + ".");
    }
}
