/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaportfoliocit360.MVC.control;

/**
 *
 * @author Gina Udy
 */
public class zodiacControl {
    
}


/*

This is the CONTROLLER...the if/else function should pull the appropriate horoscope from the MODEL 
and return it to the CONTROLLER, to be sent back to the VIEW

*/


/* 
Add the zodiac results in an array, then in my if/else statement, call each array index, depending on the day/month

zodiac array {
                "aries": "The zodioc mastcot for Aries is a ram.  Some people confuse that with a sheep or goat, but rams are way cooler.  They are the Princess Leias of the animal kingdom.  It's a fact...they have the cinnamon bun horns to prove it.", 
                "taurus": "Taurus means 'bull', but this horiscope is no bull.  You are a person who sometimes has many thoughts.  Something will happen to you today...could be big, could be small.  You'll just have to wait and see.  Of course, if nothing happens, it might happen tomorrow instead.  Again, you'll just have to wait and see.", 
                "gemini": "Even though Gemini means 'twins' you are probably not one.  You could be, but probably aren't.  After all, most people aren't.", 
                "cancer": "Your zodiac mascot is a crab.  The best advice anyone could give you is to NOT be a Cancer.  Nobody likes crabby people.", 
                "leo": "It's possible you are as brave as a lion, but who can say for sure?  Being born in summer makes you a summer birthday, so you know all about disapointment (having never had a birthday party with school friends and all...assuming you had friends).  It can only go up from here...unless you lose your cell phone, of course.  That would certainly be a downer.", 
                "virgo": "Virgos are supposed to be self-suffiencient, so why are you relying on a horoscope?", 
                "libra": "It's possible 'Nacho Libre' is your favorite movie.  Oh wait...you're a Libra, not a Libre.  Nevermind.", 
                "scorpio": "Halloween falls within the timeframe of Scorpio.  That's so cool - maybe you could dress up as a scorpion this year...give those vampires a run for their money!", 
                "sagittarius": "Belonging to the coolest sounding astrological sign with the coolest mascot (hello, centaur!?) just might make you the coolest person around.  Of course, in reality the mascot is a satyr, which is infinitely less cool.  It's possible you are just mediocre.  Who can say, really.", 
                "capricorn": "You just may have the lamest zodiac mascot there is, which means you will have to work extra hard to make something of yourself.  Kind of like how goats work really hard at eating everything in their path.  Be tenacious like that.", 
                "aquarius": "Having one of the worst songs in history named after your astrological sign can only mean good things for you from here on out, Aquarius.  But just to be on the safe side, you should stay away from poisonous snakes, spiders, and insects.  Also crocodiles.  And bears.  And serial killers.", 
                "pisces": "Sorry, Pisces...you get no horoscope.  You were at the bottom of the list, and there are no more predictions left for you.  There is, however, one piece of good advice.  Avoid getting hit by a bus.  Those are words to live by.", 
                "nothing": "Please check your numbers and try again...otherwise, this is your horoscope."
            };
                
                if ((monthA === 3 && dayA >= 21) || (monthA === 4 && dayA <= 19)) {
                        var result = zodiac.aries;
                }
                
                else if ((monthA === 4 && dayA >= 20) || (monthA === 5 && dayA <= 20)) {
                        var result = zodiac.taurus;
                }
                
                else if ((monthA === 5 && dayA >= 21) || (monthA === 6 && dayA <= 20)) {
                        var result = zodiac.gemini;
                }
               
                else if ((monthA === 6 && dayA >= 21) || (monthA === 7 && dayA <= 22)) {
                        var result = zodiac.cancer;
                }
               
                else if ((monthA === 7 && dayA >= 23) || (monthA === 8 && dayA <= 22)) {
                        var result = zodiac.leo;
                }
                
                else if ((monthA === 8 && dayA >= 23) || (monthA === 9 && dayA <= 21)) {
                        var result = zodiac.virgo;
                }
                
                else if ((monthA === 9 && dayA >= 22) || (monthA === 10 && dayA <= 23)) {
                        var result = zodiac.libra;
                }
                
                else if ((monthA === 10 && dayA >= 24) || (monthA === 11 && dayA <= 21)) {
                        var result = zodiac.scorpio;
                }
                
                else if ((monthA === 11 && dayA >= 22) || (monthA === 12 && dayA <= 21)) {
                        var result = zodiac.sagittarius;
                }
                
                else if ((monthA === 12 && dayA >= 22) || (monthA === 1 && dayA <= 19)) {
                        var result = zodiac.capricorn;
                }
                
                else if ((monthA === 1 && dayA >= 20) || (monthA === 2 && dayA <= 18)) {
                        var result = zodiac.aquarius;
                }
                
                else if ((monthA === 2 && dayA >= 19) || (monthA === 3 && dayA <= 20)) {
                        var result = zodiac.pisces;
                }
                
                else {
                        var result = zodiac.nothing;
                }



*/