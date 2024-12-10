package les2.shelter;

import les2.animals.*;

import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        shelter.addCat(new Cat("Qianta", CatBreed.SIAMESE, LocalDate.of(2023,3,15), Gender.FEMALE_NEUTERED));
        shelter.addDog(new Dog("Brutus", DogBreed.BULLDOG, LocalDate.of(2020, 5, 18), Gender.MALE));
        shelter.addCat(new Cat("Pluisje", CatBreed.RAGDOLL, LocalDate.of(2018, 4, 5), Gender.FEMALE));

        shelter.printAllAnimals();

        shelter.showAnimal(1);
        shelter.removeAnimal(1);
        shelter.printAllAnimals();






        Scanner sc = new Scanner(System.in);

        int input = 0;
        int teller = 1;

        while (input != 6) {
            System.out.println("Welkom bij het dierenasiel.");
            System.out.println("wat wil je doen:");
            System.out.println("1 : voeg een kat toe");
            System.out.println("2 : voeg een hond toe");
            System.out.println("3 : toon alle dieren");
            System.out.println("4 : toon dier");
            System.out.println("5 : verwijder dier");
            System.out.println("6 : einde");
            input = sc.nextInt();

            switch (input) {

                case 1:
                    System.out.println("geef naam van kat");
                    String naamCat = sc.next();
                    System.out.println("Geef kat breed (PERSIAN, RAGDOLL, BENGAL, SIAMESE, SPHYNX");
                    String breedCat = sc.next();
                    System.out.println("Geef kat gender (MALE, MALE_NEUTERED, FEMALE, FEMALE_NEUTERED)");
                    String genderCat = sc.next();
                    System.out.println("Geef kat geboortedatum (yyyy-mm-dd)");
                    String date = sc.next();

                    shelter.addCat(new Cat(naamCat, CatBreed.valueOf(breedCat), LocalDate.parse(date), Gender.valueOf(genderCat)));
                    break;
                    case 2:
                        System.out.println("geef naam van kat");
                        String naamHond = sc.next();
                        System.out.println("Geef dog breed (LABRADOR_RETRIEVER, BULLDOG, POODLE, BEAGLE, GERMAN_SHEPHERD");
                        String breedHond = sc.next();
                        System.out.println("Geef dog gender (MALE, MALE_NEUTERED, FEMALE, FEMALE_NEUTERED)");
                        String genderHond = sc.next();
                        System.out.println("Geef dog geboortedatum (yyyy-mm-dd)");
                        String dateH = sc.next();
                        shelter.addDog(new Dog(naamHond, DogBreed.valueOf(breedHond), LocalDate.parse(dateH), Gender.valueOf(genderHond)));

                        break;
                        case 3:
                            shelter.printAllAnimals();
                            break;
                        case 4:
                            System.out.println("geef aan de hoeveelste dier je wilt zien(nummer)");
                            int index = sc.nextInt();
                            shelter.showAnimal(index);
                            break;
                        case 5:
                            System.out.println("welk dier wil je verwijderen");
                            int indexR = sc.nextInt();
                            shelter.removeAnimal(indexR);
                            break;



            }
        }





    }
}
