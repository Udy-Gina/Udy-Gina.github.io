/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaportfoliocit360.JavaCollections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gina Udy
 */

public class JavaCollections {
    
// Need to do: List, Set, Map, Queue, and Tree !!!
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This is my Java Collections demo.");
        System.out.println();
        System.out.println();
        buildArrayList();
    }

    public static void buildArrayList() {
        System.out.println("ARRAY LIST:");
        System.out.println();
        
        // Assign colors to array 
        String[] colors = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
        List<String> rainbow = new ArrayList<>();
                
        // Add array items to the ArrayList
        for(String a: colors)
            rainbow.add(a);
                
        // Print out original list items 
        System.out.println("There are seven colors in a rainbow, and they are: ");
        for(int i =0; i<rainbow.size(); i++) {
            System.out.printf("%s ", rainbow.get(i));
            System.out.println();
        }
        System.out.println();
                
        // Assign colors to array 
        String[] colorList = {"black", "gray", "white", "magenta", "aqua", "burnt umber", "brown sienna", "peach", "carnation pink", "and so on..."};
        
        // Add additional array items to original ArrayList
        for(String b: colorList)
            rainbow.add(b);
        
        System.out.println("A box of crayons, however, has many many more colors than that!");
        for(int i =0; i<rainbow.size(); i++) {
            System.out.printf("%s ", rainbow.get(i));
            System.out.println();
        }    
        System.out.println();
    }
    
}


// Need to do: List, Set, Map, Queue, and Tree !!!
