package lesson04.geomeri;

/**
 * Created by Prigovor on 16.09.2016.
 */
public class Rectangle extends Figure {

    private Double sideA;
    private Double sideB;

    public Rectangle(Double sideA, Double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public Double area() {
        System.out.println(sideA * sideB);
        return sideA * sideB;
    }

    @Override
    public void about() {
        System.out.println("Я прямоугольник.");
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) return true;
        if (object instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) object;
//            if (rectangle.sideA == this.sideA )
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println();
        return "";
    }
}
