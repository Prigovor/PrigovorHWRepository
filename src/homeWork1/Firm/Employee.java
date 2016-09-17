package homeWork1.Firm;

import java.time.LocalDate;

/**
 * Created by Prigovor on 10.09.2016.
 */
public class Employee {
    private String nameEmployee;
    private String surname;
    private Integer rate; //ставка зарплаты.
    private Integer cardAccount = 0;//зарплатный счет
    private LocalDate joining;
    private String sex;
    private String department;

    public Employee(String nameEmployee, String surname, Integer rate, int day, int month, int year, String sex, String department) {
        this.nameEmployee = nameEmployee;
        this.surname = surname;
        this.rate = rate;
        joining = LocalDate.of(year, month, day);
        this.sex = sex;
        this.department = department;
    }

    public Integer getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Имя:              " + nameEmployee + "\n" +
                "Фамилия:          " + surname + "\n" +
                "Ставка:           " + rate + "$.\n" +
                "Счет:             " + cardAccount + "$.\n" +
                "Год трудо-ства:   " + joining.getYear() + "\n" +
                "Месяц трудо-ства: " + joining.getMonth() + "\n" +
                "Пол:              " + sex + "\n" +
                "Отдел:            " + department;
    }

    public Integer getCardAccount() {
        return cardAccount;
    }

    public void setCardAccount(Integer cardAccount) {
        this.cardAccount = cardAccount;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public LocalDate getJoining() {
        return joining;
    }
}