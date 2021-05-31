package _06_ke_thua.bai_tap;

import _06_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;

public  class Triangle extends Shape {
    double size1 = 1.0;
    double size2 = 1.0;
    double size3 = 1.0;

    public Triangle() {

    }

    public Triangle(double size1, double size2, double size3) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }
    public Triangle(double size1, double size2, double size3, String color) {
        super(color);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public Triangle(double size1, double size2, double size3, String color, boolean filled) {
        super(color, filled);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;

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

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }

    public double getArea() {
        return ((Math.sqrt((size1 + size2 + size3) * (size1 + size2 - size3) * (size2 + size3 - size1) * (size3 + size1 - size2)))/4);
    }

    private double getPerimeter() {
        return size1 + size2 + size3;
    }

    @Override
    public String toString() {
        return "Triangle { " +
                "size1= " + getSize1() +
                ", size2= " + getSize2() +
                ", size3= " + getSize3()
                + " Area: "
                + getArea()
                + " Perimeter: "
                + getPerimeter()
                + " color "
                + super.getColor()
                + (isFilled() ? " filled " : " not filled ")
                + " } ";
    }
}
