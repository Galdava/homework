package by.belhard.j2.lesson5.hw;

public class Car {
    private String title;
    private double x, y, dist;

    public Car(String title, double x, double y, double dist) {
        this.title = title;
        this.x = x;
        this.y = y;
        this.dist = dist;
    }

    public void moveTo(double x, double y) {
        double distance = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y - y, 2));
        this.dist += distance;

        this.x = x;
        this.y = y;

    }


    public Car(String title, double x, double y) {
        this(title, x, y, 0);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }


    public double getDist() {
        return dist;
    }

    @Override
    public String toString() {
        return "Car{" +
                "title='" + title + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", dist=" + dist +
                '}';
    }
}
