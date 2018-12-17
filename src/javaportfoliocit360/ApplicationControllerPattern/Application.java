package javaportfoliocit360.ApplicationControllerPattern;

import java.util.Scanner;

/**
 *
 * @author Gina Udy
 */

public class Application {
    
    public static void main(String[] args) {
        ACP_Controller acpControl = new ACP_Controller();
        String add = "add";
        String sub = "sub";
        String mul = "mul";
        String div = "div";
        String zero = "zero";
        Integer num1;
        Integer num2;
        String command;
               
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num1 = Integer.parseInt(in.nextLine());
        System.out.println("Enter an operator (+, -, *, /, or ?): "); 
        command = in.nextLine();
        System.out.println("Enter another number: ");
        num2 = Integer.parseInt(in.nextLine());

        acpControl.handleCommand(command, num1, num2);
        
    }
}