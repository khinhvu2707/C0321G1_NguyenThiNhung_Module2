package _03_mang_va_phuong_thuc_trong_java.thuc_hanh;
import java.util.Scanner;
public class DaoNguocPhanTu {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size=scanner.nextInt();
            if (size>20){
                System.out.println("Size does not exceed 20");
            }
        } while (size>20);
        array= new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("Enter Element" + i+1+":");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.printf("Elements in array: " +"\n");
        for (int j=0;j<array.length;j++){
        System.out.println(array[j]);}

        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n Elements in reverse array: " +"\n");
        for (int j=0;j<array.length;j++){
            System.out.println(array[j]);}

    }
}
