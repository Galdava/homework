package by.belhard.j2.lesson5;

public class Main {
    public static void main(String[] args) {
        /*Worker worker = new Worker();
        worker.exampleMethod();
        Person person1 = new Person();
        person1.doWork();
        worker.doWork();*/
        Person person2 = new FactoryWorker();
        person2.doWork();
        Person person1 = new Teacher();
        System.out.println(person1.getA());
        person1.doWork();

        System.out.println(person1 instanceof  Person);
        System.out.println(person2 instanceof  Teacher);
        System.out.println(new FactoryWorker() instanceof Object);
        System.out.println();
        Workable monkey =new Monkey();
        Workable worker = new Worker();
        monkey.doWork();
        worker.doWork();


    }
}
