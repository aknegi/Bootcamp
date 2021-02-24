import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter15 {
    private int count = 0;
    Lock lock = new ReentrantLock();
    Condition cond = lock.newCondition();

    public void threadOne() {
        try {
            lock.lock();
            System.out.println("watiting...");
            cond.await();
            System.out.println("Got signal");
            increment();
        } catch (Exception e) {
        } finally {
            lock.unlock();
        }
    }

    public void threadTwo() {
        try {
            Thread.sleep(1000);
            lock.lock();
            increment();
            System.out.println("Press key for signal");
            new Scanner(System.in).next();
            cond.signal();
        } catch (Exception e) {
        } finally {
            lock.unlock();
        }
    }
    public void increment() {
        for (int i = 0; i < 1000; i++) {
            count++;
        }
    }
    public void finish() {
        System.out.println("count = " + count);
    }

}

public class Question15 {
    public static void main(String[] args) {
        Counter15 obj = new Counter15();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.threadOne();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.threadTwo();
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        obj.finish();
    }
}
