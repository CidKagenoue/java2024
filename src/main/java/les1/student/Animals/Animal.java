package les1.student.Animals;

public abstract class Animal {
    private final String name;
    private final int age;
    private final Gender gender;

    public Animal(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + getAge() +
                ", gender=" + gender +
                '}';
    }
}
