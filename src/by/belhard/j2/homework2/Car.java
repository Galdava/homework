package by.belhard.j2.homework2;

public class Car {

    private String name;
    private double x;
    private double y;
    private double km;


    public Car(String name, double x, double y, double km) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.km = km;
    }

    public void toMove(double x, double y) {
        double a;
        double b;
        a = x - this.x;
        b = y - this.y;
        km = this.km + Math.sqrt((a*a) + (b*b)) ;
        this.x = x;
        this.y = y;


        //        x=(55.75222);
        //        y=(37.61556);


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

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", distance=" + km +
                '}';
    }
}