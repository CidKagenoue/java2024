package les1.student.animals2;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello animals");

        Cat cat = new Cat("Qianta", CatBreed.PERSIAN, Gender.FEMALE_NEUTERED, LocalDate.of(2023, 3, 15));
        System.out.println(cat.toString());
        cat.makeSound();

        Dog dog = new Dog("Spike", DogBreed.BULLDOG, Gender.MALE, LocalDate.of(2015, 8, 12));
        System.out.println(dog.toString());
        dog.makeSound();

        Monkey monkey = new Monkey("Guust", Gender.MALE, LocalDate.of(2008, 1, 20));
        System.out.println(monkey.toString());
        monkey.makeSound();

        Lion lion = new Lion("Simba", Gender.MALE, LocalDate.of(2022, 6, 1));
        System.out.println(lion.toString());
        lion.makeSound();
    }
}
