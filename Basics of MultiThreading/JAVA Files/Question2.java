class Counter2 extends Thread {
    public void run() {
        try {
            sleep(1000);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Question2 {
    public static void main(String[] args) {
        Counter2 t1 = new Counter2();
        Counter2 t2 = new Counter2();
        Counter2 t3 = new Counter2();
        Counter2 t4 = new Counter2();

        t1.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t4.start();

    }
}
