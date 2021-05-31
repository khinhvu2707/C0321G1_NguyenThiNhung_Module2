package _05_AccessModifier_StaticMethod_StaticProperty.bai_tap;

import java.awt.geom.Area;

public class Circle {
    private double radius =1.0;
    private String color = "red";
    private double area;
    public Circle(){

    }
    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        area = radius*radius*Math.PI;
        return area;
    }

    public String getColor() {
        return color;
    }
}
