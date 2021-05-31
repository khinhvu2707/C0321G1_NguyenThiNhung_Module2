package _05_AccessModifier_StaticMethod_StaticProperty.thuc_hanh;

public class StaticPropertyTest {
    public static void main(String[] args) {

        StaticProperty car1 = new StaticProperty("Mazda 3","Skyactiv 3");

        System.out.println(StaticProperty.numberOfCars);

        StaticProperty car2 = new StaticProperty("Mazda 6","Skyactiv 6");

        System.out.println(StaticProperty.numberOfCars);

    }
}
