package _05_AccessModifier_StaticMethod_StaticProperty.bai_tap;

public class CircleTest {
    public static void main(String[] args) {
        Circle md= new Circle();
        System.out.println("Bán kính: " +md.getRadius() + " Color: " +md.getColor() + " Diện tích: " + md.getArea());

        Circle test = new Circle(5,"blue");
        System.out.println("Bán kính: " +test.getRadius() + " Color: " +test.getColor() + " Diện tích: " + test.getArea());
    }

}
