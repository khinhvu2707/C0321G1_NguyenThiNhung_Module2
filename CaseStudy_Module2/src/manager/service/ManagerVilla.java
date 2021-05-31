package manager.service;

import models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ManagerVilla {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static void addVilla() throws IOException {
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
                if (soNguoiTD > 0 && soNguoiTD < 20) {
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
                if (soTang > 0) {
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

    public static void showVilla() throws IOException {
        List<Villa> result;
        result = readVilla();
        for (Villa villa : result) {
            System.out.println(villa.showInfor());
        }
    }

    public static void editVilla() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id Villa cần sửa: ");
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
                "9.Diện tích hồ bơi\n" +
                "10.Số tầng\n");
        int choose = Integer.parseInt(scanner.nextLine());
        List<Villa> result;
        result = readVilla();
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
                        System.out.println("Nhập diện tích hồ bơi mới: ");
                        String newDienTichHoBoi = scanner.nextLine();
                        result.get(i).setSHoBoi(newDienTichHoBoi);
                        break;
                    case 10:
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

    public static void searchVilla() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id Villa cần tìm: ");
        String searchId = scanner.nextLine();
        List<Villa> result;
        result = readVilla();
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

    public static void deteleVilla() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id Villa cần xóa: ");
        String deleteId = scanner.nextLine();
        List<Villa> result;
        result = readVilla();
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
