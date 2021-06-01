package manager.service.villa;

import commons.WriteAndReadVilla;
import models.Villa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class DeleteVilla {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    public static void deteleVilla() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id Villa cần xóa: ");
        String deleteId = scanner.nextLine();
        List<Villa> result;
        result = WriteAndReadVilla.readVilla();
        boolean check = true;
        for (int i = 0; i < result.size(); i++) {
            if (deleteId.equals(result.get(i).getId())) {
                result.remove(i);
                check = false;
                break;
            } else {
                check = true;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy sản phẩm này!");
        }
        try {
            FileWriter input = new FileWriter("D:\\C0321G1_NguyenThiNhung_Module2\\CaseStudy_Module2\\src\\data\\Villa.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(input);
            for (Villa v : result) {
                bufferedWriter.append(v.getId());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(v.getTenDichVu());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(v.getDienTichSD());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(v.getChiPhiThue());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(v.getSoNguoiTD());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(v.getKieuThue());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(v.getTieuChuanPhong());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(v.getTienNghiKhac());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(v.getSHoBoi());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(v.getSoTang());
                bufferedWriter.append(NEW_LINE_SEPARATOR);

            }
            bufferedWriter.close();
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
