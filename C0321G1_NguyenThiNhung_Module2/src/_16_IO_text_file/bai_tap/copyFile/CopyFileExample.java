package _16_IO_text_file.bai_tap.copyFile;

import java.io.*;

public class CopyFileExample {
    public static void main(String[] args) throws Exception {
        try {
            FileReader input = new FileReader("D:\\C0321G1_NguyenThiNhung_Module2\\src\\_16_IO_text_file\\bai_tap\\copyFile\\source.txt");
            BufferedReader bf =new BufferedReader(input);
            FileWriter output = new FileWriter("D:\\C0321G1_NguyenThiNhung_Module2\\src\\_16_IO_text_file\\bai_tap\\copyFile\\target.txt");
            BufferedWriter bw = new BufferedWriter(output);
            int i;
            while ((i = bf.read()) != -1) {
                System.out.print((char) i);
                bw.write(i);
            }
            bf.close();
            bw.close();
            System.out.println("\n File is copied successful!");
        }
        catch (FileNotFoundException e) {
            System.out.printf("không tìm thấy tệp này");;
        }
    }
}
