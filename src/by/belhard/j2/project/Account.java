package by.belhard.j2.project;

public class Account {
    private int id;
    private String name;
    private int pass;
    private double money;

    public Account(int id, String name, int pass, double money) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.money = money;
    }



    public int getId() {
        return id;
    }

    public String getName() {
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
        return "Счёт{" +
                "id=" + id +
                ", Имя=" + name +
                ", Баланс=" + money +
                '}';
    }

}
