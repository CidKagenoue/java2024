package les1.student.zoo;

public class Bonobo implements Comparable<Bonobo> {
    private final int id;
    private final String name;
    private final int yearOfBirth;
    private final Gender gender;

    public Bonobo(int id, String name, int yearOfBirth, Gender gender) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Bonobo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", gender=" + gender +
                '}';
    }


    @Override
    public int compareTo(Bonobo o) {
        return this.name.compareTo(o.name);

    }

}
