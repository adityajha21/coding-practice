package multithreading;

public class OddEvenThread {

    /*Write a Java program that uses two threads to print even and odd numbers from 1 to 20, respectively.
    The threads should print numbers in a synchronized manner to maintain order.*/
    public static void main(String[] args) {
        final Object lock = new Object();
        Thread oddThread = new Thread(() -> {
            for (int i = 1; i < 20; i++) {
                if (i % 2 != 0) {
                    synchronized (lock) {
                        try {

                            System.out.println(Thread.currentThread().getName() + " " + i);
                            lock.notify();
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        });

        Thread evenThread = new Thread(() -> {
            for (int i = 1; i < 20; i++) {
                if (i % 2 == 0) {
                    synchronized (lock) {
                        try {
                            System.out.println(Thread.currentThread().getName() + " " + i);
                            lock.notify();
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    }
                }
            }
        });
        oddThread.start();
        evenThread.start();
    }

}
