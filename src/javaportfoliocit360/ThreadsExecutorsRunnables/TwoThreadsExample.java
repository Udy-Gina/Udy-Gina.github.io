package javaportfoliocit360.ThreadsExecutorsRunnables;

/**
 *
 * @author Gina Udy
 */

class TwoThreadsExample extends Thread {
    
    public TwoThreadsExample(String racers) {
        super(racers);
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName());
            try {
                sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {}
        }
        System.out.println("The " + getName() + " crosses the finish line!");
    }
}


class TwoThreads {
    public static void main (String[] args) {
            banner();
            new TwoThreadsExample("Tortoise").start();
            new TwoThreadsExample("Hare").start();
    }

    private static void banner() {
        System.out.println("Which thread will win?  Tortoise or Hare???");
        System.out.println();
    }
}