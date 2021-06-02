package manager.cinema;

import commons.WriteAndReadMovie;
import models.Movie;

import java.io.IOException;
import java.util.List;

public class ListMovie {
    public static void showMovie() throws IOException {
        List<Movie> result;
        result = WriteAndReadMovie.readMovie();
        for (Movie movie : result) {
            System.out.println(movie.toString());
        }
    }
}
