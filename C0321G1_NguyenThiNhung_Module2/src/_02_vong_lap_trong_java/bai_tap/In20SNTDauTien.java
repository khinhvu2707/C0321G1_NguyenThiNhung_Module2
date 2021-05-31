package _02_vong_lap_trong_java.bai_tap;
import java.util.Scanner;
public class In20SNTDauTien {
    public static void main(String[] args) {
        int number;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Số lượng số nguyên tố cần in");
        number=scanner.nextInt();
        int count=0;
        int n=2;
        while (count<number){
          if (KTSNT(n)){
              System.out.println(n +" ");
              count++;
          } n++;
        }
    }
    public static boolean KTSNT(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
