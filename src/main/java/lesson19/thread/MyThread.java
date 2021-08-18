package lesson19.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("MyThread " + i);
        }
    }
}
