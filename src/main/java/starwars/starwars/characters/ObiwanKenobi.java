package starwars.starwars.characters;

import java.util.Objects;

public class ObiwanKenobi extends StarWarsCharacter {
    private final Colour lightsaberColour;

    public ObiwanKenobi() {
        super("Obi-Wan Kenobi", true);
        this.lightsaberColour = Colour.BLUE;
    }

    @Override
    public String favoriteFightingStyle() {
        return "Overhead lightsaber swing";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObiwanKenobi)) return false;
        if (!super.equals(o)) return false;
        ObiwanKenobi that = (ObiwanKenobi) o;
        return lightsaberColour == that.lightsaberColour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lightsaberColour);
    }
}
