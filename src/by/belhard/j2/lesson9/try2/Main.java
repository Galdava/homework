package by.belhard.j2.lesson9.try2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("opel", 3000));
        list.add(new Car("opel", 1500));
        list.add(new Car("opel", 2000));
        list.add(new Car("audi", 6000));
        list.add(new Car("audi", 1500));
        list.add(new Car("opel", 6000));

        Comparator<Car> comparatorCar = ((o1, o2) -> {
            int dDistance = o1.getDistance() - o2.getDistance();
            if (dDistance == 0)
                return o1.getName().compareTo(o2.getName());
            return dDistance;
        });
        list.forEach(System.out::println);
        List<Car> collect = list.stream().filter(a -> a.getDistance() < 5000).sorted(comparatorCar)
                .collect(Collectors.toList());
        System.out.println();
        collect.forEach(System.out::println);


    }
}
