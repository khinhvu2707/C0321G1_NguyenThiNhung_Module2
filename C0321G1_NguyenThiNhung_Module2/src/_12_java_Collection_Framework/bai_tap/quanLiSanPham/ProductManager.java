package _12_java_Collection_Framework.bai_tap.quanLiSanPham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    public static void displayProduct(ArrayList<Product> list) {
        System.out.println("Danh sách sản phẩm:");
        PriceComparator3 result = new PriceComparator3();
        Collections.sort(list, result);
        for (Product pr : list) {
            System.out.println(pr);
        }
    }
    public static void searchProduct(ArrayList<Product> list) {
        System.out.println("Nhập tên sản phẩm muốn tìm : ");
        Scanner scanner1 = new Scanner(System.in);
        String searchName = scanner1.nextLine();
        System.out.println(searchName);
        boolean flag2 = true;
        for (Product pr : list) {
            if (pr.getName().equals(searchName)) {
                flag2 = true;
                System.out.println(pr.toString());
                break;
            } else {
                flag2 = false;
            }
        }
        if (!flag2) {
            System.out.println("Không có sản phẩm này!");
        }
    }
    public static void deleteProduct(ArrayList<Product> list, Scanner scanner) {
        int count4 = 0;
        do {
            System.out.println("Nhập id sản phẩm muốn xóa Hoặc nhấn 0 để quay về! ");
            int deleteId = scanner.nextInt();
            if (deleteId == 0) {
                count4++;
                continue;
            }
            boolean flag3 = true;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == deleteId) {
                    flag3 = true;
                    System.out.println("Bạn có chắc chắn muốn xóa sản phẩm này không? Nhấn 1 nếu đồng ý hoặc số khác nếu từ chối!");
                    int xacNhan = scanner.nextInt();
                    if (xacNhan == 1) {
                        list.remove(list.get(i));
                        for (Product pr : list) {
                            System.out.println(pr);
                        }
                        count4++;
                    }
                    break;
                } else {
                    flag3 = false;
                }
            }
            if (!flag3) {
                System.out.println("Không có id này!Mời nhập lại!");
            }
        } while (count4 < 1);
    }
    public static void editProduct(ArrayList<Product> list, Scanner scanner) {
        System.out.println("+++ nhập id sản phẩm muốn sửa +++");
        int editId = scanner.nextInt();
        System.out.println(" Bạn muốn sửa gì nè ?\n"
                + "1.Sửa id\n"
                + "2.Sửa tên\n"
                + "3.Sửa giá\n");
        int choose2 = scanner.nextInt();
        switch (choose2) {
            case 1:
                int count2 = 0;
                do {
                    System.out.println("Nhập id mới: ");
                    int newId2 = scanner.nextInt();
                    boolean flagg = false;
                    for (Product pr2 : list) {
                        if (pr2.getId() == newId2) {
                            flagg = true;
                            break;
                        }
                    }
                    if (!flagg) {
                        for (Product pr : list) {
                            if (pr.getId() == editId) {
                                pr.setId(newId2);
                                count2++;
                            }
                        }
                    } else System.out.println("Đã có id này!Mời nhập lại");
                } while (count2 < 1);

                break;
            case 2:
                int count3 = 0;
                do {
                    System.out.println("Nhập tên mới: ");
                    String newName2 = scanner.next();
                    boolean flagg2 = false;
                    for (Product pr2 : list) {
                        if (pr2.getName().equals(newName2)) {
                            flagg2 = true;
                            break;
                        } else {
                            flagg2 = false;
                        }
                    }
                    if (!flagg2) {
                        for (Product pr : list) {
                            if (pr.getId() == editId) {
                                pr.setName(newName2);
                                count3++;
                            }
                        }
                    } else System.out.println("Đã có tên sản phẩm này!Mời nhập lại!");
                } while (count3 < 1);
                break;
            case 3:
                System.out.println("Nhập giá mới: ");
                int newPrice2 = scanner.nextInt();
                for (Product pr : list) {
                    if (pr.getId() == editId) {
                        pr.setPrice(newPrice2);
                    }
                }
                break;
            default:
                System.out.println("Không có lựa chọn này!");
        }
        for (Product pr : list) {
            System.out.println(pr);
        }
    }
    public static void addProduct(ArrayList<Product> list, Scanner scanner) {
        int count1 = 0;
        do {
            System.out.println("+++ Nhập sản phẩm mới +++ ");
            System.out.println("Nhập id: ");
            int newID = scanner.nextInt();
            if (newID == 0) {
                count1++;
                System.out.println("Hãy nhập id >0");
                continue;
            }
            System.out.println("Nhập tên");
            String newName = scanner.next();
            System.out.println("Nhập giá");
            int newPrice = scanner.nextInt();
            boolean flag = false;
            if (newID >= 1) {
                for (Product pt1 : list) {
                    if ((pt1.getId() == newID) || pt1.getName().equals(newName)) {
                        flag = true;
                        break;
                    } else flag = false;
                }
                if (!flag) {
                    list.add(new Product(newID, newName, newPrice));
                    count1++;
                    for (Product pr : list) {
                        System.out.println(pr);
                    }
                    break;
                } else {
                    for (Product pt2 : list) {
                        if (pt2.getId() == newID) {
                            System.out.println("Đã có id này!Mời nhập lại! Hoặc nhấn 0 để quay về!");
                            break;
                        }
                        if (pt2.getName().equals(newName)) {
                            System.out.println("Đã có tên sản phẩm này!Mời nhập lại! Hoặc nhấn 0 để quay về");
                            break;
                        }
                    }
                }
            } else {
                System.out.println("Nhập id >0");
            }
        } while (count1 < 1);
    }
    public static void sort(ArrayList<Product> list, Scanner scanner) {
        System.out.println("Lựa chọn cách sắp xếp:\n"
                + "1.Tăng dần theo giá\n"
                + "2.Giảm dần theo giá");
        int choose3 = scanner.nextInt();
        if (choose3 == 1) {
            System.out.println("Danh sách sản phẩm tăng dần theo giá:");
            PriceComparator result1 = new PriceComparator();
            Collections.sort(list, result1);
            for (Product pr : list) {
                System.out.println(pr);
            }
            return;
        } else if (choose3 == 2) {
            System.out.println("Danh sách sản phẩm giảm dần theo giá:");
            PriceComparator2 result2 = new PriceComparator2();
            Collections.sort(list, result2);
            for (Product pr : list) {
                System.out.println(pr);
            }
            return;
        } else {
            System.out.println("Không có lựa chọn này!");
        }
    }
}
