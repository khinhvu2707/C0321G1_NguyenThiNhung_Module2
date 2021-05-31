package _04_lop_va_doi_tuong.bai_tap;

import java.util.Scanner;

public class QuadraticEquation2 {
    public static void main(String[] args) {
        QuadraticEquation1 pt = new QuadraticEquation1();
        Scanner input = new Scanner(System.in);
        System.out.print("nhap a: ");
        pt.a = input.nextFloat();
        System.out.print("nhap b: ");
        pt.b = input.nextFloat();
        System.out.print("nhap c: ");
        pt.c = input.nextFloat();

        System.out.println("Phương trình cần giải là: " + pt.getA() + "x²+" + pt.getB() + "x+" + pt.getC() + "=0");
        pt.giaiPT();
    }
}
