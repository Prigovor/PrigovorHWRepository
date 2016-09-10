package lesson02;

/**
 * Created by Prigovor on 02.09.2016.
 */
public class Car {
//    Параметры
    public String model; //Параметр отвечающий за модель.
    public String color; // Параметр отвечающий за цвет.
    public Integer millage;
    public int tank;
    public boolean Status = false;
    public Integer mills;

    public void start() {
        if (!Status) {
            Status = true;
            System.out.println("Машина завелась");
        }
    }

    public void stop() {
        if (Status) {
            Status = false;
            System.out.println("Машина остановилась");
        }
    }

    public void drive(Integer mills){
        if (Status == true && tank > 0) {
            millage += mills;
            System.out.println(" Машина едет ");
        }else {
            System.out.println("Что то не так.");
        }
    }

    public void drive2(Integer mills, Integer goTank) {
        tank = goTank;

        while (tank > 0) {
            if (mills > 0)
            millage += 10;
            tank--;
            mills -= 10;
        }

        System.out.println("Бен");
        stop();
    }


}
