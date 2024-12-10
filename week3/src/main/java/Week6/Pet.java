package Week6;

import java.util.Date;

public class Pet {

    public String name;
    public String birthDate;
    public String type;

    public Pet(String name, String birthDate, String type) {
        this.name = name;
        this.birthDate = birthDate;
        this.type = type;
    }


    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", type=" + type +
                '}';
    }
}
