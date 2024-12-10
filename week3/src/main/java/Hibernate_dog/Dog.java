package Hibernate_dog;

import jakarta.persistence.*;

@Entity
@Table(name = "Dog")
public class Dog{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "breed")
    private String breed;
    @Column(name = "weight_Male")
    private int weight_Male;
    @Column(name = "weight_Female")
    private int weight_Female;
    @Column(name = "age")
    private int age;

    public Dog(String breed, Double aDouble, Double valueOf, String s) {

    }

    public Dog(String breed, int weight_Male, int weight_Female, int age) {
        this.breed = breed;
        this.weight_Male = weight_Male;
        this.weight_Female = weight_Female;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
