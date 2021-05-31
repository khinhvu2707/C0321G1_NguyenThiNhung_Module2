package _13_thuat_toan_tim_kiem.bai_tap;

public class BinarySearch {
    int binarySearch(int array[], int low, int high, int x) {
        int mid = (high + low) / 2;
        if (high >= low) {
            if (array[mid] == x) {
                return mid;
            } else if (array[mid] > x) {
                {
                    return binarySearch(array, low, mid - 1, x);
                }
            } else {
                {
                    return binarySearch(array, mid + 1, high, x);
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int array[] = {1, 3, 5, 7, 9, 27};
        int result = ob.binarySearch(array, 0, array.length - 1, 6);
        if (result == -1)
            System.out.println("Không tìm thấy");
        else
            System.out.println("Vị trí: " + result);
    }
}
