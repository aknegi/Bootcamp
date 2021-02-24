import java.util.concurrent.ExecutorService;
import java.util.concurrent.*;

class Counter3 extends Thread {
    private int counter = 0;
    public void run() {
        try {
            sleep(3000);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println("ShutdownNow called");
            e.printStackTrace();
        }
    }
}
public class Question3 {
    public static void main(String[] args) {
        System.out.println("Main method starts");
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(new Counter3());
        executor.submit(new Counter3());
        executor.submit(new Counter3());
    }
}
