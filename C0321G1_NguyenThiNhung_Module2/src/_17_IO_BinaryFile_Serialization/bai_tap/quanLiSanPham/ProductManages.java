package _17_IO_BinaryFile_Serialization.bai_tap.quanLiSanPham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManages {
    static void addProduct(List<Product> test) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id:");
        int newID = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên:");
        String newName = scanner.nextLine();
        System.out.println("Nhập hãng:");
        String newManufacturer = scanner.nextLine();
        System.out.println("Nhập giá:");
        String newPrice = scanner.nextLine();
        System.out.println("Nhập mô tả:");
        String newNote = scanner.nextLine();
        test.add(new Product(newID, newName, newManufacturer, newPrice, newNote));
        try {
            FileOutputStream fout = new FileOutputStream("D:\\C0321G1_NguyenThiNhung_Module2\\C0321G1_NguyenThiNhung_Module2\\src\\_17_IO_BinaryFile_Serialization\\bai_tap\\quan_li_san_pham\\Pro.csv", false);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(test);
            System.out.println("CSV file was created successfully !");
            fout.close();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void displayProduct(List<Product> test) {
        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i).toString());
        }
    }
    static void searchProduct(List<Product> test) {
        System.out.println("Nhập tên sản phẩm muốn tìm");
        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();
        boolean check = true;
        for (int i = 0; i < test.size(); i++) {
            if (searchName.equals(test.get(i).getName())) {
                System.out.println(test.get(i).toString());
                check = false;
                break;
            } else {
                check = true;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy sản phẩm này!");
        }
    }
    public static List<Product> readFile(){
        String path = "D:\\C0321G1_NguyenThiNhung_Module2\\C0321G1_NguyenThiNhung_Module2\\src\\_17_IO_BinaryFile_Serialization\\bai_tap\\quan_li_san_pham\\Pro.csv";
        List<Product> result = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            result = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch (FileNotFoundException e){
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
