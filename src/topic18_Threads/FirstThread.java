package topic18_Threads;

public class FirstThread implements Runnable {

    int x;
    public FirstThread(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        Main17.firstResult = x * x + 3;
    }
}
