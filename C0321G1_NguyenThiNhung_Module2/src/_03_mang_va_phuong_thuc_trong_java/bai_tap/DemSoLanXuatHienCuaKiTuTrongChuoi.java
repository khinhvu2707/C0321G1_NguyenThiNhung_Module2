package _03_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class DemSoLanXuatHienCuaKiTuTrongChuoi {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi kí tự:");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("Nhập kí tự cần kiểm tra:");
        char c = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                count ++;
            }
        }
        System.out.print("Kí tự " +c+" Xuất hiện " +count +" lần");
    }
}
