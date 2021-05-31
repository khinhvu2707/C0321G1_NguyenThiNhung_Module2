package commons;

import models.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteanhReadRoom {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static void writeRoom() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên dịch vụ: ");
        String tenDichVu = scanner.nextLine();
        System.out.println("Nhập dien tích sử dụng: ");
        String dienTichSD = scanner.nextLine();
        System.out.println("Nhập chi phí thuê: ");
        String chiPhiThue = scanner.nextLine();
        System.out.println("Nhập số người tối đa: ");
        String soNguoiTD = scanner.nextLine();
        System.out.println("Nhập kiểu thuê: ");
        String kieuThue = scanner.nextLine();
        System.out.println("Nhập dịch vụ miễn phí: ");
        String dichVuMP = scanner.nextLine();

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
