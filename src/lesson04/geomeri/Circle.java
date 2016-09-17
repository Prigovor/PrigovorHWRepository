package lesson04.geomeri;

/**
 * Created by Prigovor on 16.09.2016.
 */
public class Circle extends Figure {

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        System.out.println(Math.PI * radius * radius);
        return Math.PI * radius * radius;
    }

    @Override
    public void about() {
        System.out.println("Я круг.");
    }
}
