package manager.service.house;

import commons.WriteAndReadHouse;
import models.House;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class SearchHouse {
    public static void searchHouse() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id Villa cần tìm: ");
        String searchId = scanner.nextLine();
        List<House> result;
        result = WriteAndReadHouse.readHouse();
        boolean check = true;
        for (int i = 0; i < result.size(); i++) {
            if (searchId.equals(result.get(i).getId())) {
                System.out.println(result.get(i).showInfor());
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
