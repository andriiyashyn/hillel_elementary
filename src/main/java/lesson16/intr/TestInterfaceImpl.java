package lesson16.intr;

public class TestInterfaceImpl implements TestInterface {
    @Override
    public int swim() {
        return 0;
    }


    @Override
    public void run() {
        System.out.println("test impl");
    }
}
