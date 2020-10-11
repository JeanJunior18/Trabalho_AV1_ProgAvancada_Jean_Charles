import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Movie {

    private String title;
    private String genre;
    private Date release;
    private Set<String> actors;

    public Movie(String title, String genre, Date release, HashSet<String> actors){
        super();
        this.title = title;
        this.genre = genre;
        this.release = release;
        this.actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public Set<String> getActors() {
        return actors;
    }

    public void addActor(String actor){
        this.actors.add(actor);
    }

    public void removeActor(String actor){
        this.actors.remove(actor);
    }
}
