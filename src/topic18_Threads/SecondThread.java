package topic18_Threads;

public class SecondThread extends Thread {

    int x;

    public SecondThread(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        Main17.secondResult = x / 3 * 8;
    }
}
