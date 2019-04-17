package by.belhard.j2.lesson5;

public abstract class Person implements Workable {
    public int a=10;
    public abstract void doWork();

    public void sayHello(){
        System.out.println("Hello!");

    }

    public int getA() {
        return a;
    }
}
