package lesson20.lock;

import lesson19.Main;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example {
    Lock lock;
    String thread;

    public Example(String thread, Lock lock) {
        this.thread = thread;
        this.lock = lock;
    }

    public void print() {
        lock.lock();
        for (int i = 0; i < 100; i++) {
            System.out.println("print " + thread);
        }
    }

    public void write() {
        for (int i = 0; i < 100; i++) {
            System.out.println("write");
        }
        lock.unlock();
    }
}

