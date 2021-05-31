package _04_lop_va_doi_tuong.bai_tap;
import java.util.Scanner;
public class FanTest {
    public static void main(String[] args) {
        // khởi tạo với constructor mặc định
        Fan1 fan1 = new Fan1();
        System.out.println("Mặc định" +fan1);

        Fan1 fan2 =new Fan1(3,10,true,"red");
        System.out.println("Test 1:" +fan2);
        Fan1 fan3= new Fan1(0,5,false,"Blue");
        System.out.println("Test 2:" +fan3);
        Fan1 fan4 = new Fan1();
        Scanner test = new Scanner(System.in);
        System.out.println("Nhập tốc độ: ");
        fan4.setSpeed(test.nextInt());
        System.out.println("Nhập bán kính: ");
        fan4.setRadius(test.nextDouble());
        System.out.println("Nhập trạng thái (Bật = True , Tắt = False ) : ");
        fan4.setOn(test.nextBoolean());
        System.out.println("Nhập màu sắc: ");
        fan4.setColor(test.next());

        System.out.println("Test 3:" +fan4);
    }
}
