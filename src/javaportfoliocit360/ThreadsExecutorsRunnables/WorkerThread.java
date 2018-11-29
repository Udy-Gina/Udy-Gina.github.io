package javaportfoliocit360.ThreadsExecutorsRunnables;

/**
 *
 * @author Gina Udy
 */

public class WorkerThread implements Runnable {
    
    private String command;
    
    public WorkerThread(String s) {
        this.command=s;
    }
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start. Command = " + command);
        processCommand();
        System.out.println(Thread.currentThread().getName() + " End.");
    }
    
    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
    }
    
    @Override
    public String toString() {
        return this.command;
    }
}


























/*


Runnable task = () -> {
    String threadName = Thread.currentThread().getName();
    System.out.println("Hello " + threadName);
};

task.run();

Thread thread = new Thread(task);
thread.start();

System.out.println("Done!");

////////////////////////////////////////////////////////////////////////////////

ExecutorService executor = Executors.newSingleThreadExecutor();
executor.submit(() -> {
    String threadName = Thread.currentThread().getName();
    System.out.println("Hello " + threadName);
});

// => Hello pool-1-thread-1

try {
    System.out.println("attempt to shutdown executor");
    executor.shutdown();
    executor.awaitTermination(5, TimeUnit.SECONDS);
}
catch (InterruptedException e) {
    System.err.println("tasks interrupted");
}
finally {
    if (!executor.isTerminated()) {
        System.err.println("cancel non-finished tasks");
    }
    executor.shutdownNow();
    System.out.println("shutdown finished");
}


*/