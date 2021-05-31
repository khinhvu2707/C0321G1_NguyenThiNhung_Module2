package _15_Xu_li_ngoai_le_Debug.bai_tap;

public class Triangle {
    private double size1 = 1;
    private double size2 = 1;
    private double size3 = 1;

    public Triangle() {
    }

    public Triangle(double size1, double size2, double size3) throws IllegalTriangleException {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
        if (size1 < 0 || size2 < 0 || size3 < 0) {
            throw new IllegalTriangleException("Not a triangle because side is less than 0");
        } else if (size1 + size2 < size3 || size1 + size3 < size2 || size2 + size3 < size1) {
            throw new IllegalTriangleException("It's not a triangle because the sum of the two sides is smaller than the other side");
        }
    }

    public double getSize1() {
        return size1;
    }

    public double getSize2() {
        return size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize1(int size1) {
        this.size1 = size1;
    }

    public void setSize2(int size2) {
        this.size2 = size2;
    }

    public void setSize3(int size3) {
        this.size3 = size3;
    }

    public double getArea() {
        return ((Math.sqrt((size1 + size2 + size3) * (size1 + size2 - size3) * (size2 + size3 - size1) * (size3 + size1 - size2))) / 4);
    }

    private double getPerimeter() {
        return size1 + size2 + size3;
    }

    public String toString() {
        return "Triangle { " +
                " size1= " + getSize1() +
                ", size2= " + getSize2() +
                ", size3= " + getSize3()
                + " Area = "
                + getArea()
                + " Perimeter = "
                + getPerimeter()
                + " } ";
    }
}
