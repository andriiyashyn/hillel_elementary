package lesson19;

import java.util.concurrent.ExecutionException;

public class Main {
    static int TEST = 0;
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

        Thread thread1 = new Thread(Main::method);
        Thread thread2 = new Thread(Main::method);

        thread1.start();
        thread2.start();

        Thread.sleep(5000);
        System.out.println(TEST);

//        FirstClass firstClass = new FirstClass();
//        SecondClass secondClass = new SecondClass();
//
//        firstClass.setSecondClass(secondClass);
//        secondClass.setFirstClass(firstClass);
//
//        Thread first = new Thread(() -> System.out.println(firstClass.getStringFromSecondClass()));
//        Thread second = new Thread(() -> System.out.println(secondClass.getStringFromFirstClass()));
//
//        first.start();
//        second.start();
    }


    private static synchronized void method() {
        for (int i = 0; i < 10000; i++) {
            ++TEST;
        }
    }
}
