package creational.prototype;

// Don't want it to support cloning
public class Laptop extends Device{
    private String state = "on";

    public void start() {
        this.state = "booting";
    }

    @Override
    public Device clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException(
                ("Laptop doesn't require this")
        );
    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException("Reset is not supported in Laptop");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "state='" + state + '\'' +
                '}';
    }
}
