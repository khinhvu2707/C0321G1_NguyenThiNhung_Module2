package manager.service.room;

import commons.WriteAndReadRoom;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AddRoom {
    public static void addRoom() throws IOException {
        int count = 0;
        while (count != 7) {
            count = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("+++++\n" +
                    "Nhập id đúng định dạng 'SVRO-yyyy' ( với yyyy là các số từ 0-9): ");
            String id = scanner.nextLine();
            System.out.println("Nhập tên dịch vụ dịch vụ đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường : ");
            String tenDichVu = scanner.nextLine();
            System.out.println("Nhập dien tích sử dụng > 30m2 : ");
            String dienTichSD = scanner.nextLine();
            System.out.println("Nhập chi phí thuê >0 : ");
            String chiPhiThue = scanner.nextLine();
            System.out.println("Nhập số người tối đa là 1 số nguyên >0 và <20 : ");
            String soNguoiTD = scanner.nextLine();
            System.out.println("Nhập kiểu thuê đúng định dạng 'Year'/ 'Month' / 'Day' / ' Hour' : ");
            String kieuThue = scanner.nextLine();
            System.out.println("Nhập dịch vụ miễn phí đúng định dạng 'Massage' / 'Karaoke' /'Food' /'Drink' /'Car' : ");
            String dichVuMP = scanner.nextLine();

            if (Pattern.compile("^SVRO-\\d{4}$").matcher(id).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập id đúng định dạng 'SVRO-yyyy' ( với yyyy là các số từ 0-9)");
            }

            if (Pattern.compile("^[A-Z][^A-Z]*$").matcher(tenDichVu).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập tên dịch vụ đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường'");
            }

            if (Pattern.compile("^(([3-9][1-9]|[4-9]\\d|[1-9]\\d{2,})\\.?\\d*)|(30.[0-1]*[1-9])$").matcher(dienTichSD).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập diện tích sử dụng > 30m2");
            }


            if (Pattern.compile("^([1-9]+\\.?\\d*|0.\\d*[1-9]+)$").matcher(chiPhiThue).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập chi phí thuê >0");
            }
            if (Pattern.compile("^([1-9]|1[0-9])$").matcher(soNguoiTD).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập số người tối đa là 1 số nguyên >0 và <20");
            }
            if (Pattern.compile("^(Year|Month|Day|Hour)$").matcher(kieuThue).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập Kiểu thuê đúng định dạng 'Year'/ 'Month' / 'Day' / ' Hour'");
            }
            if (Pattern.compile("^(Massage|Karaoke|Food|Drink|Car)$").matcher(dichVuMP).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập Dich vụ miễn phí đúng định dạng 'Massage' / 'Karaoke' /'Food' /'Drink' /'Car'");
            }
            if (count == 7) {
                WriteAndReadRoom.writeRoom(id, tenDichVu, dienTichSD, chiPhiThue, soNguoiTD, kieuThue, dichVuMP);
            }
        }
    }
}
