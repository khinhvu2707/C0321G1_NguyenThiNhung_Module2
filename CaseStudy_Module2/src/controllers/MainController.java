package controllers;

import manager.booking.BookingMain;
import manager.customer.ManagerCustomerMain;
import manager.service.ManagerServiceMain;
import models.House;
import models.Room;
import models.Villa;

import java.io.IOException;
import java.util.Scanner;

public class MainController {

    public static void displayMainMenu() throws IOException {
        int count = 0;
        while (count < 1) {
            System.out.println("------------------\n" +
                    "Please enter your choice : \n" +
                    "1.\tAdd New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tSearch Services\n" +
                    "4.\tEdit Services\n" +
                    "5.\tDelete Services\n" +
                    "6.\tManager Customer\n" +
                    "7.\tBooking\n" +
                    "8.\tShow Information of Employee\n" +
                    "9.\tExit\n");
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    ManagerServiceMain.addNewServies();
                    break;
                case 2:
                    ManagerServiceMain.showServices();
                    break;
                case 3:
                    ManagerServiceMain.searchServices();
                    break;
                case 4:
                    ManagerServiceMain.editServices();
                    break;
                case 5:
                    ManagerServiceMain.deleteServices();
                    break;
                case 6:
                    ManagerCustomerMain.ManagerCustomer();
                    break;
                case 7:
                    BookingMain.booking();
                    break;
                case 8:
                    break;
                case 9:
                    count++;
                    break;
                default:
                    System.out.println("There is no option");
                    break;
            }
        }
    }
}