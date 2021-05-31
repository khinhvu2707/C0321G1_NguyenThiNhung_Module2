package _01_introduction_to_java.bai_tap;
import java.util.Scanner;
public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số USD muốn quy đổi: ");
        float usd = scanner.nextFloat();
        System.out.println(usd);
        float vnd = usd/23000;

        System.out.println("số VND tương ứng là: " +vnd);
    }
}
