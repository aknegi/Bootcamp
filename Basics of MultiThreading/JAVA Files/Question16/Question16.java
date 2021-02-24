package Question16;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter16{

    Lock lock1 = new ReentrantLock();
    Lock lock2 = new ReentrantLock();
    Random random=new Random();
    public void add() {

        for (int i=0;i<20000;i++){
            lock2.lock();
            lock1.lock();
            try{
                int num1= random.nextInt(100);
                int num2= random.nextInt(100);
                System.out.println(num1+num2);
            }finally{
                lock1.unlock();
                lock2.unlock();
            }}
    }

    public void substract() {

        for (int i=0;i<20000;i++){
            lock1.lock();
            lock2.lock();
            try{
                int num1= random.nextInt(100);
                int num2= random.nextInt(100);
                System.out.println(num1-num2);

            }finally{
                lock1.unlock();
                lock2.unlock();
            }}
    }

}

public class Question16 {

    public static void main(String[] args) {
        Counter16 obj = new Counter16();

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
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


