package lesson20;

import lesson20.lock.Example;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static volatile int i = 0;
    public static AtomicInteger testAtomic = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
//        Object o = new Object();
//        Thread thread = new Thread(() -> {
//            synchronized (o) {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("thread running: " + Thread.currentThread().getName());
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                o.notify();
//            }
//        });
//
//        thread.start();
//        synchronized (o) {
//            o.wait();
//        }
//        System.out.println("Finished");


//        Thread thread1 = new Thread(() -> {
//            while (i < 10) {
//                System.out.println("Thread1. i:" + ++i);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        Thread thread2 = new Thread(() -> {
//            int cachedInt = i;
//            while (i < 10) {
//                if (cachedInt != i) {
//                    System.out.println("Thread2. i:" + i);
//                    cachedInt = i;
//                }
//            }
//        });
//        thread1.start();
//        thread2.start();


//        Thread thread1 = new Thread(Main::method);
//        Thread thread2 = new Thread(Main::method);
//
//        thread1.start();
//        thread2.start();
//
//        Thread.sleep(5000);
//        System.out.println(testAtomic);

//        List<String> syncList = Collections.synchronizedList(new ArrayList<>());
//        Set<String> syncSet = Collections.synchronizedSet(new HashSet<>());
//        Map<String, String> syncMap = Collections.synchronizedMap(new HashMap<>());


        Lock lock = new ReentrantLock();
        Thread thread3 = new Thread(new Runnable() {
            Example example = new Example("Thread 1", lock);

            @Override
            public void run() {
                example.print();
                example.write();
            }
        });

        Thread thread4 = new Thread(new Runnable() {
            Example example = new Example("Thread 2", lock);

            @Override
            public void run() {
                example.print();
                example.write();
            }
        });

        thread3.start();
        thread4.start();



    }

//    private static void method() {
//        for (int i = 0; i < 10000; i++) {
//            testAtomic.incrementAndGet();
//        }
//    }
}
