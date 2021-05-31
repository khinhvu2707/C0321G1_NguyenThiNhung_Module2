package manager.service;

import models.House;
import models.Room;
import models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerRoom {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static void addRoom() throws IOException {
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

    public static void showRoom() throws IOException {
        List<Room> result;
        result = readRoom();
        for (Room room : result) {
            System.out.println(room.showInfor());
        }
    }
    public static void searchRoom() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id Room cần tìm: ");
        String searchId = scanner.nextLine();
        List<Room> result;
        result = readRoom();
        boolean check = true;
        for (int i = 0; i < result.size(); i++) {
            if (searchId.equals(result.get(i).getId())) {
                System.out.println(result.get(i).showInfor());
                check = false;
                break;
            } else {
                check = true;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy sản phẩm này!");
        }
    }
    public static void editRoom() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id Room cần sửa: ");
        String deleteId = scanner.nextLine();
        System.out.println("Bạn muốn sửa gì?\n" +
                "1.Id\n" +
                "2.Tên dịch vụ\n" +
                "3.Diện tích sử dụng\n" +
                "4.Chi phí thuê\n" +
                "5.Số người tối đa\n" +
                "6.Kiểu thuê\n" +
                "7.Dịch vụ miễn phí\n");
        int choose = Integer.parseInt(scanner.nextLine());
        List<Room> result;
        result = readRoom();
        boolean check = true;
        for (int i = 0; i < result.size(); i++) {
            if (deleteId.equals(result.get(i).getId())) {
                switch (choose) {
                    case 1:
                        System.out.println("Nhập id mới: ");
                        String newId = scanner.nextLine();
                        result.get(i).setId(newId);
                        break;
                    case 2:
                        System.out.println("Nhập tên dịch vụ mới: ");
                        String newTenDichVu = scanner.nextLine();
                        result.get(i).setTenDichVu(newTenDichVu);
                        break;
                    case 3:
                        System.out.println("Nhập diện tích sử dụng mới: ");
                        String newDienTichSD = scanner.nextLine();
                        result.get(i).setDienTichSD(newDienTichSD);
                        break;
                    case 4:
                        System.out.println("Nhập chi phí thuê mới: ");
                        String newChiPhiThue = scanner.nextLine();
                        result.get(i).setChiPhiThue(newChiPhiThue);
                        break;
                    case 5:
                        System.out.println("Nhập số người tối đa mới: ");
                        String newSoNguoiTD = scanner.nextLine();
                        result.get(i).setSoNguoiTD(newSoNguoiTD);
                        break;
                    case 6:
                        System.out.println("Nhập kiểu thuê mới: ");
                        String newKieuThue = scanner.nextLine();
                        result.get(i).setKieuThue(newKieuThue);
                        break;
                    case 7:
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

    public static void deteleRoom() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id Room cần xóa: ");
        String deleteId = scanner.nextLine();
        List<Room> result;
        result = readRoom();
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

