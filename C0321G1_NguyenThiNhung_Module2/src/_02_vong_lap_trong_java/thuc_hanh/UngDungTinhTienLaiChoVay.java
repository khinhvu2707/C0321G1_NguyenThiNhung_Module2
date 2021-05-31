package _02_vong_lap_trong_java.thuc_hanh;
import java.util.Scanner;
public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        double money = 1.0;
        int month=1;
        double interestRate =1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tiền");
        money=input.nextDouble();
        System.out.println("Nhập tháng");
        month=input.nextInt();
        System.out.println("Nhập lãi");
        interestRate=input.nextDouble();
        double total=0;
        for (int i=0;i<month;i++){
            total+= money*(interestRate/100)/12*month;
        }
        System.out.println("Tổng Lãi: " +total);
    }
}
