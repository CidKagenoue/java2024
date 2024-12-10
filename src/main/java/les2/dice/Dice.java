package les2.dice;

import java.util.Random;

public class Dice {
    private final int pips;

    public Dice() {
        pips = 6;
    }

    public Dice(int pips) {
        this.pips = pips;
    }

    public int roll() {
        Random random = new Random();
        return random.nextInt((pips - 1) + 1) + 1;
    }
}
