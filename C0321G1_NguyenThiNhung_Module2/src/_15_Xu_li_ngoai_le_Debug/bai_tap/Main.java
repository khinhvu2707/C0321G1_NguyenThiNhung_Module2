package _15_Xu_li_ngoai_le_Debug.bai_tap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean check=false;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Hãy nhập cạnh thứ nhất : ");
                int x = Integer.parseInt(String.valueOf(scanner.nextLine()));
                System.out.println("Hãy nhập cạnh thứ hai : ");
                int y = Integer.parseInt(String.valueOf(scanner.nextLine()));
                System.out.println("Hãy nhập cạnh thứ ba : ");
                int z = Integer.parseInt(String.valueOf(scanner.nextLine()));
                Triangle test = new Triangle(x, y, z);
                System.out.println(test.toString());
                check=false;
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
                check=true;
            }
            catch (IllegalTriangleException e) {
                System.err.println(e.getMessage());
                check=true;
            }
        }while (check);
    }
}
