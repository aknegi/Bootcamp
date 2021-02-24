import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Counter5 extends Thread {
    private int counter = 0;

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class Question5 {
    public static void main(String[] args) {
        System.out.println("Main method starts");
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(new Counter4b());
        executor.submit(new Counter4b());
        executor.submit(new Counter4b());
        System.out.println("isShutDown() before calling shutDown()"+executor.isShutdown());
        System.out.println("isTerminated() before calling shutDown()" +executor.isTerminated());

        executor.shutdown();
        try {
            executor.awaitTermination(2000, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("isShutDown() before calling shutDown()"+executor.isShutdown());
        System.out.println("isTerminated() after calling shutDown()" +executor.isTerminated());
    }
}
