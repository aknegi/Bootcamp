package Question16;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Deadlock {
    Lock lock1 = new ReentrantLock();
    Lock lock2 = new ReentrantLock();
    Random random = new Random();
    private void acquireLocks(Lock firstLock, Lock secondLock) {
        boolean lockOne = false;
        boolean lockTwo = false;
        while (true) {
            try {
                lockOne = firstLock.tryLock();
                lockTwo = secondLock.tryLock();
            } finally {
                if (lockOne && lockTwo)
                    return;
                if (lockOne)
                    firstLock.unlock();
                if (lockTwo)
                    secondLock.unlock();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void add() {
        for (int i = 0; i < 20000; i++) {
            try {
                acquireLocks(lock1,lock2);
                int num1 = random.nextInt(100);
                int num2 = random.nextInt(100);
                System.out.println(num1 + num2);
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void substract() {
        for (int i = 0; i < 20000; i++) {
            try {
                acquireLocks(lock1,lock2);
                int num1 = random.nextInt(100);
                int num2 = random.nextInt(100);
                System.out.println(num1 - num2);
            } finally {
                lock2.unlock();
                lock1.unlock();
            }     }
    }

}

public class DeadlockResolving {

    public static void main(String[] args) {
        Deadlock obj = new Deadlock();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.add();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.substract();
            }
        });
        t1.start();
        t2.start();
    }
}


