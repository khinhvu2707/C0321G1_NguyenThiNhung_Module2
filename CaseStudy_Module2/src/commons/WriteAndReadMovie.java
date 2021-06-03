package commons;

import models.Employee;
import models.Movie;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadMovie {
        private static final String COMMA_DELIMITER = ",";
        private static final String NEW_LINE_SEPARATOR = "\n";

        public static void writeMovie(String name, String category, String time, String tickket) throws IOException {
            FileWriter input = new FileWriter("D:\\C0321G1_NguyenThiNhung_Module2\\CaseStudy_Module2\\src\\data\\Movie.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(input);
            try {
                bufferedWriter.append(name);
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(category);
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(time);
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(tickket);
                bufferedWriter.append(NEW_LINE_SEPARATOR);
                System.out.println("Success!");
            } catch (
                    Exception e) {
                e.printStackTrace();
            } finally {
                bufferedWriter.close();
                input.close();
            }

        }

        public static List<Movie> readMovie() {
            List<Movie> result = new ArrayList<>();
            try {
                FileReader fileReader = new FileReader("D:\\C0321G1_NguyenThiNhung_Module2\\CaseStudy_Module2\\src\\data\\Movie.csv");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] strings = line.split("_");
                    Movie movie =new Movie(strings[0], strings[1], strings[2],strings[3]);
                    result.add(movie);
                }
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return result;
        }

}
