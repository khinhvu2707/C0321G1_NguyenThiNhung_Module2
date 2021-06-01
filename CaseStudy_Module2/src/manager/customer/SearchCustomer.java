package manager.customer;

import commons.WriteAndReadCustomer;
import commons.WriteAndReadHouse;
import models.Customer;
import models.House;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class SearchCustomer {
    public static void searchCustomer() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên Customer cần tìm: ");
        String searchName = scanner.nextLine();
        List<Customer> result;
        result = WriteAndReadCustomer.readCustomer();
        boolean check = true;
        for (int i = 0; i < result.size(); i++) {
            if (searchName.equals(result.get(i).getName())) {
                System.out.println(result.get(i).showInfor());
                check = false;
                break;
            } else {
                check = true;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy khách hàng này!");
        }
    }
}
