import java.util.Scanner;

class Counter14 {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Running Producer Thread...");
            wait();
            System.out.println("Thread Notified and Resumed..");
        }
    }

    public void consume() throws InterruptedException {

        Thread.sleep(2000);
        synchronized (this) {
            System.out.println("Press a key to continue...");
            new Scanner(System.in).nextLine();
            System.out.println("Key pressed..");
            notifyAll();
        }
    }
}

public class Question14 {
    public static void main(String[] args) {

        Counter14 obj1 = new Counter14();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    obj1.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    obj1.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    obj1.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All thread notify");
    }
}