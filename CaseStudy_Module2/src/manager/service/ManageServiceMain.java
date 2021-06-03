package manager.service;

import java.io.IOException;
import java.util.Scanner;

public class ManageServiceMain {
    public static void managerService() throws Exception {

            int count = 0;
            while (count < 1) {
                System.out.println("------------------\n" +
                        "Please enter your choice : \n" +
                        "1.\tAdd New Services\n" +
                        "2.\tShow Services\n" +
                        "3.\tSearch Services\n" +
                        "4.\tEdit Services\n" +
                        "5.\tDelete Services\n" +
                        "6.\tExit\n");
                Scanner scanner = new Scanner(System.in);
                String choose = scanner.nextLine();
                switch (choose) {
                    case "1":
                        ManagerService.addNewServies();
                        break;
                    case "2":
                        ManagerService.showServices();
                        break;
                    case "3":
                        ManagerService.searchServices();
                        break;
                    case "4":
                        ManagerService.editServices();
                        break;
                    case "5":
                        ManagerService.deleteServices();
                        break;
                    case "6":
                        count++;
                    default:
                        System.out.println("There is no option");
                }
            }

    }
}
