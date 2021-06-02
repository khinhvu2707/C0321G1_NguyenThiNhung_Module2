package manager.cinema;

import commons.WriteAndReadMovie;
import models.Movie;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AddNewMovie {
    public static void addNewMovie() throws IOException {
        int count = 0;
        while (count != 4) {
            count = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập tên phim :");
            String name = scanner.nextLine();
            System.out.println("Nhập thể loại phim :");
            String category = scanner.nextLine();
            System.out.println("Nhập thời gian chiếu :");
            String time = scanner.nextLine();
            System.out.println("Nhập số lượng vé :");
            String tickket = scanner.nextLine();

            if (Pattern.compile("^[^_]?[a-zA-Z]+$").matcher(name).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập tên phim viết liền không dấu không sử dụng dấu '_'");
            }
            if (Pattern.compile("^[^_]?[a-zA-Zà-ỹ0-9]*$").matcher(name).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập thể loại phim không sử dụng dấu '_'");
            }
            if (Pattern.compile("^[^_]?[a-zA-Zà-ỹ0-9]*$").matcher(name).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập thời gian chiếu không sử dụng dấu '_'");
            }
            if (Pattern.compile("^\\d{1,2}$").matcher(tickket).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập Số lượng vé là 1 số nguyên >0 và <100");
            }

            if (count == 4) {
                List<Movie> resultMovie;
                resultMovie = WriteAndReadMovie.readMovie();
                if (resultMovie.size() != 5) {
                    WriteAndReadMovie.writeMovie(name, category, time, tickket);
                } else {
                    System.out.println("Đã quá nhiều fiml!");
                }
            }
        }
    }
}


