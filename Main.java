package Main;

//Name: Leonardo Anguiano

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        p("Welcome to The Movie Database ");
        introduction();
    }

    public static void introduction() {
        boolean validInput = false;
        if (validInput != true) {
            commandsList();
            String userResponse = UserInput.readCommandInput();
            if (userResponse != "x") {
                validInput = true;
            }

            switch (userResponse) {
                case "a":
                    newEntry();
                    break;
                case "b":
                    searchActor();
                    break;
                case "c":
                    searchYear();
                    break;
                case "d":
                    searchRuntime();
                    break;
                case "e":
                    searchDirector();
                    break;
                case "f":
                    searchTitle();
                    break;
                default:
                    quit();
                    break;
            }

        }
    }

    // search by methods (figure out were they should go to whether you want them to
    // return here or somewhere else)
    /**
     * newEntry creates a new movie entry which then adds it to the data file
     */
    public static void newEntry() {
        p("");
        p("Enter title (must be more than 3 charaters)");
        String title = UserInput.generalScanner();
        if (title.length() < 3) {
            newEntry();
        } else if (Database.checkValidTitle(title)) {
            p("");
            p("That title is already in database");
            newEntry();
        }
        p("");
        p("Enter year");
        String year = UserInput.generalScanner();
        p("");
        p("Enter runtime (minutes)");
        String runtime = UserInput.generalScanner();
        p("");
        p("Enter actor 1");
        String actor1 = UserInput.generalScanner();
        p("");
        p("Enter actor 2");
        String actor2 = UserInput.generalScanner();
        p("");
        p("Enter director");
        String director = UserInput.generalScanner();
        p("");
        MovieEntry newMovieEntry = new MovieEntry(title, actor1, actor2, year, runtime, director);
        String newMovieEntryString = newMovieEntry.toString();
        FileInputOutput.addFileEntry(newMovieEntryString);
        System.out.println("Thank you for your entry. You will now be moved to main menu.");
        p("");
        FileInputOutput.closeFileAttach();
        introduction();
        UserInput.generalScanner();

    }

    public static void searchActor() {
        p("Enter actor >");
        String searchActorEntry = UserInput.generalScanner();
        p("");
        Database.actorSearchFromDatabase(searchActorEntry);
        introduction();
    }

    public static void searchYear() {
        p("Enter year >");
        String searchYearEntry = UserInput.generalScanner();
        p("");
        Database.yearSearchFromDatatBase(searchYearEntry);
        introduction();
    }

    public static void searchRuntime() {
        p("Enter runtime >");
        String searchRuntimeEntry = UserInput.generalScanner();
        Database.runtimeSearchFromDataBase(searchRuntimeEntry);
        introduction();
    }

    public static void searchDirector() {
        p("Enter Director >");
        String searchDirectorEntry = UserInput.generalScanner();
        p("");
        Database.directorSearchFromDatabase(searchDirectorEntry);
        introduction();
    }

    public static void searchTitle() {
        p("Enter title >");
        String searchTitleEntry = UserInput.generalScanner();
        p("");
        Database.titleSearchFromDatabase(searchTitleEntry);
        introduction();
    }

    public static void quit() {
        UserInput.scannerClosers();
        p("Thank you, Good Bye :)");
    }

    public static void commandsList() {
        p("What would you like to do?");
        p("a) New Entry");
        p("b) Search by actor");
        p("c) Search by year");
        p("d) Search by runtime");
        p("e) Search by director");
        p("f) Search by title");
        p("g) Any other key to Quit");
        p("");
        p("Enter a - g");
    }

    public static <E> void p(E item) {
        System.out.println(item);
    }

}
