package by.belhard.j2.homework2;


public class Car {

    private String name;
    private Coordinate coordinate;
    private double km;

    public Car(String name, Coordinate coordinate) {
        this(name, coordinate, 20);
    }
    public Car(String name,double x, double y){
        this(name, new Coordinate(x,y));
    }


    public Car(String name,Coordinate coordinate, double km) {
        this.name = name;
        this.coordinate=coordinate;
        this.km = km;
    }



    public double move(Coordinate point) {
        double km = this.coordinate.Distance(point);
        this.km += km;
        this.coordinate = point;
        return km;

    }
    public double move(double x,double y){
        return move(new Coordinate (x,y));
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
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
                ", coordinate=" + coordinate +
                ", distance=" + km +
                '}';
    }
     /*public void toMove(double x ,double y) {
        double a;
        double b;
        a = x - this.x;
        b = y - this.y;
        km = this.km + Math.sqrt((a*a) + (b*b)) ;
        this.x = x;
        this.y = y;


        //        x=(55.75222);
        //        y=(37.61556);


    }*/


    /*public String getName() {
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
    }*/
}