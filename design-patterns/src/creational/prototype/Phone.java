package creational.prototype;

// Supports cloning
public class Phone extends Device{
    private String state = "idle";

    public void start() {
        this.state = "Apple is turning on";
    }

    @Override
    public void reset() {
        this.state = "idle";
    }

    @Override
    public String toString() {
        return "Phone{" +
                "state='" + state + '\'' +
                '}';
    }
}
