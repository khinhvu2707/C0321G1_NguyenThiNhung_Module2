package _06_ke_thua.bai_tap;
import java.util.Arrays;
public class Point2DTest {
    public static void main(String[] args) {
        Point2D test1 = new Point2D();
        System.out.println(test1);
        System.out.print("Array: " + Arrays.toString(test1.getXY()));
        Point2D test2 = new Point2D(5.0f,4.0f);
        System.out.println("\n" + test2);
        System.out.print("Array: " + Arrays.toString(test2.getXY()));
    }
}
