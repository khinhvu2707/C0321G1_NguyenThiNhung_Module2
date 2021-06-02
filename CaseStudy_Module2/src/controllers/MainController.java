package controllers;

import manager.Employee.ManagerEmployeeMain;
import manager.booking.BookingMain;
import manager.cinema.CinemaMain;
import manager.customer.ManagerCustomerMain;
import manager.filingCabinets.FilingCabinets;
import manager.service.ManageServiceMain;
import manager.service.ManagerService;
import java.io.IOException;
import java.util.Scanner;

public class MainController {

    public static void displayMainMenu() throws IOException {
        int count = 0;
        while (count < 1) {
            System.out.println("------------------\n" +
                    "Please enter your choice : \n" +
                    "1.\tManager Services\n" +
                    "2.\tManager Customer\n" +
                    "3.\tBooking\n" +
                    "4.\tEmployee\n" +
                    "5.\tCinema\n" +
                    "6.\tFiling cabinets\n" +
                    "7.\tExit\n");
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    ManageServiceMain.managerService();
                    break;
                case 2:
                    ManagerCustomerMain.ManagerCustomer();
                    break;
                case 3:
                    BookingMain.booking();
                    break;
                case 4:
                    ManagerEmployeeMain.Employee();
                    break;
                case 5:
                    CinemaMain.managerCinema();
                    break;
                case 6:
                    FilingCabinets.filingCabinets();
                    break;
                case 7:
                    count++;
                    break;
                default:
                    System.out.println("There is no option");
            }
        }
    }
}