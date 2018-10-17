/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaportfoliocit360;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Gina Udy
 */

public class JSONPracticeParse {
 
    public static void main(String[] args) {
        String jsonString = "{\"firstName\":\"Gina\",\"lastName\":\"Udy\",\"email\":\"gina@email.com\",\"age\":\"44\"}";
        JSONParser parser = new JSONParser();
        JSONObject obj;
        try {
            obj = (JSONObject) parser.parse(jsonString);
 
            System.out.println();
            System.out.println(obj.get("firstName"));
            System.out.println(obj.get("lastName"));
            System.out.println(obj.get("email"));
            System.out.println(obj.get("age"));
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println((obj.get("firstName"))+("'s last name is ")+((obj.get("lastName"))+(".")));
            System.out.println();
            System.out.println();
            System.out.println();
 
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
    }
 
}