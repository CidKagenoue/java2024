package Week6;

import animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Owner {
        private String firstName;
        private String lastName;
        private List<Pet> pets;

        public Owner(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.pets = new ArrayList<>();
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public List<Pet> getPets() {
            return pets;
        }

        public void addPet(Pet pet) {
            pets.add(pet);
        }

    @Override
    public String toString() {
        return "Owner{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pets=" + pets +
                '}';
    }
}