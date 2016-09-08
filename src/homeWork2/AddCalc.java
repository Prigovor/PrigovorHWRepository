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
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            calc.setNumber1(Integer.parseInt(reader.readLine()));

            System.out.println("Введите второе число: ");
            calc.setNumber2(Integer.parseInt(reader.readLine()));

            System.out.println("Выберите операцию(+, -, *, /): ");

            calc.calculate(calc.getNumber1(), calc.getNumber2(), reader.readLine());
        } catch (Exception e) {
            System.out.println("Ввдите пожалуйста ЧИСЛО");
        }
    }
}
