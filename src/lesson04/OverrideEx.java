package lesson04;

/**
 * Created by Prigovor on 16.09.2016.
 */
public class OverrideEx {

    public void foo() {
        System.out.println("Over");
    }
}

class Over1 extends OverrideEx {
    @Override
    public void foo() {
        System.out.println("Over1");
    }
}

class Over2 extends Over1 {
    @Override
    public void foo() {
        System.out.println("Over2");
    }
}
