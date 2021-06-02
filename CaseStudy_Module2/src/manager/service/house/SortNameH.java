package manager.service.house;

import models.House;

import java.util.Comparator;

public class SortNameH implements Comparator<House> {
    @Override
    public int compare(House o1, House o2) {
        return o1.getTenDichVu().compareTo(o2.getTenDichVu());
    }
}
