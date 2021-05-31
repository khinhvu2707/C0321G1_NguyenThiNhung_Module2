package _10_danh_Sach.bai_tap;

public class MyLinkedListTest {
    public static void main(String[] args) {

        MyLinkedList test = new MyLinkedList(20);
        System.out.println(" Test add : ");
        test.addFirst(11);
        test.add(4, 9);
        test.addFirst(12);
        test.add(5, 6);
        test.add(3, 27);
        test.addFirst(15);
        test.addLast(7);
        test.printList();
        System.out.println("Test remove: ");
        test.remove(4);
        test.remove(9);
        test.printList();
        System.out.println("Test clone:");
        test.clone();
        System.out.println("Test contains:");
        if (test.constains(15)) {
            System.out.println("Đúng lun á?");
        } else System.out.println("Khổ ghê á!");
        System.out.println("Test index of: ");
        if (test.indexOf(3) == -1) {
            System.out.println("hổng có phần tử này nghen!");
        } else System.out.println("Có phần tử trong list!");
        System.out.println("Test add : ");
        if (test.add(7)) {
            System.out.println("Hey!");
        }
        System.out.println("Test capacity : ");
        test.ensureCapacity(5);
        System.out.println(test.size());
        System.out.println("Test Get : ");
        System.out.println(test.get(4));

        System.out.println("First: " + test.getFirst());
        System.out.println("Last : " + test.getLast());
        System.out.println("Test clear: ");
        test.clear();
        System.out.println(test.size());
    }
}
