package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TongCacSoO1CotXD {
    public static void main(String[] args) {
        int size1;
        int size2;
        int[][] array;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a size array 1");
        size1 = scanner.nextInt();
        System.out.println("Enter a size array 1");
        size2 = scanner.nextInt();

        array = new int[size1][size2];

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.println("Enter Element" + i + 1 + ":");
                Scanner scanner1 = new Scanner(System.in);
                array[i][j] = scanner1.nextInt();

            }
        }
        System.out.println("\n Array: \n");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print(array[i][j]);

            }
            System.out.println("\n");

        }
        int num;
        System.out.println("Enter a num:");
        num = scanner.nextInt();
        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            sum+=array[i][num];

        }
        System.out.println(sum);
    }
}
