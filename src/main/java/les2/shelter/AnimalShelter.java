package les2.shelter;

import les2.animals.Animal;
import les2.animals.Cat;
import les2.animals.Dog;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {
    private List<Animal> animals = new ArrayList<>();

    public void addCat(Cat cat) {
        animals.add(cat);
    }

    public void addDog(Dog dog) {
        animals.add(dog);
    }

    public void printAllAnimals() {
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(i + " " + animals.get(i).toString());
        }
    }

    public void showAnimal(int index) {
        if(index < animals.size()) {
            System.out.println(animals.get(index).toString());
        }
    }

    public void removeAnimal(int index) {
        if(index < animals.size()) {
            animals.remove(index);
        }
    }
}
