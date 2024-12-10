package starwars.starwars.characters;

import java.util.Objects;

public class Rey extends StarWarsCharacter {
    private final Colour lightsaberColour;

    public Rey() {
        super("Rey", true);
        this.lightsaberColour = Colour.BLUE;
    }

    @Override
    public String favoriteFightingStyle() {
        return "Swing around";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rey)) return false;
        if (!super.equals(o)) return false;
        Rey rey = (Rey) o;
        return lightsaberColour == rey.lightsaberColour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lightsaberColour);
    }
}
