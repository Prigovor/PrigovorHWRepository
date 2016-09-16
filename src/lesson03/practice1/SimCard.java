package lesson03.practice1;

/**
 * Created by Prigovor on 14.09.2016.
 */
public class SimCard {

    private String operator;
    private  Integer balance;
    private Integer costMin;
    private Integer numberPhone;

    public SimCard(String operator, Integer numberPhone) {
        this.operator = operator;
        this.numberPhone = numberPhone;
        balance = 0;
        costMin = 1;
    }

    public void about() {
        System.out.println(
                "Оператор:       " + operator + "\n" +
                "Номер телефона: +38 (050) " + numberPhone
        );
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getBalance() {
        return balance;
    }

    public Integer getCostMin() {
        return costMin;
    }
}
