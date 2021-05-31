package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TinhDuongCheoMang2Chieu {
    public static void main(String[] args) {
        int size1;
        int[][] array;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a size array 1");
        size1 = scanner.nextInt();

        array = new int[size1][size1];

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size1; j++) {
                System.out.println("Enter Element" + i + 1 + ":");
                Scanner scanner1 = new Scanner(System.in);
                array[i][j] = scanner1.nextInt();

            }
        }
        System.out.println("\n Array: \n");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size1; j++) {
                System.out.print(array[i][j]+" ");

            }
            System.out.println("\n");
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    sum1 += array[i][j];
                }

            }
        } System.out.println("Tổng đường chéo thứ nhất: " +sum1);
        for (int i = (array.length - 1); i >= 0; i--) {
            for (int j = 0; j < array.length; j++) {
                if(i+j==array.length-1){sum2 += array[i][j];
                }
            }
        }

        System.out.println("TỔng đường chéo thứ 2: " +sum2);
        }
}
