package lesson23.singleton;

public class Animal {
    private static final Animal ANIMAL = new Animal();

    private Animal() {}

    public static Animal instance() {
        return ANIMAL;
    }
}
