package _13_thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class ConsecutiveString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();
        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.getLast()) {
                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }

        for (Character st : max) {
            System.out.print(st);
        }
        System.out.println();
    }
}
