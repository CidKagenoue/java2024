package starwars.starwars.characters;

import java.util.Objects;

public class GeneralVeers extends StarWarsCharacter {
    private final Side side;

    public GeneralVeers() {
        super("General Veers", false);
        this.side = Side.DARK;
    }

    public String favoriteFightingStyle() {
        return "Ride AT-AT";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GeneralVeers)) return false;
        if (!super.equals(o)) return false;
        GeneralVeers that = (GeneralVeers) o;
        return side == that.side;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side);
    }
}
