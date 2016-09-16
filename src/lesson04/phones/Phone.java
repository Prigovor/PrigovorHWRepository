package lesson04.phones;

/**
 * Created by Prigovor on 16.09.2016.
 */
public class Phone {
    private String model;
    private SimCard sim;

    public Phone() {
        model = "NoName";
        sim = null;
    }

    public void about() {
        System.out.println("Модель: " + model);
    }
}
