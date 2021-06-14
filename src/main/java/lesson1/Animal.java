package lesson1;

public class Animal {
    private int height;
    private String weight;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (height != animal.height) return false;
        return weight != null ? weight.equals(animal.weight) : animal.weight == null;
    }

    @Override
    public int hashCode() {
        int result = height;
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        return result;
    }
}
