package javaportfoliocit360.JUnit;

import java.util.Scanner;

/**
 *
 * @author Gina Udy
 */

public class JUnitAssertArrayEquals {
    
    // Testing ArrayEquals  
    public void assertArrayEqualsTest() {
        String a[] = {"mace", "made", "mage", "make", "male", "mane", "mare", "max", "maybe", "maze"};

        // Add scanner 
        Scanner s = new Scanner(System.in);
        String[] array = new String[10];

        // Print out request 
        System.out.println("Please put the following words in alphabetical order: ");
        System.out.println("mane, male, max, make, maze, made, maybe, mace, mage, mare");

        for (int i = 0; i < 0;) {
            array[i] = s.nextLine();
        }

        System.out.println(a[0]);
        System.out.println(array[0]);
    }
}