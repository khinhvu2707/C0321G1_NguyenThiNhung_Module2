package _11_DSA_Stack_Queue.bai_tap.demSoLanXuatHien;

import java.util.*;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        System.out.print("Nhập vào chuỗi cần kiểm tra:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (map.containsKey(input.charAt(i))) {
                map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
            } else {
                map.put(input.charAt(i), 1);
            }

        }
        System.out.println(map);
    }
}




