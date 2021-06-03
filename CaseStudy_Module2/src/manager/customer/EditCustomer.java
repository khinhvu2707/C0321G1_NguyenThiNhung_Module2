package manager.customer;

import commons.WriteAndReadCustomer;
import models.Customer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EditCustomer {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static void editCustomer() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số Chứng mình nhân dân của khách hàng cần sửa: ");
        String edit = scanner.nextLine();
        System.out.println("Nhập tên của khách hàng cần sửa: ");
        String editName = scanner.nextLine();

        System.out.println("Bạn muốn sửa gì?\n" +
                "1.Tên\n" +
                "2.Ngày tháng năm sinh\n" +
                "3.Giới tính\n" +
                "4.Số điện thoại\n" +
                "5.Email\n" +
                "6.Loại khách\n" +
                "7.Địa chỉ\n" +
                "8.Dịch vụ\n" +
                "9.Số CMND\n");
        String choose = scanner.nextLine();
        List<Customer> result;
        result = WriteAndReadCustomer.readCustomer();
        boolean check = true;
        for (int i = 0; i < result.size(); i++) {
            if (edit.equals(result.get(i).getsCMND()) && editName.equals(result.get(i).getName())) {
                switch (choose) {
                    case "1":
                        System.out.println("Nhập tên mới: ");
                        String tenMoi = scanner.nextLine();
                        if (Pattern.compile("^([A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễỬỮỰỲỴÝỶỸ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)(\\s[A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễỬỮỰỲỴÝỶỸ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)*$").matcher(tenMoi).matches()) {
                            result.get(i).setName(tenMoi);
                        } else {
                            System.out.println("Hãy nhập tên đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường'");
                        }
                        break;
                    case "2":
                        System.out.println("Nhập ngày tháng năm sinh mới: ");
                        String namSinh = scanner.nextLine();

                        if (Pattern.compile("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(190[1-9]|19[1-9]\\d|2000|2001|2002)$").matcher(namSinh).matches()) {
                            result.get(i).setBirthday(namSinh);
                        } else {
                            System.out.println("Hãy nhập ngày tháng năm sinh đúng định dạng 'dd/mm/yyyy' và năm sinh phải > 1900 và < 2003");
                        }
                        break;
                    case "3":
                        System.out.println("Nhập giới tính mới: ");
                        String gender = scanner.nextLine();
                        String str="";
                        if (Pattern.compile("^[F|f][E|e][M|m][A|a][L|l][E|e]$").matcher(gender).matches() || Pattern.compile("^[M|m][A|a][L|l][E|e]$").matcher(gender).matches() || Pattern.compile("^[U|u][N|n][K|k][N|n][O|o][W|w]$").matcher(gender).matches()) {
                            String[] str3 = gender.split("");
                            str += str3[0].toUpperCase();
                            for (int j = 1; j < gender.length(); j++) {
                                str += str3[j].toLowerCase();
                            }
                            result.get(i).setGender(str);
                        } else {
                            System.out.println("Hãy nhập giới tính đúng định dạng 'Female' / 'Male' / 'Unknow' ");
                        }
                        break;
                    case "4":
                        System.out.println("Nhập số điện thoại mới: ");
                        String sdt = scanner.nextLine();

                        if (Pattern.compile("^0\\d{9}$").matcher(sdt).matches()) {
                            result.get(i).setTelephone(sdt);
                        } else {
                            System.out.println("Hãy nhập số điện thoại đúng định dạng 0xxxxxxxxx");
                        }
                        break;
                    case "5":
                        System.out.println("Nhập email mới: ");
                        String email = scanner.nextLine();
                        if (Pattern.compile("^\\w+@\\w+\\.[a-z]+$").matcher(email).matches()) {
                            result.get(i).setEmail(email);
                        } else {
                            System.out.println("Hãy nhập email đúng định dạng 'abc@xxx.yyy'");
                        }
                        break;
                    case "6":
                        System.out.println("Nhập loại khách mới: ");
                        String loaiKhach = scanner.nextLine();
                        if (Pattern.compile("^(Diamond|Platinium|Gold|Silver|Member)$").matcher(loaiKhach).matches()) {
                            result.get(i).setLevel(loaiKhach);
                        } else {
                            System.out.println("Hãy nhập  loại khách hàng đúng định dạng 'Diamond' / 'Platinium' / 'Gold' / 'Silver' / 'Member'");
                        }
                        break;
                    case "7":
                        System.out.println("Nhập địa chỉ mới: ");
                        String diaChi = scanner.nextLine();
                        if (Pattern.compile("^[A-Z][^A-Z]*$").matcher(diaChi).matches()) {
                            result.get(i).setAddress(diaChi);
                        } else {
                            System.out.println("Hãy nhập địa chỉ đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường'");
                        }
                        break;
                    case "8":
                        System.out.println("Nhập dịch vụ mới: ");
                        String dichVu = scanner.nextLine();
                        if (Pattern.compile("^(Villa|House|Room)$").matcher(dichVu).matches()) {
                            result.get(i).setService(dichVu);
                        } else {
                            System.out.println("Hãy nhập  dịch vụ sử dụng đúng định dạng 'Villa' / 'House' / 'Room'");
                        }

                        break;
                    case "9":
                        System.out.println("Nhập số chứng minh nhân dân mới: ");
                        String scmnd = scanner.nextLine();
                        if (Pattern.compile("^\\d{3} \\d{3} \\d{3}$").matcher(scmnd).matches()) {
                            result.get(i).setService(scmnd);
                        } else {
                            System.out.println("Hãy nhập Số chứng minh nhân dân đúng định dạng 'xxx xxx xxx'");
                        }
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
            System.out.println("Không tìm thấy khách hàng này!");
        }
        try {
            FileWriter input = new FileWriter("D:\\C0321G1_NguyenThiNhung_Module2\\CaseStudy_Module2\\src\\data\\Customer.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(input);
            for (Customer customer : result) {
                bufferedWriter.append(customer.getName());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(customer.getBirthday());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(customer.getGender());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(customer.getsCMND());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(customer.getTelephone());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(customer.getEmail());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(customer.getLevel());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(customer.getAddress());
                bufferedWriter.append(COMMA_DELIMITER);
                bufferedWriter.append(customer.getService());
                bufferedWriter.append(NEW_LINE_SEPARATOR);
            }
            bufferedWriter.close();
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}


