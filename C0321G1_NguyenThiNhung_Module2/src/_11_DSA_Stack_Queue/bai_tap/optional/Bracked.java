package _11_DSA_Stack_Queue.bai_tap.optional;

import java.util.Scanner;
import java.util.Stack;

public class Bracked {
    public static boolean checkBracket(String args) {
        Stack<String> bstack = new Stack<>();
            int n = args.length();
            String[] sym = args.split("");
        for (int i = 0; i < n; i++) {
                if (sym[i].equals("(") || sym[i].equals("[") || sym[i].equals("{")) {
                    bstack.push(sym[i]);
                } else if (sym[i].equals(")") || sym[i].equals("]") || sym[i].equals("}")) {
                    if (bstack.empty()) {
                        return false;
                    } else {
                        bstack.pop();
                    }
                }
            }
            if (bstack.empty()) {
                return true;
            } else return false;
        }

    public static void main(String[] args) {
        System.out.print("Nhập vào đoạn cần kiểm tra:");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        if(checkBracket(inputString)){
            System.out.println("true");
        } else System.out.println("false");

    }

}