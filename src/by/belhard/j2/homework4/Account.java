package by.belhard.j2.homework4;

public class Account {
    private int name;
    private int pass;
    private double money;

    public Account(int name, int pass, double money) {
        this.name = name;
        this.pass = pass;
        this.money = money;
    }

    public int getName() {
        return name;
    }

    public int getPass() {
        return pass;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Счёт {" +
                "Номер счёта=" + name +
                ", Баланс=" + money +
                '}';
    }
}