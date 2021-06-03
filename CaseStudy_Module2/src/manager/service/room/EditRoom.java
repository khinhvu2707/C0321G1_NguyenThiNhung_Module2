package manager.service.room;

import commons.WriteAndReadRoom;
import models.Room;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class EditRoom {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    public static void editRoom() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id Room cần sửa: ");
        String editId = scanner.nextLine();
        System.out.println("Bạn muốn sửa gì?\n" +
                "1.Tên dịch vụ\n" +
                "2.Diện tích sử dụng\n" +
                "3.Chi phí thuê\n" +
                "4.Số người tối đa\n" +
                "5.Kiểu thuê\n" +
                "6.Dịch vụ miễn phí\n");
        String choose = scanner.nextLine();
        List<Room> result;
        result = WriteAndReadRoom.readRoom();
        boolean check = true;
        for (int i = 0; i < result.size(); i++) {
            if (editId.equals(result.get(i).getId())) {
                switch (choose) {
                    case "1":
                        System.out.println("Nhập tên dịch vụ mới: ");
                        String newTenDichVu = scanner.nextLine();
                        result.get(i).setTenDichVu(newTenDichVu);
                        break;
                    case "2":
                        System.out.println("Nhập diện tích sử dụng mới: ");
                        String newDienTichSD = scanner.nextLine();
                        result.get(i).setDienTichSD(newDienTichSD);
                        break;
                    case "3":
                        System.out.println("Nhập chi phí thuê mới: ");
                        String newChiPhiThue = scanner.nextLine();
                        result.get(i).setChiPhiThue(newChiPhiThue);
                        break;
                    case "4":
                        System.out.println("Nhập số người tối đa mới: ");
                        String newSoNguoiTD = scanner.nextLine();
                        result.get(i).setSoNguoiTD(newSoNguoiTD);
                        break;
                    case "5":
                        System.out.println("Nhập kiểu thuê mới: ");
                        String newKieuThue = scanner.nextLine();
                        result.get(i).setKieuThue(newKieuThue);
                        break;
                    case "6":
                        System.out.println("Nhập dịch vụ miễn phí mới: ");
                        String newDichVuMP = scanner.nextLine();
                        result.get(i).setDichVuMP(newDichVuMP);
                        break;
                    default:
                        System.out.println("Không có lựa chọn này");
                }
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
            for (Room room : result) {
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
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
