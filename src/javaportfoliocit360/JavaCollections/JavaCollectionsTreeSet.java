package javaportfoliocit360.JavaCollections;

import java.util.Iterator;

/**
 *
 * @author Gina Udy
 */
public class JavaCollectionsTreeSet {
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("*   This is my Java Collections TreeSet Demo      *");
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
        System.out.println();
        buildTreeSet();
    }
    
    public static void buildTreeSet() {
        
        // Create new TreeSet
        java.util.TreeSet<String> colors4 = new java.util.TreeSet<>(); 
  
        // Elements are added using add() method 
        colors4.add("red");
        colors4.add("orange");
        colors4.add("yellow");
        colors4.add("green");
        colors4.add("blue");
        colors4.add("indigo");
        colors4.add("violet");
        colors4.add("black");
        colors4.add("white");
        colors4.add("pink");
        colors4.add("burnt sienna");
        colors4.add("brown umber");
        colors4.add("magenta");
        colors4.add("peach");
        colors4.add("aqua");
          
        // Attempt to add duplicate colors
        colors4.add("blue"); 
        colors4.add("red"); 
        colors4.add("orange"); 
  
        // Create an Iterator over the TreeSet 
        Iterator<String> iterator = colors4.iterator(); 
  
        // Print out sorted list items with no duplicates
        System.out.print("A sorted list of colors with duplicates not added: "); 
        System.out.println();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()); 
            System.out.println(); 
        }
        System.out.println();
    }
}
