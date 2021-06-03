package manager.service.room;

import commons.WriteAndReadRoom;
import models.Room;


import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class SortRoom {
    public static void sortRoom() throws IOException {
        List<Room> result;
        result = WriteAndReadRoom.readRoom();
        Collections.sort(result,new SortNameR());
        TreeSet<String> strings = new TreeSet<>();
        for (int i = 0; i < result.size(); i++) {
            if(strings.add(result.get(i).getTenDichVu())){
                result.get(i).showInfor();
            }
        }
    }
}
