package lesson04.phones;

/**
 * Created by Prigovor on 16.09.2016.
 */
public class SmartPhone extends Phone {
    private String os;

    public SmartPhone() {
        this.os = "iDroid";
    }

    @Override
    public void about() {
//        super.about();
        System.out.println("OC : " + os);
    }
}
