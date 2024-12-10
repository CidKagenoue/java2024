package starwars.starwars.characters;

import java.util.Objects;

public class HanSolo extends StarWarsCharacter {
    private final Side side;

    public HanSolo() {
        super("Han Solo", false);
        this.side = Side.LIGHT;
    }

    public String favoriteFightingStyle() {
        return "Shoot blaster";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HanSolo)) return false;
        if (!super.equals(o)) return false;
        HanSolo hanSolo = (HanSolo) o;
        return side == hanSolo.side;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side);
    }
}
