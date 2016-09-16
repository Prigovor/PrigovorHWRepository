package lesson03;

/**
 * Created by Prigovor on 14.09.2016.
 */
public class Car {
    public String model;
    public String color;
    public Integer year;

    public Car(String model, String color, Integer year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public Car(String model, String color) {
        this(model, color, 2002);
    }

    public Car(String model) {
        this(model,"Черный");
    }

    public Car() {
        model = "Hundai";
        color = "Черный";
        year = 1998;
    }

    public void printAbout() {
        System.out.println(
                "Модель: " + model + "\n" +
                        "Цвет:   " + color + "\n" +
                        "Год:    " + year + "\n"
        );
    }
}
