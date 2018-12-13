package javaportfoliocit360.HttpURLConnection;

import java.net.*;
import java.io.*;
import java.util.*; 
import java.io.IOException;

/**
 *
 * @author Gina Udy
 */

public class HttpURLConnection {
    
    public static void main(String[] args) throws IOException {
        
        System.out.println("******************************************************");
        System.out.println("*                     lds.org                        *");
        System.out.println("******************************************************");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        // Program will connect to lds.org 
        String website = getUrlContents("https://www.lds.org");

        // HTML file for lds.org
        System.out.println(website);

        // This is another way to print the HTML for a webpage (ebay.com in this case)
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("******************************************************");
        System.out.println("*                    ebay.com                        *");
        System.out.println("******************************************************");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        // Program will connect to lds.org 
        URL ebay = new URL("https://www.ebay.com");
        
        URLConnection connection = ebay.openConnection();
        
        // HTML file for ebay.com
        try (BufferedReader web = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            
            String result;
            
            while ((result = web.readLine()) != null) {
                System.out.println(result);
            }
        }
        
        
        System.out.println("******************************************************");
        System.out.println("*                   facebook.com                     *");
        System.out.println("******************************************************");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        // This will read all header fields from server for facebook.com 
        String url = "https://facebook.com";
        URL fb = new URL(url);
        URLConnection conn = fb.openConnection();

        Map<String, List<String>> map = conn.getHeaderFields();

        for (String key : map.keySet()) {
            System.out.println(key + ":");

            List<String> values = map.get(key);

            for (String aValue : values) {
                System.out.println("\t" + aValue);
            }
        }
    }
    
    
    private static String getUrlContents(String church) {
        StringBuilder content = new StringBuilder();
 
        try {
            URL url = new URL(church);
 
            URLConnection urlConnection = url.openConnection();
 
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
                String html;
                
                while ((html = bufferedReader.readLine()) != null) {
                    content.append(html).append("\n");
                }
            }
        }
        catch(IOException e) { 
        }
        
        return content.toString();
    }
}