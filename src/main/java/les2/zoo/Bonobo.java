package les2.zoo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Bonobo implements Comparable<Bonobo> {
    private final int id;
    private final String name;
    private final LocalDate dateOfBirth;
    private final Gender gender;

    public Bonobo(int id, String name, LocalDate yearOfBirth, Gender gender) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = yearOfBirth;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public long getAge() {
        LocalDateTime now = LocalDateTime.now();
        Duration between = Duration.between(dateOfBirth.atStartOfDay(), now);
        return between.toDays() / 365;
    }

    @Override
    public String toString() {
        return "Bonobo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                '}';
    }

    @Override
    public int compareTo(Bonobo o) {
        return name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bonobo bonobo = (Bonobo) o;
        return id == bonobo.id && Objects.equals(name, bonobo.name) && Objects.equals(dateOfBirth.getYear(), bonobo.dateOfBirth.getYear()) && gender == bonobo.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dateOfBirth.getYear(), gender);
    }
}
