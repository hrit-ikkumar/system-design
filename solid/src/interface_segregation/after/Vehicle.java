package interface_segregation.after;

public interface Vehicle {
    public void setPrice(double price);
    public void setColor(String color);
}

/*
    - Here we have split whole interface into multiple sub-groups of interfaces
 */