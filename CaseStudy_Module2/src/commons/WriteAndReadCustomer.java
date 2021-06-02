package commons;

import models.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadCustomer {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static void writeCustomer(String name, String birthday, String str, String sCMND, String telephone, String email, String level, String address, String service) throws IOException {
        FileWriter input = new FileWriter("D:\\C0321G1_NguyenThiNhung_Module2\\CaseStudy_Module2\\src\\data\\Customer.csv", true);
        BufferedWriter bufferedWriter = new BufferedWriter(input);
        try {
            bufferedWriter.append(name);
            bufferedWriter.append(COMMA_DELIMITER);
            bufferedWriter.append(birthday);
            bufferedWriter.append(COMMA_DELIMITER);
            bufferedWriter.append(str);
            bufferedWriter.append(COMMA_DELIMITER);
            bufferedWriter.append(sCMND);
            bufferedWriter.append(COMMA_DELIMITER);
            bufferedWriter.append(telephone);
            bufferedWriter.append(COMMA_DELIMITER);
            bufferedWriter.append(email);
            bufferedWriter.append(COMMA_DELIMITER);
            bufferedWriter.append(level);
            bufferedWriter.append(COMMA_DELIMITER);
            bufferedWriter.append(address);
            bufferedWriter.append(COMMA_DELIMITER);
            bufferedWriter.append(service);
            bufferedWriter.append(NEW_LINE_SEPARATOR);
            System.out.println("Success!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.close();
            input.close();
        }
    }

    public static List<Customer> readCustomer() throws IOException {
        List<Customer> result = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("D:\\C0321G1_NguyenThiNhung_Module2\\CaseStudy_Module2\\src\\data\\Customer.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                Customer customer = new Customer(strings[0], strings[1], strings[2], strings[3], strings[4], strings[5], strings[6], strings[7], strings[8]);
                result.add(customer);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
