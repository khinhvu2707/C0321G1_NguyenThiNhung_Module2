package _11_DSA_Stack_Queue.bai_tap.optional;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        System.out.println("Decimal : ");
        int decimal = scanner.nextInt();
        while (decimal != 0) {
            int binary = decimal % 2;
            stack.push(binary);
            decimal = decimal/2;
        }
        System.out.println("Binary : ");
        for(;stack.size() > 0;) {
            Integer x = stack.pop();
            result.append(x);
        }
        System.out.println(result);
    }
}
