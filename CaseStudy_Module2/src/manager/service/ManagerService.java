package manager.service;

import manager.service.house.*;
import manager.service.room.*;
import manager.service.villa.*;

import java.io.IOException;
import java.util.Scanner;

public class ManagerService {
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
                    AddVilla.addVilla();
                    count++;
                    break;
                case 2:
                    AddHouse.addHouse();
                    count++;
                    break;
                case 3:
                    AddRoom.addRoom();
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
                SearchVilla.searchVilla();
                break;
            case 2:
                SearchHouse.searchHouse();
                break;
            case 3:
                SearchRoom.searchRoom();
                break;
            default:
                System.out.println("There is no option");
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
                EditVilla.editVilla();
                break;
            case 2:
                EditHouse.editHouse();
                break;
            case 3:
                EditRoom.editRoom();
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
                DeleteVilla.deteleVilla();
                break;
            case 2:
                DeleteHouse.deteleHouse();
                break;
            case 3:
                DeleteRoom.deteleRoom();
                break;
            default:
                System.out.println("There is no option");
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
                    ShowVilla.showVilla();
                    count++;
                    break;
                case 2:
                    ShowHouse.showHouse();
                    count++;
                    break;
                case 3:
                    ShowRoom.showRoom();
                    count++;
                    break;
                case 4:
                    SortVilla.sortVilla();
                    break;
                case 5:
                    SortHouse.sortHouse();
                    break;
                case 6:
                    SortRoom.sortRoom();
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

