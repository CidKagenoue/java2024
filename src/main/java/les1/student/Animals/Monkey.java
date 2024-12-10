package les1.student.Animals;

public class Monkey extends Animal implements WildAnimal {
    private static final String sound = "oeoeooeo";

    public Monkey(String name, int age, Gender gender) {
        super(name, age, gender);
    }


    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String toString() {
        return "Monky{ " + "endangerd= " + endangerd() + " " + super.toString();
    }

    @Override
    public boolean endangerd() {
        return false;
    }
}
