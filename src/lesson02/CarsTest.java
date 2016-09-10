package lesson02;

/**
 * Created by Prigovor on 02.09.2016.
 */
public class CarsTest {
    public static void main(String[] args) {
        Car car = new Car();

        car.color = "Зеленый";
        car.model = "ВАЗ";
        car.millage = 0;


        car.start();
        car.drive2(50, 50);
        System.out.println(car.millage);
        car.stop();
    }
}
