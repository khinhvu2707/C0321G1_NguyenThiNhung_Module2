package manager.service.house;

import commons.WriteAndReadHouse;
import models.House;


import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class SortHouse {
    public static void sortHouse() throws IOException {
        List<House> result;
        result = WriteAndReadHouse.readHouse();
        Collections.sort(result,new SortNameH());
        TreeSet<String> strings = new TreeSet<>();
        for (int i = 0; i < result.size(); i++) {
            if(strings.add(result.get(i).getTenDichVu())){
                result.get(i).showInfor();
            }
        }
    }
}
