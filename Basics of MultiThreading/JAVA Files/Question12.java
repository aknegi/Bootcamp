import java.util.concurrent.atomic.AtomicInteger;

class Counter12 extends Thread {
    private AtomicInteger value = new AtomicInteger();
    public void increment() {
        for (int i = 0; i < 100; i++)
            value.incrementAndGet();
    }
    public void decrement() {
        for (int i = 0; i < 100; i++)
            value.decrementAndGet();
    }
    public int get() {
        return value.get();
    }
}
public class Question12 {
    public static void main(String[] args) {
        Counter12 value = new Counter12();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++)
                value.increment();

            System.out.println(value.get());
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++)
                value.decrement();
            System.out.println(value.get());
        });
        t1.start();
        t2.start();

    }
}