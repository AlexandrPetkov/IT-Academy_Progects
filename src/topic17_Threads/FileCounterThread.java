package topic17_Threads;

import java.io.File;

public class FileCounterThread extends Thread {
    File files = new File("resources");
    int count = files.list().length;

    @Override
    public void run() {

            while (true) {
                files = new File("resources");

                if (files.list().length - count != 0) {
                    count = files.list().length;
                    System.out.println("Кол-во файлов изменилось");
                } else {
                    System.out.println("Ничего не изменилось");
                }


                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
