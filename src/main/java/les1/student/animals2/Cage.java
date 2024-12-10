package les1.student.animals2;

import java.util.ArrayList;
import java.util.List;

public class Cage<T> {

    List<T> list = new ArrayList<>();

    public void addAnimal(T animal) {
        list.add(animal);
    }

    public void showAnimals() {
        for (T animal : list) {
            System.out.println(animal);
        }
    }


}
