package manager.service.house;

import commons.WriteAndReadHouse;
import models.House;
import java.io.IOException;
import java.util.List;

public class ShowHouse {
    public static void showHouse() throws IOException {
        List<House> result;
        result = WriteAndReadHouse.readHouse();
        for (House house : result) {
            System.out.println(house.showInfor());
        }
    }
}
