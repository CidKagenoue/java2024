package starwars.starwars.characters;

import java.util.Objects;

public class LukeSkywalker extends StarWarsCharacter {
    private final Side side;
    private final Colour lightsaberColour;

    public LukeSkywalker() {
        super("Luke Skywalker", true);
        this.side = Side.LIGHT;
        this.lightsaberColour = Colour.GREEN;
    }

    public String favoriteFightingStyle() {
        return "Jump and strike";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LukeSkywalker)) return false;
        if (!super.equals(o)) return false;
        LukeSkywalker that = (LukeSkywalker) o;
        return side == that.side && lightsaberColour == that.lightsaberColour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side, lightsaberColour);
    }
}
