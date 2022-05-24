package interface_segregation.before;

public interface Vehicle {
    public void setPrice(double price);
    public void setColor(String color);

    public void start();
    public void stop();

    public void fly();
}

/*
    This is violating the interface segregation principle
    - the larger interfaces split into smaller ones
    - Here are multiple sub-groups of interfaces combined into one
 */