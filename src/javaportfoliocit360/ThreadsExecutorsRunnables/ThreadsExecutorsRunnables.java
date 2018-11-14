/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaportfoliocit360.ThreadsExecutorsRunnables;

import java.util.Random;

/**
 *
 * @author Gina Udy
 */
public class ThreadsExecutorsRunnables {
    
    public static void main(String[] args) {
       /* UNCOMMENT THESE TO WORK ON THEM!!!
        Thread t1 = new Thread(new Apple("one"));
        Thread t2 = new Thread(new Apple("two"));
        Thread t3 = new Thread(new Apple("three"));
        Thread t4 = new Thread(new Apple("four"));
        Thread t5 = new Thread(new Apple("five"));
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();*/
    }
    
    
    public class Apple implements Runnable {
    String name;
    int time;
    Random r = new Random();
    
        public Apple(String x) {
            name = x;
            time = r.nextInt(999);
        }

    @Override
        public void run() {
            try {
                System.out.printf("%s is sleeping for %d\n", name, time);
                Thread.sleep(time);
                System.out.printf("%s woke up and is done!\n", name);
            } catch(Exception e) {}
        }
    }
}