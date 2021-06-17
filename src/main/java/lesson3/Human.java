package lesson3;

import lesson1.Animal;

public class Human<T, U, Y> {
    private T first;
    private U asda;
    private Y asdasd;

    public Human(T first, U asda, Y asdasd) {
        this.first = first;
        this.asda = asda;
        this.asdasd = asdasd;
    }

    public Y test(T test) {
        return asdasd;
    }
}
