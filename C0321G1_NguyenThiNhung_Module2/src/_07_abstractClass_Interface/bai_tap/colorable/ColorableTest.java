package _07_abstractClass_Interface.bai_tap.colorable;

public class ColorableTest {
    public static void main(String[] args) {

        Shape2[] shape2Test = new Shape2[4];
        shape2Test[0] = new Circle2(7);
        shape2Test[1] = new Circle2(4, "red", true);
        shape2Test[2] = new Square2(7, "black", false);
        shape2Test[3] = new Rectangle2(8, 3.2, "blue", false);
        for (Shape2 a : shape2Test) {
            System.out.println(a);
            if (a instanceof Colorable) {
                ((Colorable) a).howToColor();
            }
        }
    }

}



