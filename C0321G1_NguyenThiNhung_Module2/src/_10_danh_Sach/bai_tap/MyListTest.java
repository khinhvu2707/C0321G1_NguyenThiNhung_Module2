package _10_danh_Sach.bai_tap;
public class MyListTest{
    public static void main(String[] args) {
        MyList<Integer> test = new MyList<>();
        System.out.println("Check add: ");
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        System.out.println(test.size());
        test.add(5);
        test.add(6);
        test.add(7);
        test.add(7, 8);
        test.add(9);
        System.out.println(test.size());
        System.out.println("element 4: " + test.get(4));

        for (int i = 0; i < test.size(); i++) {
            System.out.println("element" + i + " : " + test.get(i));
        }

        System.out.println("Check Capacity: ");
        test.ensureCapacity(3);
        System.out.println(test.DEFAULT_CAPACITY);

        System.out.println("Check clone: ");
        test.clone();
        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
        }

        System.out.println("Check remove: ");
        test.remove(5);
        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
        }

        System.out.println("Check contains: ");
        if (test.contains(15)) {
            System.out.println("Đúng lun á?");
        } else System.out.println("Khổ ghê á!");

        System.out.println("check index of: ");
        if (test.indexOf(3) == -1) {
            System.out.println("hổng có phần tử này nghen");
        } else System.out.println("Có phần tử trong list");

        System.out.println("Check clear: ");
        test.clear();
        System.out.println("clear:" + test.size());
    }
}
