package core.java.pratice;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class EvenOddThreads {
    private int number =1;
    private final int maxNumber = 10;
    private final Lock lock = new ReentrantLock();

    public void printOdd() throws InterruptedException {
        while(maxNumber >= number) {
           lock.lock();
            if (number % 2 == 0) {
                wait();
            } else {
                System.out.println("Thread Number :" + Thread.currentThread() + " - " + number++);
                notify();
            }
        }
    }

    public void printEven() throws InterruptedException {
        while (maxNumber >= number) {
           lock.lock();
            if (number % 2 != 0) {
                wait();
            } else {
                System.out.println("Thread Number :" + Thread.currentThread() + " - " + number++);
            notify();
            }
        }
    }
}

public class MainThread {
     public static void main(String[] args) {
        EvenOddThreads e = new EvenOddThreads();
        Thread oddThread = new Thread( () -> {
            try {
                e.printOdd();
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        });
        Thread evenThread = new Thread( () -> {
            try {
                e.printEven();
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        });
        oddThread.start();
        evenThread.start();
     }
}


