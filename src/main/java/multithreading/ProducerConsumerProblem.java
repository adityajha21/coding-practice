package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerProblem {
    public static void main(String[] args) {
      SharedResource sharedResource = new SharedResource();
        Thread producer = new Thread (() -> {
            sharedResource.addItem();
        });

        Thread consumer = new Thread(() -> {
            try {
                sharedResource.consumeItem();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        // way 1
        producer.start();
        consumer.start();

        // way 2
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(producer);
        executor.execute(consumer);
        executor.shutdown();
    }


}

class SharedResource {
    private boolean available = false;
    public synchronized void addItem() {
        available = true;
        System.out.println("Item is added");
        notify();

    }

    public void consumeItem() throws InterruptedException {
        if (!available) {
            System.out.println("Item is yet to added");
            wait();
        } else {
            System.out.println("Item is consumed");
            available = false;
        }

    }
}
