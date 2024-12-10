package les1.student.Animals;

public class Cat extends Animal implements DomesticatedAnimal,FourLeggedAnimal {
    private final CatBreed catBreed;
    private static final String sound = "miauw";

    public Cat(String name, int age, CatBreed catBreed, Gender gender) {
        super(name,age, gender);
        this.catBreed = catBreed;
        ;
    }

    public CatBreed getBreed() {
        return catBreed;
    }


    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catBreed=" + catBreed + " " +
                  super.toString();
    }
}
