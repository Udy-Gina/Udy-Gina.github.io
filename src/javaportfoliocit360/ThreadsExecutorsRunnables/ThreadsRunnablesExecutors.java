package javaportfoliocit360.ThreadsExecutorsRunnables;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Gina Udy
 */

public class ThreadsRunnablesExecutors {
     
    public static void main(String[] args) {
        
        // Will print this line first
        System.out.println("The ants go marching one by one, hurrah, hurrah!");
        
        // Jump to startThread() method to print second line
        lineTwo ant1 = new lineTwo();
        //startThread ant1 = new startThread();
        ant1.start();
        
        // Jump to startRunnable() method to print third line 
        Thread ant2 = new Thread(new lineThree());
        ant2.start();
        
        // This thread prints fourth after a 1 second pause 
        try {
            Thread.sleep(1000);
            System.out.println("The ants go marching four by four, hurrah, hurrah!");
        } catch (InterruptedException e) {
            System.out.println("Exception works " + e);
        }
        
        // The system should print out the fifth line, but first it must do the try/catch 
        ExecutorService ant5 = Executors.newSingleThreadExecutor();
        ant5.submit(() -> {
            System.out.println("The ants go marching five by five, hurrah, hurrah!");
        });

        // System does not shutdown, so the word HICCUP prints
        try {
            System.out.println("HICCUP");
            ant5.shutdown();
            ant5.awaitTermination(5, TimeUnit.SECONDS);
        }
        catch (InterruptedException e) {
            System.err.println("Can't shutdown");
        }
        finally {
            if (!ant5.isTerminated()) {
                System.err.println("Try again");
            }
            
            // After the fifth line prints, that thread is shutdown 
            ant5.shutdownNow();
            // The system should print the sixth line and then end
            System.out.println("The ants go marching six by six, hurrah, hurrah!");
        }
    }
    
}

// Prints the second line 
class lineTwo extends Thread {
    @Override
    public void run() {
        System.out.println("The ants go marching two by two, hurrah, hurrah!");
    }
}

// Prints the third line
class lineThree implements Runnable {
    @Override
    public void run() {
        System.out.println("The ants go marching three by three, hurrah, hurrah!");
    }
}