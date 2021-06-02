package commons;

import java.io.*;

public class WriteAndReadTickket {
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static void writeTickket(String args) throws IOException {
        FileWriter input = new FileWriter("D:\\C0321G1_NguyenThiNhung_Module2\\CaseStudy_Module2\\src\\data\\Tickket.csv", true);
        BufferedWriter bufferedWriter = new BufferedWriter(input);
        try {
            bufferedWriter.write(args);
            bufferedWriter.write(NEW_LINE_SEPARATOR);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.close();
            input.close();
        }
    }

    public static String readTickket() throws IOException {
        FileReader ouput = new FileReader("D:\\C0321G1_NguyenThiNhung_Module2\\CaseStudy_Module2\\src\\data\\Tickket.csv");
        BufferedReader bufferedReader = new BufferedReader(ouput);

        String line1 = "";
        try {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                line1+=line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
            ouput.close();
        }return line1;
    }
}
