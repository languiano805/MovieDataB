package Main;

public class MovieEntry {
    // Fields (declares private fields needed in the assignment sheet)
    private String title, actor1, actor2, year, runtime, director;

    public MovieEntry(String title, String actor1, String actor2, String year, String runtime, String director) {
        this.title = title;
        this.actor1 = actor1;
        this.actor2 = actor2;
        this.year = year;
        this.runtime = runtime;
        this.director = director;
    }

    public String toString() {
        String larray = (title + "/" + year + "/" + runtime + "/" + actor1 + "/" + actor2 + "/" + director);
        return larray;
    }

    // create get methods to return specific data from movie entry
    public String getTitle() {
        return title;
    }

    public String getActor1() {
        return actor1;
    }

    public String getActor2() {
        return actor2;
    }

    public String getYear() {
        return year;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getDirector() {
        return director;
    }
}