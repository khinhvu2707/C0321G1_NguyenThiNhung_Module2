package manager.service.room;

import models.Room;

import java.util.Comparator;

public class SortNameR implements Comparator<Room> {
    @Override
    public int compare(Room o1, Room o2) {
        return o1.getTenDichVu().compareTo(o2.getTenDichVu());
    }
}
