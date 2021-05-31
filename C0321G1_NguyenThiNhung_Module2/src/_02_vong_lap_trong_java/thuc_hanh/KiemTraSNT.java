package _02_vong_lap_trong_java.thuc_hanh;
import java.util.Scanner;
public class KiemTraSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số muốn kiểm tra");
        int number = scanner.nextInt();
        if (number<2){
            System.out.println(number+" Không phải Số Nguyên Tố");
        }  else {
            int i=2;
            boolean check=true;
            while (i<=Math.sqrt(number)){
                if (number%i==0){
                    check=false;
                    break;
                } i++;
            }
            if (check){
                System.out.println(number+" là Số Nguyên Tố");
            } else {
                System.out.println(number+ " Không phải Số Nguyên Tố");
            }
        }
    }
}
