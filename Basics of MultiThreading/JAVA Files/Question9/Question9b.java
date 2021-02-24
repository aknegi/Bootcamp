import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Counter9b implements Runnable {
    private static int count = 0;
    Counter9b() {
        count++;
    }
    public void run() {
        System.out.println("count = " + count + " " + Thread.currentThread().getName());
    }
}
public class Question9b {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executor.submit(new Counter9b());
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }
}
