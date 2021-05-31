package _11_DSA_Stack_Queue.bai_tap.daoNguocPhanTu;

public class ReverseStack {
    private int size;
    private char[] result;
    private int index = 0;

    public ReverseStack(int size){
     this.size=size;
        result = new char[size];
    }

    public void push(char x){
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        result[index] = x;
        index++;
    }
    public char pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        char x= result[--index];
        return x;
    }
    public int size() {
        return index;
    }
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }
    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

}
