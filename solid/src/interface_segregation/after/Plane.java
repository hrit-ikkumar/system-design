package interface_segregation.after;

public class Plane implements Vehicle, Movable, Flyable {
    public double price;
    public String color;

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println("Plane is starting....");
    }

    @Override
    public void stop() {
        System.out.println("Plane is stopping....");
    }

    @Override
    public void fly() {
        System.out.println("Plane has started flying....");
    }
}
