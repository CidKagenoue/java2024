package les2.dice;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int rollAll6Counter = 0;
        int rollAllSameCounter = 0;
        int rollSequenceCounter = 0;

        Dice d1 = new Dice();
        Dice d2 = new Dice();
        Dice d3 = new Dice();
        Dice d4 = new Dice();
        Dice d5 = new Dice();

        for(int i =0; i < 10000; i++) {
            int roll1 = d1.roll();
            int roll2 = d2.roll();
            int roll3 = d3.roll();
            int roll4 = d4.roll();
            int roll5 = d5.roll();

            if (roll1 == roll2 && roll1 == roll3 && roll1 == roll4 && roll1 == roll5) {
                rollAllSameCounter++;
                if (roll1 == 6) {
                    rollAll6Counter++;
                }
            } else {
                List<Integer> rolls = new ArrayList<>();
                rolls.add(roll1);
                rolls.add(roll2);
                rolls.add(roll3);
                rolls.add(roll4);
                rolls.add(roll5);
                if(rolls.contains(1) && rolls.contains(2) && rolls.contains(3) && rolls.contains(4) && rolls.contains(5)) {
                    rollSequenceCounter++;
                }
                if(rolls.contains(2) && rolls.contains(3) && rolls.contains(4) && rolls.contains(5) && rolls.contains(6)) {
                    rollSequenceCounter++;
                }
            }
        }

        System.out.println("Aantal keer 6 gegooid : " + rollAll6Counter);
        System.out.println("Aantal keer gelijk gegooid : " + rollAllSameCounter);
        System.out.println("Aantal keer sequentie gegooid : " + rollSequenceCounter);
    }
}
