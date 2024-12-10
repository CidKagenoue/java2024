package les1.student.Animals;

public class Dog extends Animal implements DomesticatedAnimal, FourLeggedAnimal {
    private final DogBreed DogBreed;
    private static final String sound = "woef";

    public Dog(String name, int age, DogBreed DogBreed, Gender gender) {
        super(name, age, gender);
        this.DogBreed = DogBreed;
    }


    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String toString() {
        return "Dog{" +
                ", DogBreed=" + DogBreed + " " +
                 super.toString();
    }
}
