package manager.service.room;

import commons.WriteAndReadRoom;
import models.Room;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class DeleteRoom {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    public static void deteleRoom() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id Room cần xóa: ");
        String deleteId = scanner.nextLine();
        List<Room> result;
        result = WriteAndReadRoom.readRoom();
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
            FileWriter input = new FileWriter("D:\\C0321G1_NguyenThiNhung_Module2\\CaseStudy_Module2\\src\\data\\Room.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(input);
            for (Room room :result) {
                bufferedWriter.append(room.getId());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(room.getTenDichVu());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(room.getDienTichSD());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(room.getChiPhiThue());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(room.getSoNguoiTD());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(room.getKieuThue());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(room.getDichVuMP());
                bufferedWriter.append(NEW_LINE_SEPARATOR);

            }
            bufferedWriter.close();
            input.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
