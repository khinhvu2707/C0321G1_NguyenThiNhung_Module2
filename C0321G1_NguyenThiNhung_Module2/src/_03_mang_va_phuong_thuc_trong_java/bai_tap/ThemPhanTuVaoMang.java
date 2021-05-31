package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter Element" + i + 1 + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Elements in array: " + "\n");

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int pushElement;
        System.out.println("\n Enter Push Elements");
        Scanner scanner1 = new Scanner(System.in);
        pushElement = scanner1.nextInt();

        int indexPush;
        System.out.println("\n Enter index Elements");
        Scanner scanner2 = new Scanner(System.in);
        indexPush = scanner2.nextInt();
        System.out.println("Elements in array: " + pushElement +"index" +indexPush );
        int[] array2= new int[size+1];
        for (int k = 0; k < indexPush; k++) {
            array2[k] = array[k];
        }
            if (array2.length > indexPush) {
                array2[indexPush]=pushElement;

            }
        for (int k = indexPush+1; k < array2.length; k++) {
            array2[k] = array[k-1];
        }
        System.out.print("mảng sau khi thêm : ");
        for (int h = 0; h <= array.length; h++) {
            System.out.print(array2[h] + " ");
        }
    }
}
