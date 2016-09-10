package homeWork1.consoleCalc;

/**
 * Created by Prigovor on 07.09.2016.
 */
public class ConsoleCalc {
    private Integer number1;
    private Integer number2;
    private Integer result;

    public Integer getNumber1() {
        return number1;
    }

    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }

    public Integer getNumber2() {
        return number2;
    }

    public void setNumber2(Integer number2) {
        this.number2 = number2;
    }

    public void add(Integer number1, Integer number2) {
        result = number1 + number2;
    }

    public void sub(Integer number1, Integer number2) {
        result = number1 - number2;
    }

    public void mul(Integer number1, Integer number2) {
        result = number1 * number2;
    }

    public void div(Integer number1, Integer number2) {
        try {
            result = number1 / number2;
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        }
    }

    public void calculate(Integer number1, Integer number2, String operation) {
        switch (operation) {
            case "+":
                add(number1, number2);
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case "-":
                sub(number1, number2);
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case "*":
                mul(number1, number2);
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case "/":
                div(number1, number2);
                if (result != null) {
                    System.out.println(number1 + " / " + number2 + " = " + result);
                }
                break;
            default:
                System.out.println("Введите операцию из списка(+, -, *, /)");

        }
    }
}
