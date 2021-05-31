package _02_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: 5: top-right, 6: botton-left, 7: botton-right , 8:top-left)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    int chieuDai;
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Nhập chiều dài");
                    chieuDai = scanner.nextInt();
                    int chieuRong;
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Nhập chiều rộng");
                    chieuRong = scanner1.nextInt();
                    for (int i = 0; i < chieuRong; i++) {
                        for (int j = 0; j < chieuDai; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle (The corner is square at 4 different angles: 5: top-right, 6: botton-left, 7: botton-right , 8:top-left)");
                    int choose;
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Nhập lựa chọn");
                    choose = scanner2.nextInt();
                    switch (choose) {

                        case 5:
                            System.out.println("top-right");
                            int chieuCao1;
                            Scanner scanner3 = new Scanner(System.in);
                            System.out.println("Nhập chiều cao");
                            chieuCao1 = scanner3.nextInt();

                            for (int i = 0; i <= chieuCao1; i++) {
                                for (int j = chieuCao1; j > i; j--) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 6:
                            System.out.println("botton-left");
                            int chieuCao2;
                            Scanner scanner4 = new Scanner(System.in);
                            System.out.println("Nhập chiều cao");
                            chieuCao2 = scanner4.nextInt();

                            for (int i = 1; i <= chieuCao2; i++) {
                                for (int j = 0; j < chieuCao2; j++) {
                                    if (j <= chieuCao2 - i) {
                                        System.out.print(" ");
                                    } else {
                                        System.out.print("*");
                                    }
                                }
                                System.out.println();
                            }
                            break;
                        case 7:
                            System.out.println("botton-right");
                            int chieuCao3;
                            Scanner scanner5 = new Scanner(System.in);
                            System.out.println("Nhập chiều cao");
                            chieuCao3 = scanner5.nextInt();

                            for (int i = 1; i <= chieuCao3; i++) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 8:
                            System.out.println("top-left");
                            int chieuCao4;
                            Scanner scanner6 = new Scanner(System.in);
                            System.out.println("Nhập chiều cao");
                            chieuCao4 = scanner6.nextInt();

                            for (int i = 0; i <= chieuCao4; i++) {
                                for (int j = 0; j <= chieuCao4; j++) {
                                    if (i >= j) {
                                        System.out.print(" ");
                                    } else {
                                        System.out.print("*");
                                    }
                                }
                                System.out.println();
                            }
                            break;
                        default:
                            System.out.println("No choice!");

                    } break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    int chieuCao5;
                    Scanner scanner7 = new Scanner(System.in);
                    System.out.println("Nhập chiều cao");
                    chieuCao5 = scanner7.nextInt();

                    for (int i = 0; i <= chieuCao5 * 2 - 1; i++) {
                        for (int j = 0; j <= i; j++) {
                            if (j <= (chieuCao5 * 2 - i - 1)) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);

                default:
                    System.out.println("No choice!");
            }
        }
    }
}

