package lesson04.geomeri;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prigovor on 16.09.2016.
 */
public class App {
    public static void main(String[] args) {
        Figure figure = new Figure();
        Rectangle rectangle = new Rectangle(2.0, 5.0);


        List<Figure> figureList = new ArrayList<>();

        System.out.println(figure.toString());
        figure.about();
    }
}
