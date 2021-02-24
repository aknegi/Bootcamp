import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Counter11 extends  Thread{
    int count = 0;
    public  void increment() {
        synchronized(this)
        { count = count + 1;}
    }
    public int getCount() {
        return count;
    }
}
public class Question11 {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Counter11 counter = new Counter11();
        for (int i = 0; i < 1000; i++) {
            executorService.submit(() -> counter.increment());
        }
        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);
        System.out.println("Final count is : " + counter.getCount());
    }
}

