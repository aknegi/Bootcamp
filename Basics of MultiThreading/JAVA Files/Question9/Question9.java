import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Counter9 implements Runnable {
    private static int count = 0;
    Counter9() {
        count++;
    }
    public void run() {
        System.out.println("count = " + count + " " + Thread.currentThread().getName());
    }
}
public class Question9 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 4; i++) {
            executor.submit(new Counter9());
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }}
