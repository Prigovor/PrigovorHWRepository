package homeWork2;

/**
 * Created by Prigovor on 07.09.2016.
 */
public class ConsoleCalc {
    private Integer age1;
    private Integer age2;
    private Integer result;

    public Integer getAge1() {
        return age1;
    }

    public void setAge1(Integer age1) {
        this.age1 = age1;
    }

    public Integer getAge2() {
        return age2;
    }

    public void setAge2(Integer age2) {
        this.age2 = age2;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public void add(Integer age1, Integer age2) {
         result = age1 + age2;
    }

    public void sub(Integer age1, Integer age2) {
        result = age1 - age2;
    }

    public void mul(Integer age1, Integer age2) {
        result = age1 * age2;
    }

    public void div(Integer age1, Integer age2) {
        try {
            result = age1 / age2;
        }catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        }
    }
}
