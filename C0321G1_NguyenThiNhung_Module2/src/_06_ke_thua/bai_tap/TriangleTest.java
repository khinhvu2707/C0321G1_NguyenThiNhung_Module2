package _06_ke_thua.bai_tap;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle test0 = new Triangle();
        System.out.println(test0);

        Triangle test1 = new Triangle(3.6,5.0,2.0,"blue",true);
        System.out.println("\n" +test1);

        Triangle triangle2 = new Triangle();
        Scanner test = new Scanner(System.in);
        System.out.println("Nhập cạnh thứ nhất : ");
        triangle2.setSize1(test.nextDouble());
        System.out.println("Nhập cạnh thứ 2 : ");
        triangle2.setSize2(test.nextDouble());
        System.out.println("Nhập cạnh thứ 3 : ");
        triangle2.setSize3(test.nextDouble());
        System.out.println("Nhập màu sắc: ");
        triangle2.setColor(test.next());
        System.out.println(triangle2);

    }
}
