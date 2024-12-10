package starwars.starwars.characters;

import java.util.Objects;

public class KyloRen extends StarWarsCharacter {
    private final Colour lightsaberColour;

    public KyloRen() {
        super("Kylo Ren", true);
        this.lightsaberColour = Colour.RED;
    }

    @Override
    public String favoriteFightingStyle() {
        return "Force push";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof KyloRen)) return false;
        if (!super.equals(o)) return false;
        KyloRen kyloRen = (KyloRen) o;
        return lightsaberColour == kyloRen.lightsaberColour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lightsaberColour);
    }
}
