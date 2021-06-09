package lesson1.intr;

public class Parrot implements Animal {
    @Override
    public void run() {
        System.out.println("run parrot");
    }

    @Override
    public void voice() {
        System.out.println("voice parrot");
    }
}
