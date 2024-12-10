package les1.student.Animals;

public class Lion extends Animal implements WildAnimal,FourLeggedAnimal {
    private static final String sound = "roar";

    public Lion(String name, int age, Gender gender) {
        super(name, age, gender);
    }


    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String toString() {
        return "Lion{ " + "endangerd= " + endangerd() + " " +super.toString();
    }

    @Override
    public boolean endangerd() {
        return true;
    }
}
