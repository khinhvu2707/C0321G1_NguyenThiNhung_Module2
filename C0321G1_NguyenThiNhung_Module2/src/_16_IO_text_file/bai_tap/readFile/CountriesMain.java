package _16_IO_text_file.bai_tap.readFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountriesMain {
    public static void main(String[] args) {
        BufferedReader test = null;
        try {
            String line;
            test = new BufferedReader(new FileReader("D:\\C0321G1_NguyenThiNhung_Module2\\src\\_16_IO_text_file\\bai_tap\\readFile\\countries.csv"));
            while ((line = test.readLine()) != null){
                List<String> result =getAddress(line);
                print(result);
            }
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                if(test !=null){
                    test.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static List getAddress(String line){
        List<String> result = new ArrayList<>();
        if (line != null) {
            String[] data = line.split(",");
            for (int i = 0; i < data.length; i++) {
                result.add(data[i]);
            }
        }
        return result;
    }
    private static void print(List<String> pr) {
        System.out.println(
                "Country [id= "
                        + pr.get(0)
                        + ", code= " + pr.get(1)
                        + " , name=" + pr.get(2)
                        + "]");
    }
}
