package lesson19.thread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 50; i++) {
            System.out.println("MyCallable " + i);
        }

        return "FINISHED";
    }
}
