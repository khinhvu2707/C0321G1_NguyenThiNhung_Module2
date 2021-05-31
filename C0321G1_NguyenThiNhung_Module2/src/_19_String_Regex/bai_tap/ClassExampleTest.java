package _19_String_Regex.bai_tap;


public class ClassExampleTest {
    private static ClassExample classExample;
    public static final String[] str = new String[] { "C0321G","H98",  "A0522H", "B9999L" ,"B8765A", "B@876L"};

    public static void main(String args[]) {
        classExample = new ClassExample();
        for (String test : str) {
            boolean isvalid = classExample.validate(test);
            System.out.println("Class is " + test +" is valid: "+ isvalid);
        }
    }
}
