package lesson1.intr;

public class Parrot implements Animal {
    @Override
    public int run() {
        System.out.println("run parrot");
        return 1;
    }

    @Override
    public void voice() {
        System.out.println("voice parrot");
    }
}
