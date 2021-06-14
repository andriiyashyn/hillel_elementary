package lesson1.intr;

public abstract class AbstractAnimal implements Animal {
    @Override
    public int run() {
        System.out.println("run");
        return 1;
    }
}
