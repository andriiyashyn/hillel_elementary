package lesson1.intr;

public class Cat extends AbstractAnimal implements Animal {
    @Override
    public void voice() {
        System.out.println("voice cat");
    }
}
