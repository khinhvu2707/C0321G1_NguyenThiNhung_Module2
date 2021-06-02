package manager.cinema;

import commons.WriteAndReadCustomer;
import commons.WriteAndReadMovie;
import commons.WriteAndReadTickket;
import models.Customer;
import models.Movie;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class BuyTickket {
    public static void buyTicket() throws IOException {
        String movie1 = "";
        List<Customer> result;
        result = WriteAndReadCustomer.readCustomer();
        int index = 1;
        int index2 = 1;
        System.out.println("---- List Customer ---");
        for (Customer customer : result) {
            System.out.println(index++ + " . " + customer.showInfor());
        }
        System.out.println("+++++++");
        System.out.println("Vui lòng nhập số thứ tự của bạn tương ứng với bảng trên");
        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.nextLine());
        if (id > result.size() || id < 1) {
            System.out.println("Không có số thứ tự này!");
        } else {
            System.out.println("Thông tin của bạn là: ");
            System.out.println("*** " + result.get(id - 1).showInfor() + " ***");
            movie1 += "_" + result.get(id - 1).getName() + "_";
            System.out.println("---- List Movie ---");
            List<Movie> resultMovie;
            resultMovie = WriteAndReadMovie.readMovie();
            for (Movie movie : resultMovie) {
                System.out.println(index2++ + " . " + movie.toString());
            }
            System.out.println("Nhập số thứ tự phim bạn muốn mua vé tương ứng với bảng trên :");
            int idMovie = Integer.parseInt(scanner.nextLine());
            if (idMovie > 5 || idMovie < 1) {
                System.out.println("Không có phim này!");
            } else {
                System.out.println("Bạn muốn mua 1 vé phim " + resultMovie.get(idMovie - 1).getName() + " hay không? Nhấn phím 1 nếu đồng ý!");
                int choose = Integer.parseInt(scanner.nextLine());
                if (choose == 1) {
                    int count = 1;
                    String tickket = WriteAndReadTickket.readTickket();
                    String[] strings = tickket.split("_");
                    for (int i = 0; i < strings.length; i++) {
                        if (strings[i].equals(resultMovie.get(idMovie - 1).getName())) {
                            count++;
                        } else {
                        }
                    }
                    System.out.println(count);
//
                    if (count <= Integer.parseInt(resultMovie.get(idMovie - 1).getTickket())) {
                        movie1 += resultMovie.get(idMovie - 1).getName();
                        WriteAndReadTickket.writeTickket(movie1);
                        System.out.println("Chúc mừng bạn đã mua vé thành công!Nhấn phím 3 để xem số ghế của bạn!Cảm ơn!");
                    } else {
                        System.out.println("Vé đã bán hết!Chúc bạn may mắn lần sau!");
                    }
                } else {
                    System.out.println("Tạm biệt!");
                }
            }
        }
    }
}
