package starwars.starwars.movies;

import java.util.Comparator;

public class SortByName implements Comparator<StarWarsMovie> {

    @Override
    public int compare(StarWarsMovie o1, StarWarsMovie o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
