package _14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortByStep {
    public static void  insertSort (int [] array) {
        for (int  i =  1 ; i < array.length; i++) {
            System.out.println("mảng hiện tại: " +Arrays.toString(array));
            int  temp = array[i];
            System.out.println(" Gán temp=" +temp);
            int  j = i - 1 ;
            System.out.println("So sánh phần tử tại vị trí "+(i-1) +" = " +array[j] +" và temp =" +temp);
            for  (; j >= 0 && array[j] > temp; j--) {

                System.out.println("Dịch chuyển " + array[j] + " sang vị trí của " + array[j + 1]);
                array [j + 1] = array [j];
                System.out.println("mảng hiện tại: " +Arrays.toString(array));
            }
            array [j + 1] = temp;
            System.out.println("Gán lại giá trị cho phần tử tại vị trí " +(j+1) +"= temp =" +temp);
        }
        System.out.println("Result : "+Arrays.toString(array));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertSort(list);
    }
}
