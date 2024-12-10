package starwars.starwars.characters;

import java.util.Objects;

public abstract class StarWarsCharacter {
    private final String name;
    private final boolean forceUser;

    public StarWarsCharacter(String name, boolean forceUser) {
        this.name = name;
        this.forceUser = forceUser;
    }

    public String getName() {
        return name;
    }

    public boolean isForceUser() {
        return forceUser;
    }

    public abstract String favoriteFightingStyle();

    @Override
    public String toString() {
        return "StarWarsCharacter{" +
                "name='" + name + '\'' +
                ", forceUser=" + forceUser +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StarWarsCharacter)) return false;
        StarWarsCharacter that = (StarWarsCharacter) o;
        return isForceUser() == that.isForceUser() && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isForceUser());
    }
}
