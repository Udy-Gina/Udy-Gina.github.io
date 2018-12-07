package javaportfoliocit360.JavaCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Gina Udy
 */
public class JavaCollectionsHashMap {
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("*    This is my Java Collections HashMap demo     *");
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
        System.out.println();
        buildHashMap();
    }
    
    public static void buildHashMap() {
        
        HashMap<String, String> zodiac = new HashMap<>(); 
        
        // Nothing has been "put" into HashMap yet 
        print(zodiac); 
        
        System.out.println();
        
        // Fill HashMap with key/value pairs 
        zodiac.put("Aries", "The zodioc mastcot for Aries is a ram.  Some people confuse that with a sheep or goat, but rams are way cooler.  They are the Princess Leias of the animal kingdom.  It's a fact...they have the cinnamon bun horns to prove it."); 
        zodiac.put("Taurus", "Taurus means 'bull', but this horiscope is no bull.  You are a person who sometimes has many thoughts.  Something will happen to you today...could be big, could be small.  You'll just have to wait and see.  Of course, if nothing happens, it might happen tomorrow instead.  Again, you'll just have to wait and see."); 
        zodiac.put("Gemini", "Even though Gemini means 'twins' you are probably not one.  You could be, but probably aren't.  After all, most people aren't."); 
        zodiac.put("Cancer", "Your zodiac mascot is a crab.  The best advice anyone could give you is to NOT be a Cancer.  Nobody likes crabby people."); 
        zodiac.put("Leo", "It's possible you are as brave as a lion, but who can say for sure?  Being born in summer makes you a summer birthday, so you know all about disapointment (having never had a birthday party with school friends and all...assuming you had friends).  It can only go up from here...unless you lose your cell phone, of course.  That would certainly be a downer."); 
        zodiac.put("Virgo", "Virgos are supposed to be self-suffiencient, so why are you relying on a horoscope?"); 
        zodiac.put("Libra", "It's possible 'Nacho Libre' is your favorite movie.  Oh wait...you're a Libra, not a Libre.  Nevermind."); 
        zodiac.put("Scorpio", "Halloween falls within the timeframe of Scorpio.  That's so cool - maybe you could dress up as a scorpion this year...give those vampires a run for their money!"); 
        zodiac.put("Sagittarius", "Belonging to the coolest sounding astrological sign with the coolest mascot (hello, centaur!?) just might make you the coolest person around.  Of course, in reality the mascot is a satyr, which is infinitely less cool.  It's possible you are just mediocre.  Who can say, really."); 
        zodiac.put("Capricorn", "You just may have the lamest zodiac mascot there is, which means you will have to work extra hard to make something of yourself.  Kind of like how goats work really hard at eating everything in their path.  Be tenacious like that."); 
        zodiac.put("Aquarius", "Having one of the worst songs in history named after your astrological sign can only mean good things for you from here on out, Aquarius.  But just to be on the safe side, you should stay away from poisonous snakes, spiders, and insects.  Also crocodiles.  And bears.  And serial killers."); 
        zodiac.put("Pisces", "Sorry, Pisces...you get no horoscope.  You were at the bottom of the list, and there are no more predictions left for you.  There is, however, one piece of good advice.  Avoid getting hit by a bus.  Those are words to live by."); 
        zodiac.put("Nothing", "Please check your numbers and try again...otherwise, this is your horoscope.");
          
        // Print the number of entries in the HashMap
        System.out.println("There are " + zodiac.size() + " entries in the HashMap."); 
        System.out.println();
      
        // Find a specific key/value pair in the HashMap
        if (zodiac.containsKey("Aries"))  
        { 
            String a = zodiac.get("Aries"); 
            System.out.println("The value for key \"Aries\" is: " + a); 
        } 
               
        // Print the entire list of HashMap entries using an iterator 
        System.out.println();
        System.out.println();
        Set set = zodiac.entrySet();
        Iterator iterator = set.iterator();
        System.out.println("The signs of the zodiac with their corresponding horoscopes are: ");
        System.out.println();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print(mentry.getKey() + ": ");
            System.out.println(mentry.getValue());
        }
        System.out.println();
        
        // Clear the HashMap
        zodiac.clear(); 
        
        // Print the empty HashMap 
        print(zodiac); 
    }
    
    public static void print(Map<String, String> zodiac)  
    { 
        if (zodiac.isEmpty())  
        { 
            System.out.println("The HashMap is empty."); 
        } 
          
        else
        { 
            System.out.println(zodiac); 
        } 
    } 
}
