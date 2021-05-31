package _03_mang_va_phuong_thuc_trong_java.thuc_hanh;
import java.util.Scanner;
public class TimMax {
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
            System.out.print(array[j] +"\t");}
        int max= array[0];
        int index=0;
        for (int k=0;k<array.length;k++){
            if(array[k]>max){
                max=array[k];
                index=k;
            }
        }
        System.out.println("\n Max : "+max +" index: " +(index +1));
    }
}
