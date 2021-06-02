package commons;

import models.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class WriteAndReadRoom {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static void writeRoom(String id, String tenDichVu, String dienTichSD, String chiPhiThue, String soNguoiTD, String kieuThue, String dichVuMP) throws IOException {

        FileWriter input = new FileWriter("D:\\C0321G1_NguyenThiNhung_Module2\\CaseStudy_Module2\\src\\data\\Room.csv", true);
        BufferedWriter bufferedWriter = new BufferedWriter(input);
        try {
            bufferedWriter.append(id);
            bufferedWriter.append(COMMA_DELIMITER);
            bufferedWriter.append(tenDichVu);
            bufferedWriter.append(COMMA_DELIMITER);
            bufferedWriter.append(dienTichSD);
            bufferedWriter.append(COMMA_DELIMITER);
            bufferedWriter.append(chiPhiThue);
            bufferedWriter.append(COMMA_DELIMITER);
            bufferedWriter.append(soNguoiTD);
            bufferedWriter.append(COMMA_DELIMITER);
            bufferedWriter.append(kieuThue);
            bufferedWriter.append(COMMA_DELIMITER);
            bufferedWriter.append(dichVuMP);
            bufferedWriter.append(NEW_LINE_SEPARATOR);
            System.out.println("Success!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.close();
            input.close();
        }
    }

    public static List<Room> readRoom() throws IOException {
        List<Room> result = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("D:\\C0321G1_NguyenThiNhung_Module2\\CaseStudy_Module2\\src\\data\\Room.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                Room room = new Room(strings[0], strings[1], strings[2], strings[3], strings[4], strings[5], strings[6]);
                result.add(room);
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
