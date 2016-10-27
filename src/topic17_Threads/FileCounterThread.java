package topic17_Threads;

import java.io.File;

public class FileCounterThread extends Thread {
    File files;
    String[] names;
    int count;

    public FileCounterThread(File files) {
        this.files = files;
        names = files.list();
        count = names.length;
    }

    @Override
    public void run() {

        synchronized (files) {
            while (true) {
                try {
                    files.wait(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                for (int i = 0; i < count; i++) {
                    System.out.println(names[i]);
                }


                if (names.length - count != 0) {
                    count = names.length;
                    System.out.println("Список файлов изменился");
                } else {
                    System.out.println("Ничего не изменилось");
                }
            }
        }

    }
}
