/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaportfoliocit360.JavaCollections;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Gina Udy
 */
public class JavaCollectionsLinkedList {
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("*   This is my Java Collections LinkedList demo   *");
        System.out.println("***************************************************");
        System.out.println();
        buildLinkedList();
    }

        
    public static void buildLinkedList() {
        
        // Creating object of class linked list 
    LinkedList<String> colors4 = new LinkedList<>();
  
        // Elements are added using add() method 
        colors4.add("red");
        colors4.add("orange");
        colors4.add("yellow");
        colors4.add("green");
        colors4.add("blue");
        colors4.add(2, "indigo");
        colors4.add("violet");
        colors4.add("black");
        colors4.add("white");
        colors4.add("pink");
        colors4.add("burnt sienna");
        colors4.add("brown umber");
        colors4.add("magenta");
        colors4.add("peach");
        colors4.add("aqua");
        
        // Create an Iterator over the LinkedList
        ListIterator i = colors4.listIterator(); 
  
        // Print out LinkedList
        System.out.println("The LinkedList is: "); 
        while(i.hasNext()) { 
           System.out.println(i.next()); 
        } 
        System.out.println(); 
        
        // Removing elements from the LinkedList 
        colors4.remove("magenta"); 
        colors4.remove(5); 
        colors4.removeFirst(); 
        colors4.removeLast(); 
        
        // Create an Iterator over the LinkedList
        ListIterator x = colors4.listIterator(); 
        
        // Print out updated LinkedList
        System.out.println("The LinkedList after the deletions is: "); 
        while(x.hasNext()) { 
           System.out.println(x.next()); 
        }
        System.out.println();
                 
        // Finding elements in the LinkedList 
        boolean status = colors4.contains("magenta"); 
  
        if(status) 
            System.out.println("List contains the color 'magenta'."); 
        else
            System.out.println("List doesn't contain the element 'magenta'."); 
  
        // Number of elements in the LinkedList 
        System.out.println();
        int size = colors4.size(); 
        System.out.println("The size of the LinkedList is: " + size); 
        System.out.println();
  
        // Get and set elements from the LinkedList 
        Object element = colors4.get(2); 
        System.out.println("Element returned by get(): " + element); 
        System.out.println();
        
        // Change index #2 to read 'CHANGED INDEX'
        colors4.set(2, "CHANGED INDEX"); 
        
        // Create an Iterator over the LinkedList
        ListIterator y = colors4.listIterator(); 
        
        // Print out updated LinkedList
        System.out.println("The LinkedList after the change is: "); 
        while(y.hasNext()) { 
           System.out.println(y.next()); 
        }
        System.out.println();
    }
}