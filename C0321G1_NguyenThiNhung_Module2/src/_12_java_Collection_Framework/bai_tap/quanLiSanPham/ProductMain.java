package _12_java_Collection_Framework.bai_tap.quanLiSanPham;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductMain extends ProductManager{
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product(1, "Hoa Lan", 75));
        list.add(new Product(2, "Ly", 60));
        list.add(new Product(3, "Mai", 80));
        list.add(new Product(4, "Sen", 20));
        list.add(new Product(5, "Đào", 90));
        int count = 0;
        do {
            System.out.println("------- Quản lí sản phẩm ------- \n"
                    + "1.Thêm sản phẩm \n"
                    + "2.Sửa thông tin sản phẩm theo id \n"
                    + "3.Xoá sản phẩm theo id \n"
                    + "4.Hiển thị danh sách sản phẩm \n"
                    + "5.Tìm kiếm sản phẩm theo tên \n"
                    + "6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá \n"
                    + "7.Thoát chương trình \n");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập lựa chọn: ");
            int choose1 = scanner.nextInt();
            switch (choose1) {
                case 1:
                    addProduct(list, scanner);
                    break;
                case 2:
                    editProduct(list, scanner);
                    break;
                case 3:
                    deleteProduct(list, scanner);
                    break;
                case 4:
                    displayProduct(list);
                    break;
                case 5:
                    searchProduct(list);
                    break;
                case 6:
                    sort(list, scanner);
                    break;
                case 7:
                    count++;
                    break;
                default:
                    System.out.println("Không có lựa chọn này!");
            }
        } while (count < 1);
    }
}
