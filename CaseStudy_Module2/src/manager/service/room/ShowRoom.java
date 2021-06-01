package manager.service.room;

import commons.WriteAndReadRoom;
import models.Room;

import java.io.IOException;
import java.util.List;

public class ShowRoom {
    public static void showRoom() throws IOException {
        List<Room> result;
        result = WriteAndReadRoom.readRoom();
        for (Room room : result) {
            System.out.println(room.showInfor());
        }
    }
}
