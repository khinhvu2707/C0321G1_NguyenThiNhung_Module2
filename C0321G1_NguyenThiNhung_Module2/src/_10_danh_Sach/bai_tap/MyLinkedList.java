package _10_danh_Sach.bai_tap;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;
    public Object data;

    public MyLinkedList() {

    }

    public MyLinkedList(Object data) {
        head = new Node(data);

    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object data) {

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        numNodes++;
    }

    public E remove(int index) {

        if (index < 0 || index >= numNodes) return null;
        Node temp = head;

        if (index == 0) {
            data = temp.data;
            head = head.next;
            numNodes--;
        } else {

            for (int i = 1; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }

            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }

        return (E) data;


    }

    public boolean remove(Object E) {
        if (head.data.equals(E)) {
            remove(0);
            numNodes--;
            return true;
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data.equals(E)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList<E> clone() {
        if (numNodes == 0) {
            throw new NullPointerException("LinkedList nay null");
        }
        MyLinkedList<E> returnLinkedList = new MyLinkedList<>();
        Node temp = head;
        returnLinkedList.addFirst((E) temp);
        temp = temp.next;
        while (temp != null) {
            returnLinkedList.addLast((E) temp.data);
            temp = temp.next;
        }
        return returnLinkedList;
    }

    public boolean constains(E o) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data.equals(o)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData().equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        if (head != null) {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(e);
            numNodes++;
            return true;
        }
        return false;
    }

    public void ensureCapacity(int minCapacity) {
        numNodes += minCapacity;
    }

    public E get(int index) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public E getFirst() {
        Node temp = head;
        return (E) temp.data;
    }

    public E getLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }


        return (E) temp.data;
    }

    public void clear() {
        data = (E[]) new Object[numNodes];
        numNodes = 0;
    }

    public void printList() {

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
