package by.belhard.j2.homework2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 53.8722515, 27.616536,20);


        System.out.println(car1);
        car1.toMove(55.75222,37.61556);
        System.out.println(car1);
    }

}
