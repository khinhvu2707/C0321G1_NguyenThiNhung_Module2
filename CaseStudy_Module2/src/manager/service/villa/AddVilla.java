package manager.service.villa;

import commons.WriteAndReadVilla;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AddVilla {
    public static void addVilla() throws IOException {
        int count = 0;
        while (count != 10) {
            count = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("+++++\n" +
                    "Nhập id đúng định dạng 'SVVL-yyyy' ( với yyyy là các số từ 0-9): ");
            String id = scanner.nextLine();
            System.out.println("Nhập tên dịch vụ đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường': ");
            String tenDichVu = scanner.nextLine();
            System.out.println("Nhập dien tích sử dụng >30 : ");
            String dienTichSD = scanner.nextLine();
            System.out.println("Nhập chi phí thuê >0 : ");
            String chiPhiThue = scanner.nextLine();
            System.out.println("Nhập số người tối đa là 1 số nguyên >0 và <20 : ");
            String soNguoiTD = scanner.nextLine();
            System.out.println("Nhập kiểu thuê đúng định dạng 'Year'/ 'Month' / 'Day' / ' Hour': ");
            String kieuThue = scanner.nextLine();
            System.out.println("Nhập tiêu chuẩn phòng đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường': ");
            String tieuChuanPhong = scanner.nextLine();
            System.out.println("Nhập tiện nghi khác đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường': ");
            String tienNghiKhac = scanner.nextLine();
            System.out.println("Nhập diện tích hồ bơi >30: ");
            String dienTichHoBoi = scanner.nextLine();
            System.out.println("Nhập số tầng là 1 số nguyên >0: ");
            String soTang = scanner.nextLine();

            if (Pattern.compile("^SVVL-\\d{4}$").matcher(id).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập id đúng định dạng 'SVVL-yyyy' ( với yyyy là các số từ 0-9)");
            }

            if (Pattern.compile("^[A-Z][^A-Z]*$").matcher(tenDichVu).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập tên đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường'");
            }

            if (Pattern.compile("^(([3-9][1-9]|[4-9]\\d|[1-9]\\d{2,})\\.?\\d*)|(30.[0-1]*[1-9])$").matcher(dienTichSD).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập diện tích sử dụng >30m2");
            }
            if (Pattern.compile("^([1-9]+\\.?\\d*|0.\\d*[1-9]+)$").matcher(chiPhiThue).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập chi phí thuê >0");
            }
            if (Pattern.compile("^([1-9]|1[0-9])$").matcher(soNguoiTD).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập số người tối đa >0 và <20");
            }
            if (Pattern.compile("^(Year|Month|Day|Hour)$").matcher(kieuThue).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập Kiểu thuê đúng định dạng 'Year'/ 'Month' / 'Day' / ' Hour'");
            }
            if (Pattern.compile("^[A-Z][^A-Z]*$").matcher(tieuChuanPhong).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập Tiêu chuẩn phòng đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường'");
            }
            if (Pattern.compile("^[A-Z][^A-Z]*$").matcher(tienNghiKhac).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập Tiện nghi khác đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường'");
            }
            if (Pattern.compile("^\\d+\\.?\\d*$").matcher(dienTichHoBoi).matches() && Integer.parseInt(dienTichHoBoi) > 30) {
                count++;
            } else {
                System.out.println("Hãy nhập diện tích hồ bơi >30");
            }
            if (Pattern.compile("^([1-9]|\\d{2,})$").matcher(soTang).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập số tầng là 1 số nguyên >0");
            }


            if (count == 10) {
                WriteAndReadVilla.writeVilla(id, tenDichVu, dienTichSD, chiPhiThue, soNguoiTD, kieuThue, tieuChuanPhong, tienNghiKhac, dienTichHoBoi, soTang);
            }
        }
    }
}
