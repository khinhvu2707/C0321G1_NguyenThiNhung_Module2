package _06_ke_thua.bai_tap;

import java.util.Arrays;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D test1 = new Point3D();
        System.out.println(test1);
        Point3D test2 = new Point3D(5.3f,7.2f,8.0f);
        System.out.println(test2);
        System.out.print("Array: " + Arrays.toString(test2.getXYZ()));
    }
}
