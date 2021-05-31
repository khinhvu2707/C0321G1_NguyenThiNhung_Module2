package _16_IO_text_file.bai_tap.readFile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvWriterExample {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static void main(String[] args) {

        String fileName = "D:\\C0321G1_NguyenThiNhung_Module2\\src\\_16_IO_text_file\\bai_tap\\readFile\\countries.csv";
        writeCsvFile(fileName);
    }

    public static void writeCsvFile(String fileName) {
        Countries countries1 = new Countries(1,"AU","Australia");
        Countries countries2 = new Countries(2,"CN","China");
        Countries countries3 = new Countries(3,"AU","Australia");
        Countries countries4 = new Countries(4,"CN","China");
        Countries countries5 = new Countries(5,"JP","Japan");
        Countries countries6 = new Countries(6,"CN","China");
        Countries countries7 = new Countries(7,"JP","Japan");
        Countries countries8 = new Countries(8,"TH","Thailand");

        List<Countries> countries = new ArrayList<>();
        countries.add(countries1);
        countries.add(countries2);
        countries.add(countries3);
        countries.add(countries4);
        countries.add(countries5);
        countries.add(countries6);
        countries.add(countries7);
        countries.add(countries8);


        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);
            for (Countries country : countries) {
                fileWriter.append(String.valueOf(country.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(country.getCode());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(country.getName());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("CSV file was created successfully !");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !");
            e.printStackTrace();
        } finally {
            try { if(fileWriter!=null)
            {fileWriter.close();}
            } catch (IOException e) {
                System.out.println("Error closing fileWriter !");
                e.printStackTrace();
            }
        }
    }
}
