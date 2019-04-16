package by.belhard.j2.homework2;

public class Car {

    private String name;
    private double x;
    private double y;


    public Car(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public void toMove() {
        System.out.println("car move from x=" + x + " " + "y=" + y);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
