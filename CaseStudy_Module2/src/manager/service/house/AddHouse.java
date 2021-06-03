package manager.service.house;

import commons.FuromaException;
import commons.Validate;
import commons.WriteAndReadHouse;
import models.House;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AddHouse {
    public static void addHouse() {


        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("+++++\n" + "Nhập id đúng định dạng 'SVHO-yyyy' ( với yyyy là các số từ 0-9): ");
            String id = scanner.nextLine();
            Validate.idException(id);
            System.out.println("Nhập tên dịch vụ đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường': ");
            String tenDichVu = scanner.nextLine();
            Validate.tenDichVuException(tenDichVu);
            System.out.println("Nhập dien tích sử dụng >30: ");
            String dienTichSD = scanner.nextLine();
            Validate.dienTichException(dienTichSD);
            System.out.println("Nhập chi phí  >0: ");
            String chiPhiThue = scanner.nextLine();
            Validate.chiPhiThueException(chiPhiThue);
            System.out.println("Nhập số người tối đa là 1 số nguyên >0 và <20: ");
            String soNguoiTD = scanner.nextLine();
            Validate.soNguoiTDException(soNguoiTD);
            System.out.println("Nhập kiểu thuê đúng định dạng 'Year'/ 'Month' / 'Day' / ' Hour': ");
            String kieuThue = scanner.nextLine();
            Validate.kieuThueException(kieuThue);
            System.out.println("Nhập tiêu chuẩn phòng đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường': ");
            String tieuChuanPhongH = scanner.nextLine();
            Validate.tieuChuanPhongException(tieuChuanPhongH);
            System.out.println("Nhập tiện nghi khác đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường': ");
            String tienNghiKhacH = scanner.nextLine();
            Validate.tienNghiKhacException(tienNghiKhacH);
            System.out.println("Nhập số tầng là 1 số nguyên >0: ");
            String soTangH = scanner.nextLine();
            Validate.soTangException(soTangH);

            List<House> result = WriteAndReadHouse.readHouse();
            boolean check=true;
            for (int i = 0; i < result.size(); i++) {
                if (id.equals(result.get(i).getId())) {
                    check = false;
                    break;
                }
            }
            if(check) {
                WriteAndReadHouse.writeHouse(id, tenDichVu, dienTichSD, chiPhiThue, soNguoiTD, kieuThue, tieuChuanPhongH, tienNghiKhacH, soTangH);
            }else {
                System.out.println("Đã có id này!");
            }
        } catch (FuromaException | IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
