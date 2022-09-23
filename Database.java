package Main;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Database {
    public static ArrayList<MovieEntry> currentDataBase() {
        ArrayList<MovieEntry> movieEntryDataBase = null;
        try {
            movieEntryDataBase = UserInput.fileEntries();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return movieEntryDataBase;

    }

    public static boolean checkValidTitle(String title) {
        title = title.toLowerCase();
        boolean sameTitle = false;
        for (int i = 0; i <= currentDataBase().size() - 1; i++) {
            MovieEntry focusMovieEntry = currentDataBase().get(i);
            if (title.equals(focusMovieEntry.getTitle().toLowerCase())) {
                sameTitle = true;
            }
        }
        return sameTitle;
    }

    // search algorithm that returns titles of movies based off of the year given
    public static void yearSearchFromDatatBase(String year) {
        ArrayList<String> titleList = new ArrayList<String>();
        for (int i = 0; i <= currentDataBase().size() - 1; i++) {
            MovieEntry focusMovieEntry = currentDataBase().get(i);
            if (year.equals(focusMovieEntry.getYear())) {
                titleList.add(focusMovieEntry.getTitle());
            }
        }
        p("Movies that came out in the year " + year);
        if (titleList.size() == 0) {
            p("No titles found for this year");
        } else {
            for (int j = 0; j <= titleList.size() - 1; j++) {
                p(titleList.get(j));
            }
        }
        p("");
    }

    public static void runtimeSearchFromDataBase(String runtime) {
        ArrayList<String> runtimeList = new ArrayList<String>();
        for (int i = 0; i <= currentDataBase().size() - 1; i++) {
            MovieEntry focusMovieEntry = currentDataBase().get(i);
            if (runtime.equals(focusMovieEntry.getRuntime())) {
                runtimeList.add(focusMovieEntry.getTitle());
            }
        }
        p("Movies that have the runtime of " + runtime);
        if (runtimeList.size() == 0) {
            p("No titles found for that runtime");
        } else {
            for (int j = 0; j <= runtimeList.size() - 1; j++) {
                p(runtimeList.get(j));
            }

        }
        p("");
    }

    public static void actorSearchFromDatabase(String actor) {
        actor = actor.toLowerCase();
        ArrayList<String> titleList = new ArrayList<String>();
        for (int i = 0; i <= currentDataBase().size() - 1; i++) {
            MovieEntry focusMovieEntry = currentDataBase().get(i);
            if (actor.equals(focusMovieEntry.getActor1().toLowerCase())) {
                titleList.add(focusMovieEntry.getTitle());
            }
        }
        for (int i = 0; i <= currentDataBase().size() - 1; i++) {
            MovieEntry focusMovieEntry = currentDataBase().get(i);
            if (actor.equals(focusMovieEntry.getActor2().toLowerCase())) {
                titleList.add(focusMovieEntry.getTitle());
            }
        }
        p("The Movies that " + actor + " has been in are: ");
        if (titleList.size() == 0) {
            p("No titles found for that actor");
        } else {
            for (int j = 0; j <= titleList.size() - 1; j++) {
                p(titleList.get(j));
            }
        }

        p("");
    }

    public static void directorSearchFromDatabase(String director) {
        director = director.toLowerCase();
        ArrayList<String> titleList = new ArrayList<String>();
        for (int i = 0; i <= currentDataBase().size() - 1; i++) {
            MovieEntry focusMovieEntry = currentDataBase().get(i);
            if (director.equals(focusMovieEntry.getDirector().toLowerCase())) {
                titleList.add(focusMovieEntry.getTitle());
            }
        }
        p("The movies " + director + " has made are: ");
        if (titleList.size() == 0) {
            p("No titles found for that director");
        } else {
            for (int j = 0; j <= titleList.size() - 1; j++) {
                p(titleList.get(j));
            }
        }

        p("");
    }

    public static void titleSearchFromDatabase(String title) {
        title = title.toLowerCase();
        MovieEntry newMovieEntry = null;
        for (int i = 0; i <= currentDataBase().size() - 1; i++) {
            MovieEntry focusMovieEntry = currentDataBase().get(i);
            if (title.equals(focusMovieEntry.getTitle().toLowerCase())) {
                newMovieEntry = currentDataBase().get(i);
            }
        }
        if (newMovieEntry == null) {
            p("Invalid title no entry available");
            p("");
        } else {
            p("Actors: " + newMovieEntry.getActor1() + ", " + newMovieEntry.getActor2());
            p("Director: " + newMovieEntry.getDirector());
            p("Year: " + newMovieEntry.getYear());
            p("Runtime: " + newMovieEntry.getRuntime());
            p("");
        }
    }

    public static <E> void p(E item) {
        System.out.println(item);
    }
}
