package manager.service.villa;

import commons.WriteAndReadVilla;
import models.Villa;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class SortVilla {
        public static void sortVilla() throws IOException {
        List<Villa> result;
        result = WriteAndReadVilla.readVilla();
        Collections.sort(result,new SortNameV());
        TreeSet<String> villas = new TreeSet<>();
        for (int i = 0; i < result.size(); i++) {
            if(villas.add(result.get(i).getTenDichVu())){
                result.get(i).showInfor();
            }
        }
    }
}
