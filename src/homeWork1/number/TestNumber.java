package homeWork1.number;

/**
 * Created by Prigovor on 05.09.2016.
 */
public class TestNumber {
    public static void main(String[] args) {
        Number number = new Number(6);

        number = number.add(number);
        System.out.println("Сложение: " + number);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

        number = number.sub(number);
        System.out.println("Вычитание: " + number);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

        number.setNumber(8);
        number = number.mul(number);
        System.out.println("Умножение: " + number);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

        number.setNumber(0);
        number = number.div(number);
        System.out.println("Деление: " + number);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

        number.setNumber(2);
        number = number.pow(number);
        System.out.println("Возведение в степень: " + number);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

        number.setNumber(3);
        number = number.fact(number);
        System.out.println("Факториал: " + number);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

        number.setNumber(0);
        number = number.mod(number);
        System.out.println("Остаток от деления: " + number);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
