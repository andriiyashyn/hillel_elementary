package lesson21;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {
    private static final Semaphore SEMAPHORE = new Semaphore(5, true);

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);



        executorService.execute(new MyRunnable("first"));
        executorService.execute(new MyRunnable("second"));
        executorService.execute(new MyRunnable("third"));

        System.out.println("Hello");

    }
}
