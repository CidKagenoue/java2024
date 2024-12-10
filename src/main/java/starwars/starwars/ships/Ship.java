package starwars.starwars.ships;

import starwars.starwars.characters.StarWarsCharacter;

public class Ship<T extends StarWarsCharacter> {
    private T pilot;

    public void addPilot(T pilot) {
        this.pilot = pilot;
    }

    public void showPilot() {
        System.out.println(pilot);
    }
}
