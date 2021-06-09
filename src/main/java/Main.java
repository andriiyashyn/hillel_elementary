import lesson1.Animal;
import lesson1.Cat;

public class Main extends Animal {

    public static int ifaffas() {
        return 1;
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.voice();

        Animal cat = new Cat();
        cat.voice();

        Main main = new Main();
        main.test(cat);
    }

    public static void test(Animal animal) {
        animal.voice();
        if (animal instanceof Cat) {
            System.out.println("this is cat");
        }

        if (animal instanceof Animal) {
            System.out.println("this is plain animal");
        }
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
    }

    static {
        System.out.println("hello");
    }
}
