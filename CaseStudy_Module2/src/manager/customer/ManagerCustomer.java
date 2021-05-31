package manager.customer;

import models.Customer;

import java.util.Scanner;

public class ManagerCustomer {
    public void addNewCustomer(){
        Scanner scanner = new Scanner(System.in);
        String NewName= scanner.nextLine();
        String NewBirthday= scanner.nextLine();
        String NewGender= scanner.nextLine();
        String NewCMND= scanner.nextLine();
        String NewTelephone= scanner.nextLine();
        String NewEmail= scanner.nextLine();
        String NewLevel= scanner.nextLine();
        String NewAddress= scanner.nextLine();
        String NewService= scanner.nextLine();
        Customer newCustomer =new Customer(NewName,NewBirthday,NewGender,NewCMND,NewTelephone,NewEmail,NewLevel,NewAddress,NewService);
    }
}
