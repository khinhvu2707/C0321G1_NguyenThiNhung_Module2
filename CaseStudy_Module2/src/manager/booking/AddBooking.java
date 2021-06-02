package manager.booking;

import commons.*;
import manager.service.house.ShowHouse;
import manager.service.room.ShowRoom;
import manager.service.villa.ShowVilla;
import models.Customer;
import models.House;
import models.Room;
import models.Villa;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class AddBooking {
        public static void addNewBooking() throws IOException {
        String booking="";
        List<Customer> result;
        result = WriteAndReadCustomer.readCustomer();
        int index = 1;
            System.out.println("---- List Customer ---");
        for (Customer customer : result) {
            System.out.println(index++ + " . " + customer.showInfor());
        }
            System.out.println("+++++++");
        System.out.println("Vui lòng nhập số thứ tự của bạn tương ứng với bảng trên");
        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Dịch vụ của bạn là: ");
        System.out.println("*** " +result.get(id - 1).getService() +" ***");
        String service = result.get(id - 1).getService();
        booking += "Customer "+result.get(id - 1).getName() + " : Service " +result.get(id - 1).getService();
        System.out.println("Vui lòng chọn add new booking tương ứng với dịch vụ của bạn: ");

        int count = 0;
        while (count < 1) {
            System.out.println(" Please enter your choice : \n" +
                    "1.\tBooking Villa\n" +
                    "2.\tBooking House\n" +
                    "3.\tBooking Room\n" +
                    "4.\tExit\n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    if (service.equals("Villa")) {
                        ShowVilla.showVilla();
                        System.out.println("Nhập id dịch vụ bạn muốn chọn: ");
                        String svId = scanner.nextLine();
                        List<Villa> resultVilla;
                        resultVilla = WriteAndReadVilla.readVilla();
                        boolean check = true;
                        for (int i = 0; i < resultVilla.size(); i++) {
                            if (svId.equals(resultVilla.get(i).getId())) {
                                check = false;
                                System.out.println("Dịch vụ bạn chọn là: ");
                                System.out.println(resultVilla.get(i).showInfor());
                                booking += " ( id : " +resultVilla.get(i).getId() +" )";
                                System.out.println("Success!");
                                count++;
                                break;
                            }else {
                                check = true;
                            }
                        }
                        if (check) {
                            System.out.println("Không có id này!");
                        }
                    } else {
                        System.out.println("Hãy nhập đúng dịch vụ tương ứng");
                    }
                    break;
                case 2:
                    if (service.equals("House")) {
                        ShowHouse.showHouse();
                        System.out.println("Nhập id dịch vụ bạn muốn chọn: ");
                        String svId = scanner.nextLine();
                        List<House> resultHouse;
                        resultHouse = WriteAndReadHouse.readHouse();
                        boolean check = true;
                        for (int i = 0; i < resultHouse.size(); i++) {
                            if (svId.equals(resultHouse.get(i).getId())) {
                                check = false;
                                System.out.println("Dịch vụ bạn chọn là: ");
                                System.out.println(resultHouse.get(i).showInfor());
                                booking += " ( id : " +resultHouse.get(i).getId() +" )";
                                System.out.println("Success!");
                                count++;
                                break;
                            }else {
                                check = true;
                            }
                        }
                        if (check) {
                            System.out.println("Không có id này!");
                        }
                    }else {
                        System.out.println("Hãy nhập đúng dịch vụ tương ứng");
                    }
                    break;
                case 3:
                    if (service.equals("Room")) {
                        ShowRoom.showRoom();
                        System.out.println("Nhập id dịch vụ bạn muốn chọn: ");
                        String svId = scanner.nextLine();
                        List<Room> resultRoom;
                        resultRoom = WriteAndReadRoom.readRoom();
                        boolean check = true;
                        for (int i = 0; i < resultRoom.size(); i++) {
                            if (svId.equals(resultRoom.get(i).getId())) {
                                check = false;
                                System.out.println("Dịch vụ bạn chọn là: ");
                                System.out.println(resultRoom.get(i).showInfor());
                                booking += " ( id : " +resultRoom.get(i).getId() +" )";
                                System.out.println("Success!");
                                count++;
                                break;
                            }else {
                                check = true;
                            }
                        }
                        if (check) {
                            System.out.println("Không có id này!");
                        }
                    }else {
                        System.out.println("Hãy nhập đúng dịch vụ tương ứng");
                    }
                    break;
                case 4:
                    count++;
                    break;
                default:
                    System.out.println("There is no option");
                    break;
            }
        }
            WriteAndReadBooking.writeBooking(booking);
    }
}
