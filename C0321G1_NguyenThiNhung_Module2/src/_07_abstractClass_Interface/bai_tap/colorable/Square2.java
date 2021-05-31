package _07_abstractClass_Interface.bai_tap.colorable;

public class Square2 extends Shape2 implements Colorable {
    private double side;

    public Square2() {
    }

    public Square2(double side) {
        this.side = side;
    }

    public Square2(double side, String color, boolean filled) {
        super(color,filled);
        this.side = side;
    }
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    double getArea() {
        return side * side;
    }
    @Override
    public String toString() {
        return "A Square : "
                + getArea();
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
