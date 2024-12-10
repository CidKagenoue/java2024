package animals;

import java.time.LocalDate;
import java.util.Objects;

public class Dog extends Animal implements DomesticatedAnimal, FourLeggedAnimal {
    private static final String SOUND = "Barks";

    private final DogBreed breed;

    public Dog(String name, DogBreed breed, Gender gender, LocalDate dateOfBirth) {
        super(name, gender, dateOfBirth);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(SOUND);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed=" + breed +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed);  // Safer breed comparison
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed);
    }
}
