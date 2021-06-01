package commons;

import manager.booking.AddBooking;

import java.io.*;

public class WriteAndReadBooking {
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static void writeBooking() throws IOException {
        FileWriter input = new FileWriter("D:\\C0321G1_NguyenThiNhung_Module2\\CaseStudy_Module2\\src\\data\\Booking.csv", true);
        BufferedWriter bufferedWriter = new BufferedWriter(input);
        try {
            String booking = AddBooking.addNewBooking();
            bufferedWriter.write(booking);
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
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
            ouput.close();
        }
    }
}

