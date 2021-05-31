package _04_lop_va_doi_tuong.bai_tap;


public class QuadraticEquation1 {
    double a;
    double b;
    double c;
    double delta;
    double r1;
    double r2;

    public QuadraticEquation1() {

    }

    public QuadraticEquation1(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }


    public double getDiscriminant() {
        delta = b * b - 4 * a * c;
        return delta;
    }

    private double getRoot1() {
        r1 = ((-b + Math.sqrt(delta)) / (2 * a));
        return r1;
    }

    private double getRoot2() {
        r2 = ((-b - Math.sqrt(delta)) / (2 * a));
        return r2;
    }

    private double getRoot3() {
        r1 = -c / b;
        return r1;
    }

    private double getRoot4() {
        r2 = -b / (2 * a);
        return r2;
    }

    public void giaiPT() {
        if (this.a == 0) {
            if (this.b == 0) {
                System.out.print("Phương trình vô số nghiệm");
            } else {

                System.out.print("Phương trình có nghiệm duy nhất " + this.getRoot3());
            }
        } else {
            if (this.getDiscriminant() < 0) {
                System.out.print("Phương trình vô nghiệm");
            } else {
                if (this.getDiscriminant() == 0) {
                    System.out.print("Phương trình có nghiệm kép: " + this.getRoot4());
                } else {
                    System.out.println("Phương trình có 2 nghiệm phân biệt: " + this.getRoot1() + " và " + this.getRoot2());
                }
            }
        }
    }
}

