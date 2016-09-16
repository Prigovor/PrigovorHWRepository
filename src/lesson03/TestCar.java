package lesson03;

/**
 * Created by Prigovor on 14.09.2016.
 */
public class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car("ВАЗ");
        Car car3 = new Car("Ford", "Silver-metallic");

        car.printAbout();
        car2.printAbout();
        car3.printAbout();
    }
}
