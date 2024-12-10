package les1.student.Animals;

public class Main {
    public static void main(String[] args) {
        Cat kat = new Cat("mike",12,CatBreed.PERSIAN,Gender.FEMALE);
        kat.makeSound();
        System.out.println(kat.toString());

        Dog hond = new Dog("koek",12,DogBreed.GROTEHOND,Gender.MALE);
        System.out.println(hond.toString());
        hond.makeSound();

        Lion leeuw = new Lion("kori",25,Gender.MALE);
        System.out.println(leeuw.toString());
        leeuw.makeSound();

        Monkey monke = new Monkey("kort",25,Gender.MALE);
        System.out.println(monke.toString());
        monke.makeSound();

    }
}
