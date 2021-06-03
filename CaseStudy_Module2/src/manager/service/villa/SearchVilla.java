package manager.service.villa;

import commons.WriteAndReadVilla;
import models.Villa;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class SearchVilla {
    public static void searchVilla() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id Villa cần tìm: ");
        String searchId = scanner.nextLine();
        List<Villa> result;
        result = WriteAndReadVilla.readVilla();
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
