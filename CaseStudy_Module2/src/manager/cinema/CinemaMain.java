package manager.cinema;

import commons.WriteAndReadTickket;

import java.io.IOException;
import java.util.Scanner;

public class CinemaMain {
    public static void managerCinema() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 1) {
            System.out.println("Please enter your choice :\n" +
                    "1.\tShow Movie\n" +
                    "2.\tBuy ticket\n" +
                    "3.\tShow ticket\n" +
                    "4.\tAdd Movie\n" +
                    "5.\tExit\n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    ListMovie.showMovie();
                    break;
                case 2:
                    BuyTickket.buyTicket();
                    break;
                case 3:
                    ShowTickket.showTickket();
                    break;
                case 4:
                    AddNewMovie.addNewMovie();
                    break;
                case 5:
                    System.out.println("Bye bye");
                    count++;
                    break;
                default:
                    System.out.println("There is no option");
            }
        }
    }
}
