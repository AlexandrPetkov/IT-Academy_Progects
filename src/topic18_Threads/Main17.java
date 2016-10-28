package topic18_Threads;

public class Main17 {
    static int firstResult = 0;
    static int secondResult = 0;


    public static void main(String[] args) throws InterruptedException {
        Thread firstThread = new Thread(new FirstThread(5));
        Thread secondThread = new SecondThread(5);

        firstThread.start();
        secondThread.start();

        firstThread.join();
        secondThread.join();

        System.out.println(firstResult / secondResult);
    }


}
