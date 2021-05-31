package _07_AbstractClass_Interface.thuc_hanh;

import _06_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Circle;
import _06_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;
import java.util.Arrays;
public class ComparableCircle extends Circle implements Comparable<ComparableCircle>

    {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius){
        super(radius);
    }

    public ComparableCircle( double radius, String color,boolean filled){
        super(radius, color, filled);
    }

        @Override
        public int compareTo (ComparableCircle o){
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;

    }
    }

