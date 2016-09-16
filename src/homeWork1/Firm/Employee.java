package homeWork1.Firm;

import sun.util.locale.provider.DateFormatSymbolsProviderImpl;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Prigovor on 10.09.2016.
 */
public class Employee {
    private String nameEmployee;
    private String surname;
    private Integer rate; //ставка зарплаты.
    private Integer cardAccount = 0;//зарплатный счет
    private Calendar joining;
    private String sex;
    private String department;

    public Employee(String nameEmployee, String surname, Integer rate, int month, int year , String sex, String department) {
        this.nameEmployee = nameEmployee;
        this.surname = surname;
        this.rate = rate;
        joining = new GregorianCalendar();//правильно ли обьект создавать в конструкторе???
        joining.set(Calendar.MONTH, month);
        joining.set(Calendar.YEAR, year);
        this.sex = sex;
        this.department = department;
    }

    public Integer getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return  "Имя:              " + nameEmployee + "\n" +
                "Фамилия:          " + surname + "\n" +
                "Ставка:           " + rate + "$.\n" +
                "Счет:             " + cardAccount + "$.\n" +
                "Год трудо-ства:   " + joining.get(Calendar.YEAR) + "\n" +
                "Месяц трудо-ства: " + joining.get(Calendar.MONTH) + "\n" +
                "Пол:              " + sex + "\n" +
                "Отдел:            " + department;
    }
}