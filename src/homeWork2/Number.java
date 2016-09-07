package homeWork2;

/**
 * Created by Prigovor on 05.09.2016.
 */
public class Number {

    private int number;

    public Number(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

//    public Number add(Number nam) {
//        nam.number += nam.number;
//        return nam;
//    }

    public Number add(Number num) {
        return new Number(num.number + num.number);
    }

    public Number sub(Number num) {
        return new Number(num.number - num.number);
    }

    public Number mul(Number num) {
        return new Number(num.number * num.number);
    }

    public Number div(Number num) {
        try {
            return new Number(num.number / num.number);
        }catch (ArithmeticException e){
            System.out.println("Ha " + num + " делить нельзя!");
            return num;
        }
    }

    public Number pow(Number exponent) {
        double num = (double) exponent.number;
        exponent.number = (int) Math.pow(num, num);
        return exponent;
    }

    public Number fact(Number num) {
        if (num.number < 0) {
            System.out.println("num.number должен быть больше или равен 0");
        }
        int factAge = 1;
        for (int i = 2; i <= num.number; i++) {
            factAge = factAge * i;
        }
        num.number = factAge;
        return num;
    }

    public Number mod(Number num) {
        try {
            return new Number(num.number % num.number);
        } catch (ArithmeticException e) {
            System.out.println("На " + num + " делить нельзя");
        }
        return num;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}
