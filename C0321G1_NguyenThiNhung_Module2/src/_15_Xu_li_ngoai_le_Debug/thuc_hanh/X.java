package _15_Xu_li_ngoai_le_Debug.thuc_hanh;

public class X {
    public static void main(String args[]){
        try {
            int x = 0;
            int y = 5 / x;
        }catch (ArithmeticException e) {
            System.out.println("Arithmetic");
        }catch (Exception ae) {
            System.out.println("Exception");
        }
        System.out.println("finished");}
}
