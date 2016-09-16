package lesson04.phones;

/**
 * Created by Prigovor on 16.09.2016.
 */
public class SimCard {

    public Integer balance;

    public SimCard() {
        balance = 0;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        if (balance > 0) {
            this.balance = balance;
        }
    }
}
