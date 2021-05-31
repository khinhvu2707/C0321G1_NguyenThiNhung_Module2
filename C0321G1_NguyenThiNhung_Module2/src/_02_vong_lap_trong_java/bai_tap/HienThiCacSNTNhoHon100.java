package _02_vong_lap_trong_java.bai_tap;

public class HienThiCacSNTNhoHon100 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (KTSNT(i)) {
                System.out.println(i + " ");
            }
        }
    }
    public static boolean KTSNT(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
