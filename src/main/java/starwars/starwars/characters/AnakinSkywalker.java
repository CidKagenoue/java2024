package starwars.starwars.characters;

import java.util.Objects;

public class AnakinSkywalker extends StarWarsCharacter {
    private final Colour lightsaberColour;

    public AnakinSkywalker() {
        super("Anakin Skywalker", true);
        this.lightsaberColour = Colour.BLUE;
    }

    @Override
    public String favoriteFightingStyle() {
        return "Charge and strike";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AnakinSkywalker)) return false;
        if (!super.equals(o)) return false;
        AnakinSkywalker that = (AnakinSkywalker) o;
        return lightsaberColour == that.lightsaberColour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lightsaberColour);
    }
}
