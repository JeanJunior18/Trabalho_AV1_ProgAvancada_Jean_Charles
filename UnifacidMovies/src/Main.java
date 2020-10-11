import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws ParseException {
        MovieManager movies = new MovieManager();

        movies.addMovie(
            "A volta dos que não foram",
            "Ação",
            new SimpleDateFormat("dd/MM/yyyy").parse("27/06/1980"),
            new HashSet<>(Arrays.asList("Jean", "Junior"))
        );

        movies.addMovie(
            "Toy Story 10",
            "Drama",
            new SimpleDateFormat("dd/MM/yyyy").parse("27/06/2019"),
            new HashSet<>(Arrays.asList("José", "Leandro"))
        );

        movies.addMovie(
            "Velozes e Furiosos 230, dirigindo sobre os prédios de madagascar",
            "Ficção",
            new SimpleDateFormat("dd/MM/yyyy").parse("27/06/2019"),
            new HashSet<>(Arrays.asList("Julio", "Emanuel"))
        );

        movies.removeMovie("Toy Story 10");
        movies.searchMovie("Toy Story 10");

        movies.addActor("Toy Story 10", "Ferdinando");
        movies.removeActor("Toy Story 10", "José");
        movies.listActors("Toy Story 10");

        movies.showAllMovies();
    }
}
