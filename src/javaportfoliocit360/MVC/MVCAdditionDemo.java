package javaportfoliocit360.MVC;

/**
 *
 * @author Gina Udy
 */

import java.util.Scanner;
import java.math.BigInteger;
 
class MVCAdditionDemo {
  public static void main(String[] args) {
    String number1, number2;
    Scanner in = new Scanner(System.in);
 
    System.out.println("Enter first whole number:");
    number1 = in.nextLine();
 
    System.out.println("Enter second whole number");
    number2 = in.nextLine();
 
    BigInteger first  = new BigInteger(number1);
    BigInteger second = new BigInteger(number2);
    BigInteger sum;
   
    sum = first.add(second);
       
    System.out.println("Result of addition = " + sum);
  }
} 