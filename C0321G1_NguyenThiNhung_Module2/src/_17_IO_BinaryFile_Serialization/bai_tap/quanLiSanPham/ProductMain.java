package _17_IO_BinaryFile_Serialization.bai_tap.quanLiSanPham;
import java.util.List;
import java.util.Scanner;
public class ProductMain {
    public static void main(String[] args) throws Exception {
        List<Product> test;
        int count = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập lựa chọn của bạn:\n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Hiển thị danh sách sản phẩm\n" +
                    "3. Tìm kiếm thông tin sản phẩm\n" +
                    "4. Thoát chương trình");
            int luaChon = scanner.nextInt();
            boolean check = true;
            do {
                switch (luaChon) {
                    case 1:
                        test = ProductManages.readFile();
                        ProductManages.addProduct(test);
                        check = false;
                        break;
                    case 2:
                        test = ProductManages.readFile();
                        ProductManages.displayProduct(test);
                        check = false;
                        break;
                    case 3:
                        test = ProductManages.readFile();
                        ProductManages.searchProduct(test);
                        check = false;
                        break;
                    case 4:
                        check = false;
                        count++;
                        break;
                    default:
                        check = true;
                        System.out.println("không có lựa chọn này");
                        break;
                }
            } while (check);
        } while (count < 1);
    }

}