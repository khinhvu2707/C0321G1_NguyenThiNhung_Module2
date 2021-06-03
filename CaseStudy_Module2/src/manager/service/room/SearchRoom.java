package manager.service.room;

import commons.WriteAndReadRoom;
import models.Room;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class SearchRoom {
    public static void searchRoom() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id Room cần tìm: ");
        String searchId = scanner.nextLine();
        List<Room> result;
        result = WriteAndReadRoom.readRoom();
        boolean check = true;
        for (int i = 0; i < result.size(); i++) {
            if (searchId.equals(result.get(i).getId())) {
                result.get(i).showInfor();
                check = false;
                break;
            } else {
                check = true;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy sản phẩm này!");
        }
    }
}
