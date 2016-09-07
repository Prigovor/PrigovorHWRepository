package homeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Prigovor on 07.09.2016.
 */
public class AddCalc {
    public static void main(String[] args) throws IOException {
        ConsoleCalc calc = new ConsoleCalc();

        System.out.println("Введите первое число: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        calc.setAge1(Integer.parseInt(reader.readLine()));

        System.out.println("Введите второе число: ");
        calc.setAge2(Integer.parseInt(reader.readLine()));

        System.out.println("Выберите операцию(+, -, *, /): ");

        switch (reader.readLine()) {
            case "+":
                calc.add(calc.getAge1(), calc.getAge2());
                System.out.println(calc.getAge1() + " + " + calc.getAge2() + " = " + calc.getResult());
                break;
            case "-":
                calc.sub(calc.getAge1(), calc.getAge2());
                System.out.println(calc.getAge1() + " - " + calc.getAge2() + " = " + calc.getResult());
                break;
            case "*":
                calc.mul(calc.getAge1(), calc.getAge2());
                System.out.println(calc.getAge1() + " * " + calc.getAge2() + " = " + calc.getResult());
                break;
            case "/":
                calc.div(calc.getAge1(), calc.getAge2());
                System.out.println(calc.getAge1() + " / " + calc.getAge2() + " = " + calc.getResult());
                break;
            default:
                System.out.println("Введите операцию из списка(+, -, *, /)");

        }
    }
}
