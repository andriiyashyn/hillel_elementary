package lesson16.intr;

public interface TestInterface1  {
    default void run() {
        System.out.println("test TestInterface1");
    }
}
