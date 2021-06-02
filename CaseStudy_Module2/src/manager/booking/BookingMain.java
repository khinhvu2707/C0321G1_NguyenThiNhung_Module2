package manager.booking;
import commons.WriteAndReadBooking;

import java.io.IOException;
import java.util.Scanner;

public class BookingMain {
        public static void booking() throws IOException {
        int count = 0;
        while (count < 1) {
            System.out.println(" Please enter your choice : \n" +
                    "1.\tAdd New Booking\n" +
                    "2.\tShow Booking\n" +
                    "3.\tExit\n");
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    AddBooking.addNewBooking();
                    count++;
                    break;
                case 2:
                    WriteAndReadBooking.readBooking();
                    count++;
                    break;
                case 3:
                    count++;
                    break;
                default:
                    System.out.println("There is no option");
                    break;
            }
        }
    }
}
