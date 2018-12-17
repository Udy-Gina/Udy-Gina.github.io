package javaportfoliocit360.ApplicationControllerPattern;

/**
 *
 * @author Gina Udy
 */

public class ACP_Sum implements ACP_Handler {
    
    /**
     *
     * @param num1
     * @param num2
     */
    @Override
    public void execute(Integer num1, Integer num2) {
        Integer sum = num1 + num2;
        System.out.println(num1 + " " + "+" + " " + num2 + " = " + sum);
    }

}
