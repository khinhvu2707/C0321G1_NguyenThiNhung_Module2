package _07_abstractClass_Interface.bai_tap.resizeable;



public class Square1 extends Shape1 implements Resizeable {
    private double side;

    public Square1() {
    }

    public Square1(double side) {
        this.side = side;
    }

    public Square1(double side, String color, boolean filled) {
        super(color,filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString()
                + ", Area=" +
                + getArea();
    }

    double getArea() {
        return side * side;
    }

    @Override
    public void resize(double percent) {
        this.side *= (percent / 100);
    }

}
