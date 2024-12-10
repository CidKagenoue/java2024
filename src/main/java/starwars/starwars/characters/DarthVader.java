package starwars.starwars.characters;

import java.util.Objects;

public class DarthVader extends StarWarsCharacter {
    private Side side;
    private final Colour lightsaberColour;

    public DarthVader() {
        super("Darth Vader", true);
        this.side = Side.DARK;
        this.lightsaberColour = Colour.RED;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public String favoriteFightingStyle() {
        return "Throw lightsaber";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DarthVader)) return false;
        if (!super.equals(o)) return false;
        DarthVader that = (DarthVader) o;
        return getSide() == that.getSide() && lightsaberColour == that.lightsaberColour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSide(), lightsaberColour);
    }
}
