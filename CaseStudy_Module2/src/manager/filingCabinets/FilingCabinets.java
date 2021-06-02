package manager.filingCabinets;

import commons.WriteAndReadEmployee;
import models.Employee;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class FilingCabinets {
        public static void filingCabinets(){

        Stack<Employee> stack = new Stack<>();
        List<Employee> result;
        result = WriteAndReadEmployee.readEmployee();
        for (Employee employee : result) {
            stack.push(employee);
        }
        int length = stack.size();
        System.out.println("Nhập tên nhân viên cần tìm kiếm : ");
        Scanner scanner =new Scanner(System.in);
        String string = scanner.nextLine();
        for (int i = length-1; i >0; i--) {
            if(string.equals(stack.pop().getName())){
                System.out.println(result.get(i).toString());
            }
        }
    }
}
