package topic17_Threads;

import java.io.File;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        File directory = new File("resources");
        Thread thread = new FileCounterThread(directory);
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(100000);

    }
}
