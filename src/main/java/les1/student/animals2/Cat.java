package les1.student.animals2;

import java.time.LocalDate;

public class Cat extends Animal implements DomesticatedAnimal, FourLeggedAnimal {
    private static final String SOUND = "Meows";

    private final CatBreed breed;

    public Cat(String name, CatBreed breed, Gender gender, LocalDate dateOfBirth) {
        super(name, gender, dateOfBirth);
        this.breed = breed;
    }

    public void makeSound() {
        System.out.println(SOUND);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed=" + breed +
                "} " + super.toString();
    }
}
