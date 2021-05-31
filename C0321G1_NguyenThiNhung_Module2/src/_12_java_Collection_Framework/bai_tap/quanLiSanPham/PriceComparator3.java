package _12_java_Collection_Framework.bai_tap.quanLiSanPham;

import java.util.Comparator;

public class PriceComparator3 implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getId() > o2.getId()){
            return 1;
        }else{
            return -1;
        }
    }
}
