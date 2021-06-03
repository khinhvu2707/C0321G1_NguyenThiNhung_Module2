package commons;

import java.io.*;

public class WriteAndReadBooking {
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static void writeBooking(String args) throws IOException {
        FileWriter input = new FileWriter("D:\\C0321G1_NguyenThiNhung_Module2\\CaseStudy_Module2\\src\\data\\Booking.csv", true);
        BufferedWriter bufferedWriter = new BufferedWriter(input);
        try {
            bufferedWriter.write(args);
            bufferedWriter.write(NEW_LINE_SEPARATOR);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.close();
            input.close();
        }
    }

    public static void readBooking() throws IOException {
        FileReader ouput = new FileReader("D:\\C0321G1_NguyenThiNhung_Module2\\CaseStudy_Module2\\src\\data\\Booking.csv");
        BufferedReader bufferedReader = new BufferedReader(ouput);
        try {
            String line;
            int index=1;

                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(index + " . " + line);
                    index++;
                }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
            ouput.close();
        }
    }
}

