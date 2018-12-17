package javaportfoliocit360.ApplicationControllerPattern;

/**
 *
 * @author Gina Udy
 */

public class ACP_Divide implements ACP_Handler {

    /**
     *
     * @param num1
     * @param num2
     */
    @Override
    public void execute(Integer num1, Integer num2) {
        Integer quotient = num1 / num2;
        System.out.println(num1 + " " + "/" + " " + num2 + " = " + quotient);
    }
}
