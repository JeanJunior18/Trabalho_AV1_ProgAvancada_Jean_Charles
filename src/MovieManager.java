import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

public class MovieManager {

    private ArrayList<Movie> movies;

    public MovieManager(){
        this.movies = new ArrayList<Movie>();
        System.out.println("Movie Manager is Running");
    }

    public void addMovie(String title, String genre, Date release, HashSet<String> actors){
        Movie movie = new Movie(title, genre, release, actors);
        movies.add(movie);
        System.out.println("New Movie Added");
    }

    public ArrayList<String> showAllMovies(){
        ArrayList<String> titles = new ArrayList<String>();

        movies.stream().forEach(m -> titles.add(m.getTitle()));
        System.out.println(titles);
        return titles;
    }

    public Movie searchMovie(String title){
        Movie m = movies
                .stream()
                .filter(movie -> movie.getTitle() == title)
                .findAny()
                .orElse(null);
        if(m != null){
            System.out.println(m.getTitle());
            return m;
        }else {
            System.out.println("Movie \""+title+"\" Not Found!");
            return null;
        }
    }

    public void removeMovie(String title){
        Movie m = movies
                .stream()
                .filter(movie -> movie.getTitle() == title)
                .findAny()
                .orElse(null);
        if(m != null){
            movies.remove(m);
            System.out.println("Removed Movie \""+ title+"\"");
        }else {
            System.out.println("Movie \""+ title +"\" Not Found!");
        }
    }

    public void listActors(String title){
        Movie m = movies
                .stream()
                .filter(movie -> movie.getTitle() == title)
                .findAny()
                .orElse(null);
        if(m != null)
            System.out.println(m.getActors());
        else
            System.out.println("Movie \""+ title +"\" Not Found!");
    }

    public void addActor(String title, String actor){
        Movie m = movies
                .stream()
                .filter(movie -> movie.getTitle() == title)
                .findAny()
                .orElse(null);

        if(m != null){
            m.addActor(actor);
            System.out.println("Actor \""+actor+"\" added to movie \""+title+"\"");
        }
        else{
            System.out.println("Cannot add actor, movie \""+ title +"\" Not Found!");
        }
    }

    public void removeActor(String title, String actor){
        Movie m = movies
                .stream()
                .filter(movie -> movie.getTitle() == title)
                .findAny()
                .orElse(null);

        if(m != null){
            m.removeActor(actor);
            System.out.println("Actor \""+actor+"\" removed to movie \""+title+"\"");
        }
        else{
            System.out.println("Cannot remove actor, movie \""+ title +"\" Not Found!");
        }
    }
}
