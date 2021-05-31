package _04_lop_va_doi_tuong.bai_tap;

public class Fan1 {
    final int SLOW = 1;
    final int MeDIUM = 2;
    final int FAST = 3;
    private int speed;
    private double radius;
    private boolean on;
    private String color;

    // constructor không tham số
    public Fan1() {

    }

    // thêm constructor có tham số
    public Fan1(int speed, double radius, boolean on, String color) {
        this.speed = speed;
        this.radius = radius;
        this.on = on;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public boolean isOn() {
        return on;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if(isOn()){
            return "A Fan: "
                    + " Speed: "
                    + getSpeed()
                    + " Color: "
                    + getColor()
                    + " Radius: "
                    + getRadius()
                    + " and "
                    + (isOn() ? "fan is on" : "fan is off");
        }
        return "A Fan: "
                + " Color: "
                + getColor()
                + " Radius: "
                + getRadius()
                + " and "
                + (isOn() ? "fan is on" : "fan is off");
    }


}
