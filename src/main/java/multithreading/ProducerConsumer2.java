package multithreading;


public class ProducerConsumer2 {
    public static void main(String[] args) {
        SharedResource1 sharedResource = new SharedResource1();
        Thread pro = new Thread (sharedResource::addItem);

        Thread con = new Thread(sharedResource ::consumeItem);
        // way 1
        pro.start();
        con.start();
    }
}

class SharedResource1 {
    private int counter = 10;

    public synchronized void addItem() {
        while (true) {
            try {
                while (counter > 0) {  // Wait until all items are consumed
                    wait();  // Producer waits
                }
                System.out.println("Item is added!");
                counter = 10; // Reset counter
                notify(); // Notify consumer to consume items
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void consumeItem() {
        while (true) {
            try {
                while (counter == 0) {  // Wait if no items to consume
                    wait();  // Consumer waits
                }
                System.out.println("Consumed: " + counter);
                counter--;
                if (counter == 0) {
                    notify();  // Notify producer to add items
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}