class Counter1 implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class Question1b extends Thread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Counter1());
        t1.start();
    }
}
