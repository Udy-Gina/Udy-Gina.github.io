/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaportfoliocit360.JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Gina Udy
 */

public class JavaCollectionsArrayList {
    
// Need to do: List, Set, Map, Queue, and Tree !!!
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("*   This is my Java Collections ARRAY LIST demo   *");
        System.out.println("***************************************************");
        System.out.println();
        buildArrayList();
        buildSet();
        buildMap();
        buildQueue();
        buildTree();
    }

    public static void buildArrayList() {
        
        // Assign colors to array 
        String[] colors = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
        List<String> rainbow = new ArrayList<>();
                
        // Add array items to the ArrayList
        rainbow.addAll(Arrays.asList(colors));
                
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
        rainbow.addAll(Arrays.asList(colorList));
        
        System.out.println("A box of crayons, however, has many many more colors than that!");
        for(int i =0; i<rainbow.size(); i++) {
            System.out.printf("%s ", rainbow.get(i));
            System.out.println();
        }    
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
    }
    
    
    
    
    
    public static void buildSet() {
        System.out.println("SET:");
        System.out.println();
        
        
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
    }
    
    
    public static void buildMap() {
        System.out.println("MAP:");
        System.out.println();
        
        
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
    }
    
    
    public static void buildQueue() {
        System.out.println("QUEUE:");
        System.out.println();
        
        
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
    }
    
    
    public static void buildTree() {
        System.out.println("TREE:");
        System.out.println();
    }
}


// Need to do: List, Set, Map, Queue, and Tree !!!
