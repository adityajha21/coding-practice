package core.java.pratice;

public class PrintSeriesOfNumber {
    private static final int N = 10;   // LIMIT
    private static int counter  = 1;  // shared counter
    public static final Object lock = new Object();   // lock object

    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> {
            int threadId = Integer.parseInt(Thread.currentThread().getName());
            synchronized(lock) {
                while(counter<N) {
                    while(counter%3 != threadId){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if(counter <= N) {
                        System.out.println("Thread " + threadId + " is " + counter);
                        counter++;
                    }
                    lock.notifyAll();
                }
            }

        };
        Thread t1 = new Thread(r, "1");
        Thread t2 = new Thread(r, "2");
        Thread t3 = new Thread(r, "0"); // Using 0 for modulo logic

        t1.start();
        t2.start();
        t3.start();
    }


}
