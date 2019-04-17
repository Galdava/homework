package by.belhard.j2.lesson5.hw;

public class Main {
    public static void main(String[] args) {


        Car car1 = new Car("audi", 0, 0);

        car1.moveTo(6, 8);
        System.out.println(car1);
        car1.moveTo(-6,-8);
        System.out.println(car1);
    }

}
