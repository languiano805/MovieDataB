package Main;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UserInput {
    // make reading the command input for the if statement less chaotic
    public static String readCommandInput() {
        String userInput = UserInput.generalScanner();
        String validInput;
        switch (userInput) {
            case "a":
                validInput = "a";
                break;
            case "b":
                validInput = "b";
                break;
            case "c":
                validInput = "c";
                break;
            case "d":
                validInput = "d";
                break;
            case "e":
                validInput = "e";
                break;
            case "f":
                validInput = "f";
                break;
            case "g":
                validInput = "g";
                break;
            default:
                validInput = "x";
                break;
        }
        return validInput;
    }

    public static ArrayList<MovieEntry> fileEntries() throws FileNotFoundException {
        ArrayList<MovieEntry> movieEntries = new ArrayList<MovieEntry>();
        Scanner fileScan = new Scanner(FileInputOutput.fileData());

        String title, year, runtime, actor1, actor2, director;

        while (fileScan.hasNextLine()) {
            String fileString = fileScan.nextLine();
            StringTokenizer st = new StringTokenizer(fileString, "/");
            title = st.nextToken();
            year = st.nextToken();
            runtime = st.nextToken();
            actor1 = st.nextToken();
            actor2 = st.nextToken();
            director = st.nextToken();
            MovieEntry newMovieEntry = new MovieEntry(title, actor1, actor2, year, runtime, director);
            movieEntries.add(newMovieEntry);
        }
        return movieEntries;

    }

    public static Scanner thisScanner() {
        Scanner s = new Scanner(System.in);
        return s;
    }

    public static String generalScanner() {

        String userInput = thisScanner().nextLine();
        return userInput;
    }

    public static void scannerClosers() {
        thisScanner().close();
    }

    public static <E> void p(E item) {
        System.out.println(item);
    }
}
