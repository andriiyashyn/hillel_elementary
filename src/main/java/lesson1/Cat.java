package lesson1;

public class Cat extends Animal {
    @Override
    public void voice() {
        super.voice();
        System.out.println("may may");
    }

    private int voice(int i) {
        return i;
    }
}
