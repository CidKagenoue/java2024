package les2.animals;

import java.util.ArrayList;
import java.util.List;

public class Cage<T extends Animal> {
    private final int maxAnimals;
    private final List<T> animals = new ArrayList<>();

    public Cage(int maxAnimals) {
        this.maxAnimals = maxAnimals;
    }

    public boolean addAnimal(T animal) {
        if (animals.size() >= maxAnimals) {
            return false;
        } else {
            animals.add(animal);
            return true;
        }
    }

    public void showAnimals() {
        for (T animal : animals) {
            System.out.println(animal.toString());
        }
    }

}
