package javaportfoliocit360.ApplicationControllerPattern;

import java.util.HashMap;

/**
 *
 * @author Gina Udy
 */

public class ACP_Controller {
    
    public static HashMap<String, ACP_Handler> hashMapOfOperation = new HashMap<String, ACP_Handler>();

    public  ACP_Controller() {
    }

    public  void handleCommand(String command, Integer num1, Integer num2) {

        hashMapOfOperation.put("+",  new ACP_Sum());
        hashMapOfOperation.put("-",  new ACP_Subtract());
        hashMapOfOperation.put("*", new ACP_Multiply());
        hashMapOfOperation.put("/", new ACP_Divide());
        hashMapOfOperation.put("?", new ACP_Zero());

        ACP_Handler handler = hashMapOfOperation.get(command);

        handler.execute(num1, num2);
    }
}