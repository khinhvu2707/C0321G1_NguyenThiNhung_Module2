package _07_abstractClass_Interface.bai_tap.colorable;
public class Rectangle2 extends Shape2  {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle2() {
    }

    public Rectangle2(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle2(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle : "
                +getArea();
    }
}
