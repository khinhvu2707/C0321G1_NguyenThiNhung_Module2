package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
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
        int delete;
        System.out.println("\n Enter Delete Elements");
        Scanner scanner1 = new Scanner(System.in);
        delete = scanner1.nextInt();
        int indexDel = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == delete) {
                indexDel = j;
                System.out.println("Elements in array: " + delete + " index: " + (indexDel + 1));
            }
        }
        for (int k = indexDel; k < array.length - 1; k++) {
            array[k] = array[k + 1];
        }
        System.out.print("mảng sau khi xóa : ");
        for (int h = 0; h < array.length-1; h++) {
            System.out.print(array[h] + " ");
        }
    }
}
