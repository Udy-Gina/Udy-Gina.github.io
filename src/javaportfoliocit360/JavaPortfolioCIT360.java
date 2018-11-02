/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaportfoliocit360;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Gina Udy
 */
public class JavaPortfolioCIT360 {
    
    //public static void main(String[] args) {
        // TODO code application logic here
      //  System.out.println("This is my Java Collections demo:"); 
    //}
 
    //public class FirstFunction {

    public static int multiply(int firstNum, int secondNum){
        return firstNum * secondNum;
    }	

    
    /* MULTIPLY EXAMPLE
    public static void main(String[] args) {
        int product = JavaPortfolioCIT360.multiply(3, 4);
    	System.out.printf("3 * 4 = %d\n",product);
    }*/
    
    
    /* SCANNER EXAMPLE
    public static void main(String[] args) throws Exception{
    	Scanner systemInScanner = new Scanner(System.in);
    	System.out.printf("enter an integer: ");
    	int firstInt = systemInScanner.nextInt();
    	System.out.printf("enter another integer: ");
    	int secondInt = systemInScanner.nextInt();
	    int product = JavaPortfolioCIT360.multiply(firstInt, secondInt);
    	System.out.printf("%d * %d = %d\n",firstInt, secondInt, product);
    }*/
    
    
    /* SAVING DATA EXAMPLE
    public static void main(String[] args) throws Exception{
    	Scanner systemInScanner = new Scanner(System.in);
    	System.out.printf("enter an integer: ");
    	int firstInt = systemInScanner.nextInt();
    	System.out.printf("enter another integer: ");
    	int secondInt = systemInScanner.nextInt();
	    JavaPortfolioCIT360.saveNumbers(firstInt,secondInt);
    }

    public static void saveNumbers(int aNumber, int anotherNumber) throws Exception{
    	PrintWriter fileWriter = new PrintWriter("user.data");
    	fileWriter.printf("%d %d",aNumber,anotherNumber);
        fileWriter.flush();
    }*/
    

    /* RETRIEVING DATA EXAMPLE */
    public static void main(String[] args) throws Exception{
        File userDataFile = new File("user.data");
        Scanner fileScanner = new Scanner(userDataFile);
        int firstNumber = JavaPortfolioCIT360.readNumber(fileScanner);
        int secondNumber = JavaPortfolioCIT360.readNumber(fileScanner);
        System.out.printf("%d * %d = %d\n",firstNumber,secondNumber,firstNumber * secondNumber);
        System.out.printf("%d + %d = %d\n",firstNumber,secondNumber,firstNumber + secondNumber);
        System.out.printf("%d - %d = %d\n",firstNumber,secondNumber,firstNumber - secondNumber);
    }

    public static int readNumber(Scanner fileScanner) throws Exception{
        int aNumber = fileScanner.nextInt();
        return aNumber;
    }
}