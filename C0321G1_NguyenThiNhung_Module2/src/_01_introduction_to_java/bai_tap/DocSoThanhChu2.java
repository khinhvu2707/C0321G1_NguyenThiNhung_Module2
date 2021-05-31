package _01_introduction_to_java.bai_tap;
import java.util.Scanner;
public class DocSoThanhChu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số cần đọc: ");
        int so = scanner.nextInt();
        String chu;
        if (so >= 0) {
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
            } else {
                if (so <= 20) {
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
                } else {
                    if (so < 100) {
                        int ones = so / 10;
                        int twos = so % 10;
                        String chu2;
                        switch (twos) {
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
                    } else {
                        if (so < 1000) {
                            int threes = so / 100;
                            String chu3;
                            int two2 = so % 10;
                            int ones = (so / 10) % 10;
                            int ones2 = so % 10;
                            String chu4;
                            switch (threes) {
                                case 1:
                                    chu3 = "One hundred";
                                    break;
                                case 2:
                                    chu3 = "two hundred";
                                    break;
                                case 3:
                                    chu3 = "three hundred";
                                    break;
                                case 4:
                                    chu3 = "four hundred";
                                    break;
                                case 5:
                                    chu3 = "five hundred";
                                    break;
                                case 6:
                                    chu3 = "six hundred";
                                    break;
                                case 7:
                                    chu3 = "seven hundred";
                                    break;
                                case 8:
                                    chu3 = "eight hundred";
                                    break;
                                case 9:
                                    chu3 = "night hundred";
                                    break;
                                default:
                                    chu3 = "ngoài khả năng";
                                    break;
                            }
                            switch (two2) {
                                case 0:
                                    chu4 = "";
                                    break;
                                case 1:
                                    chu4 = "one";
                                    break;
                                case 2:
                                    chu4 = "two";
                                    break;
                                case 3:
                                    chu4 = "three";
                                    break;
                                case 4:
                                    chu4 = "four";
                                    break;
                                case 5:
                                    chu4 = "five";
                                    break;
                                case 6:
                                    chu4 = "six";
                                    break;
                                case 7:
                                    chu4 = "seven";
                                    break;
                                case 8:
                                    chu4 = "eight";
                                    break;
                                case 9:
                                    chu4 = "night";
                                    break;
                                default:
                                    chu4 = "ngoài khả năng";
                                    break;
                            }
                            switch (ones) {
                                case 0:
                                    chu = "";
                                    break;
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
                            if (!chu.equals("ngoài khả năng") && !chu4.equals("ngoài khả năng") && !chu3.equals("ngoài khả năng")) {
                                if (chu != "") {
                                    System.out.printf("%s and %s %s", chu3, chu, chu4);
                                } else {
                                    System.out.printf("%s %s %s", chu3, chu, chu4);
                                }
                            }
                            switch (ones) {
                                case 1:
                                    switch (ones2) {
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
                                    if (!chu.equals("ngoài khả năng") && !chu3.equals("ngoài khả năng")) {
                                        System.out.printf("%s and %s", chu3, chu);
                                    }
                                    break;
                            }
                        }
                    }
                }
            }
        }
    }
}

