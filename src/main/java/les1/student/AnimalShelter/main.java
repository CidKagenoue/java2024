package les1.student.AnimalShelter;

import les1.student.animals2.Cat;
import les1.student.animals2.CatBreed;
import les1.student.animals2.Gender;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Cat cat = new Cat("Qianta", CatBreed.PERSIAN, Gender.FEMALE_NEUTERED, LocalDate.of(2023, 3, 15));
        Dierenasiel d = new Dierenasiel();
        d.addCat(cat);
        d.printAllAnimals();
        d.showAnimal(0);
        d.removeAnimal(0);
        d.showAnimal(0);
        

    }
}
