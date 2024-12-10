package starwars.starwars.troopers;

import java.util.Objects;

public class StormTrooper implements Comparable<StormTrooper> {
    private final String name;
    private final Rank rank;

    public StormTrooper(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "StormTrooper{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StormTrooper trooper = (StormTrooper) o;
        return Objects.equals(name, trooper.name) && rank == trooper.rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rank);
    }

    @Override
    public int compareTo(StormTrooper o) {
        if (this.rank == Rank.SERGEANT && o.rank == Rank.TROOPER) {
            return -1;
        } else if(this.rank == Rank.TROOPER && o.rank == Rank.SERGEANT) {
            return 1;
        } else {
            return 0;
        }
    }
}
