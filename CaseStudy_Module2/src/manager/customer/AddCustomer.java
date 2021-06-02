package manager.customer;

import commons.WriteAndReadCustomer;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AddCustomer {
    public static void addNewCustomer() throws IOException {
        int count = 0;
        while (count != 9) {
            count=0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("_____" +
                    "Nhập tên khách hàng đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường':");
            String name = scanner.nextLine();
            System.out.println("Nhập ngày tháng năm sinh đúng định dạng 'dd/mm/yyyy' và năm sinh phải > 1900 và < 2003:");
            String birthday = scanner.nextLine();
            System.out.println("Nhập giới tính định dạng 'Female' / 'Male' / 'Unknow':");
            String gender = scanner.nextLine();
            String str = "";
            System.out.println("Nhập số CMND đúng định dạng 'xxx xxx xxx':");
            String sCMND = scanner.nextLine();
            System.out.println("Nhập số điện thoại đúng định dạng 0xxxxxxxxx:");
            String telephone = scanner.nextLine();
            System.out.println("Nhập email đúng định dạng 'abc@xxx.yyy':");
            String email = scanner.nextLine();
            System.out.println("Nhập loại khách đúng định dạng 'Diamond' / 'Platinium' / 'Gold' / 'Silver' / 'Member':");
            String level = scanner.nextLine();
            System.out.println("Nhập địa chỉ đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường':");
            String address = scanner.nextLine();
            System.out.println("Nhập dịch vụ sử dụng đúng định dạng 'Villa' / 'House' / 'Room':");
            String service = scanner.nextLine();

            if (Pattern.compile("^([A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễỬỮỰỲỴÝỶỸ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)(\\s[A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễỬỮỰỲỴÝỶỸ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)*$").matcher(name).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập tên đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường'");
            }

            if (Pattern.compile("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(190[1-9]|19[1-9]\\d|2000|2001|2002)$").matcher(birthday).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập ngày tháng năm sinh đúng định dạng 'dd/mm/yyyy' và năm sinh phải > 1900 và < 2003");
            }

            if (Pattern.compile("^[F|f][E|e][M|m][A|a][L|l][E|e]$").matcher(gender).matches() || Pattern.compile("^[M|m][A|a][L|l][E|e]$").matcher(gender).matches() || Pattern.compile("^[U|u][N|n][K|k][N|n][O|o][W|w]$").matcher(gender).matches()) {
                String[] str3 = gender.split("");
                str += str3[0].toUpperCase();
                for (int i = 1; i < gender.length(); i++) {
                    str += str3[i].toLowerCase();
                }
                count++;
            } else {
                System.out.println("Hãy nhập giới tính đúng định dạng 'Female' / 'Male' / 'Unknow' ");
            }
            if (Pattern.compile("^\\d{3} \\d{3} \\d{3}$").matcher(sCMND).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập Số chứng minh nhân dân đúng định dạng 'xxx xxx xxx'");
            }
            if (Pattern.compile("^0\\d{9}$").matcher(telephone).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập số điện thoại đúng định dạng 0xxxxxxxxx");
            }
            if (Pattern.compile("^\\w+@\\w+\\.[a-z]+$").matcher(email).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập email đúng định dạng 'abc@xxx.yyy'");
            }
            if (Pattern.compile("^(Diamond|Platinium|Gold|Silver|Member)$").matcher(level).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập  loại khách hàng đúng định dạng 'Diamond' / 'Platinium' / 'Gold' / 'Silver' / 'Member'");
            }
            if (Pattern.compile("^[A-Z][^A-Z]*$").matcher(address).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập địa chỉ đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường'");
            }
            if (Pattern.compile("^(Villa|House|Room)$").matcher(service).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập  dịch vụ sử dụng đúng định dạng 'Villa' / 'House' / 'Room'");
            }


            if (count == 9) {
                WriteAndReadCustomer.writeCustomer(name, birthday, str, sCMND, telephone, email, level, address, service);
            }

        }


    }
}
