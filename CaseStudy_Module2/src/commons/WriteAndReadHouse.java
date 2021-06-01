package commons;

import models.House;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class WriteAndReadHouse {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static void writeHouse() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id đúng định dạng 'SVHO-yyyy' ( với yyyy là các số từ 0-9): ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên dịch vụ đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường': ");
        String tenDichVu = scanner.nextLine();
        System.out.println("Nhập dien tích sử dụng >30: ");
        String dienTichSD = scanner.nextLine();
        System.out.println("Nhập chi phí  >0: ");
        String chiPhiThue = scanner.nextLine();
        System.out.println("Nhập số người tối đa là 1 số nguyên >0 và <20: ");
        String soNguoiTD = scanner.nextLine();
        System.out.println("Nhập kiểu thuê đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường': ");
        String kieuThue = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường': ");
        String tieuChuanPhongH = scanner.nextLine();
        System.out.println("Nhập tiện nghi khác đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường': ");
        String tienNghiKhacH = scanner.nextLine();
        System.out.println("Nhập số tầng là 1 số nguyên >0: ");
        String soTangH = scanner.nextLine();

        FileWriter input = new FileWriter("D:\\C0321G1_NguyenThiNhung_Module2\\CaseStudy_Module2\\src\\data\\House.csv", true);
        BufferedWriter bufferedWriter = new BufferedWriter(input);
        try {
            int count = 0;
            while (count < 9) {
                if (Pattern.compile("SVHO-\\d{4}").matcher(id).matches()) {
                    count++;
                } else {
                    count = 20;
                    System.out.println("Hãy nhập id đúng định dạng 'SVHO-yyyy' ( với yyyy là các số từ 0-9)");
                }

                if (Pattern.compile("[A-Z][^A-Z]*").matcher(tenDichVu).matches()) {
                    count++;
                } else {
                    count = 20;
                    System.out.println("Hãy nhập tên đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường'");
                }

                if (Pattern.compile("(([3-9][1-9]|[4-9]\\d|[1-9]\\d{2,})\\.?\\d*)|(30.[0-1]*[1-9])").matcher(dienTichSD).matches() && Integer.parseInt(dienTichSD)>30) {
                    count++;
                } else {
                    count = 20;
                    System.out.println("Hãy nhập diện tích sử dụng >30 m2");
                }


                if (Pattern.compile("([1-9]+\\.?\\d*|0.\\d*[1-9]+)").matcher(chiPhiThue).matches()) {
                    count++;
                } else {
                    count = 20;
                    System.out.println("Hãy nhập chi phí thuê >0");
                }
                if (Pattern.compile("([1-9]|1[0-9])").matcher(soNguoiTD).matches()) {
                    count++;
                } else {
                    count = 20;
                    System.out.println("Hãy nhập số người tối đa là 1 số nguyên >0 và <20");
                }
                if (Pattern.compile("[A-Z][^A-Z]*").matcher(kieuThue).matches()) {
                    count++;
                } else {
                    count = 20;
                    System.out.println("Hãy nhập Kiểu thuê đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường'");
                }
                if (Pattern.compile("[A-Z][^A-Z]*").matcher(tieuChuanPhongH).matches()) {
                    count++;
                } else {
                    count = 20;
                    System.out.println("Hãy nhập Tiêu chuẩn phòng đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường'");
                }
                if (Pattern.compile("[A-Z][^A-Z]*").matcher(tienNghiKhacH).matches()) {
                    count++;
                } else {
                    count = 20;
                    System.out.println("Hãy nhập Tiện nghi khác đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường'");
                    count++;
                }

                if (Pattern.compile("([1-9]|\\d{2,})").matcher(soTangH).matches()) {
                    count++;
                } else {
                    count = 20;
                    System.out.println("Hãy nhập số tầng là số nguyên >0");
                }
            }
            if(count==9) {
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
                System.out.println("Success!");
            }
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
