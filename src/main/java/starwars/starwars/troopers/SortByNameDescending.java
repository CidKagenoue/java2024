package starwars.starwars.troopers;

import java.util.Comparator;

public class SortByNameDescending implements Comparator<StormTrooper> {
    @Override
    public int compare(StormTrooper o1, StormTrooper o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
