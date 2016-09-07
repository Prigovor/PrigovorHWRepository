package homeWork1;

/**
 * Created by Prigovor on 07.09.2016.
 */
public class Fraction {
    private Double fractionAge1;
    private Double fractionAge2;
    private Double result;

    public Fraction(Double fractionAge1, Double fractionAge2) {
        this.fractionAge1 = fractionAge1;
        this.fractionAge2 = fractionAge2;
    }

//    public void setResult(Fraction frac) {
//        this.result = frac.result;
//    }

    public Double getResult() {
        return this.result;
    }

    public Fraction add(Fraction frac) {
        frac.result = frac.fractionAge1 + frac.fractionAge2;
        return  frac;
    }

    public Fraction sub(Fraction frac) {
        frac.result = frac.fractionAge1 - frac.fractionAge2;
        return  frac;
    }

    public Fraction mul(Fraction frac) {
        frac.result = frac.fractionAge1 * frac.fractionAge2;
        return  frac;
    }

    public Fraction div(Fraction frac) {
        frac.result = frac.fractionAge1 / frac.fractionAge2;
        return  frac;
    }

    public String toString() {
        return String.valueOf(result);
    }

    public void print() {
        System.out.println("Вывод результата: " + result);
    }



}
