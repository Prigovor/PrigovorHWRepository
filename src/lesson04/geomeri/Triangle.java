package lesson04.geomeri;

/**
 * Created by Prigovor on 16.09.2016.
 */
public class Triangle extends Figure {

    private Double sideA;
    private Double sideB;
    private Double hypotenuse;

    public Triangle(Double sideA, Double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void about() {
        System.out.println("Я треугольник.");;
    }

//    @Override
//    public Double area() {
//        return ;
//    }

    public Double calcHypo() {
        System.out.println();
        return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }
}
