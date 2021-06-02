package manager.Employee;

import manager.service.house.DeleteHouse;
import manager.service.room.DeleteRoom;
import manager.service.villa.DeleteVilla;

import java.io.IOException;
import java.util.Scanner;

public class ManagerEmployeeMain {
    public static void Employee() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 1) {
            System.out.println("Please enter your choice :\n" +
                    "1.Add Employee\n" +
                    "2.Show Employee\n" +
                    "3.Exit\n ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    count++;
                    AddEmployee.addEmployee();
                    break;
                case 2:
                    count++;
                    ShowEmployee.showEmployee();
                    break;
                case 3:
                    count++;
                    break;
                default:
                    System.out.println("There is no option");
            }
        }
    }
}
