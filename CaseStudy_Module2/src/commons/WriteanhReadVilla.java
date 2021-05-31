package commons;

import models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class WriteanhReadVilla {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    public static void writeVilla() throws IOException {
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
        String tieuChuanPhong = scanner.nextLine();
        System.out.println("Nhập tiện nghi khác: ");
        String tienNghiKhac = scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi: ");
        String dienTichHoBoi = scanner.nextLine();
        System.out.println("Nhập số tầng: ");
        String soTang = scanner.nextLine();


        FileWriter input = new FileWriter("D:\\C0321G1_NguyenThiNhung_Module2\\CaseStudy_Module2\\src\\data\\Villa.csv", true);
        BufferedWriter bufferedWriter = new BufferedWriter(input);
        try {
            int count = 0;
            while (count < 9) {
                if (Pattern.compile("^SVVL-\\d{4}").matcher(id).matches()) {
                    count++;
                } else {
                    count = 20;
                    System.out.println("Hãy nhập id đúng định dạng 'SVVL-yyyy' ( với yyyy là các số từ 0-9)");
                }

                if (Pattern.compile("^[A-Z][^A-Z]*").matcher(tenDichVu).matches()) {
                    count++;
                } else {
                    count = 20;
                    System.out.println("Hãy nhập tên đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường'");
                }

                if (Integer.parseInt(dienTichSD) > 30) {
                    count++;
                } else {
                    count = 20;
                    System.out.println("Hãy nhập diện tích sử dụng >30");
                }


                if (Integer.parseInt(chiPhiThue) > 0) {
                    count++;
                } else {
                    count = 20;
                    System.out.println("Hãy nhập chi phí thuê >0");
                }
                if (Integer.parseInt(soNguoiTD) > 0 && Integer.parseInt(soNguoiTD) < 20) {
                    count++;
                } else {
                    count = 20;
                    System.out.println("Hãy nhập số người tối đa >0 và <20");
                }
                if (Pattern.compile("^[A-Z][^A-Z]*").matcher(kieuThue).matches()) {
                    count++;
                } else {
                    count = 20;
                    System.out.println("Hãy nhập Kiểu thuê đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường'");
                }
                if (Pattern.compile("^[A-Z][^A-Z]*").matcher(tieuChuanPhong).matches()) {
                    count++;
                } else {
                    count = 20;
                    System.out.println("Hãy nhập Tiêu chuẩn phòng đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường'");
                }
                if (Integer.parseInt(dienTichHoBoi) > 30) {
                    count++;
                } else {
                    count = 20;
                    System.out.println("Hãy nhập diện tích hồ bơi >30");
                }
                if (Integer.parseInt(soTang) > 0) {
                    count++;
                } else {
                    count = 20;
                    System.out.println("Hãy nhập chi phí thuê >0");
                }
            }

            if(count==9){
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
                bufferedWriter.append(tieuChuanPhong);
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(tienNghiKhac);
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(dienTichHoBoi);
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(soTang);
                bufferedWriter.append(NEW_LINE_SEPARATOR);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.close();
            input.close();
        }
    }

    public static List<Villa> readVilla() throws IOException {
        List<Villa> result = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("D:\\C0321G1_NguyenThiNhung_Module2\\CaseStudy_Module2\\src\\data\\Villa.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                Villa villa = new Villa(strings[0], strings[1], strings[2], strings[3], strings[4], strings[5], strings[6], strings[7], strings[8], strings[9]);
                result.add(villa);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
