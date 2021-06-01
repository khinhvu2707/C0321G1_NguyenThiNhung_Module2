package manager.service.room;

import commons.WriteAndReadRoom;

import java.io.IOException;

public class AddRoom {
    public static void addRoom() throws IOException {
        WriteAndReadRoom.writeRoom();
    }
}
