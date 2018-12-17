package javaportfoliocit360.ApplicationControllerPattern;

/**
 *
 * @author Gina Udy
 */

public class ACP_Multiply implements ACP_Handler {
    
    /**
     *
     * @param num1
     * @param num2
     */
    @Override
    public void execute(Integer num1, Integer num2) {
        Integer product = num1 * num2;
        System.out.println(num1 + " " + "*" + " " + num2 + " = " + product);
    }
}
