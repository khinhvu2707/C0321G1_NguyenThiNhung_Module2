package _07_abstractClass_Interface.bai_tap.resizeable;
public class Circle1 extends Shape1 implements Resizeable{
    private double radius = 1.0;

    public Circle1() {
    }

    public Circle1(double radius) {
        this.radius = radius;
    }

    public Circle1(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString()
                + ", Area=" +
                + getArea();
    }

    @Override
    public void resize(double percent) {
        this.radius *= (percent / 100);
    }
}
