package starwars;

import java.awt.image.ImageProducer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import starwars.starwars.characters.AnakinSkywalker;
import starwars.starwars.characters.DarthVader;
import starwars.starwars.characters.GeneralVeers;
import starwars.starwars.characters.HanSolo;
import starwars.starwars.characters.KyloRen;
import starwars.starwars.characters.LukeSkywalker;
import starwars.starwars.characters.ObiwanKenobi;
import starwars.starwars.characters.Rey;
import starwars.starwars.movies.StarWarsMovie;
import starwars.starwars.characters.StarWarsCharacter;

public class Main {

    public static void main(String[] args) {

        List<StarWarsMovie> movies = new ArrayList<>();
        movies.add(new StarWarsMovie(1, "The Phantom Menace", LocalDate.of(1999, 1, 1), "George Lucas",
                Arrays.asList(new ObiwanKenobi(), new AnakinSkywalker())));
        movies.add(new StarWarsMovie(2, "Attack of the Clones", LocalDate.of(2002, 1, 1), "George Lucas",
                Arrays.asList(new ObiwanKenobi(), new AnakinSkywalker())));
        movies.add(new StarWarsMovie(3, "Revenge of the Sith", LocalDate.of(2005, 1, 1), "George Lucas",
                Arrays.asList(new ObiwanKenobi(), new AnakinSkywalker(), new DarthVader())));
        movies.add(new StarWarsMovie(4, "A New Hope", LocalDate.of(1977, 1, 1), "George Lucas",
                Arrays.asList(new ObiwanKenobi(), new LukeSkywalker(), new DarthVader(), new HanSolo())));
        movies.add(new StarWarsMovie(5, "The Empire Strikes Back", LocalDate.of(1980, 1, 1), "Irvin Kershner",
                Arrays.asList(new LukeSkywalker(), new DarthVader(), new HanSolo(), new GeneralVeers())));
        movies.add(new StarWarsMovie(6, "Return of the Jedi", LocalDate.of(1983, 1, 1), "Richard Marquand",
                Arrays.asList(new LukeSkywalker(), new DarthVader(), new HanSolo(), new AnakinSkywalker())));
        movies.add(new StarWarsMovie(7, "The Force Awakens", LocalDate.of(2015, 1, 1), "J. J. Abrams",
                Arrays.asList(new HanSolo(), new Rey(), new KyloRen())));
        movies.add(new StarWarsMovie(8, "The Last Jedi", LocalDate.of(2017, 1, 1), "Rian Johnson",
                Arrays.asList(new Rey(), new KyloRen(), new LukeSkywalker())));
        movies.add(new StarWarsMovie(9, "The Rise of Skywalker", LocalDate.of(2019, 1, 1), "J. J. Abrams",
                Arrays.asList(new Rey(), new KyloRen(), new LukeSkywalker())));

        //movies.stream();

        Predicate<StarWarsMovie> episodeFilter = movie -> movie.getEpisode() < 5;


        List<StarWarsMovie> res = movies.stream().toList();
        Map<String, List<StarWarsMovie>> map = movies.stream().
                collect(Collectors.groupingBy(StarWarsMovie::getDirector));

        List<StarWarsMovie> result = movies.stream()
                .filter(movie -> movie.getEpisode() < 5)
                .collect(Collectors.toList());

        //result.forEach(System.out::println);

        List<StarWarsMovie> result2 = movies.stream()
                .sorted()
                .toList();
        result2.forEach(System.out::println);





    }
}
















