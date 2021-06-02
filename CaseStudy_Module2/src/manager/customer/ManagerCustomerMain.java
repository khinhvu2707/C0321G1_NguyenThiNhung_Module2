package manager.customer;

import java.io.IOException;
import java.util.Scanner;

public class ManagerCustomerMain {
    public static void ManagerCustomer() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 1) {
            System.out.println("Please enter your choice :\n" +
                    "1.\tShow Customer\n" +
                    "2.\tAdd Customer\n" +
                    "3.\tEdit Customer\n" +
                    "4.\tDelete Customer\n" +
                    "5.\tSearch Customer\n" +
                    "6.\tExit\n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    ShowCustomer.showInformationCustomers();
                    count++;
                    break;
                case 2:
                    AddCustomer.addNewCustomer();
                    count++;
                    break;
                case 3:
                    EditCustomer.editCustomer();
                    count++;
                    break;
                case 4:
                    DeleteCustomer.deteleCustomer();
                    break;
                case 5:
                    SearchCustomer.searchCustomer();
                    count++;
                    break;
                case 6:
                    count++;
                    break;
                default:
                    System.out.println("There is no option");
                    break;
            }
        }
    }
}