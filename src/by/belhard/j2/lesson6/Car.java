package by.belhard.j2.lesson6;

public class Car {
    private String title;


    public Car(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Car{" +
                "title='" + title + '\'' +
                '}';
    }
}
