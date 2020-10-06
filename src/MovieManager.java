import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;

public class MovieManager {

    private ArrayList<Movie> movies;

    MovieManager(){
//        super();
        this.movies = new ArrayList<Movie>();
        System.out.println("Movie Manager is Running");
    }

    void addMovie(String title, String genre, Date release, HashSet<String> actors){
        Movie movie = new Movie(title, genre, release, actors);
        movies.add(movie);
        System.out.println("New Movie Added");
    }


    void showMovies(){
        for(Movie m: movies){
            System.out.println(m.getTitle());
            System.out.println(m.getActors().toString());
        }
    }
}
