package multithreading;

public class StartVsRun extends Thread{
    @Override
    public void run() {
        System.out.println("Starting thread");
    }

    public static void main(String[] args) {
        StartVsRun startVsRun = new StartVsRun();
        startVsRun.start();
    }
}
