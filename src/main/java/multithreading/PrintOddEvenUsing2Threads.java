package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintOddEvenUsing2Threads {
    public static void main(String[] args) {
      NumberPrinter numberPrinter = new NumberPrinter();
      // Using Executor services
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Runnable r1 = () -> {
            try {
                numberPrinter.printOddNumber();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable r2 = () -> {
            try {
                numberPrinter.printEvenNumber();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        executorService.execute(r1);
        executorService.execute(r2);

        executorService.shutdown();
    }
}

class NumberPrinter {
    int currentNumber = 1;
    final int maxNumber = 10;

    synchronized void printOddNumber() throws InterruptedException {
        while(maxNumber >= currentNumber){
            if(currentNumber % 2 !=0) {
                System.out.println("Odd Number : " +currentNumber);
                currentNumber++;
                notifyAll();
            }
            if(currentNumber <= maxNumber){
                wait();
            }
        }

    }

    synchronized void printEvenNumber() throws InterruptedException {
        while(maxNumber >= currentNumber){
            if(currentNumber % 2 == 0) {
                System.out.println("Even Number : " +currentNumber);
                currentNumber++;
                notifyAll();
            }
            if(currentNumber <= maxNumber){
                wait();
            }
        }
    }

}

