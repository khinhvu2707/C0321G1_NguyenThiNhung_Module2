package _10_danh_Sach.bai_tap;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    public int DEFAULT_CAPACITY = 10;
    public E[] data;

    public MyList() {
        data = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        data = (E[]) new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = data.length * 2;
        data = Arrays.copyOf(data, newSize);
    }

    public boolean add(int index, E element) {
        if (index >= 0 && index <= size) {
            size += 1;
            ensureCapa();
            for (int i = size - 2; i >= index; i--) {
                data[i + 1] = data[i];
            }
            data[index] = element;
            return true;
        }
        return false;
    }

    public E remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                data[i] = data[i + 1];
            }
            size -= 1;
        }
        return (E) data;
    }

    public int size() {
        return size;
    }

    public E clone() {
        MyList<E> clone = new MyList<>(data.length);
        for (E x : data) {
            clone.add(x);
        }
        return (E) clone;
    }

    public boolean contains(E o) {
        for (E x : data) {
            if (o.equals(x)) {
                return true;
            }
        }
        return false;

    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public void add(E o) {
        size += 1;


        data[size - 1] = o;
    }

    public void ensureCapacity(int minCapacity) {
        DEFAULT_CAPACITY = data.length + minCapacity;
        data = Arrays.copyOf(data, DEFAULT_CAPACITY);

    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) data[i];
    }

    public void clear() {
        data = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

}