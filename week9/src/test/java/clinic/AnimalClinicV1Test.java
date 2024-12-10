package clinic;

import model.Animal;
import model.AnimalType;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnimalClinicV1Test {

    @org.junit.jupiter.api.Test
    void addOneAnimal() {
        AnimalClinicV1 clinic = new AnimalClinicV1();
        Animal dier = new Animal("dier", AnimalType.DOG,"jeff");
        int size = clinic.addAnimal(dier);
        assertEquals(1,size);
    }

    @Test
    void addTwoAnimals() {
        AnimalClinicV1 clinic = new AnimalClinicV1();
        Animal dier = new Animal("cattoe", AnimalType.DOG,"jeff");
        Animal dier2 = new Animal("dawg", AnimalType.CAT,"marie");
        int size = clinic.addAnimal(dier);
        size = clinic.addAnimal(dier2);
        assertEquals(2,size);
    }

    @Test
    void addTwoSameAnimals() {
        AnimalClinicV1 clinic = new AnimalClinicV1();
        Animal dier = new Animal("cattoe", AnimalType.DOG,"jeff");
        int size = clinic.addAnimal(dier);
        size = clinic.addAnimal(dier);
        assertEquals(1,size);
    }


    @Test
    void findAnimal() {
        AnimalClinicV1 clinic = new AnimalClinicV1();
        Animal dier = new Animal("cattoe", AnimalType.DOG,"jeff");
        clinic.addAnimal(dier);
        Animal actual = clinic.findAnimal("cattoe", AnimalType.DOG);
        assertEquals(dier,actual);

    }

    @Test
    void findAnimalsInListOf2() {
        AnimalClinicV1 clinic = new AnimalClinicV1();
        Animal dier = new Animal("cattoe", AnimalType.DOG,"jeff");
        Animal dier2 = new Animal("catty", AnimalType.DOG,"loly");
        clinic.addAnimal(dier);
        clinic.addAnimal(dier2);
        Animal actual = clinic.findAnimal("cattoe", AnimalType.DOG);
        assertEquals(dier,actual);
    }
    @Test
    void findOtherAnimalExpectNull() {
        AnimalClinicV1 clinic = new AnimalClinicV1();
        Animal dier = new Animal("cattoe", AnimalType.DOG,"jeff");
        clinic.addAnimal(dier);
        Animal actual = clinic.findAnimal("cattyy", AnimalType.CAT);
        assertNull(actual);
    }

    @Test
    void countZeroAnimals() {
        AnimalClinicV1 clinic = new AnimalClinicV1();
        assertEquals(0,clinic.countAnimals());
    }

    @Test
    void count5Animals() {
        AnimalClinicV1 clinic = new AnimalClinicV1();
        Animal dier = new Animal("cattoe", AnimalType.DOG,"jeff");
        Animal dier2 = new Animal("catty", AnimalType.DOG,"jeff");
        Animal dier3 = new Animal("cats", AnimalType.DOG,"jeff");
        Animal dier4 = new Animal("car", AnimalType.DOG,"jeff");
        Animal dier5 = new Animal("catss", AnimalType.DOG,"jeff");
        int size = clinic.addAnimal(dier);
        size = clinic.addAnimal(dier2);
        size= clinic.addAnimal(dier3);
        size= clinic.addAnimal(dier4);
        size= clinic.addAnimal(dier5);
        assertEquals(5,size);
    }

    @Test
    void findAllAnimalsForAllOwners(){
        AnimalClinicV1 clinic = new AnimalClinicV1();
        Animal dier = new Animal("cardf", AnimalType.DOG,"jeff");
        Animal dier2 = new Animal("cartt", AnimalType.DOG,"cloeh");
        Animal dier3 = new Animal("caryy", AnimalType.DOG,"jeff");
        clinic.addAnimal(dier);
        clinic.addAnimal(dier2);
        clinic.addAnimal(dier3);
        List<Animal> animals = clinic.findAllAnimalsForOwner("jeff");
        assertTrue(animals.contains(dier));
        assertTrue(animals.contains(dier3));
        assertFalse(animals.contains(dier2));
    }

    @Test
    void changeOwnerOfExistingAnimal(){
        AnimalClinicV1 clinic = new AnimalClinicV1();
        Animal dier = new Animal("caryy", AnimalType.DOG,"jeff");
        clinic.addAnimal(dier);
        boolean change = clinic.changeAnimalOwner("caryy",AnimalType.DOG,"rayan");
        Animal actual = clinic.findAnimal("caryy",AnimalType.DOG);
        assertTrue(change);
        assertEquals(actual,dier);
    }

    @Test
    void changeOwnerOfNonExistingAnimal(){
        AnimalClinicV1 clinic = new AnimalClinicV1();
        Animal dier = new Animal("caryy", AnimalType.DOG,"jeff");
        clinic.addAnimal(dier);
        boolean change = clinic.changeAnimalOwner("baldy",AnimalType.CAT,"rayan");
        assertFalse(change);
    }











}
