package _17_IO_BinaryFile_Serialization.bai_tap.optional;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CopyFileExample {

    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream("D:\\C0321G1_NguyenThiNhung_Module2\\src\\_17_IO_BinaryFile_Serialization\\bai_tap\\optional\\source.txt");
            outputStream = new FileOutputStream("D:\\C0321G1_NguyenThiNhung_Module2\\src\\_17_IO_BinaryFile_Serialization\\bai_tap\\optional\\target.txt");
            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.print((char) i);
                outputStream.write(i);
            }
            System.out.println("\n File is copied successful!");
        }
        catch (FileNotFoundException e) {
            System.out.printf("không tìm thấy tệp này!");;
        }
        finally {
            if(inputStream != null & outputStream !=null){
                inputStream.close();
                outputStream.close();}
        }
    }
}
