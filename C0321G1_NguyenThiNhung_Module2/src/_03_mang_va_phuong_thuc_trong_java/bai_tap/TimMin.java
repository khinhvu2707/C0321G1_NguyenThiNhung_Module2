package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimMin {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a size array 1");
        size = scanner.nextInt();
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter Element" + i + 1 + ":");
            Scanner scanner1 = new Scanner(System.in);
            array[i] = scanner1.nextInt();
            i++;
        }
        System.out.println("Elements in array 1 : " + "\n");
        for (int h = 0; h < array.length; h++) {
            System.out.print(array[h] + " ");
        }
        int min =array[0];
        for (int j = 0; j < array.length ; j++) {
            if (array[j]<min){
                min=array[j];
            }
        }System.out.println("\n Min:" + min);

    }
}
