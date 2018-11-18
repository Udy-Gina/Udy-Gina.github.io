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
        System.out.println("*   This is my Java Collections ArrayList demo    *");
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
        System.out.println();
        buildArrayList();
    }

    public static void buildArrayList() {
        
        // Assign colors to ArrayList 
        String[] colorList1 = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
        List<String> colors1 = new ArrayList<>();
                
        // Add array items to the ArrayList
        colors1.addAll(Arrays.asList(colorList1));
                
        // Print out original list items 
        System.out.println("A list of colors: ");
        for(int i =0; i<colors1.size(); i++) {
            System.out.printf("%s ", colors1.get(i));
            System.out.println();
        }
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
                
        /**********************************************************************/
        
        // Assign colors to ArrayList 
        String[] colorList2 = {"black", "red", "yellow", "green", "gray", "white", "magenta", "aqua", "burnt umber", "brown sienna", "peach", "carnation pink", "violet"};
        List<String> colors2 = new ArrayList<>();
        
        // Add array items to the ArrayList
        colors2.addAll(Arrays.asList(colorList2));
        
        // Print out original list items 
        System.out.println("Another list of colors: ");
        for(int i =0; i<colors2.size(); i++) {
            System.out.printf("%s ", colors2.get(i));
            System.out.println();
        }
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        
        /**********************************************************************/
        
        // Add the new ArrayList to original ArrayList
        colors1.addAll(Arrays.asList(colorList2));
        
        System.out.println("The two lists of colors combined: ");
        for(int i =0; i<colors1.size(); i++) {
            System.out.printf("%s ", colors1.get(i));
            System.out.println();
        }    
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
    
        
        // Assign colors to ArrayList 
        ArrayList<String> colors3 = new ArrayList<>();
        colors3.add("red");
        colors3.add("orange");
        colors3.add("yellow");
        colors3.add("aqua");
        colors3.add("green");
        colors3.add("brown umber");
        colors3.add("blue");
        colors3.add("indigo");
        colors3.add("orange");
        colors3.add("violet");
        colors3.add("red");
        colors3.add("black");
        colors3.add("white");
        colors3.add("pink");
        colors3.add("burnt sienna");
        colors3.add("red");
        colors3.add("brown umber");
        colors3.add("magenta");
        colors3.add("orange");
        colors3.add("peach");
        colors3.add("aqua");
        
        colors3.sort(null);
        
        // Print out sorted list items 
        System.out.println("A sorted list of colors (with some duplicates): ");
        for (int x = 0; x < colors3.size(); ++x) {
            System.out.print(colors3.get(x) + " ");
            System.out.println();
        }
        System.out.println();
    }
}