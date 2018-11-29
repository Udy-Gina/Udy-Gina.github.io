/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaportfoliocit360.QCJSONandJSON;

import java.io.IOException;
import java.io.StringWriter;
import org.json.simple.JSONObject;

/**
 *
 * @author Gina Udy
 */

public class JSONPracticeString {

   public static void main(String[] args) throws IOException{
      JSONObject obj2 = new JSONObject();

      obj2.put("FirstName", "Gina");
      obj2.put("LastName", "Udy");
      obj2.put("email", "gina@gmail.com");
      obj2.put("Age", new Integer(44));

      StringWriter out = new StringWriter();
      obj2.writeJSONString(out);
      
      String jsonText = out.toString();
      System.out.print(jsonText);
   }
}
