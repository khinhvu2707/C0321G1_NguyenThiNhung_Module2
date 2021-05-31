package _06_ke_thua.bai_tap;

import java.util.Arrays;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint test1 = new MoveablePoint();
        System.out.println(test1);
        System.out.print("Array 1 : " + Arrays.toString(test1.getXY()));

        MoveablePoint test2 = new MoveablePoint(5.3f,7.2f);
        System.out.println(test2);
        test2.Move();
        System.out.print("Array 2 : " + Arrays.toString(test2.getXY()));

    }
}
