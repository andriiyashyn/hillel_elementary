package lesson1.intr;

public class Dog extends AbstractAnimal implements Animal {
    @Override
    public void voice() {
        System.out.println("voice dog");
    }
}
