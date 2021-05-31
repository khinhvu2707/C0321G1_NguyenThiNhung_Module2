package _03_mang_va_phuong_thuc_trong_java.bai_tap;

public class TimMAxMang2Chieu {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,7,2},{8,3,4}};
        int max=arr[0][0];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (arr[i][j]>max){
                    max=arr[i][j];
                }
            }

        }System.out.println(max);

    }
}
