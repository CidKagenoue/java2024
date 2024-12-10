package starwars.starwars.movies;

import java.time.LocalDate;
import java.util.List;

import starwars.starwars.characters.StarWarsCharacter;

public class StarWarsMovie implements Comparable<StarWarsMovie> {
    private final int episode;
    private final String title;
    private final LocalDate releaseDate;
    private final String director;
    private final List<StarWarsCharacter> mainCharacters;

    public StarWarsMovie(int episode, String title, LocalDate releaseDate, String director, List<StarWarsCharacter> mainCharacters) {
        this.episode = episode;
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
        this.mainCharacters = mainCharacters;
    }

    public int getEpisode() {
        return episode;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getDirector() {
        return director;
    }

    public List<StarWarsCharacter> getMainCharacters() {
        return mainCharacters;
    }

    @Override
    public String toString() {
        return "StarWarsMovie{" +
                "episode=" + getEpisode() +
                ", title='" + getTitle() + '\'' +
                ", releaseDate=" + getReleaseDate() +
                ", director='" + getDirector() + '\'' +
                ", mainCharacters=" + getMainCharacters() +
                '}';
    }

    @Override
    public int compareTo(StarWarsMovie o) {
        return Integer.compare(this.episode, o.episode);
    }
}
