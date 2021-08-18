package lesson19;

import lesson19.deadlock.FirstClass;
import lesson19.deadlock.SecondClass;
import lesson19.thread.MyCallable;
import lesson19.thread.MyRunnable;
import lesson19.thread.MyThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    static Integer TEST = 0;
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        Thread thread = new Thread(new MyRunnable());
//        thread.start();
//
//        thread.setName("fafsd");
//        System.out.println(thread.getName());
//
//        FutureTask<String> futureTask = new FutureTask<>(new MyCallable());
//        Thread thread1 = new Thread(futureTask);
//        thread1.start();
//        System.out.println(futureTask.get());
//
//        Thread.sleep(10000);
//        for (int i = 0; i < 100; i++) {
//            System.out.println("END");
//        }

//        Thread thread1 = new Thread(() -> method("thread1"));
//        Thread thread2 = new Thread(() -> method("thread2"));
//
//        thread1.start();
//        thread2.start();
//
//        Thread.sleep(10000);
//        System.out.println(TEST);

        FirstClass firstClass = new FirstClass();
        SecondClass secondClass = new SecondClass();

        firstClass.setSecondClass(secondClass);
        secondClass.setFirstClass(firstClass);

        Thread first = new Thread(() -> System.out.println(firstClass.getStringFromSecondClass()));
        Thread second = new Thread(() -> System.out.println(secondClass.getStringFromFirstClass()));

        first.start();
        second.start();
    }


    private static synchronized void method(String thread) {
        for (int i = 0; i < 10000; i++) {
            ++TEST;
        }
    }
}
