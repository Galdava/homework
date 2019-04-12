package by.belhard.j2.lesson4;

import by.belhard.j2.lesson4.in.Country;
import by.belhard.j2.lesson4.in.Person;
import by.belhard.j2.lesson4.in.Sex;
import by.belhard.j2.lesson4.in.Worker;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Pablo", 23, Sex.MALE);
        Person person2 = new Person("Anna", 20, Sex.FEMALE);

        person1.setCountry(new Country("Brazil", 123456));
        person2.setCountry(person1.getCountry());
        System.out.println(person1);
        System.out.println(person2);
        Worker worker1 =new Worker("Mustafa",45,Sex.MALE);
        System.out.println(worker1);
        worker1.toWork();

    }
}
