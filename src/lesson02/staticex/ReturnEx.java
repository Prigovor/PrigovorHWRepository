package lesson02.staticex;

/**
 * Created by Prigovor on 02.09.2016.
 */
public class ReturnEx {

    public int a = 200;

    public void procedure() {
        System.out.println("Пример");

        for (int i = 1; i < 6; i++) {
            if (i == 4) {return;}
            if (i == 2) {continue;}
            if (i == 3) {break;}
            System.out.println(a * i);
        }
        System.out.println("Конец метода");
    }
}
