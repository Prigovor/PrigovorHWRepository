package lesson04.geomeri;

/**
 * Created by Prigovor on 16.09.2016.
 */
public class Square extends Rectangle {

    public Square(Double sideA) {
        super(sideA, sideA);
    }

    @Override
    public void about() {
        System.out.println("Я квадрат");
    }
}
