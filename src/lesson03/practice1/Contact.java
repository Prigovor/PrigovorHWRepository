package lesson03.practice1;

/**
 * Created by Prigovor on 14.09.2016.
 */
public class Contact {
    private String name;
    private String surName;
    private Integer numberPhone;

    public Contact(String name, String surName, Integer numberPhone) {
        this.name = name;
        this.surName = surName;
        this.numberPhone = numberPhone;
    }

    public void about() {
        System.out.println(
                        "Имя Фамилия:    " + name + " " + surName + "\n" +
                        "Номер телефона: +38 (050)" + numberPhone
        );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Integer getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(Integer numberPhone) {
        this.numberPhone = numberPhone;
    }
}
