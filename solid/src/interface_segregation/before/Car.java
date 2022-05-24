package interface_segregation.before;

public class Car implements Vehicle {
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
        System.out.println("Car is starting....");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping....");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("This operation is not available");
    }
}
