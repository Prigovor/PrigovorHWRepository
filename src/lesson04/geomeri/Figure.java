package lesson04.geomeri;

/**
 * Created by Prigovor on 16.09.2016.
 */
public class Figure {



    public void about() {
        System.out.println("Я фигура.");
    }

    public Double area() {
        System.out.println("0");
        return 0.0;
    }

    @Override
    public String toString() {
        return "Я фигура.";
    }
}
