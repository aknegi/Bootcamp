import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Counter4 extends Thread {
    private int counter = 0;
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
public class Question4 {
    public static void main(String[] args) {
        System.out.println("Main method starts");
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(new Counter4());
        executor.submit(new Counter4());
        executor.submit(new Counter4());
        executor.shutdown();
    }
}
