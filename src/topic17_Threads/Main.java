package topic17_Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Thread thread = new FileCounterThread();
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(100000);

    }
}
