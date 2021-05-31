package _06_ke_thua.bai_tap;

public class Circle {
    private double radius = 7.0;
    private String color = "green";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.color =color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return " A Circle with radius = "
                + getRadius()
                + " Color: "
                +getColor()
                + " Area: "
                +getArea()
                + " Perimeter: "
                +getPerimeter();
    }
}
