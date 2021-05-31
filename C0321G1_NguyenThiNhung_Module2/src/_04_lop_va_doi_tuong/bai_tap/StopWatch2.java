package _04_lop_va_doi_tuong.bai_tap;
import java.time.LocalTime;
public class StopWatch2 {
    public static int[] selectionSort(int... a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int tempt = a[i];
                    a[i] = a[j];
                    a[j] = tempt;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        LocalTime start = LocalTime.now();
        selectionSort(arr);
        LocalTime end = LocalTime.now();
        StopWatch test = new StopWatch(start, end);
        System.out.println("StarTime: " + test.getStarTime() );
        System.out.println("EndTime: " +test.getEndTime());
        System.out.println("Time: " + test.getElapsedTime());

    }

}
