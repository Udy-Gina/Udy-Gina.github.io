package javaportfoliocit360.JavaCollections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Gina Udy
 */
public class JavaCollectionsTreeMap {
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("*    This is my Java Collections TreeMap demo     *");
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
        System.out.println();
        buildTreeMap();
    }    
        
    public static void buildTreeMap() {
        TreeMap<Float, String> heatScores = new TreeMap<>(); 
        
        // Nothing has been "put" into TreeMap yet 
        print(heatScores); 
        
        System.out.println();
        
        // Fill TreeMap with key/value pairs 
        heatScores.put(1.2f, "John"); 
        heatScores.put(2.0f, "Frank"); 
        heatScores.put(2.3f, "William"); 
        heatScores.put(2.1f, "Jim"); 
        heatScores.put(1.1f, "Joey"); 
        heatScores.put(1.5f, "Jeff"); 
        heatScores.put(1.9f, "Sam"); 
        heatScores.put(2.9f, "Joel"); 
        heatScores.put(3.2f, "Rick"); 
        heatScores.put(3.9f, "Mike"); 
        heatScores.put(4.0f, "Ben"); 
        heatScores.put(3.3f, "Marty"); 
        heatScores.put(1.0f, "Hank"); 
          
        // Print the number of entries in the TreeMap
        System.out.println("There are " + heatScores.size() + " entries in the TreeMap."); 
        System.out.println();
      
        // Find a specific key/value pair in the TreeMap
        if (heatScores.containsKey(2.0f))  
        { 
            String a = heatScores.get(2.0f); 
            System.out.println("The value for key \"2.0\" is: " + a); 
        } 
               
        // Print the entire list of TreeMap entries using an iterator 
        System.out.println();
        System.out.println();
        Set set = heatScores.entrySet();
        Iterator iterator = set.iterator();
        System.out.println("The times of all race participants are: ");
        System.out.println();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print(mentry.getKey() + ": ");
            System.out.println(mentry.getValue());
        }
        System.out.println();
        
        // Use lastKey() and firstKey() utilities 
        System.out.println("The highest race time is: " + heatScores.lastKey());
        System.out.println("The lowest race time is: " + heatScores.firstKey());
        System.out.println("The person who took last place is: " + heatScores.lastEntry());
        System.out.println("The winner of the race is: " + heatScores.firstEntry());
        
        System.out.println();
        
        // Clear the TreeMap
        heatScores.clear(); 
        
        // Print the empty TreeMap 
        print(heatScores); 
        System.out.println();
        
        
        
    }
    
    public static void print(Map<Float, String> heatScores)  
    { 
        if (heatScores.isEmpty())  
        { 
            System.out.println("The TreeMap is empty."); 
        } 
          
        else
        { 
            System.out.println(heatScores); 
        } 
    } 
}
