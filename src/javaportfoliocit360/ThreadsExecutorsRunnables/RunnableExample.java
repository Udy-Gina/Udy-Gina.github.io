package javaportfoliocit360.ThreadsExecutorsRunnables;

import static java.lang.Thread.sleep;

/**
 *
 * @author Gina Udy
 */

public class RunnableExample implements Runnable {

    public static void main(String[] args) {
        banner(); 
        RunnableExample example = new RunnableExample();
        Thread thread1 = new Thread(example, "Tortoise"); 
        Thread thread2 = new Thread(example, "Hare"); 
        thread1.start();
        thread2.start();
    }
    
    private static void banner() {
        System.out.println("Which thread will win?  Tortoise or Hare???");
        System.out.println();
        }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {}
        }
        System.out.println("The " + Thread.currentThread().getName() + " crosses the finish line!");
    }
}