package _01_introduction_to_java.bai_tap;
import java.util.Scanner;
public class DocSoThanhChuCach2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số cần đọc: ");
        int so = scanner.nextInt();
        String chu;

        if (so < 10) {
            switch (so) {
                case 0:
                    chu = "zero";
                    break;
                case 1:
                    chu = "one";
                    break;
                case 2:
                    chu = "two";
                    break;
                case 3:
                    chu = "three";
                    break;
                case 4:
                    chu = "four";
                    break;
                case 5:
                    chu = "five";
                    break;
                case 6:
                    chu = "six";
                    break;
                case 7:
                    chu = "seven";
                    break;
                case 8:
                    chu = "eight";
                    break;
                case 9:
                    chu = "night";
                    break;
                default:
                    chu = "ngoài khả năng";
                    break;
            }
            if (!chu.equals("ngoài khả năng")) {
                System.out.printf("%s", chu);
            }
        } else if (so <= 20) {
            int ones = so % 10;
            switch (ones) {

                case 1:
                    chu = "eleven";
                    break;
                case 2:
                    chu = "Twelve";
                    break;
                case 3:
                    chu = "Thirteen";
                    break;
                case 4:
                    chu = "Fourteen";
                    break;
                case 5:
                    chu = "Fifteen ";
                    break;
                case 6:
                    chu = "Sixteen";
                    break;
                case 7:
                    chu = "Seventeen";
                    break;
                case 8:
                    chu = "Eighteen";
                    break;
                case 9:
                    chu = "Nineteen";
                    break;
                case 10:
                    chu = "Twenty";
                    break;
                default:
                    chu = "ngoài khả năng";
                    break;
            }
            if (!chu.equals("ngoài khả năng")) {
                System.out.printf("%s", chu);
            }
        } else if (so < 100) {
            int ones = so / 10;
            int twos = so % 10;
            String chu2;
            switch (twos) {
                case 0:
                    chu2 = " ";
                    break;
                case 1:
                    chu2 = "one";
                    break;
                case 2:
                    chu2 = "two";
                    break;
                case 3:
                    chu2 = "three";
                    break;
                case 4:
                    chu2 = "four";
                    break;
                case 5:
                    chu2 = "five";
                    break;
                case 6:
                    chu2 = "six";
                    break;
                case 7:
                    chu2 = "seven";
                    break;
                case 8:
                    chu2 = "eight";
                    break;
                case 9:
                    chu2 = "night";
                    break;
                default:
                    chu2 = "ngoài khả năng";
                    break;
            }
            switch (ones) {

                case 2:
                    chu = "Twenty";
                    break;
                case 3:
                    chu = "Thirty ";
                    break;
                case 4:
                    chu = "Fourty";
                    break;
                case 5:
                    chu = "Fifty ";
                    break;
                case 6:
                    chu = "Sixty";
                    break;
                case 7:
                    chu = "Seventy";
                    break;
                case 8:
                    chu = "Eighty";
                    break;
                case 9:
                    chu = "Ninety";
                    break;
                default:
                    chu = "ngoài khả năng";
                    break;

            }
            if (!chu.equals("ngoài khả năng") && !chu2.equals("ngoài khả năng")) {
                System.out.printf("%s %s", chu, chu2);
            }
        } else if (so < 1000) {
            int threes = so / 100;
            String tram = "";
            String chuc = "";
            String dv = "";
            int two2 = (so % 100) / 10;
            int ones = (so % 100) % 10;


            switch (threes) {
                case 1:
                    tram = "One hundred";
                    break;
                case 2:
                    tram = "two hundred";
                    break;
                case 3:
                    tram = "three hundred";
                    break;
                case 4:
                    tram = "four hundred";
                    break;
                case 5:
                    tram = "five hundred";
                    break;
                case 6:
                    tram = "six hundred";
                    break;
                case 7:
                    tram = "seven hundred";
                    break;
                case 8:
                    tram = "eight hundred";
                    break;
                case 9:
                    tram = "night hundred";
                    break;
                default:
                    tram = "ngoài khả năng";
                    break;

            }
            if (two2 == 0) {
                chuc = "";
                switch (ones) {
                    case 0:
                        dv = " ";
                        break;
                    case 1:
                        dv = "one";
                        break;
                    case 2:
                        dv = "two";
                        break;
                    case 3:
                        dv = "three";
                        break;
                    case 4:
                        dv = "four";
                        break;
                    case 5:
                        dv = "five";
                        break;
                    case 6:
                        dv = "six";
                        break;
                    case 7:
                        dv = "seven";
                        break;
                    case 8:
                        dv = "eight";
                        break;
                    case 9:
                        dv = "night";
                        break;
                    default:
                        dv = "ngoài khả năng";
                        break;
                }
            } else if (two2 == 1) {
                chuc = " ";
                switch (ones) {
                    case 0:
                        dv = "ten";
                    case 1:
                        dv = "eleven";
                        break;
                    case 2:
                        dv = "Twelve";
                        break;
                    case 3:
                        dv = "Thirteen";
                        break;
                    case 4:
                        dv = "Fourteen";
                        break;
                    case 5:
                        dv = "Fifteen ";
                        break;
                    case 6:
                        dv = "Sixteen";
                        break;
                    case 7:
                        dv = "Seventeen";
                        break;
                    case 8:
                        dv = "Eighteen";
                        break;
                    case 9:
                        dv = "Nineteen";
                        break;
                    case 10:
                        dv = "Twenty";
                        break;
                    default:
                        dv = "ngoài khả năng";
                        break;
                }
            } else {
                switch (two2) {
                    case 2:
                        chuc = "Twenty";
                        break;
                    case 3:
                        chuc = "Thirty ";
                        break;
                    case 4:
                        chuc = "Fourty";
                        break;
                    case 5:
                        chuc = "Fifty ";
                        break;
                    case 6:
                        chuc = "Sixty";
                        break;
                    case 7:
                        chuc = "Seventy";
                        break;
                    case 8:
                        chuc = "Eighty";
                        break;
                    case 9:
                        chuc = "Ninety";
                        break;
                    default:
                        chuc = "ngoài khả năng";
                        break;
                }
                switch (ones) {
                    case 0:
                        dv = " ";
                        break;
                    case 1:
                        dv = "one";
                        break;
                    case 2:
                        dv = "two";
                        break;
                    case 3:
                        dv = "three";
                        break;
                    case 4:
                        dv = "four";
                        break;
                    case 5:
                        dv = "five";
                        break;
                    case 6:
                        dv = "six";
                        break;
                    case 7:
                        dv = "seven";
                        break;
                    case 8:
                        dv = "eight";
                        break;
                    case 9:
                        dv = "night";
                        break;
                    default:
                        dv = "ngoài khả năng";
                        break;
                }
            }
            if (chuc != "") {
                System.out.printf("%s and %s %s", tram, chuc, dv);
            } else { System.out.printf("%s %s %s", tram, chuc, dv);
            }

        }
    }
}
