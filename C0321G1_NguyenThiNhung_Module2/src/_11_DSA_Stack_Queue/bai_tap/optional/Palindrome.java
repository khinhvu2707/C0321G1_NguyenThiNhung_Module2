package _11_DSA_Stack_Queue.bai_tap.optional;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
//        boolean flag = true;
//        StringBuilder str3 = new StringBuilder();
//        System.out.print("Nhập vào chuỗi cần kiểm tra:");
//        Scanner in = new Scanner(System.in);
//        String inputString = in.nextLine();
//        String str2 = inputString.toLowerCase();
//        Queue<Character> queue = new LinkedList<>();
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < str2.length() / 2; i++) {
//            queue.add(str2.charAt(i));
//        }
//        for (int i = str2.length() - 1; i >= str2.length() / 2; i--) {
//            if (str3.length() < queue.size()) {
//                str3.append(str2.charAt(i));
//            }
//        }
//        for (int i = str3.length() - 1; i >= 0; i--) {
//            { if (stack.size() < queue.size()) {
//                    stack.add(str3.charAt(i));
//                }
//            }
//        }
//        for (int i = 0; i < str2.length() / 2; i++) {
//            if (!stack.pop().equals(queue.poll())) {
//                flag = false;
//                break;
//            }
//        }
//        if (flag) {
//            System.out.println("Đây là chuỗi Palindrome!");
//        } else {
//            System.out.println("Đây không phải là chuỗi Palindrome!");
//        }
//    }
//}

// --- CÁCH 2 ---
            boolean flag = true;
            System.out.print("Nhập vào chuỗi cần kiểm tra:");
            Scanner in = new Scanner(System.in);
            String inputString = in.nextLine();
            String str2 = inputString.toLowerCase();
            Queue<Character> queue = new LinkedList<>();
            Stack<Character> stack = new Stack<>();
                for (int i = 0; i < str2.length(); i++) {
                    if (i < str2.length() / 2) {
                        queue.add(str2.charAt(i));
                    } else {
                        stack.push(str2.charAt(i));
                    }
                }
        System.out.println(stack);
            for (int i = 0; i < str2.length() / 2; i++) {
                if (!stack.pop().equals(queue.poll())) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Đây là chuỗi Palindrome!");
            } else {
                System.out.println("Đây không phải là chuỗi Palindrome!");
            }
        }
    }


