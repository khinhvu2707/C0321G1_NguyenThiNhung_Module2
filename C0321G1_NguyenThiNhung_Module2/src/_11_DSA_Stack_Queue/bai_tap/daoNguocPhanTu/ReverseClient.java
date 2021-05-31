package _11_DSA_Stack_Queue.bai_tap.daoNguocPhanTu;

public class ReverseClient {
    public static String reverse(String str) throws Exception {
        int n= str.length();
        ReverseStack test = new ReverseStack(n);
        String str2="";
        for (int i = 0; i < str.length(); i++) {
            test.push(str.charAt(i));
        }
        while (!test.isEmpty()){
            char x = test.pop();
            str2+=x;
        }
        return str2;
    }
    public static void main(String[] args) throws Exception {
        String str1= "Nhung";
       reverse(str1);
        System.out.println(str1);
        System.out.println("Reverse : " +reverse(str1));
    }
    }


