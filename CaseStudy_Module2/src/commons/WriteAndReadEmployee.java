package commons;

import models.Customer;
import models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadEmployee {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static void writeEmployee(String name, String old, String adress) throws IOException {
        FileWriter input = new FileWriter("D:\\C0321G1_NguyenThiNhung_Module2\\CaseStudy_Module2\\src\\data\\Employee.csv", true);
        BufferedWriter bufferedWriter = new BufferedWriter(input);
        try {
            bufferedWriter.append(name);
            bufferedWriter.append(COMMA_DELIMITER);
            bufferedWriter.append(old);
            bufferedWriter.append(COMMA_DELIMITER);
            bufferedWriter.append(adress);
            bufferedWriter.append(NEW_LINE_SEPARATOR);
            System.out.println("Success!");
        } catch (
                Exception e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.close();
            input.close();
        }

    }

    public static List<Employee> readEmployee() {
        List<Employee> result = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("D:\\C0321G1_NguyenThiNhung_Module2\\CaseStudy_Module2\\src\\data\\Employee.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                Employee employee =new Employee(strings[0],strings[1],strings[2]);
                result.add(employee);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
