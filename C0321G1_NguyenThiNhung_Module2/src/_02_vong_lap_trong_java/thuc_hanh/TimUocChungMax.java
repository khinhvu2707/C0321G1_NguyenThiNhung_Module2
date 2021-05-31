package _02_vong_lap_trong_java.thuc_hanh;
import java.util.Scanner;
public class TimUocChungMax {
    public static void main(String[] args) {
        int a;
        int b;
       Scanner input=new Scanner(System.in);
        System.out.println("Nhập số thứ nhất");
        a=input.nextInt();
        System.out.println("Nhập số thứ 2");
        b=input.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if (a==0||b==0){
            System.out.println("Không có ước chung");
        }
        if (a!=b){
            if (a>b){
                a=a-b;
            } else {
                b=b-a;
            }
        }
        System.out.println("Ước chung lớn nhất: " +a);
    }
}
