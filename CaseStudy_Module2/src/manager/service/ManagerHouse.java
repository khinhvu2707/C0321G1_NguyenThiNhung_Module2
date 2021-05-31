package manager.service;

import models.House;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerHouse {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static void addHouse() throws IOException {
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
    public static void searchHouse() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id Villa cần tìm: ");
        String searchId = scanner.nextLine();
        List<House> result;
        result = readHouse();
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
    public static void showHouse() throws IOException {
        List<House> result;
        result = readHouse();
        for (House house : result) {
            System.out.println(house.showInfor());
        }
    }

    public static void editHouse() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id House cần sửa: ");
        String deleteId = scanner.nextLine();
        System.out.println("Bạn muốn sửa gì?\n" +
                "1.Id\n" +
                "2.Tên dịch vụ\n" +
                "3.Diện tích sử dụng\n" +
                "4.Chi phí thuê\n" +
                "5.Số người tối đa\n" +
                "6.Kiểu thuê\n" +
                "7.Tiêu chuẩn phòng\n" +
                "8.Tiện nghi khác\n" +
                "9.Số tầng\n");
        int choose = Integer.parseInt(scanner.nextLine());
        List<House> result;
        result = readHouse();
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
                        System.out.println("Nhập tiêu chuẩn phòng mới: ");
                        String newTieuChuanPhong = scanner.nextLine();
                        result.get(i).setTieuChuanPhong(newTieuChuanPhong);
                        break;
                    case 8:
                        System.out.println("Nhập tiện nghi khác mới: ");
                        String newTienNghiKhac = scanner.nextLine();
                        result.get(i).setTienNghiKhac(newTienNghiKhac);
                        break;
                    case 9:
                        System.out.println("Nhập số tầng mới: ");
                        String newSoTang = scanner.nextLine();
                        result.get(i).setSoTang(newSoTang);
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
            FileWriter input = new FileWriter("D:\\C0321G1_NguyenThiNhung_Module2\\CaseStudy_Module2\\src\\data\\House.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(input);
            for (House house : result) {
                bufferedWriter.append(house.getId());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(house.getTenDichVu());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(house.getDienTichSD());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(house.getChiPhiThue());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(house.getSoNguoiTD());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(house.getKieuThue());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(house.getTieuChuanPhong());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(house.getTienNghiKhac());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(house.getSoTang());
                bufferedWriter.append(NEW_LINE_SEPARATOR);
            }
            bufferedWriter.close();
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void deteleHouse() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id House cần xóa: ");
        String deleteId = scanner.nextLine();
        List<House> result;
        result = readHouse();
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
            FileWriter input = new FileWriter("D:\\C0321G1_NguyenThiNhung_Module2\\CaseStudy_Module2\\src\\data\\House.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(input);
            for (House v :result) {
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
                bufferedWriter.append(v.getSoTang());
                bufferedWriter.append(NEW_LINE_SEPARATOR);
            }
            bufferedWriter.close();
            input.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    }

