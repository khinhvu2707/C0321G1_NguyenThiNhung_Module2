package manager.service.villa;

import commons.WriteAndReadVilla;
import models.Villa;

import java.io.IOException;
import java.util.List;

public class ShowVilla {
    public static void showVilla() throws IOException {
        List<Villa> result;
        result = WriteAndReadVilla.readVilla();
        for (Villa villa : result) {
            villa.showInfor();
        }
    }
}
