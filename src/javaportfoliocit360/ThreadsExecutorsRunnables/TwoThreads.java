package javaportfoliocit360.ThreadsExecutorsRunnables;

/**
 *
 * @author Gina Udy
 */

class TwoThreads {
    public static void main (String[] args) {
            banner();
            new ThreadsExecutorsRunnables("Tortoise").start();
            new ThreadsExecutorsRunnables("Hare").start();
    }

    private static void banner() {
        System.out.println("Which thread will win?  Tortoise or Hare???");
        System.out.println();
    }
}