/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaportfoliocit360;

import java.io.IOException;
import java.io.StringWriter;
import org.json.simple.JSONObject;

/**
 *
 * @author Gina Udy
 */

class JsonEncodeDemo1 {

   public static void main(String[] args){
      JSONObject obj1 = new JSONObject();

      obj1.put("FirstName", "Gina");
      obj1.put("LastName", "Udy");
      obj1.put("email", "gina@email.com");
      obj1.put("Age", new Integer(44));

      System.out.print(obj1);
   }
}

