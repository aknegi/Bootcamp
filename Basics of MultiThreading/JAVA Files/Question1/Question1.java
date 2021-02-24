class Counter extends Thread {
    public void run() {
        try {
            sleep(1000);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Question1 {
    public static void main(String[] args) {
        Counter t1 = new Counter();
        t1.start();
    }
}
