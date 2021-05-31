package _04_lop_va_doi_tuong.bai_tap;

public class StopWatchCachCuaThay2 {
    public static void main(String[] args) {
        StopWatchCachCuaThay stopWatch = new StopWatchCachCuaThay();
        stopWatch.star();
        int arr[] = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        stopWatch.end();
        System.out.println("Time :" + stopWatch.getTime());
    }
}
