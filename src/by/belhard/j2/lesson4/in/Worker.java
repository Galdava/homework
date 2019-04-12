package by.belhard.j2.lesson4.in;

public class Worker extends Person{
    private int salary;

    public  Worker(String name,int age, Sex sex){
        super(name,age,sex);
    }
    public void toWork(){
        System.out.println("i work");
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
