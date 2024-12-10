package les1.student.AnimalShelter;

import les1.student.animals2.Animal;
import les1.student.animals2.Cat;
import les1.student.animals2.Dog;

import java.util.ArrayList;
import java.util.List;

public class Dierenasiel {

    List<Animal> list = new ArrayList<>();

    public void addCat(Cat cat){
        list.add(cat);
    }
    public void addDog(Dog dog){
        list.add(dog);
    }

    public void printAllAnimals(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " " + list.get(i));

        }
    }

    public void showAnimal(int index){
        System.out.println(list.get(index));

    }

    public void removeAnimal(int index){
        list.remove(index);
    }

}
