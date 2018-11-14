/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaportfoliocit360.JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        System.out.println("*  This is my Java Collections LINKED LIST demo   *");
        System.out.println("***************************************************");
        System.out.println();
        buildLinkedList();
    }

        
    public static void buildLinkedList() {
        // Assign colors to array 
        String[] colors = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
        List<String> rainbow = new ArrayList<>();
                
        // Add array items to the ArrayList
        rainbow.addAll(Arrays.asList(colors));
        
        // Assign colors to array 
        String[] colorList = {"black", "gray", "white", "magenta", "aqua", "rose", "teal", "peach", "pink", "sage", "azure", "lavender"};
        List<String> moreColors = new ArrayList<>();
        
        // Add array items to the ArrayList
        moreColors.addAll(Arrays.asList(colorList));
        
        // Combine both lists 
        rainbow.addAll(moreColors);
        
        //create methods
        printList(rainbow);
        removeColors(rainbow, 2,7);
        printList(rainbow);
        reverseList(rainbow);
    }
        
    //printMe method
    private static void printList(List<String> l) {
        for(String temp : l)
            System.out.printf("%s ", temp);
            System.out.println();
    }

    //removeStuff method
    private static void removeColors(List<String> l, int from, int to) {
        l.subList(from, to).clear();
    }

    //reverseMe method
    private static void reverseList(List<String> l) {
        ListIterator<String> it = l.listIterator(l.size());
        while(it.hasPrevious())
            System.out.printf("%s ", it.previous());
            System.out.println();
    }
}
