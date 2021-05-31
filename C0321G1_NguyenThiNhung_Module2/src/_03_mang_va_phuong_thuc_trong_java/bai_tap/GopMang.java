package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int size2;
        int[] array3;
        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a size array 1");
            size2 = scanner.nextInt();
        array3 = new int[size2];
        int i = 0;
        while (i < array3.length) {
            System.out.println("Enter Element" + i + 1 + ":");
            Scanner scanner1 = new Scanner(System.in);
            array3[i] = scanner1.nextInt();
            i++;
        }
        System.out.println("Elements in array 1 : " + "\n");
        for (int h = 0; h < array3.length; h++) {
            System.out.print(array3[h] + " ");
        }
        int size3;
        int[] array4;
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("\n Enter a size array 2");
        size3 = scanner2.nextInt();
        array4 = new int[size3];
        int j = 0;
        while (j < array4.length) {
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Enter Element" + j + 1 + ":");
            array4[j] = scanner3.nextInt();
            j++;
        }
        System.out.println("Elements in array 2 : " + "\n");
        for (int k = 0; k < array4.length; k++) {
            System.out.print(array4[k] + " ");
        }

        int[] array5 = new int[size2+size3];
        for (int a = 0; a < size2 ; a++) {
            array5[a]=array3[a];
        }
        int c=0;
        for (int b = size2; b <size2+size3 ; b++) {

            if( c < array4.length) {
                array5[b] = array4[c];
                c++;

            }

        }
        System.out.println("New array: \n");
        for (int d = 0; d < array5.length ; d++) {
            System.out.println(array5[d]);
        }

    }
    }
