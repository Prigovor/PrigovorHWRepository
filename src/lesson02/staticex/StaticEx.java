package lesson02.staticex;

/**
 * Created by Prigovor on 02.09.2016.
 */
public class StaticEx {

    public  static Integer statInt = 100;
    public Integer nonStatInt = 200;

    public static void print() {
        System.out.println(statInt);
//        System.out.println(nonStatInt);
    }

    public void printAll() {
        System.out.println(statInt);
        System.out.println(nonStatInt);
    }
}
