package commons;

import models.House;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteanhReadHouse {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static void writeHouse() throws IOException {
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
        System.out.println("Nhập tiêu chuẩn phòng: ");
        String tieuChuanPhongH = scanner.nextLine();
        System.out.println("Nhập tiện nghi khác: ");
        String tienNghiKhacH = scanner.nextLine();
        System.out.println("Nhập số tầng: ");
        String soTangH = scanner.nextLine();

        FileWriter input = new FileWriter("D:\\C0321G1_NguyenThiNhung_Module2\\CaseStudy_Module2\\src\\data\\House.csv", true);
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
            bufferedWriter.append(tieuChuanPhongH);
            bufferedWriter.append(COMMA_DELIMITER);
            bufferedWriter.append(tienNghiKhacH);
            bufferedWriter.append(COMMA_DELIMITER);
            bufferedWriter.append(soTangH);
            bufferedWriter.append(NEW_LINE_SEPARATOR);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.close();
            input.close();
        }
    }

    public static List<House> readHouse() throws IOException {
        List<House> result = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("D:\\C0321G1_NguyenThiNhung_Module2\\CaseStudy_Module2\\src\\data\\House.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                House house = new House(strings[0], strings[1], strings[2], strings[3], strings[4], strings[5], strings[6], strings[7], strings[8]);
                result.add(house);
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
