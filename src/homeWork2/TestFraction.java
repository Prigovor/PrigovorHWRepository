package homeWork2;

/**
 * Created by Prigovor on 07.09.2016.
 */
public class TestFraction {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(4.0, 8.0);

        fraction.add(fraction);
        System.out.println("Сложение: " + fraction.getResult());

        fraction.sub(fraction);
        System.out.println("Вычитание: " + fraction.getResult());

        fraction.mul(fraction);
        System.out.println("Умножение: " + fraction.getResult());

        fraction.div(fraction);
        System.out.println("Деление: " + fraction.getResult());
        System.out.println("Приведение к строке: " + fraction.toString());
        fraction.print();
    }
}
