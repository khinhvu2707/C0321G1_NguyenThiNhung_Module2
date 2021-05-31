package _11_DSA_Stack_Queue.bai_tap.demSoLanXuatHien;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        System.out.print("Nhập vào chuỗi cần kiểm tra:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] input = string.trim().split("\\s+");
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < input.length; i++) {
            if (map.containsKey(input[i])) {
                map.put(input[i], map.get(input[i]) + 1);
            } else {
                map.put(input[i], 1);
            }

        }
        System.out.println(map);
    }
}
