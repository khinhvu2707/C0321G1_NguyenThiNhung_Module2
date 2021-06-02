package manager.Employee;

import commons.WriteAndReadEmployee;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AddEmployee {
    public static void addEmployee() throws IOException {
        int count = 0;
        while (count != 3) {
            count = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("_____\n" +
                    "Nhập tên nhân viên đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường':");
            String name = scanner.nextLine();
            System.out.println("Nhập tuổi đúng định dạng '> 18 và < 60 ':");
            String old = scanner.nextLine();
            System.out.println("Nhập địa chỉ đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường':");
            String address = scanner.nextLine();
            if (Pattern.compile("^([A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễỬỮỰỲỴÝỶỸ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)(\\s[A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễỬỮỰỲỴÝỶỸ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)*$").matcher(name).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập tên đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường'");
            }
            if (Pattern.compile("^(1[8|9]|[2-5][0-9])$").matcher(old).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập tuổi đúng định dạng '>= 18 và < 60 ': ");
            }
            if (Pattern.compile("^[A-Z][^A-Z]*$").matcher(address).matches()) {
                count++;
            } else {
                System.out.println("Hãy nhập địa chỉ đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường'");
            }
            if (count == 3) {
                WriteAndReadEmployee.writeEmployee(name, old, address);
            }
        }
    }
}
