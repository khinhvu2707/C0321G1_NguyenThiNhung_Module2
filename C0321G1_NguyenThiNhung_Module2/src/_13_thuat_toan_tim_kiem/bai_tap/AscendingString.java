package _13_thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class AscendingString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
            String string = input.nextLine();
            LinkedList<Character> max = new LinkedList<>();

            for (int i = 0; i < string.length(); i++) {
                LinkedList<Character> list = new LinkedList<>();
                list.add(string.charAt(i));
                for (int j = i + 1; j < string.length(); j++) {
                    if (string.charAt(j) > list.getLast()) {
                        list.add(string.charAt(j));
                    }
                }
                if (list.size() > max.size()) {
                    max.clear();
                    max.addAll(list);
                }
                list.clear();
            }

            for (Character ch : max) {
                System.out.print(ch);
            }
        }
    }

     //Độ phức tạp:
    // 1 vòng lặp bên ngoài n lần+ 1 vòng lặp bên trong (n-1) lần => O(n*(n-1))
    // 1 vòng lặp * 1 câu lệnh => O(1)
    // => T(n) = O(n^2)


