package commons;

import models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadVilla {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static void writeVilla(String id, String tenDichVu, String dienTichSD, String chiPhiThue, String soNguoiTD, String kieuThue, String tieuChuanPhong, String tienNghiKhac, String dienTichHoBoi, String soTang) throws IOException {

        FileWriter input = new FileWriter("D:\\C0321G1_NguyenThiNhung_Module2\\CaseStudy_Module2\\src\\data\\Villa.csv", true);
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
            bufferedWriter.append(tieuChuanPhong);
            bufferedWriter.append(COMMA_DELIMITER);
            bufferedWriter.append(tienNghiKhac);
            bufferedWriter.append(COMMA_DELIMITER);
            bufferedWriter.append(dienTichHoBoi);
            bufferedWriter.append(COMMA_DELIMITER);
            bufferedWriter.append(soTang);
            bufferedWriter.append(NEW_LINE_SEPARATOR);
            System.out.println("Success!");

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
