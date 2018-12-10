/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaportfoliocit360.JUnit;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Gina Udy
 */
class Calculator {

    public static void main(String[] args) {
        addNumbers();
    }
        
    public static void addNumbers() {    
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

        System.out.println(first + " + " + second + " = " + sum);
  }
}
