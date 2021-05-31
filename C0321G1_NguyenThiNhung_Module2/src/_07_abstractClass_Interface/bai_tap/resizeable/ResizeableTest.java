package _07_abstractClass_Interface.bai_tap.resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape1[] shape1s = new Shape1[3];
        shape1s[0] = new Circle1(x, "yellow", false);
        shape1s[1] = new Rectangle1(x, x, "infinity", true);
        shape1s[2] = new Square1(x, "melinda", true);
        for (Shape1 a : shape1s){
            System.out.println(a);
        }

        for (Shape1 a : shape1s) {
            ((Resizeable)a).resize(Math.random() * 100);
        }
        System.out.println("\n");
        Shape1.printShape(shape1s);
    }
}
