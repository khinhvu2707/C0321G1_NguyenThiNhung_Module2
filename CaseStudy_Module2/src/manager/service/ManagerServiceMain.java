package manager.service;

import java.io.IOException;
import java.util.Scanner;

public class ManagerServiceMain {
    public static void addNewServies() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 1) {
            System.out.println("Please enter your choice :\n" +
                    "1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    ManagerVilla.addVilla();
                    count++;
                    break;
                case 2:
                    ManagerHouse.addHouse();
                    count++;
                    break;
                case 3:
                    ManagerRoom.addRoom();
                    count++;
                    break;
                case 4:
                    break;
                case 5:
                    count++;
                    break;
                default:
                    count++;
                    System.out.println("There is no option");
                    break;
            }
        }
    }
    public static void searchServices() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your choice :\n" +
                "1.Search Villa\n" +
                "2.Search House\n" +
                "3.Search Room\n ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                ManagerVilla.searchVilla();
                break;
            case 2:
                ManagerHouse.searchHouse();
                break;
            case 3:
                ManagerRoom.searchRoom();
                break;
            default:
                System.out.println("There is no option");
                break;
        }
    }
    public static void editServices() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your choice :\n" +
                "1.Edit Villa\n" +
                "2.Edit House\n" +
                "3.Edit Room\n ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                ManagerVilla.editVilla();
                break;
            case 2:
                ManagerHouse.editHouse();
                break;
            case 3:
                ManagerRoom.editRoom();
                break;
            default:
                System.out.println("There is no option");
                break;
        }
    }
    public static void deleteServices() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your choice :\n" +
                "1.Delete Villa\n" +
                "2.Delete House\n" +
                "3.Delete Room\n ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                ManagerVilla.deteleVilla();
                break;
            case 2:
                ManagerHouse.deteleHouse();
                break;
            case 3:
                ManagerRoom.deteleRoom();
                break;
            default:
                System.out.println("There is no option");
                break;
        }
    }

    public static void showServices() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 1) {
            System.out.println("Please enter your choice :\n" +
                    "1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Name Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit\n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    ManagerVilla.showVilla();
                    count++;
                    break;
                case 2:
                    ManagerHouse.showHouse();
                    count++;
                    break;
                case 3:
                    ManagerRoom.showRoom();
                    count++;
                    break;
                case 4:
                    break;
                case 5:
                    count++;
                    break;
                default:
                    count++;
                    System.out.println("There is no option");
                    break;
            }
        }

    }
}

